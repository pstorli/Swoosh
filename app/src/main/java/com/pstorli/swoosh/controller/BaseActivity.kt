package com.pstorli.swoosh.controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.pstorli.swoosh.util.*
import android.util.Log
import com.pstorli.swoosh.util.LOG_LIFECYCLE_EVENTS

open class BaseActivity : AppCompatActivity() {


    // /////////////////////////////////////////////////////////////////////////////////////////////
    // Starting
    // /////////////////////////////////////////////////////////////////////////////////////////////

    /**
     * OnCreate
     */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        if (LOG_LIFECYCLE_EVENTS) Log.d(TAG, "OnCreate  ${javaClass.simpleName}")
    }

    /**
     * OnStart
     */
    override fun onStart() {
        super.onStart()
        if (LOG_LIFECYCLE_EVENTS) Log.d(TAG, "OnStart   ${javaClass.simpleName}")
    }

    /**
     * OnResume
     */
    override fun onResume() {
        super.onResume()
        if (LOG_LIFECYCLE_EVENTS) Log.d(TAG, "OnResume  ${javaClass.simpleName}")
    }

    /**
     * OnRestart
     */
    override fun onRestart() {
        super.onRestart()
        if (LOG_LIFECYCLE_EVENTS) Log.d(TAG, "OnRestart ${javaClass.simpleName}")
    }

    // /////////////////////////////////////////////////////////////////////////////////////////////
    // Stopping
    // /////////////////////////////////////////////////////////////////////////////////////////////

    /**
     * OnPause
     */
    override fun onPause() {
        super.onPause()
        if (LOG_LIFECYCLE_EVENTS) Log.d(TAG, "OnPause   ${javaClass.simpleName}")
    }

    /**
     * OnStop
     */
    override fun onStop() {
        super.onStop()
        if (LOG_LIFECYCLE_EVENTS) Log.d(TAG, "OnStop    ${javaClass.simpleName}")
    }

    /**
     * OnDestroy
     */
    override fun onDestroy() {
        super.onDestroy()
        if (LOG_LIFECYCLE_EVENTS) Log.d(TAG,"OnDestroy ${javaClass.simpleName}")
    }
}