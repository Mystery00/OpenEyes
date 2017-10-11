package vip.mystery0.openeyes.classes.home.data.item.data

import vip.mystery0.openeyes.classes.home.data.item.data.author.follow.Followed
import vip.mystery0.openeyes.classes.home.data.item.data.author.shield.Shield

/**
 * Created by myste.
 */
class Author
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