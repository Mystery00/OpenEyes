package vip.mystery0.openeyes.util

import com.google.gson.GsonBuilder
import com.google.gson.reflect.TypeToken
import vip.mystery0.openeyes.classes.home.Home
import vip.mystery0.openeyes.classes.home.ItemModel
import vip.mystery0.openeyes.classes.home.item.*
import java.io.Reader

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

	fun convertHome(jsonReader: Reader): Home
	{
		val requestListTypeToken = object : TypeToken<Home>()
		{}
		val typeFactory = RuntimeTypeAdapterFactory
				.of(ItemModel::class.java, "type")
				.registerSubtype(Video::class.java, "video")
				.registerSubtype(TextHeader::class.java, "textHeader")
				.registerSubtype(TextFooter::class.java, "textFooter")
				.registerSubtype(VideoCollectionOfFollow::class.java, "videoCollectionOfFollow")
				.registerSubtype(VideoCollectionWithCover::class.java, "videoCollectionWithCover")
		val gson = GsonBuilder().registerTypeAdapterFactory(typeFactory).create()
		return gson.fromJson(jsonReader, requestListTypeToken.type)
	}
}