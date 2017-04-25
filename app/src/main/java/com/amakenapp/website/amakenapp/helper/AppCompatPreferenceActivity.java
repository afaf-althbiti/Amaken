package com.amakenapp.website.amakenapp.helper;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.design.widget.CoordinatorLayout;
import android.support.v7.app.AppCompatActivity;

import com.amakenapp.website.amakenapp.R;

/**
 * A {@link android.preference.PreferenceActivity} which implements and proxies the necessary calls
 * to be used with AppCompat.
 */
public abstract class AppCompatPreferenceActivity extends AppCompatActivity {
    SharedPreferences sh;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        sh= getSharedPreferences("Setting", Context.MODE_PRIVATE);
        String myStyle = sh.getString("myStyle","Default setting");
        CoordinatorLayout layte =(CoordinatorLayout) findViewById(R.layout.activity_add_place);
            switch (myStyle){
                case "Default setting":
                    this.setTheme(R.style.AppTheme);
                    break;
                case "style 1":
                    this.setTheme(R.style.AppTheme1);
                    break;
                case "style 2":
                    this.setTheme(R.style.AppTheme2);
                    break;
    }}
/** @Override
    protected void onStart(){
        super.onStart();
        if (sh.getBoolean("enable_settings",false)){
            switch (sh.getString("theme","Default setting")){
                case "Default setting":
                    this.setTheme(R.style.AppTheme);
                    break;
                case "style 1":
                    this.setTheme(R.style.AppTheme1);
                    break;
                case "style 2":
                    this.setTheme(R.style.AppTheme2);
                    break;

            }
        }}*/
       public void MyStyle(String myStyle){
        SharedPreferences.Editor editor= sh.edit();
        editor.putString("myStyle",myStyle);
        editor.apply();
        finish();

    }

    }



    /**
     * A {@link android.preference.PreferenceActivity} which implements and proxies the necessary calls
     * to be used with AppCompat.

    @Override
    protected void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        getDelegate().onPostCreate(savedInstanceState);
    }

    public ActionBar getSupportActionBar() {
        return getDelegate().getSupportActionBar();
    }

    public void setSupportActionBar(@Nullable Toolbar toolbar) {
        getDelegate().setSupportActionBar(toolbar);
    }

    @Override
    public MenuInflater getMenuInflater() {
        return getDelegate().getMenuInflater();
    }

    @Override
    public void setContentView(@LayoutRes int layoutResID) {
        getDelegate().setContentView(layoutResID);
    }

    @Override
    public void setContentView(View view) {
        getDelegate().setContentView(view);
    }

    @Override
    public void setContentView(View view, ViewGroup.LayoutParams params) {
        getDelegate().setContentView(view, params);
    }

    @Override
    public void addContentView(View view, ViewGroup.LayoutParams params) {
        getDelegate().addContentView(view, params);
    }

    @Override
    protected void onPostResume() {
        super.onPostResume();
        getDelegate().onPostResume();
    }

    @Override
    protected void onTitleChanged(CharSequence title, int color) {
        super.onTitleChanged(title, color);
        getDelegate().setTitle(title);
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        getDelegate().onConfigurationChanged(newConfig);
    }

    @Override
    protected void onStop() {
        super.onStop();
        getDelegate().onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        getDelegate().onDestroy();
    }

    public void invalidateOptionsMenu() {
        getDelegate().invalidateOptionsMenu();
    }

    private AppCompatDelegate getDelegate() {
        if (mDelegate == null) {
            mDelegate = AppCompatDelegate.create(this, null);
        }
        return mDelegate;
    }
}

     */