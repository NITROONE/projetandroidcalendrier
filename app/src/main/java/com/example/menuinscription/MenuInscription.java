package com.example.menuinscription;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

public class MenuInscription extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menuinscription);

        TextView username =(TextView) findViewById(R.id.username);
        TextView password =(TextView) findViewById(R.id.password);

        MaterialButton login = (MaterialButton) findViewById(R.id.login);


        // pour admin

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (username.getText().toString().equals("admin") && password.getText().toString().equals("admin")){
                    //correcte
                    Toast.makeText(v.getContext(), "connexion reussi", Toast.LENGTH_LONG).show();
                    Intent intent = new Intent(v.getContext(),Meteo.class);

                    v.getContext().startActivity(intent);
                }else
                    //incorrecte
                    Toast.makeText(MenuInscription.this, "connexion rater", Toast.LENGTH_LONG).show();

            }
        });
    }
    public void envoyer (View view){

        Intent intent = new Intent(this,Suite.class);

        startActivity(intent);
    }


}