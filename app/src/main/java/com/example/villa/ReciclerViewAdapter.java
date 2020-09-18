package com.example.villa;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import static androidx.core.content.ContextCompat.startActivity;


public class ReciclerViewAdapter extends RecyclerView.Adapter<ReciclerViewAdapter.ViewHolder> {




    public static class ViewHolder extends RecyclerView.ViewHolder{

        private TextView codigo,descripcion,peso;
        ImageView foto;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            codigo = itemView.findViewById(R.id.txtcodigo);
            descripcion = itemView.findViewById(R.id.txtDescripcion);
            peso = itemView.findViewById(R.id.txtPeso);
            foto = itemView.findViewById(R.id.imgEnamoro);




        }
    }


    public List<Enamoro> enamoroItem;


    public ReciclerViewAdapter(List<Enamoro> enamoroItem){

        this.enamoroItem=enamoroItem;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_item,parent,false);
        ViewHolder viewHolder = new ViewHolder(view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull final ViewHolder holder, final int position) {
        holder.codigo.setText(enamoroItem.get(position).getCodigo());
        holder.descripcion.setText(enamoroItem.get(position).getDescripcion());
        holder.peso.setText(enamoroItem.get(position).getPeso());
        holder.foto.setImageResource(enamoroItem.get(position).getFoto());


        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            //    Toast.makeText(, "wqwqwdqw", Toast.LENGTH_SHORT).show();


               // Intent detalleArgolla = new Intent(view.getContext(),detalleArgollaActivity.class);
               // detalleArgolla.putExtra("codigo",enamoroItem.get(position).getCodigo());
              //  detalleArgolla.putExtra("imagenArgolla",enamoroItem.get(position).getFoto());
              //  startActivity(this,detalleArgolla);

                //Toast.makeText(view.getContext(), "mmmta", Toast.LENGTH_SHORT).show();


            }
        });


    }

    @Override
    public int getItemCount(){
        return enamoroItem.size();

    }

}
