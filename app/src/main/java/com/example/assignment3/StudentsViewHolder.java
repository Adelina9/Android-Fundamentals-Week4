package com.example.assignment3;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

class StudentsViewHolder extends RecyclerView.ViewHolder {
    private TextView textViewFirstName;
    private TextView textViewLastName;

    public StudentsViewHolder(@NonNull View itemView) {
        super(itemView);
        textViewFirstName = itemView.findViewById(R.id.textViewFirstName);
        textViewLastName = itemView.findViewById(R.id.textViewLastName);
    }

    public TextView getTextViewFirstName() {
        return textViewFirstName;
    }

    public TextView getTextViewLastName() {
        return textViewLastName;
    }
}
