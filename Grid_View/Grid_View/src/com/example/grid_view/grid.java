package com.example.grid_view;

import android.os.Bundle;
import android.app.Activity;
import android.widget.GridView;

public class grid extends Activity {
	@Override
	
	public void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		android.widget.GridView gv = (GridView) findViewById(R.id.gridView);
		gv.setAdapter(new ImageAdapter(getApplicationContext()));
		
	}

}
