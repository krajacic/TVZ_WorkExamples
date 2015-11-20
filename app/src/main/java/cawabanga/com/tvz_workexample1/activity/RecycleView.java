package cawabanga.com.tvz_workexample1.activity;

/**
 * Created by croatan on 16.11.2015..
 */

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

import cawabanga.com.tvz_workexample1.R;
import cawabanga.com.tvz_workexample1.adapter.CustomAdapter;
import cawabanga.com.tvz_workexample1.model.POJO;

/**
 * Created by croatan on 16.11.2015..
 */
public class RecycleView extends AppCompatActivity{

    private RecyclerView recyclerView; //to smo dodali u xml-u
    private RecyclerView.Adapter adapter; //u javi kad smo extendali recyclerViewAdapter...znaci CustomAdapter
    private RecyclerView.LayoutManager layoutManager;
    private List<POJO> list;

    private Button addNewItem;
    private Button removeItem;

    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycle_view);

        addNewItem = (Button) findViewById(R.id.add_new_item_to_list_rv);
        removeItem = (Button) findViewById(R.id.remoce_item_from_list_rv);

        list = new ArrayList<POJO>();

        for (int i = 0; i < 5; i++) {
            list.add(new POJO(String.valueOf(i)));
        }

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);

        // RecyclerView can perform several optimizations
        // if it can know in advance that changes in adapter content cannot
        // change the size of the RecyclerView itself.
        recyclerView.setHasFixedSize(true);

        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        adapter = new CustomAdapter(list);
        recyclerView.setAdapter(adapter);

        addNewItem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v) {

                int newItemNumber = list.size();

                list.add(new POJO(String.valueOf(newItemNumber)));
                adapter.notifyItemInserted(list.size()); //da zna da mu je dodan novi item te da refresha

            }
        });

        removeItem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v) {

                if (list.size() != 0) {

                    int removedPosition = list.size() - 1;
                    list.remove(removedPosition);
                    adapter.notifyItemRemoved(removedPosition); //da zna da mu je izbrisan neki item te da refresha

                }


            }
        });


    }

}
