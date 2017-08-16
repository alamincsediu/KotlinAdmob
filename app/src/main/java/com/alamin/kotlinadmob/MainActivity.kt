package com.alamin.kotlinadmob

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.gms.ads.*


class MainActivity : AppCompatActivity() {




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button:Button = findViewById(R.id.button2)
        val button1:Button = findViewById(R.id.button3)
        val button2:Button = findViewById(R.id.button4)
        val button3:Button = findViewById(R.id.button5)

        button.setOnClickListener {
            val intent = Intent(this, AdmobOne::class.java)
            startActivity(intent)
        }
        button1.setOnClickListener {
            val intent = Intent(this, AdmobTwo::class.java)
            startActivity(intent)
        }
        button2.setOnClickListener {
            val intent = Intent(this, AdmobThree::class.java)
            startActivity(intent)
        }
        button3.setOnClickListener {
            val intent = Intent(this, AdmobFour::class.java)
            startActivity(intent)
        }
        val mNativeExpressAdView :NativeExpressAdView = findViewById(R.id.adView2)

        val request = AdRequest.Builder().build()
        mNativeExpressAdView.loadAd(request)



        val adView :AdView = findViewById(R.id.adview)

        val adRequest = AdRequest.Builder()
                .build()
        adView.loadAd(adRequest)

    }



}