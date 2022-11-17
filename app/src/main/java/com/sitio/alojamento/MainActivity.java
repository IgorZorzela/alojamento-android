package com.sitio.alojamento;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {
    public EditText peso1;
    public EditText peso2;
    public EditText peso3;
    public EditText peso4;
    public EditText peso5;
    public EditText peso6;
    public EditText peso7;
    public EditText peso8;
    public EditText peso9;
    public EditText peso10;
    public EditText qt1;
    public EditText qt2;
    public EditText qt3;
    public EditText qt4;
    public EditText qt5;
    public EditText qt6;
    public EditText qt7;
    public EditText qt8;
    public EditText qt9;
    public EditText qt10;
    public TextView result;
    public Button calcular;
    private float cal1;
    private float cal2;
    public boolean validar;

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
        qt1 = findViewById(R.id.q1);
        qt2 = findViewById(R.id.q2);
        qt3 = findViewById(R.id.q3);
        qt4 = findViewById(R.id.q4);
        qt5 = findViewById(R.id.q5);
        qt6 = findViewById(R.id.q6);
        qt7 = findViewById(R.id.q6);
        qt8 = findViewById(R.id.q8);
        qt9 = findViewById(R.id.q9);
        qt10 = findViewById(R.id.q10);
        result = findViewById(R.id.resultado);
        calcular = findViewById(R.id.calcular);

        calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                validar = comparaCampos();

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
                    int q1 = Integer.parseInt(String.valueOf(qt1.getText()));
                    int q2 = Integer.parseInt(String.valueOf(qt2.getText()));
                    int q3 = Integer.parseInt(String.valueOf(qt3.getText()));
                    int q4 = Integer.parseInt(String.valueOf(qt4.getText()));
                    int q5 = Integer.parseInt(String.valueOf(qt5.getText()));
                    int q6 = Integer.parseInt(String.valueOf(qt6.getText()));
                    int q7 = Integer.parseInt(String.valueOf(qt7.getText()));
                    int q8 = Integer.parseInt(String.valueOf(qt8.getText()));
                    int q9 = Integer.parseInt(String.valueOf(qt9.getText()));
                    int q10 = Integer.parseInt(String.valueOf(qt10.getText()));


                    cal1 = p1 + p2 + p3 + p4 + p5 + p6 + p7 + p8 + p9 + p10;
                    cal2 = q1 + q2 + q3 + q4 + q5 + q6 + q7 + q8 + q9 + q10;
                    float resultt = (cal1 / cal2) * 1000;

                    //mostra apenas duas casas decimais
                DecimalFormat dc = new DecimalFormat("0.00");
                    result.setText("O peso médio é de: \n" + dc.format(resultt) + "g");

            }
        });

    }

    private boolean validarForm() {

        boolean retorno = false;

        if(!TextUtils.isEmpty(qt1.getText().toString())){
            retorno = true;

        } else{
            qt1.setError("preenca todos os campos");
            qt1.requestFocus();
        }

        if(!TextUtils.isEmpty(peso2.getText().toString())){
            retorno = true;

        } else{
            peso2.setError("preenca todos os campos");
            peso2.requestFocus();
        }
        if(!TextUtils.isEmpty(peso3.getText().toString())){
            retorno = true;

        } else{
            peso3.setError("preenca todos os campos");
            peso3.requestFocus();
        }
        if(!TextUtils.isEmpty(peso4.getText().toString())){
            retorno = true;

        } else{
            peso4.setError("preenca todos os campos");
            peso4.requestFocus();
        }
        if(!TextUtils.isEmpty(peso5.getText().toString())){
            retorno = true;

        } else{
            peso5.setError("preenca todos os campos");
            peso5.requestFocus();
        }
        if(!TextUtils.isEmpty(peso6.getText().toString())){
            retorno = true;

        } else{
            peso6.setError("preenca todos os campos");
            peso6.requestFocus();
        }
        if(!TextUtils.isEmpty(peso7.getText().toString())){
            retorno = true;

        } else{
            peso7.setError("preenca todos os campos");
            peso7.requestFocus();
        }
        if(!TextUtils.isEmpty(peso8.getText().toString())){
            retorno = true;

        } else{
            peso8.setError("preenca todos os campos");
            peso8.requestFocus();
        }
        if(!TextUtils.isEmpty(peso9.getText().toString())){
            retorno = true;

        } else{
            peso9.setError("preenca todos os campos");
            peso9.requestFocus();
        }
        if(!TextUtils.isEmpty(peso10.getText().toString())){
            retorno = true;

        } else{
            peso10.setError("preenca todos os campos");
            peso10.requestFocus();
        }
        if(!TextUtils.isEmpty(peso1.getText().toString())){
            retorno = true;

        } else{
            peso1.setError("preenca todos os campos");
            peso1.requestFocus();
        }

        if(!TextUtils.isEmpty(qt2.getText().toString())){
            retorno = true;

        } else{
            qt2.setError("preenca todos os campos");
            qt2.requestFocus();
        }
        if(!TextUtils.isEmpty(qt3.getText().toString())){
            retorno = true;

        } else{
            qt3.setError("preenca todos os campos");
            qt3.requestFocus();
        }
        if(!TextUtils.isEmpty(qt4.getText().toString())){
            retorno = true;

        } else{
            qt4.setError("preenca todos os campos");
            qt4.requestFocus();
        }
        if(!TextUtils.isEmpty(qt5.getText().toString())){
            retorno = true;

        } else{
            qt5.setError("preenca todos os campos");
            qt5.requestFocus();
        }
        if(!TextUtils.isEmpty(qt6.getText().toString())){
            retorno = true;

        } else{
            qt6.setError("preenca todos os campos");
            qt6.requestFocus();
        }
        if(!TextUtils.isEmpty(qt7.getText().toString())){
            retorno = true;

        } else{
            qt7.setError("preenca todos os campos");
            qt7.requestFocus();
        }
        if(!TextUtils.isEmpty(qt8.getText().toString())){
            retorno = true;

        } else{
            qt8.setError("preenca todos os campos");
            qt8.requestFocus();
        }
        if(!TextUtils.isEmpty(qt9.getText().toString())){
            retorno = true;

        } else{
            qt9.setError("preenca todos os campos");
            qt9.requestFocus();
        }
        if(!TextUtils.isEmpty(qt10.getText().toString())){
            retorno = true;

        } else{
            qt10.setError("preenca todos os campos");
            qt10.requestFocus();
        }


        return retorno;
    }

}