package vip.mystery0.openeyes.adapter

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter
import vip.mystery0.openeyes.classes.home.item.videoCollectionOfFollow.data.Item
import vip.mystery0.openeyes.fragment.HeaderPagerFragment
import java.util.ArrayList

/**
 * Created by myste.
 */
class HeaderPagerAdapter(fragmentManager: FragmentManager) : FragmentPagerAdapter(fragmentManager)
{
	private val fragmentList = ArrayList<HeaderPagerFragment>()
	private val dataList = ArrayList<Item>()

	fun addFragment(fragment: HeaderPagerFragment)
	{
		fragmentList.add(fragment)
	}

	override fun getItem(position: Int): Fragment
	{
		return fragmentList[position]
	}

	override fun getCount(): Int
	{
		return 5
	}
}