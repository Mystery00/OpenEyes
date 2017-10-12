package vip.mystery0.openeyes.classes.home.item.video.data

import vip.mystery0.openeyes.classes.home.item.video.data.author.follow.Followed
import vip.mystery0.openeyes.classes.home.item.video.data.author.shield.Shield
import java.io.Serializable

/**
 * Created by myste.
 */
class Author: Serializable
{
	lateinit var id: String
	lateinit var icon: String
	lateinit var name: String
	lateinit var description: String
	lateinit var link: String
	var latestReleaseTime = 0L
	var videoNum = 0
	lateinit var followed: Followed
	lateinit var shield: Shield
	var approvedNotReadyVideoCount = 0
	var ifPgc = false
}