package dev.ogabek.androidlocalization.menegers

import android.content.Context
import android.content.SharedPreferences

class PrefsManager(context: Context) {

    private val sharedPreferences: SharedPreferences? = context.getSharedPreferences("MyPref", Context.MODE_PRIVATE)

    companion object {
        private var prefsManager: PrefsManager? = null
        fun getInstance(context: Context): PrefsManager? {
            if (prefsManager == null) {
                prefsManager = PrefsManager(context)
            }
            return prefsManager
        }
    }

    fun saveData(key: String?, value: String?) {
        val prefsEditor = sharedPreferences!!.edit()
        prefsEditor.putString(key, value)
        prefsEditor.apply()
    }

    fun getData(key: String?): String? {
        return sharedPreferences!!.getString(key, "en")
    }

}