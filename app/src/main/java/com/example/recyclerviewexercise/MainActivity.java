package com.example.recyclerviewexercise;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.os.Bundle;

import com.example.recyclerviewexercise.Adapters.RecipeAdapter;
import com.example.recyclerviewexercise.Models.RecipeModel;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView myRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myRecyclerView = findViewById(R.id.myrecyclerview);

        ArrayList <RecipeModel> list = new ArrayList<>();
        list.add(new RecipeModel(R.drawable.img1,"Burger"));
        list.add(new RecipeModel(R.drawable.img2 , "Zinger"));
        list.add(new RecipeModel(R.drawable.img3 , "Shawarma"));
        list.add(new RecipeModel(R.drawable.img4 ,"Roll"));
        list.add(new RecipeModel(R.drawable.img5 , "Paratha"));
        list.add(new RecipeModel(R.drawable.img6 , "Fries"));
        list.add(new RecipeModel(R.drawable.img7 , "Cheese Steak"));
        list.add(new RecipeModel(R.drawable.img8 , "Shaami Kabab"));
        list.add(new RecipeModel(R.drawable.img9 , "Chappli kabab"));

        RecipeAdapter adapter = new RecipeAdapter(list , this);
        myRecyclerView.setAdapter(adapter);

        // Layout style i.e vertical scrolling, gridview or horizontal scrolling.

//         1. Vertical Scrolling
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        myRecyclerView.setLayoutManager(linearLayoutManager);

        // 2. Horizontal Scrolling
//        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this , LinearLayoutManager.HORIZONTAL , false);   // When we set false, we scroll from left to right. When we set true, we scroll from right to left.
//        myRecyclerView.setLayoutManager(linearLayoutManager);

        // 3. Grid Layout Scrolling

//        GridLayoutManager gridLayoutManager = new GridLayoutManager(this , 2);
//        myRecyclerView.setLayoutManager(gridLayoutManager);

        // 4. StaggeredGridLayout, used to scroll vertical or horizontal

//        StaggeredGridLayoutManager staggeredGridLayoutManager = new StaggeredGridLayoutManager(2 , StaggeredGridLayoutManager.HORIZONTAL); // Set StaggeredGridLayoutManager.VERTICAL to scroll vertical.
//        myRecyclerView.setLayoutManager(staggeredGridLayoutManager);



    }
}