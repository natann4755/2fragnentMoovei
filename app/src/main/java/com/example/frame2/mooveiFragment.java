package com.example.frame2;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class mooveiFragment extends Fragment {

//    public OnMooveiFragmentClickLisiner myClickLisiner;

    private RecyclerView myRecyclerView;
    private RecyclerView.LayoutManager mylayoutManager;
    private RecyclerView.Adapter myAdapter;



    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View vveiw = inflater.inflate(R.layout.ferm1,container,false);
        myRecyclerView = vveiw.findViewById(R.id.FM_rv);

        intimyRecyclerView();


        return vveiw;
    }

    private void intimyRecyclerView() {
        if (getContext() != null) {
            mylayoutManager = new LinearLayoutManager(getContext());
            myRecyclerView.setLayoutManager(mylayoutManager);
            myAdapter = new mooveyVeiwAdapter(getContext() , MainActivity.arryListMooveis());
            myRecyclerView.setAdapter(myAdapter);
        }
    }
}
