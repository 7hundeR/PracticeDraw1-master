package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Build;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.util.AttributeSet;
import android.view.View;

public class Practice11PieChartView extends View {

    private Paint paintPie = new Paint(Paint.ANTI_ALIAS_FLAG);


    public Practice11PieChartView(Context context) {
        super(context);
        init();
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init() {

    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画饼图

        int width = getWidth() / 2;
        int height = getHeight() / 2;
        paintPie.setColor(Color.YELLOW);
        canvas.drawArc(width-300, height-300, width + 300, height + 300, 0, -70, true, paintPie);

        paintPie.setColor(Color.WHITE);
        canvas.drawArc(width-300, height-300, width + 300, height + 300, 5, 15, true, paintPie);

        paintPie.setColor(Color.GREEN);
        canvas.drawArc(width-300, height-300, width + 300, height + 300, 25, 35, true, paintPie);

        paintPie.setColor(Color.BLUE);
        canvas.drawArc(width-300, height-300, width + 300, height + 300, 65, 80, true, paintPie);

        paintPie.setColor(Color.RED);
        canvas.drawArc(width-320, height-320, width + 280, height + 280, 150, 140, true, paintPie);
    }
}
