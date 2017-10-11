package vip.mystery0.openeyes.util

import com.google.gson.GsonBuilder
import com.google.gson.stream.JsonReader
import vip.mystery0.openeyes.classes.home.Home
import vip.mystery0.openeyes.classes.home.ItemModel
import vip.mystery0.openeyes.classes.home.item.TextHeader
import vip.mystery0.openeyes.classes.home.item.Video
import vip.mystery0.openeyes.classes.home.item.VideoCollectionOfFollow
import vip.mystery0.openeyes.classes.home.item.VideoCollectionWithCover

/**
 * Created by myste.
 */
class JsonConvert private constructor()
{
	companion object
	{
		private var jsonConvert: JsonConvert? = null

		fun getInstance(): JsonConvert
		{
			if (jsonConvert == null)
				jsonConvert = JsonConvert()
			return jsonConvert!!
		}
	}

	fun convertHome(jsonReader: JsonReader): Home
	{
		val typeFactory = RuntimeTypeAdapterFactory
				.of(ItemModel::class.java)
				.registerSubtype(Video::class.java)
				.registerSubtype(TextHeader::class.java)
				.registerSubtype(VideoCollectionOfFollow::class.java)
				.registerSubtype(VideoCollectionWithCover::class.java)
		val gson = GsonBuilder().registerTypeAdapterFactory(typeFactory).create()
		return gson.fromJson(jsonReader, Home::class.java)
	}
}