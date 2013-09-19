package com.example.views;

import android.app.Activity;
import android.content.Context;
import android.database.DataSetObserver;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

public class ListAdapter extends BaseAdapter {
	
	Context context;
	List l1;
	
	public ListAdapter(Context context)
	{
		this.context=context;
	}
	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return 100;
	}

	@Override
	public Object getItem(int position) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return 0;
	}

	 
	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub
		   View row = convertView;
		 //LayoutInflater vi =   (LayoutInflater)this.getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
         //v = vi.inflate(R.layout.listview_item_row, null);
         
         
         LayoutInflater inflater = ((Activity)context).getLayoutInflater();
         row = inflater.inflate(R.layout.listview_item_row, parent, false);
		return row;
	}

}
