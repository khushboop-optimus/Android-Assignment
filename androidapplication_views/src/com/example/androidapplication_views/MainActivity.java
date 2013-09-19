package com.example.androidapplication_views;

import com.example.module.*;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTransaction;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class MainActivity extends FragmentActivity {

	private Button btn1, btn2, btn3;
	private Fragment frag1 = new InitialFragment();

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		btn1 = (Button) findViewById(R.id.list);
		btn2 = (Button) findViewById(R.id.grid);
		btn3 = (Button) findViewById(R.id.exlist);
		FragmentTransaction ft = getSupportFragmentManager().beginTransaction();

		ft.add(R.id.myfragment, frag1);
		ft.commit();
		btn1.setOnClickListener(btnOnClickListener);
		btn2.setOnClickListener(btnOnClickListener);
		btn3.setOnClickListener(btnOnClickListener);

	}

	Button.OnClickListener btnOnClickListener = new Button.OnClickListener() {
		@Override
		public void onClick(View v) {
			Fragment newfragment;
			newfragment = frag1;
			if (v == btn1) {
				newfragment = new ListViewFragment();
			}

			else if (v == btn2) {
				newfragment = new GridViewFragment();
			} else if (v == btn3) {
				newfragment = new ExpandableListViewFragment();
			} else {
				newfragment = new InitialFragment();
			}

			FragmentTransaction transaction = getSupportFragmentManager()
					.beginTransaction();
			transaction.replace(R.id.myfragment, newfragment);
			transaction.addToBackStack(null);
			transaction
					.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
			transaction.commit();
		}

	};

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
