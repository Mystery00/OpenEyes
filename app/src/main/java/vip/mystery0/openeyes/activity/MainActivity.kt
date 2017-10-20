package vip.mystery0.openeyes.activity

import android.os.Bundle
import android.support.v4.view.ViewPager
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import vip.mystery0.openeyes.R
import vip.mystery0.openeyes.adapter.ViewPagerAdapter
import vip.mystery0.openeyes.fragment.HomeFragment

class MainActivity : AppCompatActivity()
{

	override fun onCreate(savedInstanceState: Bundle?)
	{
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_main)

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
