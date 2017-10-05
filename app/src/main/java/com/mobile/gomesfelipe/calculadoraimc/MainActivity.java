package com.mobile.gomesfelipe.calculadoraimc;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public static float resultF;
    float weight;
    float height;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText alturaTxt = (EditText) findViewById(R.id.etWeight);
        final EditText pesoTxt = (EditText) findViewById(R.id.etHeight);
        Button calculateButton = (Button) findViewById(R.id.btCalculate);

        calculateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                weight = Float.valueOf(alturaTxt.getText().toString());
                height = Float.valueOf(pesoTxt.getText().toString());

                ResultActivity.result = calculateIMC();

                Intent i = new Intent(getBaseContext(), ResultActivity.class);

                startActivity(i);
            }
        });
    }

    public String calculateIMC() {

        resultF = weight / (height * height);

        return String.valueOf(resultF);
    }

}
