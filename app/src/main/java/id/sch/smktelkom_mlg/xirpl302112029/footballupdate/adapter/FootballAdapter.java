package id.sch.smktelkom_mlg.xirpl302112029.footballupdate.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import id.sch.smktelkom_mlg.xirpl302112029.footballupdate.R;
import id.sch.smktelkom_mlg.xirpl302112029.footballupdate.model.Football;

/**
 * Created by Affandhy on 22/11/2016.
 */

public class FootballAdapter extends RecyclerView.Adapter<FootballAdapter.ViewHolder>

{
    ArrayList<Football> footballList;

    public FootballAdapter(ArrayList<Football> footballList) {
        this.footballList = footballList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list, parent, false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Football football = footballList.get(position);
        holder.tvJudul.setText(football.Judul);
        holder.tvDeskripsi.setText(football.Deskripsi);
        holder.ivFoto.setImageDrawable(football.foto);
    }

    @Override
    public int getItemCount() {
        if (footballList != null)
            return footballList.size();
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView ivFoto;
        TextView tvJudul;
        TextView tvDeskripsi;

        public ViewHolder(View itemView) {
            super(itemView);
            ivFoto = (ImageView) itemView.findViewById(R.id.ImageView);
            tvJudul = (TextView) itemView.findViewById(R.id.textViewJudul);
            tvDeskripsi = (TextView) itemView.findViewById(R.id.textViewDeskripsi);


        }
    }
}
