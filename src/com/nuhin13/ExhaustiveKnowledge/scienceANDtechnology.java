package com.nuhin13.ExhaustiveKnowledge;

import java.io.IOException;
import java.io.InputStream;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class scienceANDtechnology extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.science_technology);

		try {

			InputStream is = getAssets().open("science & Technology.txt");

			int size = is.available();

			byte[] buffer = new byte[size];

			is.read(buffer);

			is.close();

			String text = new String(buffer, "UTF-8");

			TextView tv = (TextView) findViewById(R.id.science_technology);
			tv.setTypeface(Typeface.createFromAsset(getAssets(),
					"BenSenHandwriting.ttf"), Typeface.BOLD);
			tv.setTextColor(Color.parseColor("#FFFFFF"));
			tv.setText(text);

		} catch (IOException e) {
			// Should never happen!
			throw new RuntimeException(e);
		}

		ActionBar actionBar = getActionBar();
		actionBar.setBackgroundDrawable(new ColorDrawable(Color
				.parseColor("#708090")));
		actionBar.setStackedBackgroundDrawable(new ColorDrawable(Color
				.parseColor("#550000ff")));
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {

		if (item.getItemId() == R.id.credit) {
			final Intent intent = new Intent(getApplicationContext(),
					Credit.class);
			// intent.putExtra(TestConstants.SELCTED_SCENE_KEY,
			// position);
			startActivity(intent);

		}
		return true;
	}

}
