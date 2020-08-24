package com.pstorli.swoosh.controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.pstorli.swoosh.R
import com.pstorli.swoosh.model.Player
import com.pstorli.swoosh.utilities.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_finish.*

class FinishActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)

        val player = intent.getParcelableExtra<Player>(EXTRA_PLAYER)

        // Format league and skill.
        // I like doing it in the resoure file, but you can also do this:
        //
        searchLeagueText.text = // "Looking for ${player.league} ${player.skill} league near you … "
            getString(
            R.string.looking_for_skill,
            player?.league?:getString(R.string.league_undefined),
            player?.skill?:getString(R.string.skill_undefined))
    }
}