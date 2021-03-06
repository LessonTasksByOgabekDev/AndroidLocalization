package dev.ogabek.androidlocalization.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import dev.ogabek.androidlocalization.R
import dev.ogabek.androidlocalization.menegers.LocaleManager

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initViews()

    }

    private fun initViews() {
        LocaleManager(this).setLocale(this)

        val btn_open_language = findViewById<Button>(R.id.btn_open_language)
        btn_open_language.text = getString(R.string.app_name)
        btn_open_language.setOnClickListener {
            callLanguageActivity()
        }

        val btn_open_preference = findViewById<Button>(R.id.btn_shared_preference)
        btn_open_preference.text = getString(R.string.shared_preference)
        btn_open_preference.setOnClickListener {
            callPreferenceActivity()
        }
    }

    private fun callLanguageActivity() {
        startActivity(Intent(this, LanguageActivity::class.java))
    }

    private fun callPreferenceActivity() {
        startActivity(Intent(this, SharedPreferenceActivity::class.java))
    }
}