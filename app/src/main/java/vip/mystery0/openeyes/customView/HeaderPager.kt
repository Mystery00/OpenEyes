package vip.mystery0.openeyes.customView

import android.content.Context
import android.support.constraint.ConstraintLayout
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import vip.mystery0.openeyes.R

/**
 * Created by myste.
 */
class HeaderPager(context: Context?, attrs: AttributeSet?) : ConstraintLayout(context, attrs)
{
	private val imageViewBackground: ImageView
	private val imageViewSearch: ImageView
	private val textViewTitle: TextView
	private val textViewSubTitle: TextView
	private val pageIndicator: LinearLayout

	init
	{
		LayoutInflater.from(context).inflate(R.layout.layout_header_pager, this)
		imageViewBackground = findViewById(R.id.imageView)
		imageViewSearch = findViewById(R.id.imageView_search)
		textViewTitle = findViewById(R.id.textView_title)
		textViewSubTitle = findViewById(R.id.textView_subtitle)
		pageIndicator = findViewById(R.id.pageIndicator)
	}
}