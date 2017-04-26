package kr.co.company.phonekeeper;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.view.View.OnClickListener;

public class Btn1activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.btn1activity);

        Button backbtn1 = (Button) findViewById(R.id.backbtn01);
        backbtn1.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "이전화면으로 돌아갑니다", 1000).show();
                finish();
            }
        });

        Button nextbtn01 = (Button) findViewById(R.id.nextbtn01);
        nextbtn01.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "다음으로 넘어갑니다", 1000).show();

                Intent myIntent = new Intent(getApplicationContext(), Nextbtn01.class);
                startActivity(myIntent);
            }
        });
    }
}
