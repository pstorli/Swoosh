package com.pstorli.swoosh.controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.pstorli.swoosh.R
import com.pstorli.swoosh.util.EXTRA_LEAGUE
import com.pstorli.swoosh.util.EXTRA_SKILL
import kotlinx.android.synthetic.main.activity_finish.*

class FinishActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)

        val league = intent.getStringExtra(EXTRA_LEAGUE)
        val skill = intent.getStringExtra(EXTRA_SKILL)

        searchLeagueText.text = getString(R.string.looking_for_skill, league, skill)
    }
}