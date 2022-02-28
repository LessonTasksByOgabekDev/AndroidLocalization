package dev.ogabek.androidlocalization.activity

import android.content.Context
import android.content.res.Configuration
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import dev.ogabek.androidlocalization.MyApplication
import dev.ogabek.androidlocalization.R
import dev.ogabek.androidlocalization.menegers.LocaleManager
import java.util.*

class LanguageActivity : AppCompatActivity() {

    private lateinit var context: Context

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_language)

        initViews()

        val one = resources.getQuantityString(R.plurals.my_cats, 1, 1)
        val few = resources.getQuantityString(R.plurals.my_cats, 2, 3)
        val many = resources.getQuantityString(R.plurals.my_cats, 5, 10)

        Log.d(one, "onCreate: ")
        Log.d(few, "onCreate: ")
        Log.d(many, "onCreate: ")

    }

    private fun initViews() {

        LocaleManager(this).setLocale(this)

        context = this

        val btn_english = findViewById<Button>(R.id.btn_english)
        btn_english.setOnClickListener {
            MyApplication.localeManager!!.setNewLocale(context, LocaleManager.LANGUAGE_ENGLISH)
            finish()
        }

        val btn_russian = findViewById<Button>(R.id.btn_russian)
        btn_russian.setOnClickListener {
            MyApplication.localeManager!!.setNewLocale(context, LocaleManager.LANGUAGE_RUSSIAN)
            finish()
        }

        val btn_uzbek = findViewById<Button>(R.id.btn_uzbek)
        btn_uzbek.setOnClickListener {
            MyApplication.localeManager!!.setNewLocale(context, LocaleManager.LANGUAGE_UZBEK)
            finish()
        }
    }

}