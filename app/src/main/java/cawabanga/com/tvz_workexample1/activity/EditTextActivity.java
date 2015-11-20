package cawabanga.com.tvz_workexample1.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import cawabanga.com.tvz_workexample1.R;

/**
 * Created by croatan on 3.11.2015..
 */
public class EditTextActivity extends AppCompatActivity {
    private EditText editText;
    private Button button;
    private Button gobackbutton;

    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_text);

        editText = (EditText) findViewById(R.id.edit_text);
        button = (Button) findViewById(R.id.button_get_text);
        gobackbutton = (Button) findViewById(R.id.go_back);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v) {

                if (editText.getText() != null) {

                    String text = editText.getText().toString();

                    Toast.makeText(EditTextActivity.this, text, Toast.LENGTH_SHORT).show();

                }

            }
        });

        gobackbutton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                finish();
            }
        });



    }

}
