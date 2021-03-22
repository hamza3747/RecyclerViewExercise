package com.example.recyclerviewexercise.Adapters;

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

import com.example.recyclerviewexercise.Models.RecipeModel;
import com.example.recyclerviewexercise.R;

import java.util.ArrayList;

public class RecipeAdapter extends RecyclerView.Adapter<RecipeAdapter.viewHolder>{

    ArrayList<RecipeModel> list;
    Context context;

    public RecipeAdapter(ArrayList<RecipeModel> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.sample_recyclerview , parent , false);
        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecipeAdapter.viewHolder holder, int position) {

        RecipeModel model = list.get(position);
        holder.imageView1.setImageResource(model.getImage());
        holder.textView1.setText(model.getFoodMenuText());


        //  Code to set clickListner on image

        switch (position){
            case 0:
            holder.imageView1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(context , "Image one is clicked" , Toast.LENGTH_SHORT).show();
                }
            });

            holder.textView1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(context , "Text one is clicked" , Toast.LENGTH_SHORT).show();
                }
            });
            break;

            case 1:
                holder.imageView1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(context , "Image two is clicked" , Toast.LENGTH_SHORT).show();
                    }
                });

                holder.textView1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(context , "Text two is clicked" , Toast.LENGTH_SHORT).show();
                    }
                });
                break;

            case 2:
                holder.imageView1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(context , "Image three is clicked" , Toast.LENGTH_SHORT).show();
                    }
                });

                holder.textView1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(context , "Text three is clicked" , Toast.LENGTH_SHORT).show();
                    }
                });
                break;

            case 3:
                holder.imageView1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(context , "Image four is clicked" , Toast.LENGTH_SHORT).show();
                    }
                });

                holder.textView1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(context , "Text four is clicked" , Toast.LENGTH_SHORT).show();
                    }
                });
                break;

            case 4:
                holder.imageView1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(context , "Image five is clicked" , Toast.LENGTH_SHORT).show();
                    }
                });

                holder.textView1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(context , "Text five is clicked" , Toast.LENGTH_SHORT).show();
                    }
                });
                break;

            case 5:
                holder.imageView1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(context , "Image six is clicked" , Toast.LENGTH_SHORT).show();
                    }
                });

                holder.textView1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(context , "Text six is clicked" , Toast.LENGTH_SHORT).show();
                    }
                });
                break;

            case 6:
                holder.imageView1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(context , "Image seven is clicked" , Toast.LENGTH_SHORT).show();
                    }
                });

                holder.textView1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(context , "Text seven is clicked" , Toast.LENGTH_SHORT).show();
                    }
                });
                break;

            case 7:
                holder.imageView1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(context , "Image eight is clicked" , Toast.LENGTH_SHORT).show();
                    }
                });

                holder.textView1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(context , "Text eight is clicked" , Toast.LENGTH_SHORT).show();
                    }
                });
                break;

            case 8:
                holder.imageView1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(context , "Image nine is clicked" , Toast.LENGTH_SHORT).show();
                    }
                });

                holder.textView1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(context , "Text nine is clicked" , Toast.LENGTH_SHORT).show();
                    }
                });
                break;

            default:
                break;
        }

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder{

        ImageView imageView1;
        TextView textView1;

        public viewHolder(@NonNull View itemView) {
            super(itemView);
            imageView1 = itemView.findViewById(R.id.ivImage1);
            textView1 = itemView.findViewById(R.id.tvImage1Name);
        }
    }

}
