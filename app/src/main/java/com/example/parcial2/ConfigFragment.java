package com.example.parcial2;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class ConfigFragment extends Fragment {

    private static final String ARG_USUARIO = "usuario";

    public static ConfigFragment newInstance(String usuario) {
        ConfigFragment f = new ConfigFragment();
        Bundle args = new Bundle();
        args.putString(ARG_USUARIO, usuario);
        f.setArguments(args);
        return f;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_config, container, false);

        TextView tvUsuario = view.findViewById(R.id.tvUsuario);
        Button btnCerrar = view.findViewById(R.id.btnCerrarSesion);

        if (getArguments() != null) {
            tvUsuario.setText(getArguments().getString(ARG_USUARIO));
        }

        btnCerrar.setOnClickListener(v -> {
            Intent intent = new Intent(requireActivity(), Login.class);
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
            startActivity(intent);
        });

        return view;
    }
}