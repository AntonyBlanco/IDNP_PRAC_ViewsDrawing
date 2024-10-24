package com.ablancotunsa.viewsdrawing;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

public class FaceView extends View {
    private Paint paint = new Paint();

    public FaceView(Context context, AttributeSet attrs) {
        super(context);
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        drawFace(canvas);
    }

    private void drawFace(Canvas canvas) {
        paint.setColor(Color.GREEN);
        paint.setStyle(Paint.Style.FILL);
        canvas.drawCircle(200f, 200f, 100f, paint);

        paint.setColor(Color.BLACK);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(10f);
        canvas.drawCircle(200f, 200f, 100f, paint);
        canvas.drawCircle(165f, 170f, 15f, paint); // Ojo izquierdo
        canvas.drawCircle(235f, 170f, 15f, paint); // Ojo derecho
        canvas.drawArc(145f, 145f, 255f, 255f, 45f, 90f, false, paint);
    }
}
