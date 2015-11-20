package cawabanga.com.tvz_workexample1.activity;

/**
 * Created by croatan on 16.11.2015..
 */
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import cawabanga.com.tvz_workexample1.R;
import cawabanga.com.tvz_workexample1.adapter.CarAdapter;
import cawabanga.com.tvz_workexample1.model.Car;

public class CardView extends AppCompatActivity implements CarAdapter.OnCarClickListener {


    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;
    private List<Car> list;


    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card_view);

        recyclerView = (RecyclerView) findViewById(R.id.car_recycler_view);

        list = new ArrayList<Car>();
        populateList();

        // RecyclerView can perform several optimizations
        // if it can know in advance that changes in adapter content cannot
        // change the size of the RecyclerView itself.
        recyclerView.setHasFixedSize(true); //uvjek ce imat fiksnu velicinu, nema promjene recyclera

        layoutManager = new LinearLayoutManager(this); //da nam dopusti da skorlamo vertikalno
        recyclerView.setLayoutManager(layoutManager); //ovdje ga postavimo na taj recycler view

        adapter = new CarAdapter(list, this); //novi objekt adaptera
        recyclerView.setAdapter(adapter); //postavimo adapter


    }

    private void populateList () {

        if (list == null) {
            throw new YouAreAnIdiotException();
        }

        list.add(new Car("Lamborghini", R.drawable.lamborghini));
        list.add(new Car("Porsche", R.drawable.porsche));
        list.add(new Car("Mustang", R.drawable.mustang));
        list.add(new Car("Peglica", R.drawable.peglica));
        list.add(new Car("Nissan", R.drawable.nissan));
        list.add(new Car("Dodge", R.drawable.dodge_viper_srt));


    }

    private class YouAreAnIdiotException extends IllegalStateException {

        private YouAreAnIdiotException () {
            super("You are an idiot!");
        }
    }

    @Override
    public void onCarSelected (Car selectedCar) {
        Toast.makeText(this, "Selected car: " + selectedCar.getName(), Toast.LENGTH_SHORT).show();
    }
}
