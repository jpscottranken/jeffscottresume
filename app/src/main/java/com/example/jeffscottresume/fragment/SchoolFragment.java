package com.example.jeffscottresume.fragment;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.jeffscottresume.R;
import com.example.jeffscottresume.adapter.SchoolAdapter;
import com.example.jeffscottresume.data.DataProject;
import com.example.jeffscottresume.data.DataSchool;
import com.example.jeffscottresume.model.ModelSchool;

import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class SchoolFragment extends Fragment {
    private SchoolAdapter mAdapter;
    private RecyclerView mRecyclerView;
    private RecyclerView.LayoutManager mLayoutManager;
    private List<ModelSchool> mSchools;
    private View mRootView;

    public SchoolFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        mRootView = inflater.inflate(R.layout.fragment_project, container, false);

        mSchools        = DataSchool.getDataSchools();
        mAdapter        = new SchoolAdapter(mSchools,  getContext());
        mRecyclerView   = mRootView.findViewById(R.id.rvProject);
        mLayoutManager  = new LinearLayoutManager(getContext());
        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setAdapter(mAdapter);

        return mRootView;
    }
}
