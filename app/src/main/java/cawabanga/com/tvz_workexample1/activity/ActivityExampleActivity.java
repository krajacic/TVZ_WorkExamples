package cawabanga.com.tvz_workexample1.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import cawabanga.com.tvz_workexample1.R;

/**
 * Created by croatan on 3.11.2015..
 */
public class ActivityExampleActivity extends AppCompatActivity{ //mozda bu trebalo stavit samo Activity umjesto AppCompatActivity

    private static final String TAG = "example";

    private ImageView monster;

    @Override protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_example);

        monster = (ImageView) findViewById(R.id.monster_ends);

        Toast.makeText(this, "onCreate", Toast.LENGTH_SHORT).show();
        Log.d(TAG, "onCreate");

        monster.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    @Override protected void onStart(){
        super.onStart();

        Toast.makeText(this, "onStart", Toast.LENGTH_SHORT).show();
        Log.d(TAG, "onStart");
    }

    @Override
    protected void onResume () {
        super.onResume();


        Toast.makeText(this, "onResume", Toast.LENGTH_SHORT).show();
        Log.d(TAG, "onResume");
    }

    @Override
    protected void onPause () {
        super.onPause();


        Toast.makeText(this, "onPause", Toast.LENGTH_SHORT).show();
        Log.d(TAG, "onPause");
    }

    @Override
    protected void onStop () {
        super.onStop();

        Toast.makeText(this, "onRestart", Toast.LENGTH_SHORT).show();
        Log.d(TAG, "onRestart");

    }

    @Override
    protected void onRestart () {
        super.onRestart();

        Toast.makeText(this, "onStop", Toast.LENGTH_SHORT).show();
        Log.d(TAG, "onStop");

    }

    @Override
    protected void onDestroy () {
        super.onDestroy();

        Toast.makeText(this, "onDestroy", Toast.LENGTH_SHORT).show();
        Log.d(TAG, "onDestroy");
    }

    @Override
    public void onBackPressed () {
        Toast.makeText(this, "Only Monster can end this misery", Toast.LENGTH_SHORT).show();
    }


}
