package com.zackeryrobinson.finalprojecttest;

import android.content.Context;
import android.icu.text.DateFormat;
import android.icu.text.SimpleDateFormat;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.v4.app.Fragment;
import android.support.v7.app.AlertDialog;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link BenefitsFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link BenefitsFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class BenefitsFragment extends Fragment implements View.OnClickListener {
    private static final String TAG = "BenefitsFragment";

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    public BenefitsFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment BenefitsFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static BenefitsFragment newInstance(String param1, String param2) {
        BenefitsFragment fragment = new BenefitsFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_benefits, container, false);
        Button btnGoodButton = (Button) view.findViewById(R.id.btnViewRequestedPto);
        Button btnRequestPto = (Button) view.findViewById(R.id.btnRequestPto);
        btnGoodButton.setOnClickListener(this);
        btnRequestPto.setOnClickListener(this);

        return view;
    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    @Override
    public void onClick(View view) {

        switch (view.getId()) {

            //////////////////////////////////////////////CHRIS
            case R.id.btnViewRequestedPto:

                View newView = getActivity().getLayoutInflater().inflate(R.layout.alert_dialog_benefits, null);

                AlertDialog alertDialog = new AlertDialog.Builder(getContext()).create();
                alertDialog.setTitle("Requested PTO");
                RecyclerView recyclerView = (RecyclerView) newView.findViewById(R.id.rvBenefits);
                List<BenefitsObject> benefitsObjects = new ArrayList<>();
                benefitsObjects.add(new BenefitsObject());
                benefitsObjects.add(new BenefitsObject());
                benefitsObjects.add(new BenefitsObject());
                benefitsObjects.add(new BenefitsObject());
                BenefitsRecyclerAdapter benefitsRecyclerAdapter = new BenefitsRecyclerAdapter(benefitsObjects);
                recyclerView.setAdapter(benefitsRecyclerAdapter);
                LinearLayoutManager layoutManager = new LinearLayoutManager(getContext());
                recyclerView.setLayoutManager(layoutManager);
                alertDialog.setView(newView);
                alertDialog.setCanceledOnTouchOutside(true);
                alertDialog.setCancelable(true);
                alertDialog.show();

                break;

            ////////////////////////////////////////////////EDEL
            case R.id.btnRequestPto:

                requestedPtos = new ArrayList<>(); ///////////////////////////////////////////////////Instantiating ARRAY LIST OF RequestedPtoClass

                final AlertDialog.Builder mBuilder = new AlertDialog.Builder(getContext());

                Log.d(TAG, "onClick: ");

                View mView = getActivity().getLayoutInflater().inflate(R.layout.alert_dialog_request_pto, null);

                tvRequestPto_dateFrom = mView.findViewById(R.id.tvRequestPto_dateFrom);
                tvRequestPto_dateTo = mView.findViewById(R.id.tvRequestPto_dateTo);
                tvRequestPto_description = mView.findViewById(R.id.tvRequestPto_description);

                btnSubmitRequestPto = mView.findViewById(R.id.btnSubmitRequestPto);
                btnCancelAlertDialog = mView.findViewById(R.id.btnCancelAlertDialog);
                btnSubmitRequestPto.setOnClickListener(new View.OnClickListener() {
                    @RequiresApi(api = Build.VERSION_CODES.N)
                    @Override
                    public void onClick(View v) {
                        Log.d(TAG, "onClick: btnSubmitRequestPto");
                        DateFormat df = new SimpleDateFormat("MM/dd/yyyy");

                        if (!Objects.equals(tvRequestPto_dateFrom.getText().toString(), "") || !Objects.equals(tvRequestPto_dateTo.getText().toString(), "")
                                || !Objects.equals(tvRequestPto_description.getText().toString(), "")) {
                            try {
                                requestedPtos.add(new RequestedPtoClass((df.parse(tvRequestPto_dateFrom.getText().toString())),
                                        df.parse(tvRequestPto_dateTo.getText().toString()), tvRequestPto_description.getText().toString()));

                                Toast.makeText(getContext(), String.valueOf(requestedPtos.size()), Toast.LENGTH_SHORT).show();

                                Toast.makeText(getContext(), "PTO Object added to list", Toast.LENGTH_LONG).show();

                            } catch (java.text.ParseException e) {
                                e.printStackTrace();
                                Log.d(TAG, "requestPto: " + e);
                            }
                        }else{
                            Toast.makeText(getContext(), "Empty Fields", Toast.LENGTH_SHORT).show();
                        }
                    }
                });
                btnCancelAlertDialog.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog.dismiss();
                    }
                });

                mBuilder.setView(mView);
                dialog = mBuilder.create();
                dialog.show();

                break;

        }
    }
    EditText tvRequestPto_dateFrom;
    EditText tvRequestPto_dateTo;
    EditText tvRequestPto_description;
    Button btnSubmitRequestPto;
    Button btnCancelAlertDialog;
    List<RequestedPtoClass> requestedPtos;
    private AlertDialog dialog;

    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
