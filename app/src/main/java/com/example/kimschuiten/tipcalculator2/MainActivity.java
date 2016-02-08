package com.example.kimschuiten.tipcalculator2;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

public class MainActivity extends AppCompatActivity {

    TextView header;
    TextView cashamount;
    EditText cash;
    TextView percentage;
    EditText chosenpercentage;
    Button calculatebutton;
    TextView showdamage;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        header = (TextView) findViewById(R.id.Title);
        cashamount = (TextView) findViewById(R.id.start_amount);
        cash = (EditText) findViewById(R.id.cash_input);
        percentage = (TextView) findViewById(R.id.text_percentage);
        chosenpercentage = (EditText) findViewById(R.id.chosen_percentage);
        calculatebutton = (Button) findViewById(R.id.calculate_button);
        showdamage = (TextView) findViewById(R.id.damage);

        calculatebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Integer total = Integer.parseInt(cash.getText().toString());
                Integer percentage = Integer.parseInt(chosenpercentage.getText().toString());
                Integer probeersel = total + percentage;
                String totalamount = "Your damage is: €"+probeersel;
                showdamage.setText(totalamount);

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
