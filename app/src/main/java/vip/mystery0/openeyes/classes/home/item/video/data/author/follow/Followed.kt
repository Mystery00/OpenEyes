package vip.mystery0.openeyes.classes.home.item.video.data.author.follow

import java.io.Serializable

/**
 * Created by myste.
 */
class Followed: Serializable
{
	lateinit var itemType: String
	var itemId = 0L
	var followed = false
}