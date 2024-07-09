package com.example.customviews.views

import android.content.Context
import android.graphics.Color
import android.util.AttributeSet
import androidx.appcompat.widget.AppCompatTextView

class AdvancedTextView(context: Context,attrs:AttributeSet):AppCompatTextView(context,attrs) {

    fun highlightText(highlight:Boolean){
        if(highlight) {
            setTextColor((Color.RED))
        }
        else{
            setTextColor(Color.BLACK)
        }
    }

}