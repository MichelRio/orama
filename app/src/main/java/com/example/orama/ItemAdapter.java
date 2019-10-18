package com.example.orama;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.orama.controller.DetailActivity;
import com.example.orama.model.Item;
import com.squareup.picasso.Picasso;

import java.util.List;

import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.ViewHolder> {
    private List<Item> items;
    private Context context;

    public ItemAdapter(Context applicationContext, List<Item> itemArrayList){
        this.context = applicationContext;
        this.items = itemArrayList;
    }

    @Override
    public ItemAdapter.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i){
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.row_item, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder (ItemAdapter.ViewHolder viewHolder, int i){
        viewHolder.title.setText(items.get(i).getSimple_name());
        viewHolder.subtitle.setText(items.get(i).getDescription().getStrengths());

        Picasso.with(context)
                .load("https://s3.amazonaws.com/orama-media/"+items.get(i).getFund_manager().getLogo())
                .placeholder(R.drawable.logo_orama)
                .into(viewHolder.imageView);
    }

    @Override
    public int getItemCount(){
        return items.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        private TextView title, subtitle;
        private ImageView imageView;
        private CardView cardView;


    public ViewHolder(View view){
        super(view);
        title = view.findViewById(R.id.tv_title);
        subtitle = view.findViewById(R.id.tv_subtitle);
        imageView = view.findViewById(R.id.iv_logo);
        cardView = view.findViewById(R.id.cardview);

        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int pos = getAdapterPosition();
                if(pos != RecyclerView.NO_POSITION){
                    Intent intent =  new Intent(context, DetailActivity.class);
                    intent.putExtra("name", items.get(pos).getFull_name());
                    intent.putExtra("logo", items.get(pos).getFund_manager().getLogo());
                    intent.putExtra("desc", items.get(pos).getDescription().getObjective());
                    intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    context.startActivity(intent);
                }
            }
        });
    }
    }
}
