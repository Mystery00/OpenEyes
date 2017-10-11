package vip.mystery0.openeyes.handler

import android.content.Context
import android.os.Handler
import android.os.Message
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import vip.mystery0.openeyes.adapter.HomeFragmentAdapter
import vip.mystery0.openeyes.classes.home.Home

/**
 * Created by myste.
 */
class HomeFragmentHandler : Handler()
{
	lateinit var context: Context
	lateinit var recyclerView: RecyclerView
	lateinit var home: Home
	lateinit var homeFragmentAdapter: HomeFragmentAdapter

	override fun handleMessage(msg: Message?)
	{
		recyclerView.layoutManager = LinearLayoutManager(context)
		homeFragmentAdapter = HomeFragmentAdapter(context, home)
		recyclerView.adapter = homeFragmentAdapter
	}
}