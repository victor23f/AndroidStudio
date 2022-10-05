package com.example.primeraaplicacion;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
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
        if (contador>0) {
            RadioButton positivo = (RadioButton) findViewById(R.id.positivos);
            positivo.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (!positivo.isSelected()) {
                        positivo.setChecked(true);
                        positivo.setSelected(true);
                    } else {
                        positivo.setChecked(false);
                        positivo.setSelected(false);
                    }
                }
            });
            if (!positivo.isChecked()) {
                contador = 0;
            }
        }
        mostrarRestultado();
    }

    public void resetear(View vista) {
        et1 = (EditText) findViewById(R.id.n_reseteo);

        contador = Integer.parseInt(et1.getText().toString());

        et1.setText("");

        resultadoTexto.setText("" + contador);

        InputMethodManager miteclado = (InputMethodManager)getSystemService(INPUT_METHOD_SERVICE);
        miteclado.hideSoftInputFromWindow(et1.getWindowToken(),0);
    }

    public void decrementar(View vista) {
        contador--;
        if (contador < 0) {
            RadioButton negativo = (RadioButton) findViewById(R.id.negativos);
            negativo.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (!negativo.isSelected()) {
                        negativo.setChecked(true);
                        negativo.setSelected(true);
                    } else {
                        negativo.setChecked(false);
                        negativo.setSelected(false);
                    }
                }
            });
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