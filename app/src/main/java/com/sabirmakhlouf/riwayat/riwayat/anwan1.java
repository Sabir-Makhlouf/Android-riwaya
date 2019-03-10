package com.sabirmakhlouf.riwayat.riwayat;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;

public class anwan1 extends AppCompatActivity {
TextView txt1,txt2,txt3,txt4,txt5;
    private InterstitialAd mInterstitialAd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anwan1);
        txt1 = (TextView) findViewById(R.id.t1);
        txt2 = (TextView) findViewById(R.id.textView021);
        txt3 = (TextView) findViewById(R.id.textView041);
        txt4 = (TextView) findViewById(R.id.textView051);
        txt5 = (TextView) findViewById(R.id.textView031);
        mInterstitialAd = new InterstitialAd(this);
        mInterstitialAd.setAdUnitId("ca-app-pub-1237823773164410/2329546886");
        mInterstitialAd.loadAd(new AdRequest.Builder().build());

    }

    public void txt5(View view) {        if (mInterstitialAd.isLoaded()) {
        mInterstitialAd.show();
    } else {
        //  Log.d("TAG", "The interstitial wasn't loaded yet.");
    }

        Intent intent = new Intent(anwan1.this, txt3.class);
        startActivity(intent);
    }

    public void txt4(View view) {        if (mInterstitialAd.isLoaded()) {
        mInterstitialAd.show();
    } else {
        //  Log.d("TAG", "The interstitial wasn't loaded yet.");
    }

        Intent intent = new Intent(anwan1.this, txt5.class);
        startActivity(intent);

    }

    public void txt3(View view) {        if (mInterstitialAd.isLoaded()) {
        mInterstitialAd.show();
    } else {
        //  Log.d("TAG", "The interstitial wasn't loaded yet.");
    }

        Intent intent = new Intent(anwan1.this, txt4.class);
        startActivity(intent);

    }

    public void txt2(View view) {        if (mInterstitialAd.isLoaded()) {
        mInterstitialAd.show();
    } else {
        //  Log.d("TAG", "The interstitial wasn't loaded yet.");
    }

        Intent intent = new Intent(anwan1.this, txt2.class);
        startActivity(intent);

    }

    public void txt1(View view) {        if (mInterstitialAd.isLoaded()) {
        mInterstitialAd.show();
    } else {
        //  Log.d("TAG", "The interstitial wasn't loaded yet.");
    }

        Intent intent = new Intent(anwan1.this, txt1.class);
        startActivity(intent);

    }
}
//By Sabir Makhlouf