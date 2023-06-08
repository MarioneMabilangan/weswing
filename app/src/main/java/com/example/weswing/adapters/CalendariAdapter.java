package com.example.weswing.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.weswing.model.Calendari;
import com.example.weswing.R;

import java.util.List;

public class CalendariAdapter extends RecyclerView.Adapter<CalendariAdapter.ViewHolder> {

    private List<Calendari> calendariList;

    public CalendariAdapter(List<Calendari> calendariList) {
        this.calendariList = calendariList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.calendari_layout, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Calendari calendari = calendariList.get(position);

        holder.imageView.setImageResource(calendari.getImagen());
        holder.textViewTitle.setText(calendari.getTitulo());
        holder.textViewSubtitle.setText(calendari.getSubtitulo());
        holder.textViewSubtitle2.setText(calendari.getSubtitulo2());
        holder.textViewSubtitle3.setText(calendari.getSubtitulo3());
        holder.textViewSubtitle4.setText(calendari.getSubtitulo4());
    }

    @Override
    public int getItemCount() {
        return calendariList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView imageView;
        private TextView textViewTitle;
        private TextView textViewSubtitle;
        private TextView textViewSubtitle2;
        private TextView textViewSubtitle3;
        private TextView textViewSubtitle4;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imageView);
            textViewTitle = itemView.findViewById(R.id.textView1);
            textViewSubtitle = itemView.findViewById(R.id.textView2);
            textViewSubtitle2 = itemView.findViewById(R.id.textView3);
            textViewSubtitle3 = itemView.findViewById(R.id.textView4);
            textViewSubtitle4 = itemView.findViewById(R.id.textView5);

        }
    }
}