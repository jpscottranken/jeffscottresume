package com.example.jeffscottresume.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.jeffscottresume.R;
import com.example.jeffscottresume.model.ModelSchool;
import com.squareup.picasso.Picasso;

import java.util.List;

//	The SchoolAapter needs to extend from the
//	RecyclerView.Adapter.  After this, you are required to
//	add the following three classes:
//
//	onCreateViewHolder(), which is where the views from the
//	custom row layout are inflated and a new ViewHolder is created.
//
//	onBindViewHolder(), which is where the values for each
//	item in the row is bound (bind) to the associated view.
//
//	getItemCount(), which returns the number of list items.
public class SchoolAdapter extends RecyclerView.Adapter<SchoolAdapter.ViewHolder> {
    private final List<ModelSchool> mSchool;	//	Holds the passed in list of schools
    private final Context mContext;		//	Context needed by constructor

    //	Constructor
    //
    //	The constructor is called when a new adapter is
    //	created.  It is in the constructor that the list of
    //	Schools, Companies, or Projects to display is received.
    public SchoolAdapter(List<ModelSchool> school, Context context) {
        mSchool  = school;
        mContext = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(mContext);
        View view = inflater.inflate(R.layout.customer_row_school, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {
        final ModelSchool selectedSchool = mSchool.get(position);
        holder.schoolName.setText(selectedSchool.getSchoolName());
        holder.schoolDegreeName.setText(selectedSchool.getSchoolDegreeName());
        holder.schoolGraduationDate.setText(selectedSchool.getSchoolGraduationDate());
        Picasso.with(mContext)
                .load(selectedSchool.getSchoolImageLink())
                .fit()
                .placeholder(R.drawable.sql_logo)
                .into(holder.schoolImageLink);
    }

    @Override
    public int getItemCount() {
        return mSchool.size();
    }

    //	The ViewHolder provides a way to cache some of
    //	the views so that the program does not have to
    //	inflate them over and over again vial calls to
    //	findViewById().  Using a ViewHolder greatly
    //	increases the performance of lists with lots of
    //	items and provides a smooth scrolling capability.
    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView  schoolName;
        public TextView  schoolDegreeName;
        public TextView schoolGraduationDate;
        public ImageView schoolImageLink;

        //	Constructor
        public ViewHolder(View itemView) {
			super(itemView);
            schoolName			 = itemView.findViewById(R.id.text_view_school_name);
            schoolDegreeName	 = itemView.findViewById(R.id.text_view_degree_name);
            schoolGraduationDate = itemView.findViewById(R.id.text_view_graduation_year);
            schoolImageLink		 = itemView.findViewById(R.id.image_view_school_image);
        }
    }
}