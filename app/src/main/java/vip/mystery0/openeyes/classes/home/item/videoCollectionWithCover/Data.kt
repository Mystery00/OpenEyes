package vip.mystery0.openeyes.classes.home.item.videoCollectionWithCover

import vip.mystery0.openeyes.classes.home.item.videoCollectionOfFollow.data.Item
import vip.mystery0.openeyes.classes.home.item.videoCollectionWithCover.Header
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