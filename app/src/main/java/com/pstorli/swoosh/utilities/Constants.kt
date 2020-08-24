package com.pstorli.swoosh.utilities

import android.util.Log

/**
 * Created by Pete Storli
 */

const val TAG                       = "LifeCycle"
const val LOG_LIFECYCLE_EVENTS      = false
const val EXTRA_PLAYER              = "player"


/**
 * Log it baby. // TODO: Does not currently work due to access?
 */
fun log (msg:String)
{
    Log.d (TAG, msg)
}