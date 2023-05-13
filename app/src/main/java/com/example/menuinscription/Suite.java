package com.example.menuinscription;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

public class Suite extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_suite);

        EditText username = (EditText) findViewById(R.id.nom);


        MaterialButton regbtn = (MaterialButton) findViewById(R.id.inscription);

        regbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username1 = username.getText().toString();
                Toast.makeText(Suite.this, "Ton prénom est"+username1, Toast.LENGTH_SHORT).show();

            }
        });
    }
    public void renvoyer (View view){

        Intent intente = new Intent(this,MenuInscription.class);

        startActivity(intente);
    }
}