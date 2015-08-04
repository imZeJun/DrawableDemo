package com.demo.drawableresource;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class LevelListDrawableActivity extends AppCompatActivity {

	private static final int MAX_LEVEL = 3;
	private int mLevel = 1;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_level_list_drawable);
		final ImageView imageView = (ImageView) findViewById(R.id.image);
		imageView.setImageLevel(2);
		imageView.setClickable(true);
		imageView.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				if (mLevel == MAX_LEVEL) {
					mLevel = 0;
				} else {
					mLevel++;
				}
				//这时候再setImageLevel(int level)没有用了。
				imageView.getDrawable().setLevel(mLevel);
			}
		});
	}

}
