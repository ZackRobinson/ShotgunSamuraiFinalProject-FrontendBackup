package com.zackeryrobinson.finalprojecttest;

import android.app.AlertDialog;
import android.icu.text.DateFormat;
import android.icu.text.SimpleDateFormat;
import android.net.ParseException;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.RequiresApi;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;

import java.util.Date;
import java.util.List;

public class MainActivity extends AppCompatActivity implements PayFragment.OnFragmentInteractionListener, BenefitsFragment.OnFragmentInteractionListener, TrainingFragment.OnFragmentInteractionListener, MarketingFragment.OnFragmentInteractionListener {

    private static final String TAG = "MainActivityTag";

    private AccountFragment frag;
    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_account:

                    getSupportFragmentManager().beginTransaction().replace(R.id.content, new AccountFragment(), "frag").commit();
                    return true;
                case R.id.navigation_pay:
                    getSupportFragmentManager().beginTransaction().replace(R.id.content, new PayFragment(), "frag").commit();


                    return true;
                case R.id.navigation_benefits:
                    getSupportFragmentManager().beginTransaction().replace(R.id.content, new BenefitsFragment(), "frag").commit();

                    return true;
                case R.id.navigation_training:
                    getSupportFragmentManager().beginTransaction().replace(R.id.content, new TrainingFragment(), "frag").commit();

                    return true;
                case R.id.navigation_marketing:
                    getSupportFragmentManager().beginTransaction().replace(R.id.content, new MarketingFragment(), "frag").commit();

                    return true;
            }
            return false;
        }

    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FragmentManager fragmentManager;
        FragmentTransaction fragmentTransaction;
        fragmentManager = getSupportFragmentManager();
        fragmentTransaction = fragmentManager.beginTransaction();
        frag = new AccountFragment();

        fragmentTransaction.replace(R.id.content, frag).commit();

        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);


    }

    EditText tvRequestPto_dateFrom;
    EditText tvRequestPto_dateTo;
    EditText tvRequestPto_description;
    List<RequestedPtoClass> requestedPtos;
    private AlertDialog dialog;

    @RequiresApi(api = Build.VERSION_CODES.N)
    public void requestPto(View view) {  ////////////////////////////////////////////onClick Method of Request PTO Button
        final AlertDialog.Builder mBuilder = new AlertDialog.Builder(this);

        View mView = getLayoutInflater().inflate(R.layout.alert_dialog_req_pto, null);

        tvRequestPto_dateFrom = mView.findViewById(R.id.tvRequestPto_dateFrom);
        tvRequestPto_dateTo = mView.findViewById(R.id.tvRequestPto_dateTo);
        tvRequestPto_description = mView.findViewById(R.id.tvRequestPto_description);

        mBuilder.setView(mView);
        dialog = mBuilder.create();
        dialog.show();

        /////////////////////////////////////////////////////////Submit Button Functionality
        {
            DateFormat df = new SimpleDateFormat("MM/dd/yyyy");

            try {
                requestedPtos.add(new RequestedPtoClass((df.parse(tvRequestPto_dateFrom.getText().toString())),
                        df.parse(tvRequestPto_dateTo.getText().toString()), tvRequestPto_description.getText().toString()));
            } catch (java.text.ParseException e) {
                e.printStackTrace();
                Log.d(TAG, "requestPto: " + e);
            }
        }
        {////////////////////////////////////////////////////////Cancel Button Functionality
            dialog.dismiss();
        }
    }


    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
