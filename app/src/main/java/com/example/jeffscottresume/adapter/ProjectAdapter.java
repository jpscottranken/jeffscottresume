package com.example.jeffscottresume.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.jeffscottresume.R;
import com.example.jeffscottresume.model.ModelProject;
import com.squareup.picasso.Picasso;

import java.util.List;

public class ProjectAdapter extends RecyclerView.Adapter<ProjectAdapter.ViewHolder> {
    private List<ModelProject> mProjects;
    private final Context mContext;
    private final ProjectActionListener mListener;

    //	Constructor
    public ProjectAdapter(List<ModelProject> projects,
                   Context context,
                   ProjectActionListener listener) {
        mProjects	= projects;
        mContext 	= context;
        mListener 	= listener;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(mContext);
        View view = inflater.inflate(R.layout.customer_row_project, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        ModelProject selectedProject = mProjects.get(position);
        holder.projectName.setText(selectedProject.getProjectName());
        holder.projectType.setText(selectedProject.getProjectType());
        holder.projectDescription.setText(selectedProject.getProjectDescription());
        Picasso.with(mContext)
               .load(selectedProject.getProjectImagePath())
               .fit()
                .placeholder(R.drawable.javascript_logo)
                .into(holder.projectImagePath);
    }

    @Override
    public int getItemCount() {
        return mProjects.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public ImageView projectImagePath;
        public TextView projectType;
        public TextView  projectName;
        public TextView  projectDescription;
        public TextView  shareProject;
        public TextView  exploreProject;

        public ViewHolder(View itemView) {
            super(itemView);
            projectImagePath    = itemView.findViewById(R.id.image_view_project_main_image);
            projectType 		= itemView.findViewById(R.id.text_view_project_type);
            projectName 		= itemView.findViewById(R.id.text_view_project_name);
            projectDescription	= itemView.findViewById(R.id.text_view_project_description);
            shareProject 		= itemView.findViewById(R.id.text_view_project_share);
            exploreProject 		= itemView.findViewById(R.id.text_view_project_details);

        //	Unlike the SchoolAdapter and the CompanyAdapter,
        //	the ProjectAdapter has listeners for when the user
        //	selects either the Share or Explore options.
		shareProject.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ModelProject clickedProject = mProjects.get(getLayoutPosition());
                mListener.onSharedProject(clickedProject);
            }
        });

		exploreProject.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ModelProject clickedProject = mProjects.get(getLayoutPosition());
                mListener.onExploreProject(clickedProject);
            }
        });
    }
    }

}