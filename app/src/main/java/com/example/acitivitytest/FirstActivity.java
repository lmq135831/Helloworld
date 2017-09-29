package com.example.acitivitytest;


import android.content.Intent;
import android.net.Uri;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_layout);
        Button button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               /* Toast.makeText(FirstActivity.this, "you clicked Button", Toast.LENGTH_SHORT).show();*/
               /*上面是监听*/
              /* finish();*//*销毁一个活动，（退出）*/
                /*Intent intent =new Intent(FirstActivity.this,SecondActivity.class);显性intent*/
                /* Intent intent=new Intent("com.example.acitivitytest.ACTION_START");
                 intent.addCategory("com.example.acitivitytest.MY_CATEGORY");
                 startActivity(intent);隐式intent*/
                Intent intent=new Intent(Intent.ACTION_VIEW);
                //intent.setData(Uri.parse("http://www.baidu.com")); 启动百度网页
                intent.setData(Uri.parse("tel:10086"));
                startActivity(intent);
            }
        });
       /* Button button_2=(Button)findViewById(R.id.button_2);
        button_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            Toast.makeText(FirstActivity.this,"you click button_2",Toast.LENGTH_SHORT);
            }
        });*//*自己加的暂时有闪退，不知道怎样解决*/
    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.add_item:
                Toast.makeText(this, "you click add", Toast.LENGTH_SHORT).show();
                break;
            case R.id.remove_item:
                Toast.makeText(this, "you click Remove", Toast.LENGTH_SHORT).show();
                break;
            default:
        }
        return  true;
    }
}


