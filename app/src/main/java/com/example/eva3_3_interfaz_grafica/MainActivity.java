package com.example.eva3_3_interfaz_grafica;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.RadioGroup;
import android.widget.Toast;

import java.util.zip.CheckedOutputStream;

public class MainActivity extends AppCompatActivity {
    implements RadioGroup.OnCheckedChangeListener;


    RadioGroup rdEstadoCivil;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //View es una clase, son la base de TODOS los componentes
        rdEstadoCivil = findViewById(R.id.rdGrpEstadoCivil);
        //Vincular eventos igual q en java -----> LISTENERS
        rdEstadoCivil.setOnCheckedChangeListener(this);
        btnNomCom = findViewById(R.id.btnNomCom);
        edtTxtNom = findViewById(R.id.edtTxtNom);
        edtTxtApe = findViewById(R.id.edtTxtApe);
        rdEstadoCivil.setOnCheckedChangeListener(this);
        btnNomCom.se
    }

    @Override
    public void onClick(View view) {
        String nombre = edtTxtNom.getText().toString();
        String apellido = edtTxtApe.getText().toString();
        Toast.makeText(MainActivity.this, nombre + "" + apellido, Toast.LENGTH_SHORT).show();
        finish();
    }

});
        }
    @Override
    public void onCheckedChanged(RadioGroup radioGroup, int i){
        if(i == R.id.rdBtnSol)
    }

}