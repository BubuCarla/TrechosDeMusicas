package com.example.aplicativo;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void sortear(View view){
        System.out.println("xxxx");

        int resultado = new Random().nextInt(5);

        TextView textResultado =  findViewById(R.id.textResultado);

        if (resultado == 1){
            textResultado.setText("She is the best thing that's ever been mine");
        } else if (resultado == 2) {
            textResultado.setText("Why are we pretending this is nothing?");
        } else if (resultado == 3) {
            textResultado.setText("But the whole time I'm wishing he was you instead");
        } else if (resultado == 4) {
            textResultado.setText("Please, don't have somebody waiting on you");
        } else {
            textResultado.setText("'Cause I see sparks fly whenever you smile");
        }

//        if(resultado == 0){
 //           textResultado.setText("Resultado: Coroa");
 //       } else {
 //           textResultado.setText("Resultado: Cara" );
 //       }

    }
}