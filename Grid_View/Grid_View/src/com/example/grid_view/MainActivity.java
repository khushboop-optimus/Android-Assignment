package com.example.grid_view;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		GridView gv = (GridView) findViewById(R.id.gridView);
		gv.setAdapter(new ImageAdapter(getApplicationContext()));
        gv.setOnItemClickListener(new OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parentView, View iv, int position, long id) {
                Toast.makeText(getApplicationContext(), ""+position,Toast.LENGTH_SHORT).show();
                //Intent i = new Intent(getApplicationContext(),ImageDetail.class);
                //i.putExtra("id", position);
                //startActivity(i);
            }
        });
	}    

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
