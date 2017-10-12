package vip.mystery0.openeyes.viewHolder

import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import vip.mystery0.openeyes.R

/**
 * Created by myste.
 */
class HomeFragmentViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)
{
	var imageViewArt: ImageView = itemView.findViewById(R.id.imageView_art)
	var imageViewLogo: ImageView = itemView.findViewById(R.id.imageView_logo)
	var imageViewAva: ImageView = itemView.findViewById(R.id.imageView_ava)
	var imageViewMore: ImageView = itemView.findViewById(R.id.imageView_more)
	var textViewTitle: TextView = itemView.findViewById(R.id.textView_title)
	var textViewSubTitle: TextView = itemView.findViewById(R.id.textView_subtitle)
}