package com.zackeryrobinson.finalprojecttest;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.constraint.ConstraintLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AlertDialog;
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
 * {@link PayStubFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 */
public class PayStubFragment extends Fragment implements View.OnClickListener {

    private OnFragmentInteractionListener mListener;
    ViewPager viewPager;

    public PayStubFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_pay_stub, container, false);
        viewPager = view.findViewById(R.id.financesViewpager);
        ArrayList<FinanceObject> objects = new ArrayList<>();
        objects.add(new FinanceObject());
        objects.add(new FinanceObject());
        objects.add(new FinanceObject());
        viewPager.setAdapter(new CustomPagerAdapter(getContext(), objects));
        ConstraintLayout constraintLayout = view.findViewById(R.id.clPayStubFragment);
        //int height = constraintLayout.getHeight();
        //viewPager.getLayoutParams().height = (int)(height*.90);
        Button btnRequestAdvance = view.findViewById(R.id.btnPayStubFrag_requestAdvance);//////////
        Button btnAdvancesRequested = view.findViewById(R.id.btnPayStubFrag_advancesRequested);
        btnRequestAdvance.setOnClickListener(this);
        btnAdvancesRequested.setOnClickListener(this);////////////
        requestAdvanceList = new ArrayList<>();

        return view;
    }

    List<RequestAdvanceClass> requestAdvanceList;
    private AlertDialog dialog;
    private Button btnSubmitRequestAdvance;
    private Button btnCancel;

    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    @Override
    public void onClick(View v) {////////////////////

        View mView = getActivity().getLayoutInflater().inflate(R.layout.alert_dialog_request_advance, null);

        switch (v.getId()) {

            case R.id.btnPayStubFrag_requestAdvance:

                final AlertDialog.Builder mBuilder = new AlertDialog.Builder(getContext());

                btnSubmitRequestAdvance = mView.findViewById(R.id.btnSubmitRequestAdvance);
                btnCancel = mView.findViewById(R.id.btnCancelAlertDialog);

                final EditText amount = mView.findViewById(R.id.tvRequestAdvance_amount);
                final EditText description = mView.findViewById(R.id.tvRequestAdvance_description);

                btnSubmitRequestAdvance.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (!Objects.equals(amount.getText().toString(), "") && !Objects.equals(description.getText().toString(), "")) {
                            requestAdvanceList
                                    .add(new RequestAdvanceClass(Float.valueOf(amount.getText().toString()), description.getText().toString()));

                            Toast.makeText(getContext(), String.valueOf(requestAdvanceList.size()), Toast.LENGTH_SHORT).show();
                        } else {
                            Toast.makeText(getContext(), "Empty Fields", Toast.LENGTH_SHORT).show();
                        }
                    }
                });
                btnCancel.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog.dismiss();
                    }
                });

                mBuilder.setView(mView);
                dialog = mBuilder.create();
                dialog.show();

                break;

            case R.id.btnPayStubFrag_submitExpense:

                break;


        }

    }////////////////

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

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
