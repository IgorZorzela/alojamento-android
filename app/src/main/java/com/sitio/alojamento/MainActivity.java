package com.sitio.alojamento;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText peso1;
    private EditText peso2;
    private EditText peso3;
    private EditText peso4;
    private EditText peso5;
    private EditText peso6;
    private EditText peso7;
    private EditText peso8;
    private EditText peso9;
    private EditText peso10;
    private TextView result;
    private Button calcular;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        peso1 = findViewById(R.id.peso1);
        peso2 = findViewById(R.id.peso2);
        peso3 = findViewById(R.id.peso3);
        peso4 = findViewById(R.id.peso4);
        peso5 = findViewById(R.id.peso5);
        peso6 = findViewById(R.id.peso6);
        peso7 = findViewById(R.id.peso7);
        peso8 = findViewById(R.id.peso8);
        peso9 = findViewById(R.id.peso9);
        peso10 = findViewById(R.id.peso10);
        result = findViewById(R.id.resultado);
        calcular = findViewById(R.id.calcular);

        calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float p1 = Float.parseFloat(String.valueOf(peso1.getText()));
                float p2 = Float.parseFloat(String.valueOf(peso2.getText()));
                float p3 = Float.parseFloat(String.valueOf(peso3.getText()));
                float p4 = Float.parseFloat(String.valueOf(peso4.getText()));
                float p5 = Float.parseFloat(String.valueOf(peso5.getText()));
                float p6 = Float.parseFloat(String.valueOf(peso6.getText()));
                float p7 = Float.parseFloat(String.valueOf(peso7.getText()));
                float p8 = Float.parseFloat(String.valueOf(peso8.getText()));
                float p9 = Float.parseFloat(String.valueOf(peso9.getText()));
                float p10 = Float.parseFloat(String.valueOf(peso10.getText()));

                float resultt = (p1 + p2 + p3 + p4 + p5 + p6 + p7 + p8 + p9 + p10) / 10 * 10;
                result.setText("O peso médio é de: \n" + resultt + "g");
            }
        });

    }

    /*public void calculaPeso(View view){

        resultado = (peso1 + peso2 + peso3 + peso4 + peso5 + peso6 + peso7 + peso8 + peso9 + peso10) / 10 * 10;
        TextView result = findViewById(R.id.resultado);
        result.setText();
            }
     */
}