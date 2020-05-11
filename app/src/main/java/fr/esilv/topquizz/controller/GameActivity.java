package fr.esilv.topquizz.controller;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

import fr.esilv.topquizz.R;

public class GameActivity extends AppCompatActivity {

    private TextView mMainQuestion;
    private Button mBtnOne;
    private Button mBtnTwo;
    private Button mBtnThree;
    private Button mBtnFour;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        mMainQuestion = findViewById(R.id.activity_game_question_txt);
        mBtnOne = findViewById(R.id.activity_game_response_one_btn);
        mBtnTwo = findViewById(R.id.activity_game_response_two_btn);
        mBtnThree = findViewById(R.id.activity_game_response_three_btn);
        mBtnFour = findViewById(R.id.activity_game_response_four_btn);



    }
}
