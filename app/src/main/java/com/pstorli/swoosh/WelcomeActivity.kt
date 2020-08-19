package com.pstorli.swoosh

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_league.*
import kotlinx.android.synthetic.main.activity_welcome.*

class WelcomeActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)

        buttonGetStarted.setOnClickListener {
            val leagueIntent = Intent (this, LeagueActivity::class.java)
            startActivity(leagueIntent)
        }
    }
}