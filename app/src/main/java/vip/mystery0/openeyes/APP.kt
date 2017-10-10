package vip.mystery0.openeyes

import android.app.Application
import vip.mystery0.tools.CrashHandler.CrashHandler
import vip.mystery0.tools.Logs.Logs

/**
 * Created by myste.
 */
class APP : Application()
{
	override fun onCreate()
	{
		super.onCreate()
		Logs.setLevel(Logs.LogLevel.Debug)
		CrashHandler.getInstance(this)
				.setPrefixName("log")
				.setExtensionName("txt")
				.setDirectory(externalCacheDir)
				.init()
	}
}