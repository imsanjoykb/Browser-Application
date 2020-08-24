package com.browsercity;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.KeyEvent;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    private WebView wv1,wv2,wv3,wv4,wv5,wv6,wv7,wv8,wv9,wv10,wv11,wv14,wv16,wv17,wv18,wv19,wv20,wv21,wv24,wv25,wv27,wv28,wv29,wv30,wv31,wv32,wv33;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer,toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);


        wv1 = (WebView)findViewById(R.id.webViev);
        //imageView=(ImageView)findViewById(R.id.imageView2);
        /*WebSettings settings = wv1.getSettings();
        settings.setJavaScriptEnabled(true);

        wv1.getSettings().setRenderPriority(WebSettings.RenderPriority.HIGH);
        wv1.getSettings().setCacheMode(WebSettings.LOAD_CACHE_ELSE_NETWORK);
        wv1.getSettings().setAppCacheEnabled(true);
        wv1.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);

        settings.setDomStorageEnabled(true);
        settings.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.NARROW_COLUMNS);
        settings.setUseWideViewPort(true);
        settings.setSavePassword(true);
        settings.setSaveFormData(true);*/

        wv28=(WebView)findViewById(R.id.webViev);

        wv28.setWebViewClient(new WebViewClient());
        WebSettings webSettings = wv28.getSettings();
        webSettings.setJavaScriptEnabled(true);

        wv1.loadUrl("https://www.google.com/");

        //wv1.setWebViewClient(new MywebViewClient());//



    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_translate) {



            wv28=(WebView)findViewById(R.id.webViev);

            wv28.setWebViewClient(new WebViewClient());
            WebSettings webSettings = wv28.getSettings();
            webSettings.setJavaScriptEnabled(true);

            wv28.loadUrl("http://www.bdjobs.com/");

            return true;
        }  else  if (id == R.id.action_dropbox) {


            wv30=(WebView)findViewById(R.id.webViev);

            wv30.setWebViewClient(new WebViewClient());
            WebSettings webSettings = wv30.getSettings();
            webSettings.setJavaScriptEnabled(true);

            wv30.loadUrl("https://www.dropbox.com/");





            return true;
        } else  if (id == R.id.action_telegram) {


            wv31=(WebView)findViewById(R.id.webViev);

            wv31.setWebViewClient(new WebViewClient());
            WebSettings webSettings = wv31.getSettings();
            webSettings.setJavaScriptEnabled(true);

            wv31.loadUrl("http://allmp3song.org/");

            return true;
        } else  if (id == R.id.action_downloder) {


            wv32=(WebView)findViewById(R.id.webViev);

            wv32.setWebViewClient(new WebViewClient());
            WebSettings webSettings = wv32.getSettings();
            webSettings.setJavaScriptEnabled(true);

            wv32.loadUrl("https://www.save-video.com/");

            return true;
        } else  if (id == R.id.action_app) {


            wv29=(WebView)findViewById(R.id.webViev);

            wv29.setWebViewClient(new WebViewClient());
            WebSettings webSettings = wv29.getSettings();
            webSettings.setJavaScriptEnabled(true);

            wv29.loadUrl("https://www.9apps.com/");

            return true;}
        else  if (id == R.id.action_aboutdeveloper) {
            setTitle("About Developer");

            wv33=(WebView)findViewById(R.id.webViev);

            wv33.setWebViewClient(new WebViewClient());
            WebSettings webSettings = wv33.getSettings();
            webSettings.setJavaScriptEnabled(true);

            wv33.loadUrl("https://www.facebook.com/profile.php?id=100011542830475&ref=bookmarks");

            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_gogle) {



            wv1=(WebView)findViewById(R.id.webViev);

            wv1.setWebViewClient(new WebViewClient());
            WebSettings webSettings = wv1.getSettings();
            webSettings.setJavaScriptEnabled(true);

            wv1.loadUrl("https://www.google.com/");

        } else if (id == R.id.nav_yahoo) {



            wv2=(WebView)findViewById(R.id.webViev);

            wv2.setWebViewClient(new WebViewClient());
            WebSettings webSettings = wv2.getSettings();
            webSettings.setJavaScriptEnabled(true);

            wv2.loadUrl("https://www.yahoo.com/");



        } else if (id == R.id.nav_bing) {



            wv3=(WebView)findViewById(R.id.webViev);

            wv3.setWebViewClient(new WebViewClient());
            WebSettings webSettings = wv3.getSettings();
            webSettings.setJavaScriptEnabled(true);

            wv3.loadUrl("https://www.bing.com/");






        } else if (id == R.id.nav_fascebook) {




            wv4=(WebView)findViewById(R.id.webViev);

            wv4.setWebViewClient(new WebViewClient());
            WebSettings webSettings = wv4.getSettings();
            webSettings.setJavaScriptEnabled(true);

            wv4.loadUrl("https://m.facebook.com/");



        } else if (id == R.id.nav_twitter) {




            wv5=(WebView)findViewById(R.id.webViev);

            wv5.setWebViewClient(new WebViewClient());
            WebSettings webSettings = wv5.getSettings();
            webSettings.setJavaScriptEnabled(true);

            wv5.loadUrl("https://twitter.com/?lang=en");



        } else if (id == R.id.nav_instagram) {

            setTitle("Instagram");

            wv25 = (WebView) findViewById(R.id.webViev);

            wv25.setWebViewClient(new WebViewClient());
            WebSettings webSettings = wv25.getSettings();
            webSettings.setJavaScriptEnabled(true);

            wv25.loadUrl("https://www.instagram.com/?hl=en");

        }
            else if (id == R.id.nav_snapcaht) {



            wv6=(WebView)findViewById(R.id.webViev);

            wv6.setWebViewClient(new WebViewClient());
            WebSettings webSettings = wv6.getSettings();
            webSettings.setJavaScriptEnabled(true);


            wv6.loadUrl("https://www.pinterest.com/");


        }else if (id == R.id.nav_skype) {



            wv24=(WebView)findViewById(R.id.webViev);

            wv24.setWebViewClient(new WebViewClient());
            WebSettings webSettings = wv24.getSettings();
            webSettings.setJavaScriptEnabled(true);

            wv24.loadUrl("https://www.linkedin.com/");


        }else if (id == R.id.nav_youtube) {



            wv7=(WebView)findViewById(R.id.webViev);

            wv7.setWebViewClient(new WebViewClient());
            WebSettings webSettings = wv7.getSettings();
            webSettings.setJavaScriptEnabled(true);


            wv7.loadUrl("https://www.youtube.com/");
            //https://www.save-video.com/--//

        }else if (id == R.id.nav_biscope) {



            wv8=(WebView)findViewById(R.id.webViev);

            wv8.setWebViewClient(new WebViewClient());
            WebSettings webSettings = wv8.getSettings();
            webSettings.setJavaScriptEnabled(true);

            wv8.loadUrl("http://morewap.com/");


        }else if (id == R.id.nav_dailymotion) {



            wv9=(WebView)findViewById(R.id.webViev);

            wv9.setWebViewClient(new WebViewClient());
            WebSettings webSettings = wv9.getSettings();
            webSettings.setJavaScriptEnabled(true);

            wv9.loadUrl("http://www.dailymotion.com/us");


        }else if (id == R.id.nav_imdb) {


            wv10=(WebView)findViewById(R.id.webViev);

            wv10.setWebViewClient(new WebViewClient());
            WebSettings webSettings = wv10.getSettings();
            webSettings.setJavaScriptEnabled(true);

            wv10.loadUrl("http://www.imdb.com/");






        }else if (id == R.id.nav_waptubes) {



            wv11=(WebView)findViewById(R.id.webViev);

            wv11.setWebViewClient(new WebViewClient());
            WebSettings webSettings = wv11.getSettings();
            webSettings.setJavaScriptEnabled(true);

            wv11.loadUrl("http://waptubes.com/");


        }else if (id == R.id.nav_cricbuzz) {



            wv14=(WebView)findViewById(R.id.webViev);

            wv14.setWebViewClient(new WebViewClient());
            WebSettings webSettings = wv14.getSettings();
            webSettings.setJavaScriptEnabled(true);

            wv14.loadUrl("http://www.cricbuzz.com/");


        }else if (id == R.id.nav_cryahoo) {



            wv16=(WebView)findViewById(R.id.webViev);

            wv16.setWebViewClient(new WebViewClient());
            WebSettings webSettings = wv16.getSettings();
            webSettings.setJavaScriptEnabled(true);


            wv16.loadUrl("https://cricket.yahoo.com/");

        }else if (id == R.id.nav_espn) {



            wv17=(WebView)findViewById(R.id.webViev);

            wv17.setWebViewClient(new WebViewClient());
            WebSettings webSettings = wv17.getSettings();
            webSettings.setJavaScriptEnabled(true);


            wv17.loadUrl("http://www.espncricinfo.com/");

        }else if (id == R.id.nav_espnfc) {



            wv18=(WebView)findViewById(R.id.webViev);

            wv18.setWebViewClient(new WebViewClient());
            WebSettings webSettings = wv18.getSettings();
            webSettings.setJavaScriptEnabled(true);

            wv18.loadUrl("http://www.espn.in/football/?src=com");



        }else if (id == R.id.nav_dhakasports) {



            wv27=(WebView)findViewById(R.id.webViev);

            wv27.setWebViewClient(new WebViewClient());
            WebSettings webSettings = wv27.getSettings();
            webSettings.setJavaScriptEnabled(true);

            wv27.loadUrl("http://dhakasports.com/bangla.php");


        }else if (id == R.id.nav_bikroy) {



            wv19=(WebView)findViewById(R.id.webViev);

            wv19.setWebViewClient(new WebViewClient());
            WebSettings webSettings = wv19.getSettings();
            webSettings.setJavaScriptEnabled(true);

            wv19.loadUrl("https://bikroy.com/en");

        }else if (id == R.id.nav_sellbazar) {

            wv20=(WebView)findViewById(R.id.webViev);

            wv20.setWebViewClient(new WebViewClient());
            WebSettings webSettings = wv20.getSettings();
            webSettings.setJavaScriptEnabled(true);

            wv20.loadUrl("https://www.ebay.com/");

        }else if (id == R.id.nav_amazon) {



            wv21=(WebView)findViewById(R.id.webViev);

            wv21.setWebViewClient(new WebViewClient());
            WebSettings webSettings = wv21.getSettings();
            webSettings.setJavaScriptEnabled(true);

            wv21.loadUrl("https://www.amazon.com/");

        }


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }


    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if(event.getAction()== KeyEvent.ACTION_DOWN){
            switch(keyCode){
                case KeyEvent.KEYCODE_BACK:
                    if(wv1.canGoBack()){
                        wv1.goBack();
                    }
                    else{
                        finish();
                    }
                    return true;
            }
        }
        return super.onKeyDown(keyCode, event);
    }


}









