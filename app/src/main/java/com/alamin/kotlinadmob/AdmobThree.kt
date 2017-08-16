package com.alamin.kotlinadmob

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.google.android.gms.ads.*

/**
 * Created by alamin on 8/16/17.
 */
class AdmobThree : AppCompatActivity() {

    lateinit var mInterstitialAd: InterstitialAd

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_four)

        val mNativeExpressAdView :NativeExpressAdView = findViewById(R.id.adView2)

        val request = AdRequest.Builder().build()
        mNativeExpressAdView.loadAd(request)


        mInterstitialAd = InterstitialAd(this)
        mInterstitialAd.adUnitId = "ca-app-pub-2496350248328805/4065457815"
        mInterstitialAd.loadAd(AdRequest.Builder().build())
        mInterstitialAd.adListener = object : AdListener() {
            override fun onAdLoaded() {
                showInterstitialAd()
            }
        }

        val adView :AdView = findViewById(R.id.adview)
        val adRequest = AdRequest.Builder()
                .build()
        adView.loadAd(adRequest)

    }

    fun showInterstitialAd() {
        if (mInterstitialAd.isLoaded) {
            mInterstitialAd.show();
        }
    }

}