package com.example.student.dd2018011003;

import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    Handler handler = new Handler(){
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            Log.d("MSG", "取得一個 Message");
            Bundle b = msg.getData();
            String str = b.getString("data");
            Log.d("MSG", "DATA: " + str);
        }
    };

    public void click1(View v)
    {
        Message msg = new Message();
        Bundle b = new Bundle();
        b.putString("data", "MyData");
        msg.setData(b);
        //handler.sendMessage(msg);
        handler.sendMessageDelayed(msg, 3000);
    }
}
