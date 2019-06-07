package com.example.macro.ui.login;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.Toast;

import com.example.macro.R;

public class LoginActivity extends AppCompatActivity{

    private Button button;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checklist_document);


        Toast.makeText(this, "Hola  curso", Toast.LENGTH_LONG).show();
        Activity activity = this;
        Context context = this;
        Test.myToast(context);
        button = (Button) findViewById(R.id.buttonMain);
       /* button = (Button)findViewById(R.id.buttonMain); //SEGUNDA FORMA
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(LoginActivity.this,"BUTTON", Toast.LENGTH_LONG).show();
            }
        });*/
        //Toast.makeText(context,)
    }

    //otra forma de hacer un evento


    @Override protected  void onStart()
    {
        super.onStart();
        Toast.makeText(this,"onStart", Toast.LENGTH_SHORT).show();
    }
    @Override protected  void onResume()
    {
        super.onResume();
        Toast.makeText(this,"onResume", Toast.LENGTH_SHORT).show();
    }
    @Override protected  void onPause()
    {
        super.onPause();
        Toast.makeText(this,"onPause", Toast.LENGTH_SHORT).show();
    }
    @Override protected  void onStop()
    {
        super.onStop();
        Toast.makeText(this,"onStop", Toast.LENGTH_SHORT).show();
    }
    @Override protected  void onRestart()
    {
        super.onRestart();
        Toast.makeText(this,"onRestart", Toast.LENGTH_SHORT).show();
    }
    @Override protected  void onDestroy()
    {
        super.onDestroy();
        Toast.makeText(this,"onDestroy", Toast.LENGTH_SHORT).show();
    }


    private void check() {

    }

}
