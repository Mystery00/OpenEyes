package vip.mystery0.openeyes.fragment

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import vip.mystery0.openeyes.R
import vip.mystery0.openeyes.classes.home.item.Video
import vip.mystery0.openeyes.handler.HomeFragmentHandler
import vip.mystery0.openeyes.util.JsonConvert
import vip.mystery0.tools.hTTPok.HTTPok
import vip.mystery0.tools.hTTPok.HTTPokResponse
import vip.mystery0.tools.hTTPok.HTTPokResponseListener
import vip.mystery0.tools.headerPage.Header
import vip.mystery0.tools.logs.Logs
import java.io.File
import java.io.FileReader

class HomeFragment : Fragment()
{
	private val TAG = "HomeFragment"

	override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
							  savedInstanceState: Bundle?): View?
	{
		val view = inflater!!.inflate(R.layout.fragment_home, container, false)
		val recyclerView = view.findViewById<RecyclerView>(R.id.recyclerView)
		val homeFragmentHandler = HomeFragmentHandler()
		homeFragmentHandler.context = activity
		homeFragmentHandler.recyclerView = recyclerView
		homeFragmentHandler.fragmentManger = fragmentManager

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
						val file = File(activity.cacheDir, "test")
						response.getFile(file)
						val fileReader = FileReader(file)
						val home = jsonConvert.convertHome(fileReader)
						homeFragmentHandler.home = home
						val list = ArrayList<Header>()
						(0 until 5)
								.map { home.itemList[it] }
								.filterIsInstance<Video>()
								.mapTo(list) { Header(it.data.cover.homepage, it.data.title, it.data.slogan) }
						homeFragmentHandler.list = list
						homeFragmentHandler.sendEmptyMessage(0)
					}
				})
				.open()
		return view
	}
}
