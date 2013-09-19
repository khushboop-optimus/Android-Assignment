package com.example.views;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

public class ImageDetail extends Activity {

@Override
protected void onCreate(Bundle savedInstanceState) {
// TODO Auto-generated method stub
super.onCreate(savedInstanceState);
setContentView(R.layout.imagedetail);
Intent i = getIntent();
int position=(Integer) i.getExtras().get("id");
        ImageView iv = (ImageView) findViewById(R.id.imageView);
        iv.setImageResource(ImageAdapter.images[position]);
}
}
