package com.demo.drawableresource;

import android.graphics.drawable.ScaleDrawable;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;


public class ScaleDrawableActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_scale_drawable);
		ImageView imageView = (ImageView) findViewById(R.id.image);
		ScaleDrawable scaleDrawable = (ScaleDrawable) imageView.getDrawable();
		//setLevel为0时，不显示，setLevel为1时为scale中所设置的百分比，其范围为1-10000，和ClipDrawable，RotateDrawable类似。
		scaleDrawable.setLevel(10000);
	}

}
