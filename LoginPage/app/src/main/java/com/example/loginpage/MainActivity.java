package com.example.loginpage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText et;
    EditText eti;
    //String user[]={"abhishek"};
    //String pass[] ={"1234"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et = findViewById(R.id.username);
        eti = findViewById(R.id.password);
    }

    public void login(View view) {
        String data = et.getText().toString();
        String datai = eti.getText().toString();
        if(data.isEmpty()){
            Toast.makeText(this, "Please Enter Username", Toast.LENGTH_SHORT).show();
        }else if(datai.isEmpty()){
            Toast.makeText(this, "Please Enter Password", Toast.LENGTH_SHORT).show();
        }

        else {


           /* for(int i= 0; i < user.length; i++){
                if(data.equals(user[i]) && datai.equals(pass[i])){*/
                    Toast.makeText(this, "Login Successful", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                    intent.putExtra("mydata", data);
                    startActivity(intent);
              /*  }else{
                    Toast.makeText(this, "Invalid Credentials", Toast.LENGTH_SHORT).show();
                }*/
            }

        }




    public void register(View view) {
        Intent i = new Intent(MainActivity.this, ThirdActivity.class);
        startActivity(i);

    }
}