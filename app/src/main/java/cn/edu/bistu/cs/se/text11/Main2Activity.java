package cn.edu.bistu.cs.se.text11;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {
    String name;
    Integer age;
    Button b2;
    Intent intent1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        b2=(Button)findViewById(R.id.b2);

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent1=getIntent();
                name=intent1.getStringExtra("name");
                age=intent1.getIntExtra("age", 20);
                intent1.putExtra("result","name:"+name+" age"+age);
                setResult(0,intent1);
                finish();
            }


        });










    }

}
