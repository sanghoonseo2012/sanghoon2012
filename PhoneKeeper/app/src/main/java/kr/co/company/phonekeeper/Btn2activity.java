package kr.co.company.phonekeeper;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.view.View.OnClickListener;


public class Btn2activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.btn2activity);

        Button input02 = (Button) findViewById(R.id.input02);
        input02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "비상연락처를 입력하시오", 1000).show();

                Intent myIntent = new Intent(getApplicationContext(), Input01.class);
                startActivity(myIntent);
            }
        });
    }
}

