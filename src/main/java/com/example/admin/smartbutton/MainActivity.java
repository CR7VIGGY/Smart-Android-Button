package com.example.admin.smartbutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button1 = (Button)findViewById(R.id.button1);

        button1.setOnClickListener(new Button.OnClickListener()
        {
            public void onClick(View v)
            {
                TextView txt1 = (TextView)findViewById(R.id.txt1);
                txt1.setText("wassupp!! viggu");
            }
        });
        button1.setOnLongClickListener(new Button.OnLongClickListener()
        {
            public boolean onLongClick(View v)
            {
                TextView txt1 = (TextView)findViewById(R.id.txt1);
                txt1.setText("that was a long one");
                return true;
            }
        });
    }
}
