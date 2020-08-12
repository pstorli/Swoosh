package com.pstorli.swoosh

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

open class BaseActivity : AppCompatActivity() {
    val TAG = "LifeCycle"

    // /////////////////////////////////////////////////////////////////////////////////////////////
    // Starting
    // /////////////////////////////////////////////////////////////////////////////////////////////

    /**
     * OnCreate
     */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        Log.d(TAG, "OnCreate ${javaClass.simpleName}")
    }

    /**
     * OnStart
     */
    override fun onStart() {
        super.onStart()
        Log.d(TAG, "OnStart  ${javaClass.simpleName}")
    }

    /**
     * OnResume
     */
    override fun onResume() {
        super.onResume()
        Log.d(TAG, "OnResume ${javaClass.simpleName}")
    }

    /**
     * OnRestart
     */
    override fun onRestart() {
        super.onRestart()
        Log.d(TAG, "OnRestart ${javaClass.simpleName}")
    }

    // /////////////////////////////////////////////////////////////////////////////////////////////
    // Stopping
    // /////////////////////////////////////////////////////////////////////////////////////////////

    /**
     * OnPause
     */
    override fun onPause() {
        super.onPause()
        Log.d(TAG, "OnPause  ${javaClass.simpleName}")
    }

    /**
     * OnStop
     */
    override fun onStop() {
        super.onStop()
        Log.d(TAG, "OnStop   ${javaClass.simpleName}")
    }

    /**
     * OnDestroy
     */
    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "OnDestroy ${javaClass.simpleName}")
    }
}