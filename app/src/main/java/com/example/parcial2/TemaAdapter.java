package com.example.parcial2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class TemaAdapter extends RecyclerView.Adapter<TemaAdapter.ViewHolder> {

    private final List<Tema> lista;

    public TemaAdapter(List<Tema> lista) {
        this.lista = lista;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_card, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder h, int position) {
        Tema t = lista.get(position);
        h.tvTitulo.setText(t.getTitulo());

        Picasso.with(h.itemView.getContext())
                .load(t.getImagen())
                .fit()
                .centerCrop()
                .into(h.imgPrincipal);

        Picasso.with(h.itemView.getContext())
                .load(t.getLogo())
                .fit()
                .centerCrop()
                .into(h.imgAvatar);
    }

    @Override
    public int getItemCount() {
        return lista.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPrincipal;
        CircleImageView imgAvatar;
        TextView tvTitulo;

        ViewHolder(@NonNull View itemView) {
            super(itemView);
            imgPrincipal = itemView.findViewById(R.id.imgPrincipal);
            imgAvatar = itemView.findViewById(R.id.imgAvatar);
            tvTitulo = itemView.findViewById(R.id.tvTitulo);
        }
    }
}