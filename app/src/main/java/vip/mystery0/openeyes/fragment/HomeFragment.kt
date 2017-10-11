package vip.mystery0.openeyes.fragment

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import vip.mystery0.openeyes.R
import vip.mystery0.openeyes.handler.HomeFragmentHandler
import vip.mystery0.openeyes.util.JsonConvert
import vip.mystery0.tools.HTTPok.HTTPok
import vip.mystery0.tools.HTTPok.HTTPokResponse
import vip.mystery0.tools.HTTPok.HTTPokResponseListener
import vip.mystery0.tools.Logs.Logs
import java.io.File
import java.io.FileReader

class HomeFragment : Fragment()
{
	private val TAG = "HomeFragment"

	override fun onCreate(savedInstanceState: Bundle?)
	{
		super.onCreate(savedInstanceState)
	}

	override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
							  savedInstanceState: Bundle?): View?
	{
		val view = inflater!!.inflate(R.layout.fragment_home, container, false)
		val recyclerView = view.findViewById<RecyclerView>(R.id.recyclerView)
		val homeFragmentHandler = HomeFragmentHandler()
		homeFragmentHandler.context = activity
		homeFragmentHandler.recyclerView = recyclerView

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
						homeFragmentHandler.home = jsonConvert.convertHome(fileReader)
						homeFragmentHandler.sendEmptyMessage(0)
					}
				})
				.open()
		return view
	}
}
