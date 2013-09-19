
package com.example.views;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ListView;

public class List extends Fragment{
  
	 ListView list1;
	 EditText e1;
	 ListAdapter adapter1;
	 
	 @Override
		public View onCreateView(LayoutInflater inflater, ViewGroup container,
				Bundle savedInstanceState) {
			// TODO Auto-generated method stub
			
		 
		 	View myFragmentView = inflater.inflate(R.layout.list, null, false);
			 
		 	adapter1=new ListAdapter(this.getActivity());
			list1=(ListView)myFragmentView.findViewById(R.id.listView1);
			list1.setAdapter(adapter1);	
			adapter1.notifyDataSetChanged();
			
			/*this.getActivity().runOnUiThread(new Runnable() {
			    public void run() {
			    	adapter1.notifyDataSetChanged();		        
			    }
			});*/
			return myFragmentView;
					
	
		}
	 
	

}