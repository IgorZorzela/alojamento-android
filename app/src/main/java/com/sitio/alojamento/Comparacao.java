package com.sitio.alojamento;

import android.widget.Toast;

public class Comparacao extends MainActivity {
    public void comparaCampos() {


        if (peso1.getText().toString().isEmpty()) {
            calcular.setEnabled(false);
            Toast.makeText(Comparacao.this, "Preencha todos os campos", Toast.LENGTH_SHORT).show();
            return;
        }
        else if(peso2.getText().toString().isEmpty()){
            calcular.setEnabled(false);
            Toast.makeText(Comparacao.this, "Preencha todos os campos", Toast.LENGTH_SHORT).show();
            return;
        }
        else if(peso3.getText().toString().isEmpty()){
            calcular.setEnabled(false);
            Toast.makeText(Comparacao.this, "Preencha todos os campos", Toast.LENGTH_SHORT).show();
            return;
        }
        else if(peso4.getText().toString().isEmpty()){
            calcular.setEnabled(false);
            Toast.makeText(Comparacao.this, "Preencha todos os campos", Toast.LENGTH_SHORT).show();
            return;
        }
        else if(peso5.getText().toString().isEmpty()){
            calcular.setEnabled(false);
            Toast.makeText(Comparacao.this, "Preencha todos os campos", Toast.LENGTH_SHORT).show();
            return;
        }
        else if(peso6.getText().toString().isEmpty()){
            calcular.setEnabled(false);
            Toast.makeText(Comparacao.this, "Preencha todos os campos", Toast.LENGTH_SHORT).show();
            return;
        }
        else if(peso7.getText().toString().isEmpty()){
            calcular.setEnabled(false);
            Toast.makeText(Comparacao.this, "Preencha todos os campos", Toast.LENGTH_SHORT).show();
            return;
        }
        else if(peso8.getText().toString().isEmpty()){
            calcular.setEnabled(false);
            Toast.makeText(Comparacao.this, "Preencha todos os campos", Toast.LENGTH_SHORT).show();
            return;
        }
        else if(peso9.getText().toString().isEmpty()){
            calcular.setEnabled(false);
            Toast.makeText(Comparacao.this, "Preencha todos os campos", Toast.LENGTH_SHORT).show();
            return;
        }
        else if(peso10.getText().toString().isEmpty()){
            calcular.setEnabled(false);
            Toast.makeText(Comparacao.this, "Preencha todos os campos", Toast.LENGTH_SHORT).show();
            return;
        }
        else if(qt1.getText().toString().isEmpty()){
            calcular.setEnabled(false);
            Toast.makeText(Comparacao.this, "Preencha todos os campos", Toast.LENGTH_SHORT).show();
            return;
        }
        else if(qt2.getText().toString().isEmpty()){
            calcular.setEnabled(false);
            Toast.makeText(Comparacao.this, "Preencha todos os campos", Toast.LENGTH_SHORT).show();
            return;
        }
        else if(qt3.getText().toString().isEmpty()){
            calcular.setEnabled(false);
            Toast.makeText(Comparacao.this, "Preencha todos os campos", Toast.LENGTH_SHORT).show();
            return;
        }
        else if(qt4.getText().toString().isEmpty()){
            calcular.setEnabled(false);
            Toast.makeText(Comparacao.this, "Preencha todos os campos", Toast.LENGTH_SHORT).show();
            return;
        }
        else if(qt5.getText().toString().isEmpty()){
            calcular.setEnabled(false);
            Toast.makeText(Comparacao.this, "Preencha todos os campos", Toast.LENGTH_SHORT).show();
            return;
        }
        else if(qt6.getText().toString().isEmpty()){
            calcular.setEnabled(false);
            Toast.makeText(Comparacao.this, "Preencha todos os campos", Toast.LENGTH_SHORT).show();
            return;
        }
        else if(qt7.getText().toString().isEmpty()){
            calcular.setEnabled(false);
            Toast.makeText(Comparacao.this, "Preencha todos os campos", Toast.LENGTH_SHORT).show();
            return;
        }
        else if(qt8.getText().toString().isEmpty()){
            calcular.setEnabled(false);
            Toast.makeText(Comparacao.this, "Preencha todos os campos", Toast.LENGTH_SHORT).show();
            return;
        }
        else if(qt9.getText().toString().isEmpty()){
            calcular.setEnabled(false);
            Toast.makeText(Comparacao.this, "Preencha todos os campos", Toast.LENGTH_SHORT).show();
            return;
        }
        else if(qt10.getText().toString().isEmpty()){
            calcular.setEnabled(false);
            Toast.makeText(Comparacao.this, "Preencha todos os campos", Toast.LENGTH_SHORT).show();
            return;
        }
        calcular.setEnabled(true);
        return;

    }

}
