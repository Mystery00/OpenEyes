package vip.mystery0.openeyes.classes.home.item.video.data.playInfo

import vip.mystery0.openeyes.classes.home.item.video.data.playInfo.urlList.UrlList
import java.io.Serializable

/**
 * Created by myste.
 */
class PlayInfo: Serializable
{
	var height = 0
	var width = 0
	lateinit var urlList: Array<UrlList>
	lateinit var name:String
	lateinit var type:String
	lateinit var url:String
}