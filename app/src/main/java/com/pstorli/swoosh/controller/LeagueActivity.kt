package com.pstorli.swoosh.controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import com.pstorli.swoosh.R
import com.pstorli.swoosh.model.Player
import com.pstorli.swoosh.utilities.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_league.*

class LeagueActivity : BaseActivity() {

    // The currently selected league. Mens by default.
    var selLeagueId = R.id.toggleButtonMens

    var player = Player ("","")
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

        when (selLeagueId) {
            R.id.toggleButtonMens   -> player.league = getString(R.string.mens)
            R.id.toggleButtonWomens -> player.league = getString(R.string.womens)
            R.id.toggleButtonCoed   -> player.league = getString(R.string.coed)
        }
    }

    /**
     * They clicked the next button.
     */
    fun buttonNextClicked(@Suppress("UNUSED_PARAMETER")view: View)
    {
        // Get your intent straight.
        val skillIntent = Intent (this, SkillActivity::class.java)

        // Add some extras.
        skillIntent.putExtra (EXTRA_PLAYER, player)

        // Fire her up!
        startActivity (skillIntent)
    }
}