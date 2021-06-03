package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    List<modelmyntra> modelmyntraList;
   Adaptermyntra adaptermyntra;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView=findViewById(R.id.listview);
        modelmyntraList=new ArrayList<>();

        adaptermyntra=new Adaptermyntra(this,modelmyntraList);
        listView.setAdapter(adaptermyntra);


        modelmyntra myntra1=new modelmyntra();
        myntra1.setTxt1("500");
        myntra1.setTxt2("Straight line");
        myntra1.setImg(R.drawable.myntra1);
        modelmyntraList.add(myntra1);


        modelmyntra myntra2=new modelmyntra();
        myntra2.setTxt1("600");
        myntra2.setTxt2("Printed kurti");
        myntra2.setImg(R.drawable.myntra2);
        modelmyntraList.add(myntra2);

        modelmyntra myntra3=new modelmyntra();
        myntra3.setTxt1("750");
        myntra3.setTxt2("Straight line");
        myntra3.setImg(R.drawable.myntra3);
        modelmyntraList.add(myntra3);


    }
}