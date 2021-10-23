package org.aplas.resepmakanan;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class RecycleViewAdapter extends RecyclerView.Adapter<RecycleViewAdapter.ViewHolder> {
    private ArrayList<String> foto = new ArrayList<>();
    private ArrayList<String> nama = new ArrayList<>();
    private ArrayList<String> info = new ArrayList<>();
    private ArrayList<String> bahan = new ArrayList<>();
    private ArrayList<String> caraMasak = new ArrayList<>();
    private Context context;

    public RecycleViewAdapter( ArrayList<String> foto, ArrayList<String> nama, ArrayList<String> info,ArrayList<String> bahan, ArrayList<String> caraMasak, Context context) {
        this.foto = foto;
        this.nama = nama;
        this.info = info;
        this.bahan= bahan;
        this.caraMasak= caraMasak;
        this.context = context;
    }

}
