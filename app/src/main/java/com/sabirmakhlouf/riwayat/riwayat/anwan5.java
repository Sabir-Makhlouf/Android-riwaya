package com.sabirmakhlouf.riwayat.riwayat;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;

public class anwan5 extends AppCompatActivity {
    TextView txt1,txt2,txt3,txt5;
    private InterstitialAd mInterstitialAd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anwan5);
        txt1 = (TextView) findViewById(R.id.textView011);
        txt2 = (TextView) findViewById(R.id.textView021);
        txt5 = (TextView) findViewById(R.id.textView031);
        mInterstitialAd = new InterstitialAd(this);
        mInterstitialAd.setAdUnitId("ca-app-pub-1237823773164410/2329546886");
        mInterstitialAd.loadAd(new AdRequest.Builder().build());

    }

    public void txt2(View view) {        if (mInterstitialAd.isLoaded()) {
        mInterstitialAd.show();
    } else {
        //  Log.d("TAG", "The interstitial wasn't loaded yet.");
    }

        Intent intent = new Intent(anwan5.this, txt5_2.class);
        startActivity(intent);

    }

    public void txt5(View view) {        if (mInterstitialAd.isLoaded()) {
        mInterstitialAd.show();
    } else {
        //  Log.d("TAG", "The interstitial wasn't loaded yet.");
    }

        Intent intent = new Intent(anwan5.this, txt5_3.class);
        startActivity(intent);

    }

    public void txt1(View view) {        if (mInterstitialAd.isLoaded()) {
        mInterstitialAd.show();
    } else {
        //  Log.d("TAG", "The interstitial wasn't loaded yet.");
    }

        Intent intent = new Intent(anwan5.this, txt5_1.class);
        startActivity(intent);

    }
}
//By Sabir Makhlouf