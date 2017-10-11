package vip.mystery0.openeyes.adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import vip.mystery0.openeyes.R
import vip.mystery0.openeyes.classes.home.Home
import vip.mystery0.openeyes.classes.home.item.Video

/**
 * Created by myste.
 */
class HomeFragmentAdapter(private val context: Context,
						  private val home: Home) : RecyclerView.Adapter<HomeFragmentAdapter.ViewHolder>()
{
	override fun getItemCount(): Int
	{
		return home.count
	}

	override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder
	{
		val viewVideo = LayoutInflater.from(context).inflate(R.layout.item_video, parent, false)
		return ViewHolder(viewVideo)
	}

	override fun onBindViewHolder(holder: ViewHolder, position: Int)
	{
		val item = home.itemList[position]
		if (item is Video)
		{
			holder.textViewTitle.text = item.data.title
			holder.textViewSubTitle.text = item.data.category
			Glide.with(context).load(item.data.cover.homepage)
		}
	}

	class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)
	{
		var imageViewArt: ImageView = itemView.findViewById(R.id.imageView_art)
		var imageViewLogo: ImageView = itemView.findViewById(R.id.imageView_logo)
		var imageViewAva: ImageView = itemView.findViewById(R.id.imageView_ava)
		var imageViewMore: ImageView = itemView.findViewById(R.id.imageView_more)
		var textViewTitle: TextView = itemView.findViewById(R.id.textView_title)
		var textViewSubTitle: TextView = itemView.findViewById(R.id.textView_subtitle)
	}
}