package com.example.myapplication.listas;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.R;

import java.util.List;

public class ListAdapterSugerencia extends RecyclerView.Adapter<ListAdapterSugerencia.ViewHolder> {
    private List<SugerenciaModel> ListSugerencias;
    LayoutInflater mInflater;
    private Context context;

    public ListAdapterSugerencia(List<SugerenciaModel> itemList, Context context){
        this.mInflater = LayoutInflater.from(context);
        this.context = context;
        this.ListSugerencias = itemList;
    }
    @Override
    public int getItemCount() {return ListSugerencias.size();}

    @Override
    public ListAdapterSugerencia.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        View view = mInflater.inflate(R.layout.list_sugerencias,null);
        return new ListAdapterSugerencia.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final ListAdapterSugerencia.ViewHolder holder, final int position){
        holder.bindData(ListSugerencias.get(position));
    }

    public void setItems(List<SugerenciaModel> items) {ListSugerencias = items;}

    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageView imagenSugerencia;
        TextView Name, Job, Ubication;

        ViewHolder (View itemView){
            super (itemView);
            imagenSugerencia = itemView.findViewById(R.id.sugerenciaImagen);
            Name = itemView.findViewById(R.id.sugerenciaNombre);
            Job = itemView.findViewById(R.id.sugerenciaRubro);
            Ubication = itemView.findViewById(R.id.sugerenciaUbicacion);
        }

        void bindData(final SugerenciaModel item){
            Name.setText(item.getName());
            Job.setText(item.getJob());
            Ubication.setText(item.getUbication());
            Integer idDebug = item.getIdR();
            Log.d("La wea",idDebug.toString());
            imagenSugerencia.setImageResource(item.getIdR());
        }
    }
}