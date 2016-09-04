package com.nuhin13.ExhaustiveKnowledge;

import java.io.IOException;
import java.io.InputStream;

import android.app.ActionBar;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.util.Linkify;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.TextView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.GridView;

public class sports extends Activity {
	GridView gd;
	
	public int selected;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.sports);

		
		
		Dialog dialog = onCreateDialogSingleChoice();
		dialog.show();
		
		ActionBar actionBar = getActionBar();
		actionBar.setBackgroundDrawable(new ColorDrawable(Color
				.parseColor("#708090")));
		actionBar.setStackedBackgroundDrawable(new ColorDrawable(Color
				.parseColor("#550000ff")));
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
	
	public Dialog onCreateDialogSingleChoice() {

		// Initialize the Alert Dialog
		AlertDialog.Builder builder = new AlertDialog.Builder(this);
		// Source of the data in the DIalog
		final String[] array = { "ক্রিকেট", "ফুটবল", "অন্যান্য" };

		// Set the dialog title
		builder.setTitle("Select Category")
				// Specify the list array, the items to be selected by default
				// (null for none),
				// and the listener through which to receive callbacks when
				// items are selected
				.setSingleChoiceItems(array, 0,
						new DialogInterface.OnClickListener() {

							@Override
							public void onClick(DialogInterface dialog,
									int which) {
								// TODO Auto-generated method stub
								// Toast.makeText(getApplicationContext(),
								// array[which], Toast.LENGTH_SHORT).show();
								selected = which;
							}
						})

				// Set the action buttons
				.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface dialog, int id) {
						// User clicked OK, so save the result somewhere
						// or return them to the component that opened the
						// dialog

						switch (selected) {
						case 0:
							try {

								setContentView(R.layout.cricket);
								
								InputStream is = getAssets().open(
										"cricket.txt");

								int size = is.available();

								byte[] buffer = new byte[size];

								is.read(buffer);

								is.close();

								String text = new String(buffer, "UTF-8");

								TextView tv = (TextView) findViewById(R.id.sportsCricket);
								tv.setTypeface(Typeface.createFromAsset(
										getAssets(), "BenSenHandwriting.ttf"),
										Typeface.BOLD);
								tv.setTextColor(Color.parseColor("#FFFFFF"));
								tv.setText(text);

							} catch (IOException e) {

								throw new RuntimeException(e);
							}
							
							final TextView Odi = (TextView) findViewById(R.id.webOdi);
							final TextView Test = (TextView) findViewById(R.id.webTest);
							final TextView T20 = (TextView) findViewById(R.id.webT20);
					        Odi.setText("Visit More Details For ODI:    " +
					        		"http://en.wikipedia.org/wiki/List_of_One_Day_International_cricket_records");
					        Test.setText("Visit More Details For TEST:    " +
					        		" http://en.wikipedia.org/wiki/List_of_Test_cricket_records");
					        T20.setText("Visit More Details For T20:    " +
					        		"http://en.wikipedia.org/wiki/List_of_Twenty20_International_records");
					        Linkify.addLinks(Odi, Linkify.WEB_URLS);
					        Linkify.addLinks(Test, Linkify.WEB_URLS);
					        Linkify.addLinks(T20, Linkify.WEB_URLS);
					        
					        Odi.setTextColor(Color.parseColor("#FFFFFF"));
					        Test.setTextColor(Color.parseColor("#FFFFFF"));
					        T20.setTextColor(Color.parseColor("#FFFFFF"));

							break;

						case 1:
							try {
								setContentView(R.layout.football);
								

								InputStream is = getAssets().open(
										"football.txt");

								int size = is.available();

								byte[] buffer = new byte[size];

								is.read(buffer);

								is.close();

								String text = new String(buffer, "UTF-8");

								TextView tv = (TextView) findViewById(R.id.sportsFootball);
								tv.setTypeface(Typeface.createFromAsset(
										getAssets(), "BenSenHandwriting.ttf"),
										Typeface.BOLD);
								tv.setTextColor(Color.parseColor("#FFFFFF"));
								tv.setText(text);

							} catch (IOException e) {

								throw new RuntimeException(e);
							}
							
							final TextView Fifa = (TextView) findViewById(R.id.webFifa);
							Fifa.setText("Visit More Details For FIFA WORLD CUP RECORD :    "
									+ "http://en.wikipedia.org/wiki/FIFA_World_Cup_records");
							Linkify.addLinks(Fifa, Linkify.WEB_URLS);

							Fifa.setTextColor(Color.parseColor("#FFFFFF"));
							break;

							
						case 2:
							try {

								setContentView(R.layout.cricket);
								
								InputStream is = getAssets().open(
										"sports_other.txt");

								int size = is.available();

								byte[] buffer = new byte[size];

								is.read(buffer);

								is.close();

								String text = new String(buffer, "UTF-8");

								TextView tv = (TextView) findViewById(R.id.sportsCricket);
								tv.setTypeface(Typeface.createFromAsset(
										getAssets(), "BenSenHandwriting.ttf"),
										Typeface.BOLD);
								tv.setTextColor(Color.parseColor("#FFFFFF"));
								tv.setText(text);

							} catch (IOException e) {

								throw new RuntimeException(e);
							}
							break;
						default:
							break;
						}

					}
				})
				.setNegativeButton("Cancel",
						new DialogInterface.OnClickListener() {
							@Override
							public void onClick(DialogInterface dialog, int id) {
								finish();
							}
							
						});

		return builder.create();
	}
}
