package vip.mystery0.openeyes.customView

import android.content.Context
import android.support.constraint.ConstraintLayout
import android.support.v4.app.FragmentManager
import android.support.v4.view.ViewPager
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import vip.mystery0.openeyes.R
import vip.mystery0.openeyes.adapter.HeaderPagerAdapter
import vip.mystery0.openeyes.classes.home.item.VideoCollectionWithCover
import vip.mystery0.openeyes.fragment.HeaderPagerFragment

/**
 * Created by myste.
 */
class HeaderPager(context: Context?, attrs: AttributeSet?) : ConstraintLayout(context, attrs)
{
	private val imageViewSearch: ImageView
	private val imageViewRefresh: ImageView
	private val viewPager: ViewPager
	private val pageIndicator: LinearLayout

	init
	{
		LayoutInflater.from(context).inflate(R.layout.layout_header_pager, this)
		imageViewSearch = findViewById(R.id.imageView_search)
		imageViewRefresh = findViewById(R.id.imageView_refresh)
		viewPager = findViewById(R.id.viewPager)
		pageIndicator = findViewById(R.id.pageIndicator)
	}

	fun setData(videoCollectionWithCover: VideoCollectionWithCover,
				fragmentManager: FragmentManager)
	{
		val viewPagerAdapter = HeaderPagerAdapter(fragmentManager)
		videoCollectionWithCover.data.itemList.forEachIndexed { index, item ->
			viewPagerAdapter.addFragment(HeaderPagerFragment.newInstance(item, index))
		}
		viewPager.adapter = viewPagerAdapter
	}
}