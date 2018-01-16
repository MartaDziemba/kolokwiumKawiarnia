package com.example.marta.kolokwiumkawiarnia;

import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by Marta on 17.01.2018.
 */

public class CoffeeAdapter extends RecyclerView.Adapter<CoffeeAdapter.ViewHolder> {

    ArrayList<Coffee> list = new ArrayList<>();
    CoffeeAdapter(ArrayList<Coffee> coffes) {
        this.list = coffes;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemLayoutView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item, null);
        return new ViewHolder(itemLayoutView);
    }

    @Override
    public void onBindViewHolder(CoffeeAdapter.ViewHolder holder, int position) {
        holder.setName(list.get(position).getName());
        holder.setCoffePrice(list.get(position).getCoffePrice());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.check)
        TextView check;

        @BindView(R.id.coffee)
        TextView coffee;

        @BindView(R.id.price)
        TextView price;

        @OnClick(R.id.pick)
        void OnPickClick(){
            if(check.getVisibility()==View.INVISIBLE){
                check.setVisibility(View.VISIBLE);
            }
            else{
                check.setVisibility(View.INVISIBLE);
            }
        }



        public ViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
            check.setVisibility(View.INVISIBLE);
        }

        public void setName(String name) {
            coffee.setText(name);
        }

        public void setCoffePrice(String coffePrice) {
            price.setText(coffePrice);
        }
    }
}
