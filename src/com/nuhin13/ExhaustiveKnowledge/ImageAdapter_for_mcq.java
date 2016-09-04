package com.nuhin13.ExhaustiveKnowledge;

import android.content.Context;
import android.database.DataSetObserver;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

public class ImageAdapter_for_mcq extends BaseAdapter {
	private Context mContext;
	float height;
	float width;
	  // Constructor
	   public ImageAdapter_for_mcq(Context c) {
	      mContext = c;
	   }

	   public int getCount() {
	      return mThumbIds.length;
	   }

	   public Object getItem(int position) {
	      return null;
	   }

	   public long getItemId(int position) {
	      return 0;
	   }

	public View getView(int position, View convertView, ViewGroup parent) {
	      ImageView imageView;
	      if (convertView == null) {
	      imageView = new ImageView(mContext);
	      
		imageView.setLayoutParams(new GridView.LayoutParams(( int) ((385/(float)720)*width) ,( int)(280/(float)1280*height)));
	      imageView.setScaleType(ImageView.ScaleType.FIT_XY);
	      imageView.setPadding(25,10,25,10);
	      } else {
	      imageView = (ImageView) convertView;
	      }

	      imageView.setImageResource(mThumbIds[position]);
	      return imageView;
	   }

	   // Keep all Images in array
	   public Integer[] mThumbIds = {
	      R.drawable.mcq1st ,R.drawable.mcq2nd ,R.drawable.mcq3rd ,R.drawable.mcq4th ,R.drawable.mcq5th ,
	      R.drawable.mcq6th,R.drawable.mcq7th,R.drawable.mcq_results
	   };   
	      
	@Override
	public int getItemViewType(int position) {
		// TODO Auto-generated method stub
		return 1;
	}

	@Override
	public int getViewTypeCount() {
		// TODO Auto-generated method stub
		return 1;
	}

	@Override
	public boolean hasStableIds() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public void registerDataSetObserver(DataSetObserver observer) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void unregisterDataSetObserver(DataSetObserver observer) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean areAllItemsEnabled() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isEnabled(int position) {
		// TODO Auto-generated method stub
		return true;
	}
	  }
