package com.example.myapplication.listas;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.QualificationActivity;
import com.example.myapplication.R;
import com.example.myapplication.SearchPerfilActivity;
import com.example.myapplication.menu.MenuActivity;

import java.util.List;

public class ListAdapterHistorial extends RecyclerView.Adapter<ListAdapterHistorial.ViewHolder> {
    private List<HistorialModel> ListHistorial;
    LayoutInflater mInflater;
    private Context context;

    public ListAdapterHistorial(List<HistorialModel> itemList, Context context){
        this.mInflater = LayoutInflater.from(context);
        this.context = context;
        this.ListHistorial = itemList;
    }
    @Override
    public int getItemCount() {return ListHistorial.size();}

    @Override
    public ListAdapterHistorial.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        View view = mInflater.inflate(R.layout.list_historial,null);
        return new ListAdapterHistorial.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final ListAdapterHistorial.ViewHolder holder, final int position){
        holder.bindData(ListHistorial.get(position));
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                HistorialModel historialModel = ListHistorial.get(holder.getAdapterPosition());
                if (historialModel.getEstado().equals("Evaluar")){
                    Intent intent = new Intent(view.getContext(), QualificationActivity.class);
                    intent.putExtra("HISTORIAL", historialModel);
                    view.getContext().startActivity(intent);}

            }
        });
    }

    public void setItems(List<HistorialModel> items) {ListHistorial = items;}

    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageView imagenestado, imagenusuario;
        TextView Name, Job, Estado;

        ViewHolder (View itemView){
            super (itemView);
            imagenusuario = itemView.findViewById(R.id.Historialimagen);
            imagenestado = itemView.findViewById(R.id.hitorialcheckstatus);
            Name = itemView.findViewById(R.id.Historialnombre);
            Job = itemView.findViewById(R.id.Historialtrabajo);
            Estado = itemView.findViewById(R.id.Historialestado);
        }

        void bindData(final HistorialModel item){
            Name.setText(item.getNombre());
            Job.setText(item.getTrabajo());
            Estado.setText(item.getEstado());
            imagenusuario.setImageResource(item.getImg());
            imagenestado.setImageResource(item.getIdR());
        }
    }
}
