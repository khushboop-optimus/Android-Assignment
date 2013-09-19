package com.example.adapters;

import com.example.details.*;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.TextView;

public class ExpandListAdapter extends BaseExpandableListAdapter {
	private Context context;
	private String[] parentList = new String[5];
	private String[][] childList = new String[5][2];

	public ExpandListAdapter(Context context) {
		this.context = context;
		int k;
		for (int j = 0; j < 5; j++) {
			parentList[j] = ExpandableListTestData.getParent(j);
			for (k = 0; k < 2; k++) {
				childList[j][k] = ExpandableListTestData.getChild(j, k);
			}
			k = 0;
		}
	}

	@Override
	public int getGroupCount() {
		return parentList.length;
	}

	@Override
	public int getChildrenCount(int i) {
		return childList[i].length;
	}

	@Override
	public Object getGroup(int i) {
		return i;
	}

	@Override
	public Object getChild(int i, int i2) {
		return null;
	}

	@Override
	public long getGroupId(int i) {
		return i;
	}

	@Override
	public long getChildId(int i, int i2) {
		return 0;
	}

	@Override
	public boolean hasStableIds() {
		return false;
	}

	@Override
	public View getGroupView(int i, boolean b, View view, ViewGroup viewGroup) {
		TextView tv = new TextView(context);
		// tv.setTextScaleX(15);
		tv.setText(parentList[i]);
		return tv;
	}

	@Override
	public View getChildView(int i, int i2, boolean b, View view,
			ViewGroup viewGroup) {
		TextView tv = new TextView(context);
		tv.setText(childList[i][i2]);
		return tv;
	}

	@Override
	public boolean isChildSelectable(int i, int i2) {
		return true;
	}
}