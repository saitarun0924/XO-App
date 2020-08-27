package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    public Button next;
    public EditText et1,et2;
    String nothing = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        next = findViewById(R.id.buton_next);
        et1 = findViewById(R.id.editTextTextPersonName);
        et2 = findViewById(R.id.editTextTextPersonName2);


        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it  = new Intent(MainActivity2.this,MainActivity.class);
                String p1 = et1.getText().toString();
                String p2 = et2.getText().toString();

                if(p1.equals(nothing) || p2.equals(nothing))
                {
                    if(p1.equals(nothing))
                    {
                        Toast.makeText(getApplicationContext()," Enter the Player 1 Name ",Toast.LENGTH_SHORT).show();
                    }
                    else
                    {
                        Toast.makeText(getApplicationContext()," Enter the Player 2 Name ",Toast.LENGTH_SHORT).show();
                    }
                }

                else
                    {
                    it.putExtra("key1", p1);
                    it.putExtra("key2", p2);

                    Toast.makeText(getApplicationContext(), " Let's Start the Game ", Toast.LENGTH_SHORT).show();
                    startActivity(it);
                    }
            }
        });
    }
}