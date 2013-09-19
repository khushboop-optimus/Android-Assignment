package com.example.module;

import com.example.adapters.*;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ExpandableListView;
import com.example.androidapplication_views.*;

public class ExpandableListViewFragment extends Fragment {

	ExpandableListView expandListView;
	ExpandListAdapter adapter;

	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View myFragmentView2 = inflater.inflate(R.layout.exlist, null, false);
		adapter = new ExpandListAdapter(this.getActivity());
		expandListView = (ExpandableListView) myFragmentView2
				.findViewById(R.id.expandableListView);
		expandListView.setAdapter(adapter);
		return myFragmentView2;
	}

}