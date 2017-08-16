package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice10HistogramView extends View {
    private Paint mPaint;
    private Paint mRectPaint;

    public Practice10HistogramView(Context context) {
        super(context);
        init();
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init(){
        mPaint = new Paint();
        mRectPaint = new Paint();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画直方图

        mPaint.setColor(Color.WHITE);
        mPaint.setTextSize(26);
        mRectPaint.setColor(Color.GREEN);

        canvas.drawLine(100,100,100,600,mPaint);
        canvas.drawLine(100,600,1400,600,mPaint);

        canvas.drawRect(150,590,250,600,mRectPaint);
        canvas.drawText("Froyo",150,630,mPaint);

        canvas.drawRect(300,580,400,600,mRectPaint);
        canvas.drawText("GB",320,630,mPaint);

        canvas.drawRect(450,580,550,600,mRectPaint);
        canvas.drawText("ICS",450,630,mPaint);

        canvas.drawRect(600,400,700,600,mRectPaint);
        canvas.drawText("JB",600,630,mPaint);

        canvas.drawRect(750,300,850,600,mRectPaint);
        canvas.drawText("KitKat",750,630,mPaint);

        canvas.drawRect(900,100,1000,600,mRectPaint);
        canvas.drawText("L",900,630,mPaint);
    }
}
