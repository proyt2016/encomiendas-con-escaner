package com.sourcey.materiallogindemo;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by maxi on 20/05/2016.
 */
public class ListadoEncomiendas extends Fragment {

    public ListadoEncomiendas(){}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.encomiendas_view, null);
    }
}
