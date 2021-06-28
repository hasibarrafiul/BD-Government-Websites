package com.techrz.governmentwebsites;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;

public class Health extends AppCompatActivity {


    private InterstitialAd mInterstitialAd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_health);

        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
                createPersonalizedAdd();
            }
        });



        Button b1= findViewById(R.id.health1);
        Button b2= findViewById(R.id.health2);
        Button b3= findViewById(R.id.health3);
        Button b4= findViewById(R.id.health4);
        Button b5= findViewById(R.id.health5);
        Button b6= findViewById(R.id.health6);
        Button b7= findViewById(R.id.health7);
        Button b8= findViewById(R.id.health8);
        Button b9= findViewById(R.id.health9);
        Button b10= findViewById(R.id.health10);
        Button b11= findViewById(R.id.health11);
        Button b12= findViewById(R.id.health12);
        Button b13= findViewById(R.id.health13);
        Button b14= findViewById(R.id.health14);
        Button b15= findViewById(R.id.health15);


        b1.setOnClickListener(v -> {
            homeActivity.link ="https://corona.gov.bd";
            Intent i=new Intent(Health.this,webview.class);
            startActivity(i);
            if (mInterstitialAd != null) {
                mInterstitialAd.show(Health.this);
            } else {
                Log.d("TAG", "The interstitial ad wasn't ready yet.");
            }
        });

        b2.setOnClickListener(v -> {
            homeActivity.link ="https://www.mohfw.gov.bd";
            Intent i=new Intent(Health.this,webview.class);
            startActivity(i);
            if (mInterstitialAd != null) {
                mInterstitialAd.show(Health.this);
            } else {
                Log.d("TAG", "The interstitial ad wasn't ready yet.");
            }
        });

        b3.setOnClickListener(v -> {
            homeActivity.link ="https://dghs.gov.bd/index.php/en/home";
            Intent i=new Intent(Health.this,webview.class);
            startActivity(i);
            if (mInterstitialAd != null) {
                mInterstitialAd.show(Health.this);
            } else {
                Log.d("TAG", "The interstitial ad wasn't ready yet.");
            }
        });

        b4.setOnClickListener(v -> {
            homeActivity.link ="https://hsd.gov.bd";
            Intent i=new Intent(Health.this,webview.class);
            startActivity(i);
            if (mInterstitialAd != null) {
                mInterstitialAd.show(Health.this);
            } else {
                Log.d("TAG", "The interstitial ad wasn't ready yet.");
            }
        });

        b5.setOnClickListener(v -> {
            homeActivity.link ="https://mohfw.portal.gov.bd";
            Intent i=new Intent(Health.this,webview.class);
            startActivity(i);
            if (mInterstitialAd != null) {
                mInterstitialAd.show(Health.this);
            } else {
                Log.d("TAG", "The interstitial ad wasn't ready yet.");
            }
        });

        b6.setOnClickListener(v -> {
            homeActivity.link ="https://www.dphe.gov.bd";
            Intent i=new Intent(Health.this,webview.class);
            startActivity(i);
            if (mInterstitialAd != null) {
                mInterstitialAd.show(Health.this);
            } else {
                Log.d("TAG", "The interstitial ad wasn't ready yet.");
            }
        });
        b7.setOnClickListener(v -> {
            homeActivity.link ="https://dgfp.gov.bd";
            Intent i=new Intent(Health.this,webview.class);
            startActivity(i);
            if (mInterstitialAd != null) {
                mInterstitialAd.show(Health.this);
            } else {
                Log.d("TAG", "The interstitial ad wasn't ready yet.");
            }
        });

        b8.setOnClickListener(v -> {
            homeActivity.link ="https://www.communityclinic.gov.bd";
            Intent i=new Intent(Health.this,webview.class);
            startActivity(i);
            if (mInterstitialAd != null) {
                mInterstitialAd.show(Health.this);
            } else {
                Log.d("TAG", "The interstitial ad wasn't ready yet.");
            }
        });

        b9.setOnClickListener(v -> {
            homeActivity.link ="https://mefwd.gov.bd";
            Intent i=new Intent(Health.this,webview.class);
            startActivity(i);
            if (mInterstitialAd != null) {
                mInterstitialAd.show(Health.this);
            } else {
                Log.d("TAG", "The interstitial ad wasn't ready yet.");
            }
        });

        b10.setOnClickListener(v -> {
            homeActivity.link ="https://www.hed.gov.bd";
            Intent i=new Intent(Health.this,webview.class);
            startActivity(i);
            if (mInterstitialAd != null) {
                mInterstitialAd.show(Health.this);
            } else {
                Log.d("TAG", "The interstitial ad wasn't ready yet.");
            }
        });

        b11.setOnClickListener(v -> {
            homeActivity.link ="https://www.heu.gov.bd";
            Intent i=new Intent(Health.this,webview.class);
            startActivity(i);
            if (mInterstitialAd != null) {
                mInterstitialAd.show(Health.this);
            } else {
                Log.d("TAG", "The interstitial ad wasn't ready yet.");
            }
        });

        b12.setOnClickListener(v -> {
            homeActivity.link ="https://hospitaldghs.gov.bd";
            Intent i=new Intent(Health.this,webview.class);
            startActivity(i);
            if (mInterstitialAd != null) {
                mInterstitialAd.show(Health.this);
            } else {
                Log.d("TAG", "The interstitial ad wasn't ready yet.");
            }
        });
        b13.setOnClickListener(v -> {
            homeActivity.link ="https://www.dgda.gov.bd";
            Intent i=new Intent(Health.this,webview.class);
            startActivity(i);
            if (mInterstitialAd != null) {
                mInterstitialAd.show(Health.this);
            } else {
                Log.d("TAG", "The interstitial ad wasn't ready yet.");
            }
        });

        b14.setOnClickListener(v -> {
            homeActivity.link ="https://www.nilmrc.gov.bd";
            Intent i=new Intent(Health.this,webview.class);
            startActivity(i);
            if (mInterstitialAd != null) {
                mInterstitialAd.show(Health.this);
            } else {
                Log.d("TAG", "The interstitial ad wasn't ready yet.");
            }
        });
        b15.setOnClickListener(v -> {
            homeActivity.link ="https://surokkha.gov.bd";
            Intent i=new Intent(Health.this,webview.class);
            startActivity(i);
            if (mInterstitialAd != null) {
                mInterstitialAd.show(Health.this);
            } else {
                Log.d("TAG", "The interstitial ad wasn't ready yet.");
            }
        });



    }
    private void createPersonalizedAdd(){
        AdRequest adRequest2 = new AdRequest.Builder().build();
        createAdd(adRequest2);
    }
    private void createAdd(AdRequest adRequest){
        InterstitialAd.load(this,"ca-app-pub-7382165076561685/9628261510", adRequest, new InterstitialAdLoadCallback() {
            @Override
            public void onAdLoaded(@NonNull InterstitialAd interstitialAd) {
                // The mInterstitialAd reference will be null until
                // an ad is loaded.
                mInterstitialAd = interstitialAd;
                Log.d("TAG", "onAdLoaded");
                mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback(){
                    @Override
                    public void onAdDismissedFullScreenContent() {
                        // Called when fullscreen content is dismissed.
                        Log.d("TAG", "The ad was dismissed.");

                    }

                    @Override
                    public void onAdFailedToShowFullScreenContent(AdError adError) {
                        // Called when fullscreen content failed to show.
                        Log.d("TAG", "The ad failed to show.");
                    }

                    @Override
                    public void onAdShowedFullScreenContent() {
                        // Called when fullscreen content is shown.
                        // Make sure to set your reference to null so you don't
                        // show it a second time.
                        mInterstitialAd = null;
                        Log.d("TAG", "The ad was shown.");
                    }
                });
            }

            @Override
            public void onAdFailedToLoad(@NonNull LoadAdError loadAdError) {
                // Handle the error
                Log.d("TAG", loadAdError.getMessage());
                mInterstitialAd = null;
            }
        });
    }
}