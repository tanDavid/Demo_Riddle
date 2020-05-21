package sg.edu.rp.c346.id19002765.demoriddle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //Event Handling step 1:
    TextView tvQ1, tvQ2;
    Button btnRevealQ1, BtnRevealQ2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        //Event Handling Step 2

        tvQ1 = findViewById(R.id.textViewQ1);
        btnRevealQ1 = findViewById(R.id.buttonReveaQ1);
        tvQ2 = findViewById(R.id.textViewQ2);
        BtnRevealQ2 = findViewById(R.id.buttonRevealQ2);

        //Event Handling Step 3
        btnRevealQ1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AnswerActivity1.class);
                intent.putExtra("Question", "Q1");
                startActivity(intent);
            }
        });
        BtnRevealQ2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AnswerActivity1.class);
                intent.putExtra("Question", "Q2");
                startActivity(intent);
            }
        });
    }
}
