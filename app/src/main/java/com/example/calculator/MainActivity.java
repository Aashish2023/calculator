package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.mariuszgromada.math.mxparser.*;

public class MainActivity extends AppCompatActivity {
    int factorial(int n)
    {
        if(n==1 || n==0)
        {
            return 1;
        }
        return factorial(n-1)*n;
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button b1 = findViewById(R.id.one);
        Button b2 = findViewById(R.id.two);
        Button b3 = findViewById(R.id.three);
        Button b4 = findViewById(R.id.four);
        Button b5 = findViewById(R.id.five);
        Button b6 = findViewById(R.id.six);
        Button b7 = findViewById(R.id.seven);
        Button b8 = findViewById(R.id.eight);
        Button b9 = findViewById(R.id.nine);
        Button b0 = findViewById(R.id.zero);
        Button bdot = findViewById(R.id.dot);
        Button bsq = findViewById(R.id.square);
        Button bC = findViewById(R.id.C);
        Button bcross = findViewById(R.id.X);
        Button bsqrt = findViewById(R.id.sqrt);
        Button bplus = findViewById(R.id.plus);
        Button bminus = findViewById(R.id.minus);
        Button bdiv = findViewById(R.id.divide);
        Button bmul = findViewById(R.id.multiply);
        Button beq = findViewById(R.id.equal);
        Button bsin = findViewById(R.id.sin);
        Button bcos = findViewById(R.id.cos);
        Button btan = findViewById(R.id.tan);
        Button blog = findViewById(R.id.log);
        Button brtbrkt = findViewById(R.id.rtbrcket);
        Button blftbrkt = findViewById(R.id.leftbrckt);
        Button bpi= findViewById(R.id.pi);
        Button be= findViewById(R.id.e);
        Button bmod= findViewById(R.id.factorial);
        TextView bdisp = findViewById(R.id.display);


        bpi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bdisp.setText(bdisp.getText() + "3.14");
            }
        });
        be.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bdisp.setText(bdisp.getText() + "2.718");
            }
        });
        bmod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String prev = bdisp.getText().toString();
                    int f = factorial(Integer.parseInt(prev));
                    bdisp.setText(String.valueOf(f));
                }
                catch(Exception e){
                    bdisp.setText("");
                }
            }
        });

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bdisp.setText(bdisp.getText() + "1");
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bdisp.setText(bdisp.getText() + "2");
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bdisp.setText(bdisp.getText() + "3");
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bdisp.setText(bdisp.getText() + "4");
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bdisp.setText(bdisp.getText() + "5");
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bdisp.setText(bdisp.getText() + "6");
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bdisp.setText(bdisp.getText() + "7");
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bdisp.setText(bdisp.getText() + "8");
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bdisp.setText(bdisp.getText() + "9");
            }
        });
        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bdisp.setText(bdisp.getText() + "0");
            }
        });
        bdot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bdisp.setText(bdisp.getText() + ".");
            }
        });
        bcross.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String prev = bdisp.getText().toString();
                    prev = prev.substring(0, prev.length() - 1);
                    bdisp.setText(prev);
                } catch (Exception e) {
                    bdisp.setText("");

                }
            }
        });
        bsq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String val = bdisp.getText().toString();
                    double ans = Math.pow(Double.parseDouble(val), 2);
                    bdisp.setText(String.valueOf(ans));
                } catch (Exception e) {
                    bdisp.setText("");
                }
            }
        });
        bplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bdisp.setText(bdisp.getText() + "+");

            }
        });
        bminus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bdisp.setText(bdisp.getText() + "-");

            }
        });
        bdiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bdisp.setText(bdisp.getText() + "/");

            }
        });
        bmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bdisp.setText(bdisp.getText() + "*");

            }
        });
        blftbrkt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bdisp.setText(bdisp.getText() + "(");

            }
        });
        brtbrkt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bdisp.setText(bdisp.getText() + ")");

            }
        });
        bsqrt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String val = bdisp.getText().toString();
                    double ans = Math.sqrt(Double.parseDouble(val));
                    bdisp.setText(String.valueOf(ans));
                } catch (Exception e) {
                    bdisp.setText("");
                }
            }
        });
        bsin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String val = bdisp.getText().toString();
                    double ans = Math.sin(Math.toRadians(Double.parseDouble(val)));
                    bdisp.setText(String.valueOf(ans));
                } catch (Exception e) {
                    bdisp.setText("");
                }
            }
        });
        bcos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String val = bdisp.getText().toString();
                    double ans = Math.cos(Math.toRadians(Double.parseDouble(val)));
                    bdisp.setText(String.valueOf(ans));
                } catch (Exception e) {
                    bdisp.setText("");
                }
            }
        });
        btan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String val = bdisp.getText().toString();
                    double ans = Math.tan(Math.toRadians(Double.parseDouble(val)));
                    bdisp.setText(String.valueOf(ans));
                } catch (Exception e) {
                    bdisp.setText("");
                }
            }
        });
        blog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String val = bdisp.getText().toString();
                    double ans = Math.log(Double.parseDouble(val));
                    bdisp.setText(String.valueOf(ans));
                } catch (Exception e) {
                    bdisp.setText("");
                }
            }
        });
        beq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String eqn = bdisp.getText().toString();
                Expression exp = new Expression(eqn);
                String ans = String.valueOf(exp.calculate());
                bdisp.setText(ans);
            }
        });
        bC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bdisp.setText("");
            }
        });

    }

}