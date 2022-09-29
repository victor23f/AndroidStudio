package com.example.primeraaplicacion;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

    public int contador;
    public EditText et1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void incrementar(View vista){
        contador++;
        mostrarRestultado();
    }
    public void resetear(View vista){
        et1 = (EditText)findViewById(R.id.n_reseteo);

        contador= Integer.parseInt(et1.getText().toString());

        mostrarRestultado();
    }
    public void decrementar(View vista){
        contador--;
        mostrarRestultado();
    }
    public void mostrarRestultado(){
        TextView resultadoTexto = (TextView)findViewById(R.id.contadorNumero);
        resultadoTexto.setText( "" + contador);

    }
    public void permitirNegativos(View vista){
            if (contador<0){
                contador=0;
            }
    mostrarRestultado();
    }

}