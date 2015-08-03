package com.demo.drawableresource;

import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

public class StateListDrawableActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_state_list_drawable);
		ImageView imageView = (ImageView) findViewById(R.id.image_code);
		StateListDrawable stateListDrawable = new StateListDrawable();
		stateListDrawable.addState(new int[]{ android.R.attr.state_pressed }, //°´ÏÂ×´Ì¬¡£
				getResources().getDrawable(android.R.color.holo_green_dark, null));
		stateListDrawable.addState(new int[]{}, //Ä¬ÈÏ×´Ì¬¡£
				getResources().getDrawable(android.R.color.holo_green_light, null));
		imageView.setClickable(true);
		imageView.setImageDrawable(stateListDrawable);
	}

}
