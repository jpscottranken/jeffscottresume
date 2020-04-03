package com.example.jeffscottresume.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.jeffscottresume.R;
import com.example.jeffscottresume.model.ModelCompany;
import com.squareup.picasso.Picasso;

import java.util.List;

public class CompanyAdapter extends RecyclerView.Adapter<CompanyAdapter.ViewHolder> {
    private List<ModelCompany> mCompanies;
    private final Context mContext;

    //	Constructor
    public CompanyAdapter(List<ModelCompany> companies, Context context) {
        mCompanies = companies;
        mContext = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(mContext);
        View view = inflater.inflate(R.layout.customer_row_company, parent, false);
        return new ViewHolder(view);

    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        ModelCompany selectedCompany = mCompanies.get(position);
        holder.companyName.setText(selectedCompany.getCompanyName());
        holder.companyCity.setText(selectedCompany.getCompanyCity());
        holder.companyState.setText(selectedCompany.getCompanyState());
        holder.companyPeriod.setText(selectedCompany.getCompanyPeriod());
        holder.companyJobDesc.setText(selectedCompany.getCompanyJobDesc());
        Picasso.with(mContext)
                .load(selectedCompany.getCompanyLogo())
                .fit()
                .placeholder(R.drawable.csharp_logo)
                .into(holder.companyLogo);
    }

    @Override
    public int getItemCount() {
        return mCompanies.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView companyName;
        public TextView companyJobDesc;
        public TextView companyJobTitle;
        public TextView companyCity;
        public TextView companyState;
        public TextView companyPeriod;
        public ImageView companyLogo;

        public ViewHolder(View itemView) {
            super(itemView);
            companyJobDesc = itemView.findViewById(R.id.text_view_job_description);
            companyJobTitle = itemView.findViewById(R.id.text_view_position);
            companyName = itemView.findViewById(R.id.text_view_company_name);
            companyCity = itemView.findViewById(R.id.text_view_city);
            companyState = itemView.findViewById(R.id.text_view_city);
            companyPeriod = itemView.findViewById(R.id.text_view_year);
            companyLogo = itemView.findViewById(R.id.image_view_project_main_image);
        }
    }
}