package com.example.module;

import com.example.adapters.*;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import com.example.androidapplication_views.*;

public class ListViewFragment extends Fragment {

	private ListView list1;
	private ListAdapter adapter1;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub

		View myFragmentView = inflater.inflate(R.layout.list, null, false);

		adapter1 = new ListAdapter(this.getActivity());
		list1 = (ListView) myFragmentView.findViewById(R.id.listView1);
		list1.setAdapter(adapter1);
		list1.setSelectionFromTop(0, 0);
		adapter1.notifyDataSetChanged();
		return myFragmentView;

	}

}