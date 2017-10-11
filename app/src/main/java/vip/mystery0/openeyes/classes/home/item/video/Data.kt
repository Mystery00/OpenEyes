package vip.mystery0.openeyes.classes.home.item.video

import vip.mystery0.openeyes.classes.home.item.video.data.*
import vip.mystery0.openeyes.classes.home.item.video.data.playInfo.PlayInfo

/**
 * Created by myste.
 */
class Data
{
	lateinit var dataType: String
	lateinit var id: String
	lateinit var title: String
	lateinit var slogan: String
	lateinit var description: String
	lateinit var provider:Provider
	lateinit var category: String
	lateinit var author: Author
	lateinit var cover: Cover
	lateinit var playUrl: String
	lateinit var thumbPlayUrl: String
	var duration = 0
	lateinit var webUrl: WebUrl
	var releaseTime = 0L
	lateinit var library: String
	lateinit var playInfo: Array<PlayInfo>
	lateinit var consumption: Consumption
	lateinit var campaign: String
	lateinit var waterMarks: String
	lateinit var adTrack: String
	//tags
	lateinit var type: String
	lateinit var titlePgc: String
	lateinit var descriptionPgc: String
	lateinit var remark: String
	var idx = 0
	lateinit var shareAdTrack: String
	lateinit var favoriteAdTrack: String
	lateinit var webAdTrack: String
	var date = 0L
	lateinit var promotion: String
//	lateinit var label: String
	//labelList
	lateinit var descriptionEditor: String
	var collected = false
	var played = false
	//subtitles
	lateinit var lastViewTime: String
	lateinit var playlists: String
}