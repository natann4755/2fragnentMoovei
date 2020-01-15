package com.example.frame2;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mooveiFragment fragmentmoovei =new mooveiFragment();
        getSupportFragmentManager().beginTransaction().add(R.id.AM_FrameLayout ,fragmentmoovei).commit();

    }

    static ArrayList arryListMooveis() {
        ArrayList<datamoovei> arr = new ArrayList<datamoovei>();
        arr.add(new datamoovei("cars", "1",R.drawable.cars));
        arr.add(new datamoovei("code", "2",R.drawable.code_8));
        arr.add(new datamoovei("forzon", "3",R.drawable.frozen_2));
        arr.add(new datamoovei("interstellar", "4",R.drawable.interstellar));
        arr.add(new datamoovei("jurassic_world", "5",R.drawable.jurassic_world));
        arr.add(new datamoovei("rabbi_jacob", "6",R.drawable.rabbi_jacob));
        arr.add(new datamoovei("rick_and_morty", "7",R.drawable.rick_and_morty));
        arr.add(new datamoovei("spider_man", "8",R.drawable.spider_man));
        arr.add(new datamoovei("the_lion_king", "9",R.drawable.the_lion_king));
        arr.add(new datamoovei("the_simpsons", "10",R.drawable.the_simpsons));
        arr.add(new datamoovei("toy_story_4", "11",R.drawable.toy_story_4));
        arr.add(new datamoovei("young_sheldon", "12",R.drawable.young_sheldon));

        return arr;
    }
}
