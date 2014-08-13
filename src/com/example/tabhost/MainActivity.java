package com.example.tabhost;

import android.app.TabActivity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;

@SuppressWarnings("deprecation")
public class MainActivity extends TabActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        TabHost tabHost = getTabHost();
        TabSpec tab1 = tabHost.newTabSpec("Tab1").setIndicator("Received").setContent(R.id.tab01);
        tabHost.addTab(tab1);
        
        TabSpec tab2 = tabHost.newTabSpec("Tab2").setIndicator("Call", getResources()
                .getDrawable(R.drawable.ic_launcher)).setContent(R.id.tab02);
        tabHost.addTab(tab2);
        
        TabSpec tab3 = tabHost.newTabSpec("Tab3").setIndicator("Missed").setContent(R.id.tab03);
        tabHost.addTab(tab3);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

}
