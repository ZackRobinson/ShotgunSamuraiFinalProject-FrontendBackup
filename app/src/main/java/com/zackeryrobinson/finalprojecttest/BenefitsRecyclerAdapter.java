package com.zackeryrobinson.finalprojecttest;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ios on 10/16/17.
 */

public class BenefitsRecyclerAdapter extends RecyclerView.Adapter<BenefitsRecyclerAdapter.ViewHolder>{

    private static final String TAG = "RecyclerViewAdapter";

    List<BenefitsObject> benefitsList = new ArrayList<>();
    private Context context;

    public BenefitsRecyclerAdapter(List<BenefitsObject> benefitsList) {
        this.benefitsList = benefitsList;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
       //private final TextView tvPersonName;
        //private final TextView tvPersonAge;
       // private final TextView tvPersonGender;
       // private final TextView tvPersonHeight;
            private final TextView tvTest;
        public ViewHolder(View itemView) {
            super(itemView);
            //bind the views in the custom item layout
            tvTest = itemView.findViewById(R.id.tvTestText);
            //tvPersonName = itemView.findViewById(R.id.tvPersonName);
            //tvPersonAge = itemView.findViewById(R.id.tvPersonAge);
            //tvPersonGender = itemView.findViewById(R.id.tvPersonGender);
            //tvPersonHeight = itemView.findViewById(R.id.tvPersonHeight);

        }
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        context = parent.getContext();

        View view = LayoutInflater
                .from(context)
                .inflate(R.layout.object_list_benefits, parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        //Person person = personList.get(position);
        //holder.tvPersonName.setText(person.getName());
        //holder.tvPersonGender.setText(person.getGender());
        //holder.tvPersonAge.setText(String.valueOf(person.getAge()));
        //holder.tvPersonHeight.setText(String.valueOf(person.getHeight()));
    }

    @Override
    public int getItemCount() {

        return benefitsList.size();
    }
}

