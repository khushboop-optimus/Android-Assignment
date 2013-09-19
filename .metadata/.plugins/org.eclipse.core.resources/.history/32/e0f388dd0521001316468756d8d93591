package com.example.expandablelist;


import android.app.Activity;
import android.os.Bundle;
import android.widget.ExpandableListView;

public class ExpandableList extends Activity{

    ExpandableListView exv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        exv = (ExpandableListView)findViewById (R.id.expandableListView);
        exv.setAdapter(new MyAdapter(this));

}
}