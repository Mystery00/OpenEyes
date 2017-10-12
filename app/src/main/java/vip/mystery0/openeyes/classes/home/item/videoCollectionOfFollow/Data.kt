package vip.mystery0.openeyes.classes.home.item.videoCollectionOfFollow

import vip.mystery0.openeyes.classes.home.item.videoCollectionOfFollow.data.Item
import java.io.Serializable

/**
 * Created by myste.
 */
class Data: Serializable
{
	lateinit var dataType: String
	lateinit var header: Header
	lateinit var itemList: Array<Item>
	var count = 0
	lateinit var adTrack: String
}