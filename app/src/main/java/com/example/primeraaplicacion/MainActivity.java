package com.example.primeraaplicacion;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

    public int contador;
    public EditText et1;
    TextView resultadoTexto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        resultadoTexto = (TextView) findViewById(R.id.contadorNumero);
        contador = 0;
    }

    public void incrementar(View vista) {
        contador++;
        resultadoTexto.setText("" + contador);
    }

    public void resetear(View vista) {
        et1 = (EditText) findViewById(R.id.n_reseteo);

        if (et1.getText().length()==0){

        }else{
        contador = Integer.parseInt(et1.getText().toString());

        et1.setText("");

        resultadoTexto.setText("" + contador);
        }
        InputMethodManager miteclado = (InputMethodManager)getSystemService(INPUT_METHOD_SERVICE);
        miteclado.hideSoftInputFromWindow(et1.getWindowToken(),0);

    }

    public void decrementar(View vista) {
        contador--;
        if (contador < 0) {
            CheckBox negativo = (CheckBox) findViewById(R.id.checkBoxNegativos);
            if (!negativo.isChecked()) {
                contador = 0;
            }
        }
        mostrarRestultado();
    }
    public void mostrarRestultado() {
        TextView resultadoTexto = (TextView) findViewById(R.id.contadorNumero);
        resultadoTexto.setText("" + contador);

    }

}


