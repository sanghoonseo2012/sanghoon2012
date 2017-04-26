package kr.co.company.phonekeeper;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.view.View.OnClickListener;


public class Input01 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.input01);

        Button input03 = (Button) findViewById(R.id.input03);
        input03.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "next", 1000).show();

                Intent myIntent = new Intent(getApplicationContext(), Input03.class);
                startActivity(myIntent);
            }
        });
    }
}
