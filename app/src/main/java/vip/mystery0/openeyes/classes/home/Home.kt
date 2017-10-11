package vip.mystery0.openeyes.classes.home

/**
 * Created by myste.
 */
class Home
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