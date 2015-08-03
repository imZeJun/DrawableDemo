package com.demo.drawableresource;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;


public class BitmapDrawableActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bitmap_drawable);
        ImageView imageView = (ImageView) findViewById(R.id.image);
        Drawable drawable = getResources().getDrawable(R.drawable.icon_bitmap, null);
        BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
        //要调用setBackground(Drawable drawable)才行，调用setImageDrawable(Drawable drawable)对于bitmap当中的tileMode没有用。
        imageView.setBackground(bitmapDrawable);
        if (bitmapDrawable != null) {
            Bitmap bitmap = bitmapDrawable.getBitmap();
            imageView.setImageBitmap(bitmap); //如何将一个Drawable对象转换成为Bitmap对象。
        }
    }

}
