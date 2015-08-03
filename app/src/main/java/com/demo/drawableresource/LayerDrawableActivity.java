package com.demo.drawableresource;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

public class LayerDrawableActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_layer_drawable);
		ImageView imageView = (ImageView) findViewById(R.id.image);
		Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.icon);
		Drawable[] drawables = new Drawable[3];
		drawables[0] = new BitmapDrawable(getResources(), bitmap);
		drawables[1] = new BitmapDrawable(getResources(), bitmap);
		drawables[2] = new BitmapDrawable(getResources(), bitmap);
		LayerDrawable layerDrawable = new LayerDrawable(drawables);
		layerDrawable.setLayerInset(0, 0, 0, 0, 0);
		layerDrawable.setLayerInset(1, 10, 10, 10, 10);
		layerDrawable.setLayerInset(2, 20, 20, 20, 20);
		imageView.setImageDrawable(layerDrawable);
	}
}
