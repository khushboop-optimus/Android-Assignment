package com.example.views;


import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ExpandableListView;

public class Exlist extends Fragment{

    ExpandableListView expandListView;
    ExpandListAdapter adapter;
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
    	View myFragmentView2 = inflater.inflate(R.layout.exlist, null, false);
    	adapter=new ExpandListAdapter(this.getActivity());
    	expandListView=(ExpandableListView)myFragmentView2.findViewById(R.id.expandableListView);
    	expandListView.setAdapter(adapter);
    	return myFragmentView2;
    }
    
}