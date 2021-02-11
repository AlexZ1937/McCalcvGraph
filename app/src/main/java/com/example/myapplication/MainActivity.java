package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.LinkedList;

public class MainActivity extends AppCompatActivity {
    Double first=0.0;
    String operation="";
    Double second=0.0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        LinkedList<Button> buttons=new LinkedList<Button>();


        buttons.add(findViewById(R.id.button17));



        buttons.add(findViewById(R.id.button21));
        buttons.add(findViewById(R.id.button22));
        buttons.add(findViewById(R.id.button23));




        buttons.add(findViewById(R.id.button26));
        buttons.add(findViewById(R.id.button27));
        buttons.add(findViewById(R.id.button28));


        buttons.add(findViewById(R.id.button30));
        buttons.add(findViewById(R.id.button31));
        buttons.add(findViewById(R.id.button32));
        buttons.add(findViewById(R.id.button33));
        buttons.add(findViewById(R.id.button34));











        buttons.add(findViewById(R.id.button37));
        buttons.add(findViewById(R.id.button38));
        buttons.add(findViewById(R.id.button39));


        for (Button item: buttons) {
            item.setOnClickListener(new Button.OnClickListener()
            {
                @Override
                public void onClick(View v) {
                    ((TextView)findViewById(R.id.editTextTextPersonName)).setText(((TextView)findViewById(R.id.editTextTextPersonName)).getText().toString()+item.getText().toString());
                }
            });
        }

//C
        (findViewById(R.id.button36)).setOnClickListener(new Button.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                ((TextView)findViewById(R.id.editTextTextPersonName)).setText("");
            }
        });

        //+
        (findViewById(R.id.button29)).setOnClickListener(new Button.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                if(first==0.0)
                {
                    operation=((TextView)findViewById(R.id.button29)).getText().toString();
                    first= new Double(((TextView)findViewById(R.id.editTextTextPersonName)).getText().toString());
                    ((TextView)findViewById(R.id.editTextTextPersonName)).setText("");
                }


            }
        });

        //-
        (findViewById(R.id.button24)).setOnClickListener(new Button.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                if(first==0.0)
                {
                    operation=((TextView)findViewById(R.id.button24)).getText().toString();
                    first= new Double(((TextView)findViewById(R.id.editTextTextPersonName)).getText().toString());
                    ((TextView)findViewById(R.id.editTextTextPersonName)).setText("");
                }


            }
        });

        //del
        findViewById(R.id.button19).setOnClickListener(new Button.OnClickListener()
        {
            @Override
            public void onClick(View v) {
             if(((TextView)findViewById(R.id.editTextTextPersonName)).getText().toString().length()>0)
             {
                 String tmp=((TextView)findViewById(R.id.editTextTextPersonName)).getText().toString();
                 tmp = tmp.substring(0, tmp.length() - 1);
                 ((TextView)findViewById(R.id.editTextTextPersonName)).setText(tmp);
             }


            }
        });

        // */
        (findViewById(R.id.button3)).setOnClickListener(new Button.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                if(first==0.0)
                {
                    operation=((TextView)findViewById(R.id.button3)).getText().toString();
                    first= new Double(((TextView)findViewById(R.id.editTextTextPersonName)).getText().toString());
                    ((TextView)findViewById(R.id.editTextTextPersonName)).setText("");
                }


            }
        });
        //  %
        (findViewById(R.id.button18)).setOnClickListener(new Button.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                if(first==0.0)
                {
                    operation=((TextView)findViewById(R.id.button18)).getText().toString();
                    first= new Double(((TextView)findViewById(R.id.editTextTextPersonName)).getText().toString());
                    ((TextView)findViewById(R.id.editTextTextPersonName)).setText("");
                }


            }
        });
        //*
        (findViewById(R.id.button20)).setOnClickListener(new Button.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                if(first==0.0)
                {
                    operation=((TextView)findViewById(R.id.button20)).getText().toString();
                    first= new Double(((TextView)findViewById(R.id.editTextTextPersonName)).getText().toString());
                    ((TextView)findViewById(R.id.editTextTextPersonName)).setText("");
                }


            }
        });

        //=
        (findViewById(R.id.button35)).setOnClickListener(new Button.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                second= new Double(((TextView)findViewById(R.id.editTextTextPersonName)).getText().toString());
                if(first!=0.0 && operation!="")
                {
                    switch (operation)
                    {
                        case "+":
                        {

                            ((TextView)findViewById(R.id.editTextTextPersonName)).setText((String.valueOf(first+second)));

                        }
                            break;
                        case "/":
                        {
                            if(second==0.0)
                            {
                                ((TextView) findViewById(R.id.editTextTextPersonName)).setText("You can not divide by ZERO!");
                            }
                            else
                                {
                                ((TextView) findViewById(R.id.editTextTextPersonName)).setText((String.valueOf(first / second)));
                            }
                        }
                            break;
                        case "-":
                        {
                            ((TextView)findViewById(R.id.editTextTextPersonName)).setText((String.valueOf(first-second)));
                        }
                            break;
                        case "*":
                        {
                            ((TextView)findViewById(R.id.editTextTextPersonName)).setText((String.valueOf(first*second)));
                        }
                            break;
                        case "%":
                        {
                            ((TextView)findViewById(R.id.editTextTextPersonName)).setText((String.valueOf(first%second)));
                        }
                        break;
                    }


                    first=0.0;
                    second=0.0;
                    operation="";
                }


            }
        });

    }
}