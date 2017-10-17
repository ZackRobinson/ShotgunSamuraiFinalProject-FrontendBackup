package com.zackeryrobinson.finalprojecttest;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.PersistableBundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity implements PayFragment.OnFragmentInteractionListener, BenefitsFragment.OnFragmentInteractionListener, TrainingFragment.OnFragmentInteractionListener, MarketingFragment.OnFragmentInteractionListener {

    private static final String TAG = "MainActivityTag";
    private AccountFragment accountFrag = new AccountFragment();
    private PayFragment payFrag = new PayFragment();
    private BenefitsFragment benefitsFrag = new BenefitsFragment();
    private TrainingFragment trainingFrag = new TrainingFragment();
    private MarketingFragment marketingFrag = new MarketingFragment();
    int tabOpen=1;


    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_account:
                    tabOpen =1;
                    return true;
                case R.id.navigation_payStub:
                    tabOpen=2;
                    return true;
                case R.id.navigation_benefits:
                    tabOpen=3;
                    return true;
                case R.id.navigation_training:
                    tabOpen=4;
                    return true;
                case R.id.navigation_marketing:
                    tabOpen=5;
                    return true;
            }
            openTab(tabOpen);
            return false;
        }
    };



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        openTab(tabOpen);

        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        //Fix rotation on bottom navigation

        Log.d(TAG, "onCreate: ");

    }

    @Override
    public void onSaveInstanceState(Bundle outState, PersistableBundle outPersistentState) {
        super.onSaveInstanceState(outState, outPersistentState);
        outState.putInt("tabOpen", tabOpen);

    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        tabOpen = savedInstanceState.getInt("tabOpen");
        openTab(tabOpen);


    }


    @Override
    public void onFragmentInteraction(Uri uri) {

    }

    private void openTab(int tabid)
    {
        switch (tabid)
        {
            case 1:
                getSupportFragmentManager().beginTransaction().replace(R.id.content, accountFrag, "frag").commit();
                break;
            case 2:
                getSupportFragmentManager().beginTransaction().replace(R.id.content, payFrag, "frag").commit();
                break;
            case 3:
                getSupportFragmentManager().beginTransaction().replace(R.id.content, benefitsFrag, "frag").commit();
                break;
            case 4:
                getSupportFragmentManager().beginTransaction().replace(R.id.content, trainingFrag, "frag").commit();
                break;
            case 5:
                getSupportFragmentManager().beginTransaction().replace(R.id.content, marketingFrag, "frag").commit();
                break;

        }
    }

}
