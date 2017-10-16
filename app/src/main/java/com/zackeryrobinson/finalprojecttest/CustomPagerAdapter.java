package com.zackeryrobinson.finalprojecttest;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

import butterknife.ButterKnife;
import butterknife.InjectView;

/**
 * Created by ios on 10/16/17.
 */

public class CustomPagerAdapter extends PagerAdapter {
    Context context;
    ArrayList<FinanceObject> objects;

    @InjectView(R.id.tvDate_payDate)
    TextView tvDate_payDate;
    @InjectView(R.id.tvDate_startDate)
    TextView tvDate_startDate;
    @InjectView(R.id.tvDate_endDate)
    TextView tvDate_endDate;
    @InjectView(R.id.tvEarning_regularRate)
    TextView tvEarning_regularRate;
    @InjectView(R.id.tvEarning_regularHours)
    TextView tvEarning_regularHours;
    @InjectView(R.id.tvEarning_regularPay)
    TextView tvEarning_regularPay;
    @InjectView(R.id.tvEarning_overtimeRate)
    TextView tvEarning_overtimeRate;
    @InjectView(R.id.tvEarning_overtimeHours)
    TextView tvEarning_overtimeHours;
    @InjectView(R.id.tvEarning_overTimePay)
    TextView tvEarning_overTimePay;
    @InjectView(R.id.tvEarning_holidayHours)
    TextView tvEarning_holidayHours;
    @InjectView(R.id.tvEarning_holidayPay)
    TextView tvEarning_holidayPay;
    @InjectView(R.id.tvEarning_ptoHours)
    TextView tvEarning_ptoHours;
    @InjectView(R.id.tvEarning_ptoPay)
    TextView tvEarning_ptoPay;
    @InjectView(R.id.tvEarning_totalHours)
    TextView tvEarning_totalHours;
    @InjectView(R.id.tvEarning_totalPay)
    TextView tvEarning_totalPay;
    @InjectView(R.id.tvExpAdv_expenses)
    TextView tvExpAdv_expenses;
    @InjectView(R.id.tvExpAdv_advances)
    TextView tvExpAdv_advances;
    @InjectView(R.id.tvDeduction_federalTax)
    TextView tvDeduction_federalTax;
    @InjectView(R.id.tvDeduction_federalTaxYTD)
    TextView tvDeduction_federalTaxYTD;
    @InjectView(R.id.tvDeduction_stateTax)
    TextView tvDeduction_stateTax;
    @InjectView(R.id.tvDeduction_stateTaxYTD)
    TextView tvDeduction_stateTaxYTD;
    @InjectView(R.id.tvDeduction_socialSecurityTax)
    TextView tvDeduction_socialSecurityTax;
    @InjectView(R.id.tvDeduction_socialSecurityTaxYTD)
    TextView tvDeduction_socialSecurityTaxYTD;
    @InjectView(R.id.tvDeduction_medicareTax)
    TextView tvDeduction_medicareTax;
    @InjectView(R.id.tvDeduction_medicareTaxYTD)
    TextView tvDeduction_medicareTaxYTD;
    @InjectView(R.id.tvDeduction_medicareInsurance)
    TextView tvDeduction_medicareInsurance;
    @InjectView(R.id.tvDeduction_medicareInsuranceYTD)
    TextView tvDeduction_medicareInsuranceYTD;
    @InjectView(R.id.tvDeduction_visionInsurance)
    TextView tvDeduction_visionInsurance;
    @InjectView(R.id.tvDeduction_visionInsuranceYTD)
    TextView tvDeduction_visionInsuranceYTD;
    @InjectView(R.id.tvDeduction_dentalInsurance)
    TextView tvDeduction_dentalInsurance;
    @InjectView(R.id.tvDeduction_dentalInsuranceYTD)
    TextView tvDeduction_dentalInsuranceYTD;
    @InjectView(R.id.tvDeduction_stdisabilityInsurance)
    TextView tvDeduction_stdisabilityInsurance;
    @InjectView(R.id.tvDeduction_stdisabilityInsuranceYTD)
    TextView tvDeduction_stdisabilityInsuranceYTD;
    @InjectView(R.id.tvDeduction_ltdisabilityInsurance)
    TextView tvDeduction_ltdisabilityInsurance;
    @InjectView(R.id.tvDeduction_ltdisabilityInsuranceYTD)
    TextView tvDeduction_ltdisabilityInsuranceYTD;
    @InjectView(R.id.tvDeduction_lifeInsurance)
    TextView tvDeduction_lifeInsurance;
    @InjectView(R.id.tvDeduction_lifeInsuranceYTD)
    TextView tvDeduction_lifeInsuranceYTD;
    @InjectView(R.id.tvDeduction_advance)
    TextView tvDeduction_advance;
    @InjectView(R.id.tvDeduction_advanceYTD)
    TextView tvDeduction_advanceYTD;
    @InjectView(R.id.tvDeduction_totalPay)
    TextView tvDeduction_totalPay;
    @InjectView(R.id.tvDeduction_totalPayYTD)
    TextView tvDeduction_totalPayYTD;
    @InjectView(R.id.tvTotals_netPay)
    TextView tvTotals_netPay;
    @InjectView(R.id.tvTotals_grossPayYTD)
    TextView tvTotals_grossPayYTD;
    @InjectView(R.id.tvTotals_netPayYTD)
    TextView tvTotals_netPayYTD;

    public CustomPagerAdapter(Context context, ArrayList<FinanceObject> object) {
        this.context = context;
        this.objects = object;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        View view = LayoutInflater.from(context).inflate(R.layout.pager_list_item, container, false);
        ButterKnife.inject(this, view);
        /*
        tvDate_payDate.setText(objects.get(position).getDate_payDate());
        tvDate_startDate.setText(objects.get(position).getDate_startDate());
        tvDate_endDate.setText(objects.get(position).getDate_endDate());
        tvEarning_regularRate.setText(objects.get(position).getEarning_regularRate());
        tvEarning_regularHours.setText(objects.get(position).getEarning_regularHours());
        tvEarning_regularPay.setText(objects.get(position).getEarning_regularPay());
        tvEarning_overtimeRate.setText(objects.get(position).getEarning_overtimeRate());
        tvEarning_overtimeHours.setText(objects.get(position).getEarning_overtimeHours());
        tvEarning_overTimePay.setText(objects.get(position).getEarning_overTimePay());
        tvEarning_holidayHours.setText(objects.get(position).getEarning_holidayHours());
        tvEarning_holidayPay.setText(objects.get(position).getEarning_holidayPay());
        tvEarning_ptoHours.setText(objects.get(position).getEarning_ptoHours());
        tvEarning_ptoPay.setText(objects.get(position).getEarning_ptoPay());
        tvEarning_totalHours.setText(objects.get(position).getEarning_totalHours());
        tvEarning_totalPay.setText(objects.get(position).getEarning_totalPay());
        tvExpAdv_expenses.setText(objects.get(position).getExpAdv_expenses());
        tvExpAdv_advances.setText(objects.get(position).getExpAdv_advances());
        tvDeduction_federalTax.setText(objects.get(position).getDeduction_federalTax());
        tvDeduction_federalTaxYTD.setText(objects.get(position).getDeduction_federalTaxYTD());
        tvDeduction_stateTax.setText(objects.get(position).getDeduction_stateTax());
        tvDeduction_stateTaxYTD.setText(objects.get(position).getDeduction_stateTaxYTD());
        tvDeduction_socialSecurityTax.setText(objects.get(position).getDeduction_socialSecurityTax());
        tvDeduction_socialSecurityTaxYTD.setText(objects.get(position).getDeduction_socialSecurityTaxYTD());
        tvDeduction_medicareTax.setText(objects.get(position).getDeduction_medicareTax());
        tvDeduction_medicareTaxYTD.setText(objects.get(position).getDeduction_medicareTaxYTD());
        tvDeduction_medicareInsurance.setText(objects.get(position).getDeduction_medicareInsurance());
        tvDeduction_medicareInsuranceYTD.setText(objects.get(position).getDeduction_medicareInsuranceYTD());
        tvDeduction_visionInsurance.setText(objects.get(position).getDeduction_visionInsurance());
        tvDeduction_visionInsuranceYTD.setText(objects.get(position).getDeduction_visionInsuranceYTD());
        tvDeduction_dentalInsurance.setText(objects.get(position).getDeduction_dentalInsurance());
        tvDeduction_dentalInsuranceYTD.setText(objects.get(position).getDeduction_dentalInsuranceYTD());
        tvDeduction_stdisabilityInsurance.setText(objects.get(position).getDeduction_stdisabilityInsurance());
        tvDeduction_stdisabilityInsuranceYTD.setText(objects.get(position).getDeduction_stdisabilityInsuranceYTD());
        tvDeduction_ltdisabilityInsurance.setText(objects.get(position).getDeduction_ltdisabilityInsurance());
        tvDeduction_ltdisabilityInsuranceYTD.setText(objects.get(position).getDeduction_ltdisabilityInsuranceYTD());
        tvDeduction_lifeInsurance.setText(objects.get(position).getDeduction_lifeInsurance());
        tvDeduction_lifeInsuranceYTD.setText(objects.get(position).getDeduction_lifeInsuranceYTD());
        tvDeduction_advance.setText(objects.get(position).getDeduction_advance());
        tvDeduction_advanceYTD.setText(objects.get(position).getDeduction_advanceYTD());
        tvDeduction_totalPay.setText(objects.get(position).getDeduction_totalPay());
        tvDeduction_totalPayYTD.setText(objects.get(position).getDeduction_totalPayYTD());
        tvTotals_netPay.setText(objects.get(position).getTotals_netPay());
        tvTotals_grossPayYTD.setText(objects.get(position).getTotals_grossPayYTD());
        tvTotals_netPayYTD.setText(objects.get(position).getTotals_netPayYTD());
        */

        container.addView(view);

        return view;
    }

    @Override
    public int getCount() {
        return objects.size();
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == (LinearLayout) object;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((LinearLayout) object);
    }
}
