package com.pstorli.swoosh

import android.content.Intent
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_league.*

class LeagueActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)

        buttonNext.setOnClickListener {
            val skillIntent = Intent (this, SkillActivity::class.java)
            startActivity(skillIntent)
        }
    }

    fun buttonNextClicked(@Suppress("UNUSED_PARAMETER")view: View)
    {
        val skillIntent = Intent (this, SkillActivity::class.java)
        startActivity(skillIntent)
    }
}