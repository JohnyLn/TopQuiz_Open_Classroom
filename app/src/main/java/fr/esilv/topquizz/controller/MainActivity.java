package fr.esilv.topquizz.controller;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import fr.esilv.topquizz.R;

public class MainActivity extends AppCompatActivity {

    //d'importer automatiquement la classe correspondante en appuyant sur ALT + Entrée
    //Alt pour selectionner les 3 lignes en meme temps
    private TextView mText;
    private EditText mEdit_text;
    private Button mButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Ctrl pour ouvrir le fichier xml
        setContentView(R.layout.activity_main);

        mText = findViewById(R.id.activity_main_greeting_txt);
        mEdit_text= findViewById(R.id.activity_main_name_input);
        mButton = findViewById(R.id.activity_main_play_btn);

        mButton.setEnabled(false);

        //Listener EditText
        mEdit_text.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }
            //Changement dans le texte
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                mButton.setEnabled(s.toString().length() !=0);

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        //Listener Button
        mButton.setOnClickListener(new View.OnClickListener() {

            @Override
            //Methode appelé à chaque fois que l'utilisateur appui sur le boutton
            public void onClick(View v) {

                Intent gameActivityIntent = new Intent(MainActivity.this, GameActivity.class);
                startActivity(gameActivityIntent);

            }
        });

    }
}
