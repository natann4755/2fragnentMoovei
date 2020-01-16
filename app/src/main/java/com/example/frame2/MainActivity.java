package com.example.frame2;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements OnMovieFragmentClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mooveiFragment fragmentmoovei =new mooveiFragment();
        getSupportFragmentManager().beginTransaction().add(R.id.AM_FrameLayout ,fragmentmoovei).commit();


    }

    static ArrayList arryListMooveis() {
        ArrayList<datamoovei> arr = new ArrayList<datamoovei>();
        arr.add(new datamoovei("cars", "1",R.drawable.cars,"https://www.youtube.com/watch?v=UND7XDWgLF0"));
        arr.add(new datamoovei("code", "2",R.drawable.code_8,"https://www.youtube.com/watch?v=DqO90q0WZ0M"));
        arr.add(new datamoovei("forzon", "3",R.drawable.frozen_2,"https://www.youtube.com/watch?v=bwzLiQZDw2I"));
        arr.add(new datamoovei("interstellar", "4",R.drawable.interstellar,"https://www.youtube.com/watch?v=UDVtMYqUAyw"));
        arr.add(new datamoovei("jurassic_world", "5",R.drawable.jurassic_world,"https://www.youtube.com/watch?v=vJ0BB9nRS_I&t=1827s"));

        arr.add(new datamoovei("rabbi_jacob", "6",R.drawable.rabbi_jacob,"https://www.youtube.com/watch?v=dFZHMHjdB8w"));
        arr.add(new datamoovei("rick_and_morty", "7",R.drawable.rick_and_morty,"https://www.youtube.com/watch?v=dFZHMHjdB8w"));
        arr.add(new datamoovei("spider_man", "8",R.drawable.spider_man,"https://www.youtube.com/watch?v=dFZHMHjdB8w"));
        arr.add(new datamoovei("the_lion_king", "9",R.drawable.the_lion_king,"https://www.youtube.com/watch?v=dFZHMHjdB8w"));
        arr.add(new datamoovei("the_simpsons", "10",R.drawable.the_simpsons,"https://www.youtube.com/watch?v=dFZHMHjdB8w"));
        arr.add(new datamoovei("toy_story_4", "11",R.drawable.toy_story_4,"https://www.youtube.com/watch?v=dFZHMHjdB8w"));
        arr.add(new datamoovei("young_sheldon", "12",R.drawable.young_sheldon,"https://www.youtube.com/watch?v=dFZHMHjdB8w"));

        return arr;
    }

    @Override
    public void OnMooveiClicked(datamoovei moovei) {
        fragment2 f2 = fragment2.newIntent(moovei);
        getSupportFragmentManager()
                .beginTransaction()
                .addToBackStack(null)
                .replace(R.id.AM_FrameLayout ,f2).commit();
    }
}
