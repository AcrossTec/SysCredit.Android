package com.acrosstec.syscredit.activities

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.acrosstec.syscredit.MainActivity

class SplashScreenActivity : AppCompatActivity()
{
    override fun onCreate(SavedInstanceState: Bundle?)
    {
        super.onCreate(SavedInstanceState)

        val Intent = Intent(this, MainActivity::class.java)
        startActivity(Intent)
        finish()
    }
}