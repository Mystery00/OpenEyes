package vip.mystery0.openeyes.classes.home

import java.io.Serializable

/**
 * Created by myste.
 */
class Home:Serializable
{
	lateinit var itemList: Array<ItemModel>
	var count = 0
	var total = 0
	lateinit var nextPageUrl: String
	var date = 0L
	var nextPublishTime = 0L
	lateinit var dialog: String
	lateinit var topIssue: String
	var refreshCount = 0
	var lastStartId = 0L
}