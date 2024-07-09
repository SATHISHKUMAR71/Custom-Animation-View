package com.example.customviews.views

import android.animation.ObjectAnimator
import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.util.AttributeSet
import android.view.View

class AnimatedCircle @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0
) : View(context, attrs, defStyleAttr) {

    private var paint:Paint = Paint();
    private var mRadius = 100f
    private var objectAnimator = ObjectAnimator()



    init {
        paint.setColor(Color.YELLOW)
        val objAnimator = ObjectAnimator.ofFloat(this,"radius",0f,200f)
        with(objAnimator){
            setDuration(1000)
            repeatCount = ObjectAnimator.INFINITE
            repeatMode = ObjectAnimator.REVERSE
            start()
        }
    }

    fun setRadius(radius:Float){
        mRadius = radius
        invalidate()
    }
    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)

        canvas.drawCircle(width/2f,height/2f,mRadius,paint)
    }
}