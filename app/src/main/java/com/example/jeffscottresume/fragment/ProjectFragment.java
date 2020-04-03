package com.example.jeffscottresume.fragment;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.jeffscottresume.R;
import com.example.jeffscottresume.adapter.ViewPagerAdapter;
import com.example.jeffscottresume.adapter.ProjectActionListener;
import com.example.jeffscottresume.adapter.ProjectAdapter;
import com.example.jeffscottresume.data.DataProject;
import com.example.jeffscottresume.model.ModelProject;

import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class ProjectFragment extends Fragment
                             implements ProjectActionListener {
    private ProjectAdapter mAdapter;
    private RecyclerView   mRecyclerView;
    private RecyclerView.LayoutManager mLayoutManager;
    private List<ModelProject> mProjects;
    private View mRootView;

   public ProjectFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        mRootView = inflater.inflate(R.layout.fragment_project, container, false);

        mProjects       = DataProject.getDataProjects();
        mAdapter        = new ProjectAdapter(mProjects, getActivity(), this);
        mRecyclerView   = mRootView.findViewById(R.id.rvProject);
        mLayoutManager  = new LinearLayoutManager(getContext());
        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setAdapter(mAdapter);

        return mRootView;
    }

    @Override
    public void onExploreProject(ModelProject project)
    {
        //Intent openBrowser = new Intent (Intent.ACTION_VIEW,
                                         //Uri.parse((project.getLandingPage())));
        //startActivity(openBrowser);
    }

    @Override
    public void onSharedProject(ModelProject project)
    {
        Intent sendIntent = new Intent();
        sendIntent.setAction(Intent.ACTION_SEND);
        //sendIntent.putExtra(Intent.EXTRA_TEXT,
                       //project.getProjectName()
                           //+ " " + project.getLandingPage());
        //sendIntent.setType("text/plain");
        //startActivity(sendIntent);
    }
}
