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

public class Sports extends AppCompatActivity {

    private InterstitialAd mInterstitialAd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sports);
        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
                createPersonalizedAdd();
            }
        });



        Button b1= findViewById(R.id.sp1);
        Button b2= findViewById(R.id.sp2);
        Button b3= findViewById(R.id.sp3);
        Button b4= findViewById(R.id.sp4);
        Button b5= findViewById(R.id.sp5);
        Button b6= findViewById(R.id.sp6);
        Button b7= findViewById(R.id.sp7);
        Button b8= findViewById(R.id.sp8);
        Button b9= findViewById(R.id.sp9);
        Button b10= findViewById(R.id.sp10);
        Button b11= findViewById(R.id.sp11);
        Button b12= findViewById(R.id.sp12);
        Button b13= findViewById(R.id.sp13);
        Button b14= findViewById(R.id.sp14);
        Button b15= findViewById(R.id.sp15);
        Button b16= findViewById(R.id.sp16);
        Button b17= findViewById(R.id.sp17);
        Button b18= findViewById(R.id.sp18);

        b1.setOnClickListener(v -> {
            homeActivity.link ="https://bssf.com.bd";
            Intent i=new Intent(Sports.this,webview.class);
            startActivity(i);
            if (mInterstitialAd != null) {
                mInterstitialAd.show(Sports.this);
            } else {
                Log.d("TAG", "The interstitial ad wasn't ready yet.");
            }
        });

        b2.setOnClickListener(v -> {
            homeActivity.link ="https://www.tigercricket.com.bd";
            Intent i=new Intent(Sports.this,webview.class);
            startActivity(i);
            if (mInterstitialAd != null) {
                mInterstitialAd.show(Sports.this);
            } else {
                Log.d("TAG", "The interstitial ad wasn't ready yet.");
            }
        });

        b3.setOnClickListener(v -> {
            homeActivity.link ="https://bksp.gov.bd";
            Intent i=new Intent(Sports.this,webview.class);
            startActivity(i);
            if (mInterstitialAd != null) {
                mInterstitialAd.show(Sports.this);
            } else {
                Log.d("TAG", "The interstitial ad wasn't ready yet.");
            }
        });

        b4.setOnClickListener(v -> {
            homeActivity.link ="https://bdhandball.org";
            Intent i=new Intent(Sports.this,webview.class);
            startActivity(i);
            if (mInterstitialAd != null) {
                mInterstitialAd.show(Sports.this);
            } else {
                Log.d("TAG", "The interstitial ad wasn't ready yet.");
            }
        });

        b5.setOnClickListener(v -> {
            homeActivity.link ="https://www.bff.com.bd";
            Intent i=new Intent(Sports.this,webview.class);
            startActivity(i);
            if (mInterstitialAd != null) {
                mInterstitialAd.show(Sports.this);
            } else {
                Log.d("TAG", "The interstitial ad wasn't ready yet.");
            }
        });

        b6.setOnClickListener(v -> {
            homeActivity.link ="https://www.nsc.gov.bd";
            Intent i=new Intent(Sports.this,webview.class);
            startActivity(i);
            if (mInterstitialAd != null) {
                mInterstitialAd.show(Sports.this);
            } else {
                Log.d("TAG", "The interstitial ad wasn't ready yet.");
            }
        });
        b7.setOnClickListener(v -> {
            homeActivity.link ="https://moysports.gov.bd";
            Intent i=new Intent(Sports.this,webview.class);
            startActivity(i);
            if (mInterstitialAd != null) {
                mInterstitialAd.show(Sports.this);
            } else {
                Log.d("TAG", "The interstitial ad wasn't ready yet.");
            }
        });

        b8.setOnClickListener(v -> {
            homeActivity.link ="https://www.badmintonbd.com";
            Intent i=new Intent(Sports.this,webview.class);
            startActivity(i);
            if (mInterstitialAd != null) {
                mInterstitialAd.show(Sports.this);
            } else {
                Log.d("TAG", "The interstitial ad wasn't ready yet.");
            }
        });

        b9.setOnClickListener(v -> {
            homeActivity.link ="https://www.babf-bd.org";
            Intent i=new Intent(Sports.this,webview.class);
            startActivity(i);
            if (mInterstitialAd != null) {
                mInterstitialAd.show(Sports.this);
            } else {
                Log.d("TAG", "The interstitial ad wasn't ready yet.");
            }
        });

        b10.setOnClickListener(v -> {
            homeActivity.link ="https://worldarchery.sport/member/ban/bangladesh-archery-federation";
            Intent i=new Intent(Sports.this,webview.class);
            startActivity(i);
            if (mInterstitialAd != null) {
                mInterstitialAd.show(Sports.this);
            } else {
                Log.d("TAG", "The interstitial ad wasn't ready yet.");
            }
        });

        b11.setOnClickListener(v -> {
            homeActivity.link ="https://www.nocban.org";
            Intent i=new Intent(Sports.this,webview.class);
            startActivity(i);
            if (mInterstitialAd != null) {
                mInterstitialAd.show(Sports.this);
            } else {
                Log.d("TAG", "The interstitial ad wasn't ready yet.");
            }
        });

        b12.setOnClickListener(v -> {
            homeActivity.link ="https://www.bgf-bd.org";
            Intent i=new Intent(Sports.this,webview.class);
            startActivity(i);
            if (mInterstitialAd != null) {
                mInterstitialAd.show(Sports.this);
            } else {
                Log.d("TAG", "The interstitial ad wasn't ready yet.");
            }
        });
        b13.setOnClickListener(v -> {
            homeActivity.link ="https://bafbd.com";
            Intent i=new Intent(Sports.this,webview.class);
            startActivity(i);
            if (mInterstitialAd != null) {
                mInterstitialAd.show(Sports.this);
            } else {
                Log.d("TAG", "The interstitial ad wasn't ready yet.");
            }
        });

        b14.setOnClickListener(v -> {
            homeActivity.link ="https://www.bkf.gov.bd";
            Intent i=new Intent(Sports.this,webview.class);
            startActivity(i);
            if (mInterstitialAd != null) {
                mInterstitialAd.show(Sports.this);
            } else {
                Log.d("TAG", "The interstitial ad wasn't ready yet.");
            }
        });

        b15.setOnClickListener(v -> {
            homeActivity.link ="https://www.ds.gov.bd";
            Intent i=new Intent(Sports.this,webview.class);
            startActivity(i);
            if (mInterstitialAd != null) {
                mInterstitialAd.show(Sports.this);
            } else {
                Log.d("TAG", "The interstitial ad wasn't ready yet.");
            }
        });

        b16.setOnClickListener(v -> {
            homeActivity.link ="https://bdchessfed.com";
            Intent i=new Intent(Sports.this,webview.class);
            startActivity(i);
            if (mInterstitialAd != null) {
                mInterstitialAd.show(Sports.this);
            } else {
                Log.d("TAG", "The interstitial ad wasn't ready yet.");
            }
        });

        b17.setOnClickListener(v -> {
            homeActivity.link ="https://bantkdassociation.com";
            Intent i=new Intent(Sports.this,webview.class);
            startActivity(i);
            if (mInterstitialAd != null) {
                mInterstitialAd.show(Sports.this);
            } else {
                Log.d("TAG", "The interstitial ad wasn't ready yet.");
            }
        });
        b18.setOnClickListener(v -> {
            homeActivity.link ="https://bdcyclists.com";
            Intent i=new Intent(Sports.this,webview.class);
            startActivity(i);
            if (mInterstitialAd != null) {
                mInterstitialAd.show(Sports.this);
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