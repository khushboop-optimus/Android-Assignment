package com.example.android_assignment1;

import android.app.Fragment;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class StartFragment extends Fragment{

	
	
	 public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
		  return inflater.inflate(R.layout.startfragment, container, false);
}
}