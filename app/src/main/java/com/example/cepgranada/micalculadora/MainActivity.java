package com.example.cepgranada.micalculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //variables glolbales
    TextView tvVisor = null;
    String operando1 = null;
    String operando2 = null;
    String operador = null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //asignaciones comunes
        tvVisor = ((TextView) findViewById(R.id.tvVisor));

    }

    /* gestiona el click de un boton numérico*/
    public void btNumerico_onClick(View v)
    {
        //v es un boton y el no lo sabe!
        Button boton = (Button) v;
        String strBoton= boton.getText().toString();
        //cogemos el valor del visor!!

        String strVisor = tvVisor.getText().toString();
        String strNuevo;
        strNuevo = strVisor+strBoton;
        // tener en cuenta el 0, al principio, y la longitud máxima
        //TODO: TOPE DE CARACTERES
        if (strVisor.equals(getString(R.string.visorPorDefecto)))
            strNuevo=strBoton;

        tvVisor.setText(strNuevo);


         /*
        boton su id
    */
    }
    /* gestiona el click de un boton operador*/
    public void btOperador_Click(View v)
    {
        //guardo operando1
        //guardo operador
        iIDBotonOperador = v.getId();
    }
    /* gestiona el click de un boton Resultado*/
    public void btResultado_Click(View v)
    {
        //coger el operando2
        // hacer la fucking cuenta
        // poner en el visor el resultado.
        // y.... reiniciar la calculadora!!!
    }

    /* gestiona el click de un boton borrado, pone el visorPorDefcto*/
    public void btBorrado_Click(View v)
    {
        TextView visor = ((TextView) findViewById(R.id.tvVisor));
        tvVisor.setText(R.string.visorPorDefecto);
    }

}
