package vip.mystery0.openeyes.classes.home.videoCollectionOfFollow

import vip.mystery0.openeyes.classes.home.videoCollectionOfFollow.data.Item
import vip.mystery0.openeyes.classes.home.videoCollectionWithCover.Header

/**
 * Created by myste.
 */
class Data
{
	lateinit var dataType: String
	lateinit var header: Header
	lateinit var itemList: Array<Item>
	var count = 0
	lateinit var adTrack: String
}