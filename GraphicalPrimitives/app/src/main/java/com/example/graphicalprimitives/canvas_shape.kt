package com.example.graphicalprimitives
import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.util.AttributeSet
import android.view.View
class canvas_shape @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0
) : View(context, attrs, defStyleAttr) {
    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)
        val paint : Paint= Paint()
        paint.setColor(Color.RED)
        canvas?.drawPaint(paint)
        paint.setColor(Color.BLACK)
        canvas?.drawLine(520f,850f,520f,1150f,paint)
        paint.setColor(Color.BLACK)
        canvas?.drawCircle(200f,350f,150f,paint)
        paint.setColor(Color.GREEN)
        canvas?.drawRect(50f,850f,350f,1150f,paint)
        paint.setColor(Color.BLUE)
        canvas?.drawRect(400f,150f,650f,700f,paint)
        paint.setColor(Color.BLUE)
        canvas?.drawOval(500f,2000f,800f,1500f,paint)

    }
}