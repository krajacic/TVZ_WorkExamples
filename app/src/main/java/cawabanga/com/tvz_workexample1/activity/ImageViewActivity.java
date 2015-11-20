package cawabanga.com.tvz_workexample1.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

import cawabanga.com.tvz_workexample1.R;

/**
 * Created by croatan on 3.11.2015..
 */
public class ImageViewActivity extends AppCompatActivity {
    private ImageView image;

    @Override
    protected void onCreate (Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_view);

        image = (ImageView) findViewById(R.id.andorid_logo);

        image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                image.setBackgroundResource(R.drawable.monster);
            }
        });
    }
}
