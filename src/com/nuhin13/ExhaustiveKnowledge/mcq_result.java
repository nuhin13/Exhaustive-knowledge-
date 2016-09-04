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
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

public class mcq_result extends Activity {

	public int selected;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.others);

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
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {

		if (item.getItemId() == R.id.credit) {
			final Intent intent = new Intent(getApplicationContext(),
					Credit.class);

			startActivity(intent);

		}
		return true;
	}

	public Dialog onCreateDialogSingleChoice() {

		// Initialize the Alert Dialog
		AlertDialog.Builder builder = new AlertDialog.Builder(this);
		// Source of the data in the DIalog
		final String[] array = { "প্রথম", "দ্বিতীয়", "তৃতীয়", "চতুর্থ",
				"পঞ্চম", "ষষ্ঠ", "সপ্তম" };

		// Set the dialog title
		builder.setTitle("Select Category")

				.setSingleChoiceItems(array, 0,
						new DialogInterface.OnClickListener() {

							@Override
							public void onClick(DialogInterface dialog,
									int which) {

								selected = which;
							}
						})

				// Set the action buttons
				.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface dialog, int id) {

						switch (selected) {
						case 0:
							try {

								setContentView(R.layout.mcq_result);

								InputStream is = getAssets()
										.open("result1.txt");

								int size = is.available();

								byte[] buffer = new byte[size];

								is.read(buffer);

								is.close();

								String text = new String(buffer, "UTF-8");

								TextView tv = (TextView) findViewById(R.id.mcq_result);
								tv.setTypeface(Typeface.createFromAsset(
										getAssets(), "BenSenHandwriting.ttf"),
										Typeface.BOLD);
								tv.setTextColor(Color.parseColor("#FFFFFF"));
								tv.setText(text);

							} catch (IOException e) {

								throw new RuntimeException(e);
							}
							break;

						case 1:
							try {
								setContentView(R.layout.mcq_result);

								InputStream is = getAssets()
										.open("result2.txt");

								int size = is.available();

								byte[] buffer = new byte[size];

								is.read(buffer);

								is.close();

								String text = new String(buffer, "UTF-8");

								TextView tv = (TextView) findViewById(R.id.mcq_result);
								tv.setTypeface(Typeface.createFromAsset(
										getAssets(), "BenSenHandwriting.ttf"),
										Typeface.BOLD);
								tv.setTextColor(Color.parseColor("#FFFFFF"));
								tv.setText(text);

							} catch (IOException e) {

								throw new RuntimeException(e);
							}
							break;

						case 2:
							try {

								setContentView(R.layout.mcq_result);

								InputStream is = getAssets()
										.open("result3.txt");

								int size = is.available();

								byte[] buffer = new byte[size];

								is.read(buffer);

								is.close();

								String text = new String(buffer, "UTF-8");

								TextView tv = (TextView) findViewById(R.id.mcq_result);
								tv.setTypeface(Typeface.createFromAsset(
										getAssets(), "BenSenHandwriting.ttf"),
										Typeface.BOLD);
								tv.setTextColor(Color.parseColor("#FFFFFF"));
								tv.setText(text);

							} catch (IOException e) {

								throw new RuntimeException(e);
							}
							break;

						case 3:
							try {
								setContentView(R.layout.mcq_result);

								InputStream is = getAssets()
										.open("result4.txt");

								int size = is.available();

								byte[] buffer = new byte[size];

								is.read(buffer);

								is.close();

								String text = new String(buffer, "UTF-8");

								TextView tv = (TextView) findViewById(R.id.mcq_result);
								tv.setTypeface(Typeface.createFromAsset(
										getAssets(), "BenSenHandwriting.ttf"),
										Typeface.BOLD);
								tv.setTextColor(Color.parseColor("#FFFFFF"));
								tv.setText(text);

							} catch (IOException e) {

								throw new RuntimeException(e);
							}
							break;

						case 4:
							try {

								setContentView(R.layout.mcq_result);

								InputStream is = getAssets()
										.open("result5.txt");

								int size = is.available();

								byte[] buffer = new byte[size];

								is.read(buffer);

								is.close();

								String text = new String(buffer, "UTF-8");

								TextView tv = (TextView) findViewById(R.id.mcq_result);
								tv.setTypeface(Typeface.createFromAsset(
										getAssets(), "BenSenHandwriting.ttf"),
										Typeface.BOLD);
								tv.setTextColor(Color.parseColor("#FFFFFF"));
								tv.setText(text);

							} catch (IOException e) {

								throw new RuntimeException(e);
							}
							break;

						case 5:
							try {

								setContentView(R.layout.mcq_result);

								InputStream is = getAssets()
										.open("result6.txt");

								int size = is.available();

								byte[] buffer = new byte[size];

								is.read(buffer);

								is.close();

								String text = new String(buffer, "UTF-8");

								TextView tv = (TextView) findViewById(R.id.mcq_result);
								tv.setTypeface(Typeface.createFromAsset(
										getAssets(), "BenSenHandwriting.ttf"),
										Typeface.BOLD);
								tv.setTextColor(Color.parseColor("#FFFFFF"));
								tv.setText(text);

							} catch (IOException e) {

								throw new RuntimeException(e);
							}
							break;

						case 6:
							try {

								setContentView(R.layout.mcq_result);

								InputStream is = getAssets()
										.open("result7.txt");

								int size = is.available();

								byte[] buffer = new byte[size];

								is.read(buffer);

								is.close();

								String text = new String(buffer, "UTF-8");

								TextView tv = (TextView) findViewById(R.id.mcq_result);
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

	@Override
	protected void onResume() {
		// TODO Auto-generated method stub
		super.onResume();
		// finishActivity(selected);
	}
}
