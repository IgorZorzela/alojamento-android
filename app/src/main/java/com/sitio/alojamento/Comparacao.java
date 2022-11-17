package com.sitio.alojamento;

import android.widget.Toast;

public class Comparacao extends MainActivity {
    public void comparaCampos() {
        EditText[] campos = {
                peso1, peso2, peso3, peso4, peso5, peso6, peso7, peso8, peso9, peso10, qt1, qt2, qt3, qt4, qt5, qt6, qt7. qt8, qt9, qt10}
    };

    List <EditText> erro = new ArrayList <EditText>();

    for (EditText edit : comparaCampos){
        if (TextUtils.isEmpty(edit.getText())){
            erro.add(edit);
            for (int i = 0; i < erro.size(); i++){
                EditText campoAtual = erro.get(i);
                campoAtual.setError("Preencha todos os campos");
                campoAtual.requestFocus();
            }
        }
    }

}
