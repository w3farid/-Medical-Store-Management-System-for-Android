package com.example.sam.medistore;

import android.app.Activity;
import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
/**
 * Created by Sam on 4/8/2016.
 */
public class Splash extends Activity {

    //MediaPlayer song;
    @Override
    protected void onCreate(Bundle v) {
        // TODO Auto-generated method stub
        super.onCreate(v);
        setContentView(R.layout.splash);
        // song= MediaPlayer.create(Splash.this,R.raw.as);
        //song.start();
        Thread timer = new Thread() {
            public void run() {
                try {
                    sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();

                } finally {
                    Intent t = new Intent("com.example.sam.medistore.MAINACTIVITY");
                    startActivity(t);
                }
            }
        };
        timer.start();
    }

    void saving() {

       /* <de.hdodenhof.circleimageview.CircleImageView
        xmlns:app="http://schemas.android.com/apk/res/android"
        android:id="@+id/profile<image"
        android:layout_width="70dp"
        android:layout_hight="70db"
        android:src="@drawable/apple"
        app:border_color="#FF000000"
        android:layout_marginleft="240dp"
        android:layout_centerVertical="true"
        android:layout_alignParentLeft="true"
        android:layout_alignParentStart="true"
        android:layout_marginStart="240dp" />
  */  }
}