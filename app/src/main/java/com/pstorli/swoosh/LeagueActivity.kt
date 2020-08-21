package com.pstorli.swoosh

import android.content.Intent
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_league.*

class LeagueActivity : BaseActivity() {

    // The currently selected league. Mens by default.
    var selLeagueId = R.id.toggleButtonMens

    /**
     * On Create
     */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)

        // /////////////////////////////////////////////////////////////////////////////////////////
        // Listen for the user to click a toggle button.
        // /////////////////////////////////////////////////////////////////////////////////////////

        // Listen for clicks on the league toggle butons.
        leagueRadioGroup.setOnClickListener() {
            updateLeague (it.id)
        }

        // Initial setup
        updateLeague (selLeagueId)
    }

    /**
     * Update the league selection toggle buttons based on the selLeagueId
     */
    fun updateLeague (id: Int)
    {
        // Remember the selected league id.
        selLeagueId = id

        // Check that one.
        leagueRadioGroup.check (id)
    }

    /**
     * They clicked the next button.
     */
    fun buttonNextClicked(@Suppress("UNUSED_PARAMETER")view: View)
    {
        val skillIntent = Intent (this, SkillActivity::class.java)
        startActivity(skillIntent)
    }
}