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
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
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
    List<RequestAdvanceClass> requestAdvanceList;
    List<ExpenseRecyclerObject> submitExpenseList;
    AlertDialog dialog;

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
        objects.add(new FinanceObject("This"));
        objects.add(new FinanceObject("Is"));
        objects.add(new FinanceObject("A test"));
        viewPager.setAdapter(new CustomPagerAdapter(getContext(), objects));
        //ConstraintLayout constraintLayout = view.findViewById(R.id.clPayStubFragment);
        //int height = constraintLayout.getHeight();
        //viewPager.getLayoutParams().height = (int)(height*.90);
        Button btnRequestAdvance = view.findViewById(R.id.btnPayStubFrag_requestAdvance);//////////
        btnRequestAdvance.setOnClickListener(this);
        Button btnSubmitExpense = view.findViewById(R.id.btnPayStubFrag_submitExpense);
        btnSubmitExpense.setOnClickListener(this);
        Button btnadvancesRequest = view.findViewById(R.id.btnPayStubFrag_advancesRequested);
        btnadvancesRequest.setOnClickListener(this);
        Button btnExpenseReport = view.findViewById(R.id.btnPayStubFrag_expenseReport);
        btnExpenseReport.setOnClickListener(this);
        requestAdvanceList = new ArrayList<>();
        submitExpenseList = new ArrayList<>();

        return view;
    }




    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    @Override
    public void onClick(View v) {////////////////////
        LinearLayoutManager layoutManager;
        Button btnSubmitRequestAdvance;
        Button btnCancel;
        RecyclerView recyclerView;

        View mView;

        final AlertDialog.Builder mBuilder = new AlertDialog.Builder(getContext());

        switch (v.getId()) {

            case R.id.btnPayStubFrag_requestAdvance:
                mView = getActivity().getLayoutInflater().inflate(R.layout.alert_dialog_request_advance, null);
                btnSubmitRequestAdvance = mView.findViewById(R.id.btnSubmitRequestAdvance);
                btnCancel = mView.findViewById(R.id.btnCancelAlertDialog);

                final EditText advanceAmount = mView.findViewById(R.id.tvRequestAdvance_amount);
                final EditText advanceDescription = mView.findViewById(R.id.tvRequestAdvance_description);

                btnSubmitRequestAdvance.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (!Objects.equals(advanceAmount.getText().toString(), "") && !Objects.equals(advanceDescription.getText().toString(), "")) {
                            requestAdvanceList
                                    .add(new RequestAdvanceClass(Float.valueOf(advanceAmount.getText().toString()), advanceDescription.getText().toString()));

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
                mView = getActivity().getLayoutInflater().inflate(R.layout.alert_dialog_request_advance, null);
                btnSubmitRequestAdvance = mView.findViewById(R.id.btnSubmitRequestAdvance);
                btnCancel = mView.findViewById(R.id.btnCancelAlertDialog);

                final EditText expenseAmount = mView.findViewById(R.id.tvRequestAdvance_amount);
                final EditText expenseDescription = mView.findViewById(R.id.tvRequestAdvance_description);

                btnSubmitRequestAdvance.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (!Objects.equals(expenseAmount.getText().toString(), "") && !Objects.equals(expenseDescription.getText().toString(), "")) {
                            submitExpenseList
                                    .add(new ExpenseRecyclerObject(Float.valueOf(expenseAmount.getText().toString()), expenseAmount.getText().toString()));

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

            case R.id.btnPayStubFrag_advancesRequested:
                mView = getActivity().getLayoutInflater().inflate(R.layout.alert_dialog_benefits, null);
                mBuilder.setTitle("Advances Requested");
                recyclerView = (RecyclerView) mView.findViewById(R.id.rvBenefits);
                AdvanceRecyclerAdapter advanceRecyclerAdapter = new AdvanceRecyclerAdapter(requestAdvanceList);
                recyclerView.setAdapter(advanceRecyclerAdapter);
                layoutManager = new LinearLayoutManager(getContext());
                recyclerView.setLayoutManager(layoutManager);
                mBuilder.setView(mView);
                mBuilder.setCancelable(true);
                mBuilder.show();
                break;
            case R.id.btnPayStubFrag_expenseReport:
                mView = getActivity().getLayoutInflater().inflate(R.layout.alert_dialog_benefits, null);
                mBuilder.setTitle("Expense Report");
                recyclerView = (RecyclerView) mView.findViewById(R.id.rvBenefits);
                ExpenseRecyclerAdapter expenseRecyclerAdapter = new ExpenseRecyclerAdapter(submitExpenseList);
                recyclerView.setAdapter(expenseRecyclerAdapter);
                layoutManager = new LinearLayoutManager(getContext());
                recyclerView.setLayoutManager(layoutManager);
                mBuilder.setView(mView);
                mBuilder.setCancelable(true);
                mBuilder.show();
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
