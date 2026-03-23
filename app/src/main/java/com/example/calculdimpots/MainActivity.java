package com.example.calculdimpots;

import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {
    private EditText surface, pieces;
    private CheckBox pool;
    private TextView result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        surface = findViewById(R.id.surface);
        pieces = findViewById(R.id.piece);
        pool = findViewById(R.id.piscine);
        result = findViewById(R.id.resultat);

        findViewById(R.id.Calc_fin).setOnClickListener(v -> calculer_depots());

    }

    private void calculer_depots(){
        double air = Double.parseDouble(surface.getText().toString());
        int nb_pieces = Integer.parseInt(pieces.getText().toString());
        boolean bain = pool.isChecked();

        double base = air*2;
        int complement = nb_pieces * 50 + (bain ? 100 : 0);
        double depots = base + complement;

        result.setText("Impôt de base :" + base+ "DH \n" +
                "Impôt supplémentaire :" + complement + "DH \n" +
                "Impôt total :" + depots + "DH");

    }
}