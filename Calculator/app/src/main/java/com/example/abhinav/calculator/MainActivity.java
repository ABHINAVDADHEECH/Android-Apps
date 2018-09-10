package com.example.abhinav.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    double first,second,result;
    boolean addition=false,
            subtraction=false,
            multiplication=false,
            division=false;
    Button bt0,bt1,bt2,bt3,bt4,bt5,bt6,bt7,bt8,bt9,add,sub,mul,divi,dot,equal,del;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bt0=findViewById(R.id.zero);
        bt1=findViewById(R.id.one);
        bt2=findViewById(R.id.two);
        bt3=findViewById(R.id.three);
        bt4=findViewById(R.id.four);
        bt5=findViewById(R.id.five);
        bt6=findViewById(R.id.six);
        bt7=findViewById(R.id.seven);
        bt8=findViewById(R.id.eight);
        bt9=findViewById(R.id.nine);
        add=findViewById(R.id.add);
        sub=findViewById(R.id.sub);
        mul=findViewById(R.id.mul);
        divi=findViewById(R.id.divi);
        dot=findViewById(R.id.dot);
        equal=findViewById(R.id.equal);
        del=findViewById(R.id.delete);
        tv=findViewById(R.id.tv);

        tv.setText("");

        bt0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               tv.append("0");
            }
        });

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv.append("1");
            }
        });

        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv.append("2");
            }
        });

        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv.append("3");
            }
        });

        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv.append("4");
            }
        });

        bt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv.append("5");
            }
        });

        bt6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv.append("6");
            }
        });

        bt7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv.append("7");
            }
        });

        bt8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv.append("8");
            }
        });

        bt9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv.append("9");
            }
        });
        dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv.append(".");
            }
        });

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    first = Double.valueOf(tv.getText().toString());
                    tv.setText(null);
                    addition = true;
                    subtraction = false;
                    multiplication = false;
                    division = false;
                } catch (Exception e) {
                }
            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    first = Double.valueOf(tv.getText().toString());
                    tv.setText(null);
                    addition = false;
                    subtraction = true;
                    multiplication = false;
                    division = false;
                } catch (Exception e) {
                }
            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    first = Double.valueOf(tv.getText().toString());
                    tv.setText(null);
                    addition = false;
                    subtraction = false;
                    multiplication =true;
                    division = false;
                } catch (Exception e) {
                }
            }
        });
        divi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    first = Double.valueOf(tv.getText().toString());
                    tv.setText(null);
                    addition =false;
                    subtraction = false;
                    multiplication = false;
                    division = true;
                } catch (Exception e) {
                }
            }
        });

        del.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String get = tv.getText().toString();
                    tv.setText(get.substring(0, get.length() - 1));
                } catch (Exception e) {
                }
            }
        });
    del.setOnLongClickListener(new View.OnLongClickListener() {
        @Override
        public boolean onLongClick(View v) {
                tv.setText(null);
                return false;
        }
    });
        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    second = Double.valueOf(tv.getText().toString());
                    if (addition) {
                        result = first + second;
                        tv.setText("" + result);
                    } else if (subtraction) {
                        result = first - second;
                        tv.setText("" + result);
                    } else if (multiplication) {
                        result = first * second;
                        tv.setText("" + result);
                    } else if (division) {
                        result = first / second;
                        tv.setText("" + result);
                    }
                } catch (Exception e) {
                }
            }
        });


    }


}


