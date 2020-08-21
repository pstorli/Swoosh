package com.pstorli.swoosh.controller

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.pstorli.swoosh.R
import com.pstorli.swoosh.util.EXTRA_LEAGUE
import com.pstorli.swoosh.util.EXTRA_SKILL
import kotlinx.android.synthetic.main.activity_skill.*

class SkillActivity : AppCompatActivity() {

    // /////////////////////////////////////////////////////////////////////////////////////////////
    // Vars
    // /////////////////////////////////////////////////////////////////////////////////////////////
    private var league: String? = null
    private var skill           = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)

        league = intent.getStringExtra(EXTRA_LEAGUE)

        // Gotta bring in elvis for this one!
        //println(league ?: getString(R.string.league_undefined))
    }

    fun onBeginnerClicked (@Suppress("UNUSED_PARAMETER")view: View)
    {
        // Make sure other button is off.
        toggleButtonBaller.isChecked = false

        skill = getString(R.string.beginner)
    }

    fun onBallerClicked (@Suppress("UNUSED_PARAMETER")view: View)
    {
        // Make sure other button is off.
        toggleButtonBeginner.isChecked = false

        skill = getString(R.string.baller)
    }

    fun onSkillFinishedClicked (@Suppress("UNUSED_PARAMETER")view: View)
    {
        if (skill.isNotEmpty()) {
            val finishActivity = Intent(this, FinishActivity::class.java)
            finishActivity.putExtra(EXTRA_LEAGUE, league)
            finishActivity.putExtra(EXTRA_SKILL, skill)
            startActivity(finishActivity)
        }
        else {
            // Oops
            Toast.makeText(this, "Please select a skill level", Toast.LENGTH_SHORT).show()
        }
    }
}