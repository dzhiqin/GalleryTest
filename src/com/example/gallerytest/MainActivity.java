package com.example.gallerytest;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Gallery;
import android.widget.ImageView;

public class MainActivity extends Activity {

	protected final static int[] images={
		R.drawable.tiger1,
		R.drawable.tiger2,
		R.drawable.tiger3,
		R.drawable.tiger4};
	@SuppressWarnings("deprecation")
	private Gallery gallery;
	private ImageView imageView;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		imageView=(ImageView)findViewById(R.id.image_view);
		imageView.setImageResource(R.drawable.tiger2);
		gallery=(Gallery)findViewById(R.id.my_gallery);
		gallery.setAdapter(new ImageAdapter(MainActivity.this));
		gallery.setSpacing(10);
		gallery.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

			@Override
			public void onItemSelected(AdapterView<?> arg0, View arg1,
					int arg2, long arg3) {
				// TODO 自动生成的方法存根
				imageView.setImageResource(images[arg2]);
			}

			@Override
			public void onNothingSelected(AdapterView<?> arg0) {
				// TODO 自动生成的方法存根
				
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
