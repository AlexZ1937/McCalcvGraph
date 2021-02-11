package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.LinkedList;

public class MainActivity extends AppCompatActivity {
    Double first=0.0;
    String operation="";
    Double second=0.0;
    double MRvalue=0.0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        LinkedList<Button> buttons=new LinkedList<Button>();




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













        for (Button item: buttons) {
            item.setOnClickListener(new Button.OnClickListener()
            {
                @Override
                public void onClick(View v) {
                    ((TextView)findViewById(R.id.editTextTextPersonName)).setText(((TextView)findViewById(R.id.editTextTextPersonName)).getText().toString()+item.getText().toString());
                }
            });
        }



        // .
        findViewById(R.id.button34).setOnClickListener(new Button.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                if(!((TextView)findViewById(R.id.editTextTextPersonName)).getText().toString().contains("."))
                {
                    ((TextView)findViewById(R.id.editTextTextPersonName)).setText(((TextView)findViewById(R.id.editTextTextPersonName)).getText().toString()+
                            ((Button)findViewById(R.id.button34)).getText().toString());
                }


            }
        });

        // MC
        findViewById(R.id.button37).setOnClickListener(new Button.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                operation=((TextView)findViewById(R.id.button37)).getText().toString();
                findViewById(R.id.button35).callOnClick();

            }
        });

        // MR
        findViewById(R.id.button38).setOnClickListener(new Button.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                operation=((TextView)findViewById(R.id.button38)).getText().toString();
                findViewById(R.id.button35).callOnClick();


            }
        });

        // M+
        findViewById(R.id.button39).setOnClickListener(new Button.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                    operation=((TextView)findViewById(R.id.button39)).getText().toString();
                findViewById(R.id.button35).callOnClick();
            }
        });


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
        (findViewById(R.id.button17)).setOnClickListener(new Button.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                if(first==0.0)
                {
                    operation=((TextView)findViewById(R.id.button17)).getText().toString();
                    first= new Double(((TextView)findViewById(R.id.editTextTextPersonName)).getText().toString());
                    ((TextView)findViewById(R.id.editTextTextPersonName)).setText("");
                }


            }
        });

        //  +|-
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





    }

    //= MR MC M+
    public void OnRezultClick(View v)
    {
        if(((TextView)findViewById(R.id.editTextTextPersonName)).getText().toString().length()>0) {
            second = new Double(((TextView) findViewById(R.id.editTextTextPersonName)).getText().toString());
        }

        if((operation.contains("MC") || operation.contains("MR") || operation.contains("M+")) || (first!=0.0 && operation!=""))
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
                        Toast.makeText(getApplicationContext(),"You can not divide by ZERO!", Toast.LENGTH_LONG).show();
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
                case "+|-":
                {

                    ((TextView)findViewById(R.id.editTextTextPersonName)).setText((String.valueOf((-1)*second)));

                }
                break;
                case "MR":
                {
                    ((TextView)findViewById(R.id.editTextTextPersonName)).setText((String.valueOf(MRvalue)));
                    Toast.makeText(getApplicationContext(),"Memory-value is "+MRvalue+"!", Toast.LENGTH_SHORT).show();
                }
                break;
                case "MC":
                {
                    Toast.makeText(getApplicationContext(),"Memory-value cleared!", Toast.LENGTH_SHORT).show();
                    MRvalue=0.0;
                }
                break;
                case "M+":
                {

                    MRvalue+=second;
                    Toast.makeText(getApplicationContext(),"Memory-value now is "+MRvalue+"!", Toast.LENGTH_SHORT).show();
                }
                break;
            }



            first=0.0;
            second=0.0;
            operation="";
        }

    }
}