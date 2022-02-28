package dev.ogabek.androidlocalization.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import dev.ogabek.androidlocalization.R
import dev.ogabek.androidlocalization.menegers.PrefsManager

class SharedPreferenceActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shared_preferance)

        initViews()

    }

    private fun initViews() {
        val et_email: EditText = findViewById(R.id.et_email)
        val btn_save: Button = findViewById(R.id.btn_save)

        val btn_load: Button = findViewById(R.id.btn_load)
        val tv_email: TextView = findViewById(R.id.tv_email)

        btn_save.setOnClickListener {
            val email = et_email.text.toString()
            PrefsManager(this).saveData("email", email)
            et_email.setText("")
            Toast.makeText(this, "Saved", Toast.LENGTH_SHORT).show()
        }

        btn_load.setOnClickListener {
            tv_email.text = PrefsManager(this).getData("email")
        }
    }


}