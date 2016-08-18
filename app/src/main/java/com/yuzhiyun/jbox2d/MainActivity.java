package com.yuzhiyun.jbox2d;

 

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

public class MainActivity extends BaseActivity implements View.OnClickListener{

	Button btnPlay;
	Button btnLearnSurfaceView;






	@Override
	protected void setLayoutView() {
		setContentView(R.layout.activity_main);
	}

	@Override
	protected void findView() {
		btnPlay= (Button) findViewById(R.id.btnPlay);
		btnLearnSurfaceView= (Button) findViewById(R.id.btnLearnSurfaceView);
	}

	@Override
	protected void setListener() {
		btnPlay.setOnClickListener(this);
		btnLearnSurfaceView.setOnClickListener(this);
	}

	@Override
	protected void initOther() {

	}

	@Override
	public void onClick(View v) {
		switch (v.getId()){
			case R.id.btnPlay:
				startActivity(new Intent(context,PlayActivity.class));
				break;
			case R.id.btnLearnSurfaceView:
				startActivity(new Intent(context,LearnSurfaceViewActivity.class));
				break;
		}
	}
}