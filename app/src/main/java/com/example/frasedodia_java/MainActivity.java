package com.example.frasedodia_java;

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
    }
    public void gerarFraseAleatoria(View view){

            String[] frases = {
                    "Hoje é um novo dia cheio de possibilidades!",
                    "Vou fazer deste dia o melhor que posso!",
                    "A gratidão transforma qualquer manhã em algo especial.",
                    "Com um sorriso, o dia já começa mais leve!",
                    "Cada novo amanhecer é uma chance de recomeçar.",
                    "Estou pronto para enfrentar os desafios de hoje com coragem!",
                    "Que hoje seja um dia de conquistas e alegria!",
                    "A energia positiva que eu coloco no mundo volta para mim.",
                    "Vou aproveitar cada momento deste dia incrível!",
                    "Com determinação e bom humor, nada me para hoje!",

            };
            int numeroAleatorio = new Random().nextInt( 10);

            TextView texto = findViewById(R.id.textfrase);
            texto.setText(frases[numeroAleatorio]);

    }
    }
