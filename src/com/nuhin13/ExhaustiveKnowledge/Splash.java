package com.nuhin13.ExhaustiveKnowledge;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;

public class Splash extends Activity {

	
	MediaPlayer ourSong;
	protected void onCreate(Bundle redflag) {
		// TODO Auto-generated method stub
		super.onCreate(redflag);
		setContentView(R.layout.splash_xml);
		
		
		Thread timer = new Thread(){
			public void run()
			{
				try
				{
					sleep(2000);
					
				}catch(InterruptedException e)
				{
					e.printStackTrace();
					
				}
				finally
				{
					Intent start = new Intent(Splash.this,MainActivity.class);
					startActivity(start);
					finish();
				}
				
			}
			
		};
		
		timer.start();
	}

	/*@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		ourSong.release();
		finish();
	}*/
	/*@Override
	public void onResume() {
		super.onResume();
		finish();
		}
	*/
	

}
