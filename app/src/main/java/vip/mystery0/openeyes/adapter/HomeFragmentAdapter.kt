package vip.mystery0.openeyes.adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import com.bumptech.glide.Glide
import vip.mystery0.openeyes.R
import vip.mystery0.openeyes.classes.home.Home
import vip.mystery0.openeyes.classes.home.item.Video
import vip.mystery0.openeyes.viewHolder.HeaderPagerViewHolder
import vip.mystery0.openeyes.viewHolder.HomeFragmentViewHolder
import vip.mystery0.tools.headerPage.Header

/**
 * Created by myste.
 */
class HomeFragmentAdapter(private val context: Context,
						  private val home: Home,
						  private val list: ArrayList<Header>) : RecyclerView.Adapter<RecyclerView.ViewHolder>()
{
	override fun getItemCount(): Int
	{
		return home.count
	}

	override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder
	{
		val viewVideo = LayoutInflater.from(context).inflate(R.layout.item_video, parent, false)
		val viewHeaderPager = LayoutInflater.from(context).inflate(R.layout.item_header, parent, false)
		return when (viewType)
		{
			0 -> HeaderPagerViewHolder(viewHeaderPager)
			1 -> HomeFragmentViewHolder(viewVideo)
			else -> throw Exception("error")
		}
	}

	override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int)
	{
		when (holder)
		{
			is HomeFragmentViewHolder ->
			{
				val item = home.itemList[home.itemList.indexOfFirst { it is Video }] as Video
				holder.textViewTitle.text = item.data.title
				holder.textViewSubTitle.text = item.data.category
				Glide.with(context).load(item.data.cover.homepage).into(holder.imageViewArt)
			}
			is HeaderPagerViewHolder ->
			{
				holder.headerPager.setData(list)
			}
		}
	}

	override fun getItemViewType(position: Int): Int
	{
		return when (position)
		{
			0 -> 0
			else -> 1
		}
	}
}