package vip.mystery0.openeyes.activity

import android.os.Bundle
import android.support.v4.view.ViewPager
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import vip.mystery0.openeyes.R
import vip.mystery0.openeyes.adapter.ViewPagerAdapter
import vip.mystery0.openeyes.fragment.HomeFragment
import vip.mystery0.openeyes.util.JsonConvert
import vip.mystery0.tools.HTTPok.HTTPok
import vip.mystery0.tools.HTTPok.HTTPokResponse
import vip.mystery0.tools.HTTPok.HTTPokResponseListener
import vip.mystery0.tools.Logs.Logs
import java.io.File
import java.io.FileReader

class MainActivity : AppCompatActivity()
{
	private val TAG = "MainActivity"

	override fun onCreate(savedInstanceState: Bundle?)
	{
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_main)

		HTTPok().setURL("http://baobab.kaiyanapp.com/api/v4/tabs/selected")
				.setRequestMethod(HTTPok.GET)
				.setListener(object : HTTPokResponseListener
				{
					override fun onError(message: String?)
					{
						Logs.e(TAG, "onError: " + message)
					}

					override fun onResponse(response: HTTPokResponse)
					{
						val jsonConvert = JsonConvert.getInstance()
						val file = File(cacheDir, "test")
						response.getFile(file)
						val fileReader = FileReader(file)
						val home = jsonConvert.convertHome(fileReader)
						Logs.i(TAG, "onResponse: ")
					}
				})
				.open()


		val viewPagerAdapter = ViewPagerAdapter(supportFragmentManager)
		viewPagerAdapter.addFragment(HomeFragment())
		viewPagerAdapter.addFragment(HomeFragment())
		viewPagerAdapter.addFragment(HomeFragment())
		viewPagerAdapter.addFragment(HomeFragment())
		viewPager.adapter = viewPagerAdapter

		navigation.setOnNavigationItemSelectedListener { item ->
			viewPager.currentItem = item.order
			true
		}

		viewPager.addOnPageChangeListener(object : ViewPager.OnPageChangeListener
		{
			override fun onPageScrolled(position: Int, positionOffset: Float,
										positionOffsetPixels: Int)
			{
			}

			override fun onPageSelected(position: Int)
			{
				navigation.menu.getItem(position).isChecked = true
			}

			override fun onPageScrollStateChanged(state: Int)
			{
			}
		})
	}
}
