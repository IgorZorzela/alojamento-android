package com.sitio.alojamento;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

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
        calcular.setEnabled(false);

        peso1.addTextChangedListener(textWatcher);
        peso2.addTextChangedListener(textWatcher);
        peso3.addTextChangedListener(textWatcher);
        peso4.addTextChangedListener(textWatcher);
        peso5.addTextChangedListener(textWatcher);
        peso6.addTextChangedListener(textWatcher);
        peso7.addTextChangedListener(textWatcher);
        peso8.addTextChangedListener(textWatcher);
        peso9.addTextChangedListener(textWatcher);
        peso10.addTextChangedListener(textWatcher);
        qt1.addTextChangedListener(textWatcher);
        qt2.addTextChangedListener(textWatcher);
        qt3.addTextChangedListener(textWatcher);
        qt4.addTextChangedListener(textWatcher);
        qt5.addTextChangedListener(textWatcher);
        qt6.addTextChangedListener(textWatcher);
        qt7.addTextChangedListener(textWatcher);
        qt8.addTextChangedListener(textWatcher);
        qt9.addTextChangedListener(textWatcher);
        qt10.addTextChangedListener(textWatcher);

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
                    result.setText("O peso m??dio ?? de: \n" + dc.format(resultt) + "g");

            }
        });

    }

    private TextWatcher textWatcher = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

        }

        @Override
        public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            String a = peso1.getText().toString();
            String b = peso2.getText().toString();
            String c = peso3.getText().toString();
            String d = peso4.getText().toString();
            String e = peso5.getText().toString();
            String f = peso6.getText().toString();
            String g = peso7.getText().toString();
            String h = peso8.getText().toString();
            String j = peso9.getText().toString();
            String k = peso10.getText().toString();
            String l = qt1.getText().toString();
            String m = qt2.getText().toString();
            String n = qt3.getText().toString();
            String o = qt4.getText().toString();
            String p = qt5.getText().toString();
            String q = qt6.getText().toString();
            String r = qt7.getText().toString();
            String s = qt8.getText().toString();
            String t = qt9.getText().toString();
            String u = qt10.getText().toString();

            if(!a.isEmpty() && !b.isEmpty() && !c.isEmpty() && !d.isEmpty() && !e.isEmpty() && !f.isEmpty() && !g.isEmpty() && !h.isEmpty() && !j.isEmpty() && !k.isEmpty() && !l.isEmpty() && !m.isEmpty() && !n.isEmpty() && !o.isEmpty() && !p.isEmpty() && !q.isEmpty() && !r.isEmpty() && !s.isEmpty() && !t.isEmpty() && !u.isEmpty()){
                calcular.setEnabled(true);
            } else{
                calcular.setEnabled(false);
            }



        }

        @Override
        public void afterTextChanged(Editable editable) {

        }
    };

}