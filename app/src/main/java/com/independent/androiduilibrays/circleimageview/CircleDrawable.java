package com.independent.androiduilibrays.circleimageview;

import android.graphics.*;
import android.graphics.drawable.Drawable;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class CircleDrawable extends Drawable {

    private Paint mPaint;
    private int mWidth; //宽/高，直径
    private Bitmap mBitmap;

    public CircleDrawable(Bitmap bitmap) {
        this.mBitmap = bitmap;
        BitmapShader bitmapShader = new BitmapShader(mBitmap, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP);//着色器 水平和竖直都需要填充满
        mPaint = new Paint();
        mPaint.setAntiAlias(true);
        mPaint.setShader(bitmapShader);
        mWidth = Math.min(mBitmap.getWidth(), mBitmap.getHeight()); //宽高的最小值作为直径
    }

    @Override
    public void draw(@NonNull Canvas canvas) {
        canvas.drawCircle(mWidth/2, mWidth/2, mWidth/2, mPaint); //绘制圆形
    }

    @Override
    public void setAlpha(@IntRange(from = 0, to = 255) int i) {
        mPaint.setAlpha(i);
    }

    @Override
    public void setColorFilter(@Nullable ColorFilter colorFilter) {
        mPaint.setColorFilter(colorFilter);
    }

    @Override
    public int getOpacity() {
        return PixelFormat.TRANSLUCENT; //设置系统默认，让drawable支持和窗口一样的透明度
    }

    //还需要从重写以下2个方法，返回drawable实际宽高
    @Override
    public int getIntrinsicWidth() {
        return mWidth;
    }

    @Override
    public int getIntrinsicHeight() {
        return mWidth;
    }
}
