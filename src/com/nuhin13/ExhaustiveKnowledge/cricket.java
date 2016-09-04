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
import android.text.util.Linkify;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class cricket extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.cricket);

		try {

			InputStream is = getAssets().open("cricket.txt");

			int size = is.available();

			byte[] buffer = new byte[size];

			is.read(buffer);

			is.close();

			String text = new String(buffer, "UTF-8");

			TextView tv = (TextView) findViewById(R.id.sportsCricket);
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

		final TextView Odi = (TextView) findViewById(R.id.webOdi);
		final TextView Test = (TextView) findViewById(R.id.webTest);
		final TextView T20 = (TextView) findViewById(R.id.webT20);
		Odi.setText("Visit More Details For ODI:    "
				+ "http://en.wikipedia.org/wiki/List_of_One_Day_International_cricket_records");
		Test.setText("Visit More Details For TEST:    "
				+ " http://en.wikipedia.org/wiki/List_of_Test_cricket_records");
		T20.setText("Visit More Details For T20:    "
				+ "http://en.wikipedia.org/wiki/List_of_Twenty20_International_records");
		Linkify.addLinks(Odi, Linkify.WEB_URLS);
		Linkify.addLinks(Test, Linkify.WEB_URLS);
		Linkify.addLinks(T20, Linkify.WEB_URLS);

		Odi.setTextColor(Color.parseColor("#FFFFFF"));
		Test.setTextColor(Color.parseColor("#FFFFFF"));
		T20.setTextColor(Color.parseColor("#FFFFFF"));

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

}

অনুগ্রহ পূর্বক অপেক্ষা করুণ 

দৈনিক প্রথম আলো  http://www.prothom-alo.com
দৈনিক ইত্তেফাক   http://www.ittefaq.com.bd/
দৈনিক আমারদেশ  http://www.amardeshonline.com/
দৈনিক সমকাল    http://www.samakal.net/
দৈনিক আমাদেরসময়  http://www.amadershomoys.com/
দৈনিক নয়া-দিগন্ত   http://www.dailynayadiganta.com/
দৈনিক কালের-কণ্ঠ  http://www.kalerkantho.com/
দৈনিক যায় যায় দিন   http://www.jjdin.com/
দৈনিক বাংলাদেশ প্রতিদিন  http://www.bd-pratidin.com/index.php
দৈনিক ইনকিলাব  http://www.dailyinqilab.com/
দৈনিক মানবজমিন  http://www.mzamin.com/
দৈনিক সংগ্রাম http://www.dailysangram.com/
দৈনিক ভোরের কাগজ 
দৈনিক জণকন্ঠ http://www.dailyjanakantha.com/
দৈনিক যুগান্তর  http://www.jugantor.com/
দৈনিক সংবাদ http://www.sangbad.com.bd/
দৈনিক সকালের খবর http://shokalerkhobor24.com/
দৈনিক গণকন্ঠ http://www.gonokantho.com/
দৈনিক বনিকবার্তা http://www.bonikbarta.com/
দৈনিক আমাদের অর্থনীতি http://www.amaderorthonete.com/
দৈনিক ভোরের ডাক 
দৈনিক দিনকাল http://www.dailydinkal.net/
দৈনিক মানবকণ্ঠ  http://www.manobkantha.com/
দৈনিক আলোকিত বাংলাদেশ 


The Daily Independent http://independent24.tv/
The Daily Sun  http://www.daily-sun.com/
The Daily Dhaka Tribune http://www.dhakatribune.com/
The Daily Star http://www.thedailystar.net/
The Daily New Age http://newagebd.net/
The Daily Observer http://www.observerbd.com/
The Daily Bangladesh Today 
The Daily Hawker http://www.hawker.com.bd/
The Daily Gurdian  http://www.theguardian.com/international
The Daily News Today http://www.newstoday.com.bd/
The Daily Prothom-alo http://www.prothom-alo.com
The Daily Financial Express
The Daily Good Morning
The Daily Bd News24 http://bangla.bdnews24.com/
The Daily Golf News http://gulfnews.com/news/asia/bangladesh
The Daily Economist http://www.economist.com/topics/bangladesh


Bangla News24  http://www.banglanews24.com/
Bd News24 http://bangla.bdnews24.com/
Priyo http://www.priyo.com/
Bangla Mail24 http://www.banglamail24.com/
Bangla Tribune http://www.banglatribune.com/
Barta Bangla  http://bartabangla.com/
BBC Bangla http://www.bbc.co.uk/bengali
BD24 Live  http://www.bd24live.com/bangla/
Dhaka Times http://www.dhakatimes24.com/
BD View24 http://bdview24.com/bn/
Sheersha News http://www.sheershanewsbd.com/
Poriborton http://www.poriborton.com/
Bss http://www.bssnews.net/bangla/
Channel24 http://www.channel24bd.tv/
DMP News http://dmpnews.org/
Dnewsbd http://dnewsbd.com/
Independent TV http://independent24.tv/
DW http://www.dw.de/%E0%A6%AC%E0%A6%BF%E0%A6%B7%E0%A7%9F/s-11929
Jago News24 http://www.jagonews24.com/
NTV http://www.ntvbd.com/
RTNN http://www.rtnn.net/bangla/
Risingbd http://www.risingbd.com/
Techtunes  http://www.techtunes.com.bd/
VOA http://www.voabangla.com/
Tuner Page http://tunerpage.com/
Somoyer Konthosor http://www.somoyerkonthosor.com/



সিলেটের আলাপ http://sylheteralap.com/
আমাদের সিলেট http://www.amadersylhet.com/
সিলেটের সকাল  http://sylhetersokal.com/
ডেইলি সিলেট http://dailysylhet.com/
সিলেটের সংবাদ  http://www.sylhetersongbad.com/
সিলেট এক্সপ্রেস  http://www.sylhetexpress.com/
Sylhet News24 http://sylhetnews24.com/
সিলেট নিউজ টাইম  http://www.sylhetnewstimes.com/
সিলেট নিউজ ওয়াল্ড http://www.sylhetnewsworld.com/
সিলেট রিপোর্ট http://sylhetreport.com/
Sylhet View24 http://www.sylhetview24.com/
Sylhet Watch24 http://sylhetwatch24.com/
সুরমা টাইম http://surmatimes.com/
হবিগঞ্জ নিউজ ২৪   http://www.habiganjnews24.com/


দৈনিক আজাদি  http://www.dainikazadi.org/index1.php
দৈনিক পূর্বকোণ  http://www.dainikpurbokone.net/
সুপ্রভাত বাংলাদেশ http://www.suprobhat.com/
দৈনিক পূর্বদেশ http://epurbodesh.com/
চিটাগং ডেইলি                          http://ctgtimes.com/ 
Cakariya News http://www.chakarianews.com/
Cox's Baar News http://www.coxsbazarnews.com/
রামু নিউজ  http://www.ramunews.com/
টেকনাফ নিউজ http://www.teknafnews.com/
 

Khulna News http://www.khulnanews.com/
সাতক্ষিরা নিউজ http://satkhiranews.com/
দৈনিক পূর্বাচল  http://www.purbanchal.com/
আন্দোলনের বাজার http://dailyandolonerbazar.com/
পত্রদুত http://patradoot.net/

News Pabna  http://www.newspabna.com/
দৈনিক করতোয়া  http://www.karatoa.com.bd/
সোনালী সংবাদ http://www.sonalisangbad.com/
মাথাভাঙ্গা  http://www.mathabhanga.com/
মেহেরপুর সংবাদ http://www.meherpurnews.com/
সংবাদ কনিকা http://www.sangbadkonika.com/

 
 আজকের জামালপুর http://www.ajkerjamalpur.com/
 চলমান নোয়াখালী http://www.chalomannoakhali.com/
 গ্রামের কাগজ http://gramerkagoj.com/
 লোক সংবাদ http://www.loksangbad.com/
 দিনাজপুর নিউজ https://dinajpurnews.com/
 United News24 http://www.unitednews24.com/
 নতুন খবর http://notunkhobor.com/
 
 
 সিলেট 
 চট্টগ্রাম 
 খুলনা 
 রাজশাহী
 অন্যান্য  

টেকটিউনস    http://www.techtunes.com.bd/
Tuner Page http://tunerpage.com/
প্রিয় টেক http://tech.priyo.com/
টেক্টুইটস  http://techtweets.com.bd/
বিজ্ঞান ও প্রযুক্তি  http://www.bigganprojukti.com/
Teck Kotha  http://www.techkotha.com/
মৌমাছি.net  http://moumachi.net/
স্বপ্নবায.net
দৈনিক আলোকিত বাংলাদেশ 
 
		item.add("Bangla Cricket");   http://www.banglacricket.com/

        item.add("Bangladesh Khela");  http://www.bangladesherkhela.com/
 
        item.add("Espn Cricinfo");  http://www.espncricinfo.com/

        item.add("Espn Fc");  http://www.espnfc.com/

        item.add("Fifa");  http://www.fifa.com/

        item.add("Goal");  http://www.goal.com/

        item.add("BBC Sports");  http://www.bbc.com/sport

        item.add("Bangladesh Cricket");  http://www.bangladeshcricket.com/

        item.add("Bangladesh Football"); http://www.bff.com.bd/bff/

        item.add("Khelar jagat"); http://www.khelarjagat.com/