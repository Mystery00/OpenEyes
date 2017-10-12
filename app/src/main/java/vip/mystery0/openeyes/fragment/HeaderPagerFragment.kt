package vip.mystery0.openeyes.fragment

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import vip.mystery0.openeyes.R
import vip.mystery0.openeyes.classes.home.item.videoCollectionOfFollow.data.Item
import vip.mystery0.tools.Logs.Logs

/**
 * Created by myste.
 */
class HeaderPagerFragment : Fragment()
{
	private val TAG = "HeaderPagerFragment"
	private lateinit var item: Item
	private var position = -1

	companion object
	{
		fun newInstance(item: Item,
						position: Int): HeaderPagerFragment
		{
			val bundle = Bundle()
			bundle.putSerializable("data", item)
			bundle.putInt("position", position)
			val fragment = HeaderPagerFragment()
			fragment.arguments = bundle
			return fragment
		}
	}

	override fun onCreate(savedInstanceState: Bundle?)
	{
		super.onCreate(savedInstanceState)
		item = arguments.getSerializable("data") as Item
		position = arguments.getInt("position")
	}

	override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
							  savedInstanceState: Bundle?): View?
	{
		Logs.i(TAG, "onCreateView: ")
		val view = inflater.inflate(R.layout.item_fragment_header_pager, container, false)
		val imageView: ImageView = view.findViewById(R.id.imageView)
		val textViewTitle: TextView = view.findViewById(R.id.textView_title)
		val textViewSubTitle: TextView = view.findViewById(R.id.textView_subtitle)
		Glide.with(activity).load(item.data.cover.homepage).into(imageView)
		textViewTitle.text = item.data.title
		textViewSubTitle.text = item.data.slogan
		return view
	}
}