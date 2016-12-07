package cn.edu.gdmec.s07150622.onclicklistener;

import android.content.Context;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity  implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn =(Button) findViewById(R.id.button1);
        Button btn2 =(Button) findViewById(R.id.button2);
        Button btn3 =(Button) findViewById(R.id.button3);
        Button btn4 =(Button) findViewById(R.id.button4);
        btn.setOnClickListener(this);
        btn2.setOnClickListener(new OuterClass(this));//外部类
        btn3.setOnClickListener(new InnerClass ());//内部类

       //匿名类的监听
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"匿名类的监听",Toast.LENGTH_LONG).show();
            }
        });
    }

    @Override
    public void onClick(View v) {
        Toast.makeText(this,"自身类的监听",Toast.LENGTH_LONG).show();
    }

    class InnerClass implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            Toast.makeText(MainActivity.this,"内部类的监听",Toast.LENGTH_LONG).show();
        }
    }


}





