package com.example.adapters;

import android.content.Context;
import android.net.Uri;
import android.os.Environment;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.ListAdapter;

import java.io.File;
import java.io.FilenameFilter;

public class ImageAdapter extends BaseAdapter implements ListAdapter {

	public static int[] images;
	private Context context;
	private Uri[] iurls;
	private String[] ifiles = null;

	public Uri[] getImages() {
		final File images = Environment.getExternalStorageDirectory();
		final File[] imglist = images.listFiles(new FilenameFilter() {
			@Override
			public boolean accept(File dir, String name) {
				return ((name.endsWith(".jpg")) || (name.endsWith(".png")));
			}
		});
		ifiles = new String[imglist.length];
		for (int i = 0; i < imglist.length; i++)
			ifiles[i] = imglist[i].getAbsolutePath();

		iurls = new Uri[ifiles.length];
		for (int i = 0; i < ifiles.length; i++) {
			iurls[i] = Uri.parse(ifiles[i]);
		}
		return iurls;
	}

	public ImageAdapter(Context applicationContext) {
		context = applicationContext;
	}

	public int getCount() {
		// TODO Auto-generated method stub
		// return images.length;\
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
		if (convertView != null) {
			iv = (ImageView) convertView;
		} else {
			iv = new ImageView(context);

			iv.setLayoutParams(new GridView.LayoutParams(80, 80));
			iv.setScaleType(ScaleType.CENTER_CROP);
			iv.setPadding(8, 8, 8, 8);
		}
		// iv.setImageResource(images[position]);
		iv.setImageURI(getImages()[position]);
		return iv;
	}

}
