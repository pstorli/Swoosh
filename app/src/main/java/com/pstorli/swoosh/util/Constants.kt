package com.pstorli.swoosh.util

import android.util.Log

/**
 * Created by Pete Storli
 */

const val TAG                       = "LifeCycle"
const val LOG_LIFECYCLE_EVENTS      = false
const val EXTRA_LEAGUE              = "league"
const val EXTRA_SKILL               = "skill"

/**
 * Log it baby. // TODO: Does not currently work due to access?
 */
fun log (msg:String)
{
    Log.d (TAG, msg)
}