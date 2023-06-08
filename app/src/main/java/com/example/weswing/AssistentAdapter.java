package com.example.weswing;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class AssistentAdapter extends RecyclerView.Adapter<AssistentAdapter.ViewHolder> {

    private List<Assistent> assistentList;

    public AssistentAdapter(List<Assistent> assistentList) {
        this.assistentList = assistentList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.assistent_layout, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Assistent assistent = assistentList.get(position);

        holder.imageView.setImageResource(assistent.getImagen());

        holder.textViewTitle.setText(assistent.getTitulo());
        holder.textViewSubtitle.setText(assistent.getSubtitulo());
    }

    @Override
    public int getItemCount() {
        return assistentList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView imageView;
        private TextView textViewTitle;
        private TextView textViewSubtitle;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imageView);
            textViewTitle = itemView.findViewById(R.id.textView1);
            textViewSubtitle = itemView.findViewById(R.id.textView2);
        }
    }
}
