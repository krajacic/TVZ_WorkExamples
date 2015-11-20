package cawabanga.com.tvz_workexample1.activity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import cawabanga.com.tvz_workexample1.R;

public class MainActivity extends AppCompatActivity {

    private static final String MONSTER_URL = "http://juricakrajacic.com/";

    private Button relativeLayout;
    private Button linearLayout;
    private Button textView;
    private Button imageView;
    private Button editText;
    private Button activityExample;
    private ImageView monster;
    private Button scrollView;
    private Button cardView;
    private Button recycleView;
    private Button listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        /*In next few codes we'll made when click on Button (in MainActivity) to connect with other layouts*/

        relativeLayout = (Button) findViewById(R.id.relative_layout_button);
        linearLayout = (Button) findViewById(R.id.linear_layout_button);
        textView = (Button) findViewById(R.id.text_view_example_button);
        imageView = (Button) findViewById(R.id.image_view_example_button);
        editText = (Button) findViewById(R.id.edit_text_example_button);
        activityExample = (Button) findViewById(R.id.activity_example_button);
        monster = (ImageView) findViewById(R.id.image_monster); //maybe this will not work!!!!
        scrollView = (Button) findViewById(R.id.scroll_view_button);
        cardView = (Button) findViewById(R.id.card_view_button);
        recycleView = (Button) findViewById(R.id.recycle_view_button);
        listView = (Button) findViewById(R.id.list_view_button);

        relativeLayout.setOnClickListener(new View.OnClickListener(){
            @Override
                    public void onClick (View v) {
                startActivity(new Intent(MainActivity.this, RelativeLayoutActivity.class));
            }
        });

        editText.setOnClickListener(new View.OnClickListener(){
            @Override
                    public void onClick (View v){
                startActivity(new Intent (MainActivity.this, EditTextActivity.class));
            }

        });

        linearLayout.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View v){
                startActivity(new Intent(MainActivity.this, LinearLayoutActivity.class));
            }

        });

        imageView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View v){
                startActivity(new Intent(MainActivity.this, ImageViewActivity.class));
            }
        });

        activityExample.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, ActivityExampleActivity.class));
            }
        });

        textView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, TextViewActivity.class));
            }
        });

        monster.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(MONSTER_URL));
                startActivity(intent);
            }
        });

        scrollView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, ScrollViewActivity.class));
            }
        });

        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, CardView.class));
            }
        });

        recycleView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, RecycleView.class));
            }
        });

        listView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v) {

                startActivity(new Intent(MainActivity.this, ListViewActivity.class));

            }
        });


        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
