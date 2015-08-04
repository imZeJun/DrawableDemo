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
        //Ҫ����setBackground(Drawable drawable)���У�����setImageDrawable(Drawable drawable)����bitmap���е�tileModeû���á�
        imageView.setBackground(bitmapDrawable);
        if (bitmapDrawable != null) {
            Bitmap bitmap = bitmapDrawable.getBitmap();
            imageView.setImageBitmap(bitmap); //��ν�һ��Drawable����ת����ΪBitmap����
        }
    }

}
