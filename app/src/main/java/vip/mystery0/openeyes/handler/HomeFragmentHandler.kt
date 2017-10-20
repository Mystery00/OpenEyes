package vip.mystery0.openeyes.handler

import android.support.v4.app.FragmentManager
import android.content.Context
import android.os.Handler
import android.os.Message
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import vip.mystery0.openeyes.adapter.HomeFragmentAdapter
import vip.mystery0.openeyes.classes.home.Home
import vip.mystery0.tools.headerPage.Header

/**
 * Created by myste.
 */
class HomeFragmentHandler : Handler()
{
	lateinit var context: Context
	lateinit var recyclerView: RecyclerView
	lateinit var home: Home
	lateinit var list: ArrayList<Header>
	lateinit var fragmentManger: FragmentManager
	lateinit var homeFragmentAdapter: HomeFragmentAdapter

	override fun handleMessage(msg: Message?)
	{
		recyclerView.layoutManager = LinearLayoutManager(context)
		homeFragmentAdapter = HomeFragmentAdapter(context, home, list)
		recyclerView.adapter = homeFragmentAdapter
	}
}