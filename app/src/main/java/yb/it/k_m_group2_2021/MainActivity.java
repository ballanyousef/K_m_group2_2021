package yb.it.k_m_group2_2021;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void btnOPtion2(View view) {


    }

    public void btnOption1(View view) {
        Intent i=new Intent(this,ActivityOption1.class);
        startActivity(i);
    }
}