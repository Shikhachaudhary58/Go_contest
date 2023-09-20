package com.example.splashscreen;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import com.example.splashscreen.Adapter.StyleAdapter;


public class home1 extends Fragment {




    List<Style> data;
    RecyclerView recyclerView;
    StyleAdapter styleAdapter;


    public home1() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootview= inflater.inflate(R.layout.fragment_home1, container, false);
        data = generateStyle();
        recyclerView = rootview.findViewById(R.id.recycle);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        styleAdapter = new StyleAdapter(data);
        recyclerView.setAdapter(styleAdapter);
        return rootview;
    }

    private List<Style> generateStyle() {
        List<Style> data = new ArrayList<>();
        data.add(new Style("Kartik Gupta", "#01","Rs. 1000", R.drawable.trace__1_ ));
        data.add(new Style("Kartik Gupta", "#01","Rs. 1000", R.drawable.trace__1_ ));
        data.add(new Style("Kartik Gupta", "#01","Rs. 1000", R.drawable.trace__1_ ));
        data.add(new Style("Kartik Gupta", "#01","Rs. 1000", R.drawable.trace__1_ ));
        data.add(new Style("Kartik Gupta", "#01","Rs. 1000", R.drawable.trace__1_ ));
        data.add(new Style("Kartik Gupta", "#01","Rs. 1000", R.drawable.trace__1_ ));
        data.add(new Style("Kartik Gupta", "#01","Rs. 1000", R.drawable.trace__1_ ));
        data.add(new Style("Kartik Gupta", "#01","Rs. 1000", R.drawable.trace__1_ ));
        data.add(new Style("Kartik Gupta", "#01","Rs. 1000", R.drawable.trace__1_ ));
        data.add(new Style("Kartik Gupta", "#01","Rs. 1000", R.drawable.trace__1_ ));
        data.add(new Style("Kartik Gupta", "#01","Rs. 1000", R.drawable.trace__1_ ));
        data.add(new Style("Kartik Gupta", "#01","Rs. 1000", R.drawable.trace__1_ ));
        data.add(new Style("Kartik Gupta", "#01","Rs. 1000", R.drawable.trace__1_ ));
        data.add(new Style("Kartik Gupta", "#01","Rs. 1000", R.drawable.trace__1_ ));
        data.add(new Style("Kartik Gupta", "#01","Rs. 1000", R.drawable.trace__1_ ));
        data.add(new Style("Kartik Gupta", "#01","Rs. 1000", R.drawable.trace__1_ ));
        data.add(new Style("Kartik Gupta", "#01","Rs. 1000", R.drawable.trace__1_ ));
        data.add(new Style("Kartik Gupta", "#01","Rs. 1000", R.drawable.trace__1_ ));
        data.add(new Style("Kartik Gupta", "#01","Rs. 1000", R.drawable.trace__1_ ));
        return data;

    }
}