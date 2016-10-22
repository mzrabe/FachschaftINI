package com.wordpress.ini8bht.fachschaftini;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    
    Button btn_roomaction;
    Button btn_chat;
    Button btn_news;
    Button btn_coffee;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        btn_roomaction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,RoomActivity.class));
            }
        });

    }
    
    private void initGui(){
        btn_roomaction = (Button) findViewById(R.id.btn_room);
        btn_chat = (Button) findViewById(R.id.btn_chat);
        btn_news= (Button) findViewById(R.id.btn_news);
        btn_coffee= (Button) findViewById(R.id.btn_coffee);
    }

    private  void intiListener(){
        btn_roomaction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,RoomActivity.class));
            }
        });
        btn_chat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,ChatActivity.class));
            }
        });
        btn_news.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,NewsActivity.class));
            }
        });
        btn_coffee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,CoffeeAmountActivity.class));
            }
        });


    }
}
