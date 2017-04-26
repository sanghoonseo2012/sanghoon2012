package kr.co.company.phonekeeper;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.view.View.OnClickListener;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn01 = (Button) findViewById(R.id.btn01);
        btn01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "알림음을 선택하시오", 1000).show();

                Intent myIntent = new Intent(getApplicationContext(), Btn1activity.class);
                startActivity(myIntent);
            }
        });
        Button btn02 = (Button) findViewById(R.id.btn02);
        btn02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "비상연락망을 입력하시오", 1000).show();

                Intent myIntent = new Intent(getApplicationContext(), Btn2activity.class);
                startActivity(myIntent);
            }
        });
        Button btn03 = (Button) findViewById(R.id.btn03);
        btn03.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "초기화면으로 이전할 문자를 입력하시오", 1000).show();

                Intent myIntent = new Intent(getApplicationContext(), Btn3activity.class);
                startActivity(myIntent);
            }
        });

        Button btn04 = (Button) findViewById(R.id.btn04);
        btn04.setOnClickListener(new View.OnClickListener() {
            @Override
        public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "데이터를 초기화할 문자를 입력하시오", 1000).show();

                Intent myIntent = new Intent(getApplicationContext(), Btn4activity.class);
                startActivity(myIntent);
            }
        });
    }
}
