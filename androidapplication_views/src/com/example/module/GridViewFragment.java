package com.example.module;

import com.example.androidapplication_views.*;
import com.example.details.*;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.GridView;
import android.widget.Toast;
import com.example.adapters.*;

public class GridViewFragment extends Fragment {
	private GridView gv;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		View myFragmentGridView = inflater.inflate(R.layout.grid, null, false);
		ImageAdapter imgadaptor = new ImageAdapter(this.getActivity());
		gv = (GridView) myFragmentGridView.findViewById(R.id.gridView);
		gv.setAdapter(imgadaptor);

		gv.setOnItemClickListener(new OnItemClickListener() {
			@Override
			public void onItemClick(AdapterView<?> parentView, View iv,
					int position, long id) {
				Toast.makeText(getActivity().getApplicationContext(),
						"" + position, Toast.LENGTH_SHORT).show();
				Intent i = new Intent(getActivity().getApplicationContext(),
						ImageDetail.class);
				i.putExtra("id", position);
				startActivity(i);

			}
		});
		return myFragmentGridView;
	}

}
