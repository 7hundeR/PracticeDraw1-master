package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.util.AttributeSet;
import android.view.View;

public class Practice8DrawArcView extends View {

    Paint mPaint = new Paint();

    public Practice8DrawArcView(Context context) {
        super(context);
    }

    public Practice8DrawArcView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice8DrawArcView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        练习内容：使用 canvas.drawArc() 方法画弧形和扇形

        mPaint.setStyle(Paint.Style.FILL);
        canvas.drawArc(getWidth() / 2 - 240, getHeight() / 2 - 120, getWidth() / 2 + 240, getHeight() / 2 + 120, -110, 80, true, mPaint);
        mPaint.setStyle(Paint.Style.STROKE);
        canvas.drawArc(getWidth() / 2 - 240, getHeight() / 2 - 120, getWidth() / 2 + 240, getHeight() / 2 + 120, -180, 60, false, mPaint);
        mPaint.setStyle(Paint.Style.FILL);
        canvas.drawArc(getWidth() / 2 - 240, getHeight() / 2 - 120, getWidth() / 2 + 240, getHeight() / 2 + 120, 30, 120, false, mPaint);
    }
}
