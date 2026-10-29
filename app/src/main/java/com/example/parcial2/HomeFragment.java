package com.example.parcial2;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        RecyclerView recycler = (RecyclerView) view;
        recycler.setLayoutManager(new LinearLayoutManager(getContext()));

        List<Tema> lista = new ArrayList<>();
        lista.add(new Tema("Ferrari", R.drawable.ferrari, R.drawable.ferrari_logo));
        lista.add(new Tema("Lamborghini", R.drawable.lambo, R.drawable.lambo_logo));
        lista.add(new Tema("Ford Mustang", R.drawable.mustang, R.drawable.ford_logo));
        lista.add(new Tema("Porsche 911", R.drawable.porsche, R.drawable.porsche_logo));
        lista.add(new Tema("Nissan GT-R", R.drawable.gtr, R.drawable.nissan_logo));
        lista.add(new Tema("BMW M3", R.drawable.bmw, R.drawable.bmw_logo));

        recycler.setAdapter(new TemaAdapter(lista));
        return view;
    }
}