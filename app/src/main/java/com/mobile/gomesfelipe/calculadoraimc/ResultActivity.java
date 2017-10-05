package com.mobile.gomesfelipe.calculadoraimc;


import android.content.res.ColorStateList;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class ResultActivity extends AppCompatActivity {

    public static String result;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        TextView tvResult = (TextView) findViewById(R.id.tvResult);

        tvResult.setText(result);
        resultImage(MainActivity.resultF);
    }

    public void resultImage(float result){
        ImageView imageView = (ImageView) findViewById(R.id.ivResult);
        TextView textView = (TextView) findViewById(R.id.resultado);

        if(result < 16){
            textView.setText(R.string.severe_thinness);
            imageView.setImageResource(R.drawable.ic_esqueleto);
        } else if(result < 17 && result >= 16){
            textView.setText(R.string.moderate_thinness);
            imageView.setImageResource(R.drawable.ic_magrelo);
        } else if(result < 18.5 && result >= 17){
            textView.setText(R.string.light_thinness);
            imageView.setImageResource(R.drawable.ic_magro);
        } else if (result >= 18.5 && result < 25){
            textView.setText(R.string.healthy);
            imageView.setImageResource(R.drawable.ic_saudavel);
        } else if (result >= 25 && result < 30){
            textView.setText(R.string.Overweight);
            imageView.setImageResource(R.drawable.ic_obeso1);
        } else if (result >= 30 && result < 35){
            textView.setText(R.string.Overweight1);
            imageView.setImageResource(R.drawable.ic_obeso2);
        } else if (result >= 35 && result < 40){
            textView.setText(R.string.Overweight2);
            imageView.setImageResource(R.drawable.ic_obeso3);
        } else if(result > 40){
            textView.setText(R.string.Overweight3);
            imageView.setImageResource(R.drawable.ic_obeso4);
        } else {
            Toast.makeText(getApplicationContext(), "Erro!", Toast.LENGTH_SHORT).show();
        }
    }
}

