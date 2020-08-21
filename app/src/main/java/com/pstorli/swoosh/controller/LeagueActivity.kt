package com.pstorli.swoosh.controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import com.pstorli.swoosh.R
import com.pstorli.swoosh.util.EXTRA_LEAGUE
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
            //Toast.makeText (this, getString (R.string.selected, getSelectedLeagueName ()), Toast.LENGTH_SHORT).show()
        }

        // Initial setup
        updateLeague (selLeagueId)
    }

    /**
     * Get the selected league name.
     */
    fun getSelectedLeagueName (): String
    {
        var selLeagueName = ""
        when (selLeagueId) {
            R.id.toggleButtonMens -> selLeagueName = getString(R.string.mens)
            R.id.toggleButtonWomens -> selLeagueName = getString(R.string.womens)
            R.id.toggleButtonCoed -> selLeagueName = getString(R.string.coed)
        }
        return selLeagueName
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
        // Get your intent straight.
        val skillIntent = Intent (this, SkillActivity::class.java)

        // Add some extras.
        skillIntent.putExtra (EXTRA_LEAGUE, getSelectedLeagueName ())

        // Fire her up!
        startActivity (skillIntent)
    }
}