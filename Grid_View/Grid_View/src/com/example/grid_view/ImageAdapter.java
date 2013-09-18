package com.example.grid_view;

import android.content.Context;
import android.net.Uri;
import android.os.Environment;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.AbsListView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.ListAdapter;

import java.io.File;
import java.io.FilenameFilter;
import java.net.URI;

public class ImageAdapter extends BaseAdapter implements ListAdapter {
	
	static int [] images = {
			R.drawable.ic_launcher,R.drawable.ic_launcher,
			R.drawable.ic_launcher,R.drawable.ic_launcher,
			R.drawable.ic_launcher,R.drawable.ic_launcher,
			R.drawable.ic_launcher,R.drawable.ic_launcher,
			R.drawable.ic_launcher,R.drawable.ic_launcher,
			R.drawable.ic_launcher,R.drawable.ic_launcher,
			R.drawable.ic_launcher,R.drawable.ic_launcher,
			R.drawable.ic_launcher,R.drawable.ic_launcher
	};
	private Context context;
    Uri[] iurls;
    String[] ifiles=null;
    public Uri[] getImages()
    {
        File images= Environment.getExternalStorageDirectory();
        File[] imglist= images.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return ((name.endsWith(".jpg"))||(name.endsWith(".png")));
            }
        });
        ifiles=new String[imglist.length];
        for (int i=0;i<imglist.length;i++)
            ifiles[i]=imglist[i].getAbsolutePath();

    iurls = new Uri[ifiles.length];
    for(int i=0;i<ifiles.length;i++) {
        iurls[i] = Uri.parse(ifiles[i]);
    }
        return iurls;
    }

	public ImageAdapter(Context applicationContext){
		context=applicationContext;
	}
	public int getCount() {
		// TODO Auto-generated method stub
		//return images.length;\
        return getImages().length;
	}


	public Object getItem(int position) {
		// TODO Auto-generated method stub
		return null;
	}


	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return 0;
	}


	public View getView(int position, View convertView, ViewGroup parent) {
		ImageView iv;
		if(convertView!=null){
		iv=(ImageView)convertView;	
		}
		else {
			iv= new ImageView(context);

			iv.setLayoutParams(new GridView.LayoutParams(80, 80));
			iv.setScaleType(ScaleType.CENTER_CROP);
			iv.setPadding(8, 8, 8, 8);
		}
		//iv.setImageResource(images[position]);
        iv.setImageURI(getImages()[position]);
		return iv;
	}

}
