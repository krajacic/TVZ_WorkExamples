package cawabanga.com.tvz_workexample1.adapter;

/**
 * Created by croatan on 16.11.2015..
 */

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import cawabanga.com.tvz_workexample1.R;
import cawabanga.com.tvz_workexample1.model.POJO;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.PojoViewHolder> {

    private List<POJO> pojoList;

    @Override
    public int getItemCount () {
        return pojoList.size();
    }


    @Override
    public void onBindViewHolder (PojoViewHolder pojoViewHolder, int i) {
        pojoViewHolder.text.setText(pojoList.get(i).getText());
    }

    @Override
    public CustomAdapter.PojoViewHolder onCreateViewHolder (ViewGroup parent, int i) {

        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.simple_list_item, parent, false);
        return new PojoViewHolder(v);
    }

    public CustomAdapter (List<POJO> list) {

        this.pojoList = list;

    }

    public static class PojoViewHolder extends RecyclerView.ViewHolder {

        public TextView text;

        public PojoViewHolder (View view) {
            super(view);
            text = (TextView) view.findViewById(R.id.list_item_text);
        }
    }


}