package dev.ogabek.androidlocalization

import android.app.Application
import dev.ogabek.androidlocalization.menegers.LocaleManager

class MyApplication: Application() {

    companion object {
        val TAG = MyApplication::class.java.simpleName
        var instance: MyApplication? = null
        var localeManager: LocaleManager? = null
    }

    override fun onCreate() {
        super.onCreate()
        instance = this
        localeManager = LocaleManager(this)
        localeManager!!.setLocale(this)
    }

}