package com.sabirmakhlouf.riwayat.riwayat;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;

public class Main2Activity extends AppCompatActivity {
TextView button1,button2,button3,button4,button5;
    private InterstitialAd mInterstitialAd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        button1 = (TextView) findViewById(R.id.textView01);
        button2 = (TextView) findViewById(R.id.textView02);
        button3 = (TextView) findViewById(R.id.textView04);
        button4 = (TextView) findViewById(R.id.textView05);
        button5 = (TextView) findViewById(R.id.textView03);

        mInterstitialAd = new InterstitialAd(this);
        mInterstitialAd.setAdUnitId("ca-app-pub-1237823773164410/2329546886");
        mInterstitialAd.loadAd(new AdRequest.Builder().build());

    }


    public void txt1(View view) {
        if (mInterstitialAd.isLoaded()) {
            mInterstitialAd.show();
        } else {
          //  Log.d("TAG", "The interstitial wasn't loaded yet.");
        }

        Intent intent = new Intent(Main2Activity.this, anwan1.class);
        startActivity(intent);
    }

    public void txt2(View view) {
        Intent intent = new Intent(Main2Activity.this, anwan2.class);
        startActivity(intent);
        if (mInterstitialAd.isLoaded()) {
            mInterstitialAd.show();
        } else {
            //  Log.d("TAG", "The interstitial wasn't loaded yet.");
        }
    }

    public void txt3(View view) {
        Intent intent = new Intent(Main2Activity.this, anwan3.class);
        startActivity(intent);
        if (mInterstitialAd.isLoaded()) {
            mInterstitialAd.show();
        } else {
            //  Log.d("TAG", "The interstitial wasn't loaded yet.");
        }
    }

    public void txt4(View view) {
        Intent intent = new Intent(Main2Activity.this, anwan4.class);
        startActivity(intent);
        if (mInterstitialAd.isLoaded()) {
            mInterstitialAd.show();
        } else {
            //  Log.d("TAG", "The interstitial wasn't loaded yet.");
        }
    }

    public void txt5(View view) {
        Intent intent = new Intent(Main2Activity.this, anwan5.class);
        startActivity(intent);
        if (mInterstitialAd.isLoaded()) {
            mInterstitialAd.show();
        } else {
            //  Log.d("TAG", "The interstitial wasn't loaded yet.");
        }
    }
}
//By Sabir Makhlouf