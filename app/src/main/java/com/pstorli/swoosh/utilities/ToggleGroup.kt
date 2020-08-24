package com.pstorli.swoosh.utilities

import android.content.Context
import android.util.AttributeSet
import android.view.View
import android.widget.CompoundButton
import android.widget.RadioGroup

class ToggleGroup (context: Context, attrs: AttributeSet): RadioGroup (context, attrs) {

    /**
     * Turn this one on, the rest off.
     */
    override fun check(id: Int) {
        // Loop thru kids.
        for (i in 0 until getChildCount()) {
            val view: View = getChildAt(i)
            val vid = view.id

            // Turn on or off
            if (view is CompoundButton) {
                view.setChecked(id == vid)
            }
        }
    }

    /**
     * Listen for child clicks.
     */
    override fun setOnClickListener(l: OnClickListener?) {
        // Loop thru kids.
        for (i in 0 until getChildCount()) {
            val view: View = getChildAt(i)
            if (view is CompoundButton) {
                view.setOnClickListener(l)
            }
        }
    }
}