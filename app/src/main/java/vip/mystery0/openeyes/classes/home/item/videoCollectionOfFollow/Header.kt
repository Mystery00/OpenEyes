package vip.mystery0.openeyes.classes.home.item.videoCollectionOfFollow

import java.io.Serializable

/**
 * Created by myste.
 */
class Header: Serializable
{
	var id = 0L
	lateinit var title: String
	lateinit var font: String
	lateinit var cover: String
//	lateinit var label: String
	lateinit var actionUrl: String
	//labelList
	//iconList
	lateinit var description: String
}