package com.example.gallerytest;

import com.example.gallerytest.R.styleable;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Gallery;
import android.widget.ImageView;

public class ImageAdapter extends BaseAdapter{

	public int galleryItemBackground;
	private Context mcontext;
	
	public ImageAdapter(Context c){
		mcontext=c;
	
		
	}
	
	@Override
	public int getCount() {
		// TODO �Զ����ɵķ������
		return MainActivity.images.length;
	}

	@Override
	public Object getItem(int arg0) {
		// TODO �Զ����ɵķ������
		return null;
	}

	@Override
	public long getItemId(int arg0) {
		// TODO �Զ����ɵķ������
		return arg0;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		ImageView imageView=new ImageView(mcontext);
		imageView.setImageResource(MainActivity.images[position]);
		imageView.setScaleType(ImageView.ScaleType.CENTER);
		imageView.setLayoutParams(new Gallery.LayoutParams(100,200));
		return imageView;
	}

}
