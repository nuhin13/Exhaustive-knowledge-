package com.nuhin13.ExhaustiveKnowledge;

import android.app.ActionBar;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Point;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.Display;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.GridView;
import android.widget.Toast;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;

public class MainActivity extends ActionBarActivity {

	GridView gd;
	int count = -1;

	int addCounter = 2;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		gd = (GridView) findViewById(R.id.gridview);
		ImageAdapterFORactivity im = new ImageAdapterFORactivity(
				MainActivity.this);
		// display size contoller

		Display display = getWindowManager().getDefaultDisplay();
		Point size = new Point();
		display.getSize(size);
		int width = size.x;
		int height = size.y;

		im.height = height;
		im.width = width;
		gd.setAdapter(im);

		ActionBar actionBar = getActionBar();
		actionBar.setBackgroundDrawable(new ColorDrawable(Color
				.parseColor("#708090")));
		actionBar.setStackedBackgroundDrawable(new ColorDrawable(Color
				.parseColor("#550000ff")));

		gd.setOnItemClickListener(new OnItemClickListener() {
			public void onItemClick(AdapterView<?> parent, View v,
					int position, long id) {

				if (position == 0) {

					final Intent intent = new Intent(getApplicationContext(),
							step1.class);

					startActivity(intent);

				}

				else if (position == 1) {
					final Intent intent = new Intent(getApplicationContext(),
							step2.class);

					startActivity(intent);
				} else if (position == 2) {
					final Intent intent = new Intent(getApplicationContext(),
							step3.class);

					startActivity(intent);
				} else if (position == 3) {
					final Intent intent = new Intent(getApplicationContext(),
							step4.class);

					startActivity(intent);
				} else if (position == 4) {
					final Intent intent = new Intent(getApplicationContext(),
							step5.class);

					startActivity(intent);
				}

				else if (position == 5) {
					final Intent intent = new Intent(getApplicationContext(),
							step6.class);

					startActivity(intent);
				} else if (position == 6) {
					final Intent intent = new Intent(getApplicationContext(),
							step7.class);

					startActivity(intent);
				} else if (position == 7) {
					final Intent intent = new Intent(getApplicationContext(),
							step8.class);

					startActivity(intent);
				}

				else if (position == 8) {
					final Intent intent = new Intent(getApplicationContext(),
							step9.class);

					startActivity(intent);
				}

				else if (position == 9) {
					final Intent intent = new Intent(getApplicationContext(),
							step10.class);

					startActivity(intent);
				} else if (position == 10) {
					final Intent intent = new Intent(getApplicationContext(),
							scienceANDtechnology.class);

					startActivity(intent);
				}

				else if (position == 11) {
					final Intent intent = new Intent(getApplicationContext(),
							bangladesh.class);

					startActivity(intent);
				}

				else if (position == 12) {
					final Intent intent = new Intent(getApplicationContext(),
							international.class);

					startActivity(intent);
				} else if (position == 13) {
					final Intent intent = new Intent(getApplicationContext(),
							sports.class);

					startActivity(intent);
				} else if (position == 14) {
					final Intent intent = new Intent(getApplicationContext(),
							abbrebiation.class);

					startActivity(intent);
				}

				else if (position == 15) {
					final Intent intent = new Intent(getApplicationContext(),
							mcq.class);

					startActivity(intent);
				}

			}
		});

		initAd();

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		MenuInflater inflater = getMenuInflater();
		inflater.inflate(R.menu.main, menu);
		return super.onCreateOptionsMenu(menu);
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

	InterstitialAd mInterstitialAd;

	@Override
	public void onResume() {
		super.onResume(); // Always call the superclass method first

		if (mInterstitialAd.isLoaded() == false) {
			LoadAdd();
		}
		// Get the Camera instance as the activity achieves full user focus
		count = count + 1;
		if (count % addCounter == 0) {
			// Toast.makeText(MainActivity.this, count, Toast.LENGTH_SHORT)
			// .show();
			displayAd();
			Log.d("cnt", "" + count);

			if (count == 2) {
				addCounter++;
			}
		}
	}

	private void initAd() {
		// Create the InterstitialAd and set the adUnitId.
		mInterstitialAd = new InterstitialAd(MainActivity.this);
		// Defined in values/strings.xml
		mInterstitialAd.setAdUnitId("ca-app-pub-9971154848057782/1986029758");
	}

	private void displayAd() {
		// Show the ad if it's ready. Otherwise toast and restart the game.
		if (mInterstitialAd != null && mInterstitialAd.isLoaded()) {
			mInterstitialAd.show();
		} else {
			// Toast.makeText(MainActivity.this, "Ad did not load",
			// Toast.LENGTH_SHORT).show();
			// LoadAdd();
			/*
			 * if (!mInterstitialAd.isLoaded()) {
			 * Toast.makeText(MainActivity.this, "not load",
			 * Toast.LENGTH_SHORT).show(); } else {
			 * Toast.makeText(MainActivity.this, "  not ", Toast.LENGTH_SHORT)
			 * .show(); }
			 */
		}
	}

	private void LoadAdd() {
		// Hide the retry button, load the ad, and start the timer.

		// initAd();
		AdRequest adRequest = new AdRequest.Builder().build();
		mInterstitialAd.loadAd(adRequest);
		// Toast.makeText(MainActivity.this, "loading",
		// Toast.LENGTH_SHORT).show();
	}
}
