package com.example.primeraaplicacion;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends Activity {

    public int contador;
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
        contador=0;
        mostrarRestultado();
    }
    public void decrementar(View vista){
        contador--;
        mostrarRestultado();
    }
    public void mostrarRestultado(){
        TextView resultadoTexto = (TextView)findViewById(R.id.contador);
        resultadoTexto.setText("Contador: "+ contador);
    }
}