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

public class Nid extends AppCompatActivity {
    private InterstitialAd mInterstitialAd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nid);

        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
                createPersonalizedAdd();
            }
        });


        Button b1= findViewById(R.id.nid1);
        Button b2= findViewById(R.id.nid2);
        Button b3= findViewById(R.id.nid3);
        Button b4= findViewById(R.id.nid4);
        Button b5= findViewById(R.id.nid5);
        Button b6= findViewById(R.id.nid6);
        Button b7= findViewById(R.id.nid7);
        Button b8= findViewById(R.id.nid8);

        b1.setOnClickListener(v -> {
            homeActivity.link ="https://services.nidw.gov.bd/registration";
            Intent i=new Intent(Nid.this,webview.class);
            startActivity(i);
            if (mInterstitialAd != null) {
                mInterstitialAd.show(Nid.this);
            } else {
                Log.d("TAG", "The interstitial ad wasn't ready yet.");
            }
        });

        b2.setOnClickListener(v -> {
            homeActivity.link ="https://services.nidw.gov.bd/login";
            Intent i=new Intent(Nid.this,webview.class);
            startActivity(i);
            if (mInterstitialAd != null) {
                mInterstitialAd.show(Nid.this);
            } else {
                Log.d("TAG", "The interstitial ad wasn't ready yet.");
            }
        });

        b3.setOnClickListener(v -> {
            homeActivity.link ="https://services.nidw.gov.bd/new_voter";
            Intent i=new Intent(Nid.this,webview.class);
            startActivity(i);
            if (mInterstitialAd != null) {
                mInterstitialAd.show(Nid.this);
            } else {
                Log.d("TAG", "The interstitial ad wasn't ready yet.");
            }
        });

        b4.setOnClickListener(v -> {
            homeActivity.link ="https://services.nidw.gov.bd/voter_center";
            Intent i=new Intent(Nid.this,webview.class);
            startActivity(i);
            if (mInterstitialAd != null) {
                mInterstitialAd.show(Nid.this);
            } else {
                Log.d("TAG", "The interstitial ad wasn't ready yet.");
            }
        });

        b5.setOnClickListener(v -> {
            homeActivity.link ="https://services.nidw.gov.bd/nid_info";
            Intent i=new Intent(Nid.this,webview.class);
            startActivity(i);
            if (mInterstitialAd != null) {
                mInterstitialAd.show(Nid.this);
            } else {
                Log.d("TAG", "The interstitial ad wasn't ready yet.");
            }
        });

        b6.setOnClickListener(v -> {
            homeActivity.link ="https://services.nidw.gov.bd/card_distribution";
            Intent i=new Intent(Nid.this,webview.class);
            startActivity(i);
            if (mInterstitialAd != null) {
                mInterstitialAd.show(Nid.this);
            } else {
                Log.d("TAG", "The interstitial ad wasn't ready yet.");
            }
        });
        b7.setOnClickListener(v -> {
            homeActivity.link ="https://services.nidw.gov.bd/online_application";
            Intent i=new Intent(Nid.this,webview.class);
            startActivity(i);
            if (mInterstitialAd != null) {
                mInterstitialAd.show(Nid.this);
            } else {
                Log.d("TAG", "The interstitial ad wasn't ready yet.");
            }
        });

        b8.setOnClickListener(v -> {
            homeActivity.link ="https://services.nidw.gov.bd/card_application";
            Intent i=new Intent(Nid.this,webview.class);
            startActivity(i);
            if (mInterstitialAd != null) {
                mInterstitialAd.show(Nid.this);
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