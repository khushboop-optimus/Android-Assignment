package com.example.views;


import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.TextView;

public class ExpandListAdapter extends BaseExpandableListAdapter {
    private Context context;
    String[] parentList = {"India", "Pakistan", "USA", "Australia", "England"};
    String[][] childList = {
            {
                    "Delhi","Mumbai"
            },
            {
                    "Islamabad","Karachi"
            },
            {
                    "Chicago","New York"
            },
            {
                    "Sydney","Melbourne"
            },
            {
                    "Manchester","London"
            }
    };
    public ExpandListAdapter(Context context) {
        this.context=context;
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
        tv.setText(parentList[i]);
        return tv;
    }

    @Override
    public View getChildView(int i, int i2, boolean b, View view, ViewGroup viewGroup) {
        TextView tv = new TextView(context);
        tv.setText(childList[i][i2]);
        return tv;
    }

    @Override
    public boolean isChildSelectable(int i, int i2) {
        return true;
    }
}