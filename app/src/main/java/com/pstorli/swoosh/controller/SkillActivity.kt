package com.pstorli.swoosh.controller

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.pstorli.swoosh.R
import com.pstorli.swoosh.model.Player
import com.pstorli.swoosh.utilities.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_skill.*

class SkillActivity : AppCompatActivity() {

    // /////////////////////////////////////////////////////////////////////////////////////////////
    // Vars
    // /////////////////////////////////////////////////////////////////////////////////////////////
    var player: Player? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)

        player = intent.getParcelableExtra<Player>(EXTRA_PLAYER)

        // Gotta bring in elvis for this one!
        //println(league ?: getString(R.string.league_undefined))
    }

    fun onBeginnerClicked (@Suppress("UNUSED_PARAMETER")view: View)
    {
        // Make sure other button is off.
        toggleButtonBaller.isChecked = false

        player?.skill = getString(R.string.beginner)
    }

    fun onBallerClicked (@Suppress("UNUSED_PARAMETER")view: View)
    {
        // Make sure other button is off.
        toggleButtonBeginner.isChecked = false

        player?.skill = getString(R.string.baller)
    }

    fun onSkillFinishedClicked (@Suppress("UNUSED_PARAMETER")view: View)
    {
        if (null != player) {
            val finishActivity = Intent(this, FinishActivity::class.java)
            finishActivity.putExtra (EXTRA_PLAYER, player)
            startActivity(finishActivity)
        }
        else {
            // Oops
            Toast.makeText(this, "Please select a skill level", Toast.LENGTH_SHORT).show()
        }
    }
}