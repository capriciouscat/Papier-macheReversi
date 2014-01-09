package com.gameapp.reversi;

import android.app.Activity;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.widget.LinearLayout;

public class ReversiActivity extends Activity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		//画面を縦方向で固定する
		setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
		//レイアウトを用意する
		LinearLayout l = new LinearLayout(this);
		setContentView(l);
		l.addView(new ReversiView(this));
	}

}
