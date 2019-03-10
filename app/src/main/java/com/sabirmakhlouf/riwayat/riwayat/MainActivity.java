package com.sabirmakhlouf.riwayat.riwayat;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
Button buttonm1,buttonm2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonm1 = (Button) findViewById(R.id.buttonm1);
        buttonm2 = (Button) findViewById(R.id.buttonm2);

    }



    public void buttonm1(View view) {
        Intent intent = new Intent(MainActivity.this, Main2Activity.class);
        startActivity(intent);

    }
    public void button4(View view) {
        Intent intent = new Intent(MainActivity.this, Main3Activity.class);
        startActivity(intent);

    }

    public void buttonm2(View view) {
        Uri uri = Uri.parse("http://www.gg-projects.blogspot.com");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);

    }

    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    public void buttonm3(View view) {
        finishAffinity();

    }
}
//By Sabir Makhlouf