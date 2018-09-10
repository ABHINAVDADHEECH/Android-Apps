package com.example.abhinav.anytable;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    EditText editText;
    Button button;
    int n=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView=findViewById(R.id.textView2);
        editText=findViewById(R.id.editText);
        button=findViewById(R.id.button);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String s=editText.getText().toString();
                n=Integer.parseInt(s);
                textView.setText(null);
                for(int i=1; i <= 10; i++)
                {
                    textView.append(n+" * "+i+" = "+n*i + "\n");

                }
            }
        });

    }
}
