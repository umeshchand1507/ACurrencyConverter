package com.amazon.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnConvertPressed(View view) {
        EditText $currency = findViewById(R.id.etDollarCurrency);
        try {
            Double entered$Currency = Double.parseDouble($currency.getText().toString());
            Double converted£Currency = entered$Currency * 0.79;
            Toast.makeText(MainActivity.this, "£" + converted£Currency.toString() , Toast.LENGTH_LONG).show();
        } catch (NumberFormatException e) {
            Toast.makeText(MainActivity.this, e.getLocalizedMessage(), Toast.LENGTH_LONG).show();
        }
    }
}
