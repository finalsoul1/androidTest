package com.example.afinal.ptest;

import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.GridView;
import android.widget.TextView;
import android.widget.ToggleButton;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    ArrayList<FoodIngredients> data;
    ToggleButton toggleButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 자료
        data = new ArrayList<>();
        data.add(new FoodIngredients("브로콜리"));
        data.add(new FoodIngredients("마늘"));
        data.add(new FoodIngredients("브로콜리"));
        data.add(new FoodIngredients("치킨"));
        data.add(new FoodIngredients("마늘"));
        data.add(new FoodIngredients("브로콜리"));
        data.add(new FoodIngredients("치킨"));
        data.add(new FoodIngredients("마늘"));
        data.add(new FoodIngredients("브로콜리"));
        data.add(new FoodIngredients("치킨"));
        data.add(new FoodIngredients("마늘"));
        data.add(new FoodIngredients("브로콜리"));
        data.add(new FoodIngredients("치킨"));
        data.add(new FoodIngredients("마늘"));
        data.add(new FoodIngredients("브로콜리"));
        data.add(new FoodIngredients("치킨"));
        data.add(new FoodIngredients("마늘"));
        data.add(new FoodIngredients("브로콜리"));
        data.add(new FoodIngredients("치킨"));
        data.add(new FoodIngredients("마늘"));
        data.add(new FoodIngredients("브로콜리"));
        data.add(new FoodIngredients("치킨"));
        data.add(new FoodIngredients("마늘"));
        data.add(new FoodIngredients("브로콜리"));
        data.add(new FoodIngredients("치킨"));
        data.add(new FoodIngredients("마늘"));
        data.add(new FoodIngredients("브로콜리"));
        data.add(new FoodIngredients("치킨"));
        data.add(new FoodIngredients("마늘"));
        data.add(new FoodIngredients("브로콜리"));
        data.add(new FoodIngredients("치킨"));
        data.add(new FoodIngredients("마늘"));
        data.add(new FoodIngredients("브로콜리"));
        data.add(new FoodIngredients("치킨"));
        data.add(new FoodIngredients("마늘"));

        // 어댑터
        MyAdapter adapter = new MyAdapter(data);

        // 뷰
        GridView gridView = (GridView) findViewById(R.id.grid_view);
        gridView.setAdapter(adapter);

    }

    public void onClickVegi(View view) {

        data = new ArrayList<>();
        data.add(new FoodIngredients("마늘"));
        data.add(new FoodIngredients("브로콜리"));
        data.add(new FoodIngredients("브로콜리"));
        data.add(new FoodIngredients("브로콜리"));
        data.add(new FoodIngredients("브로콜리"));
        data.add(new FoodIngredients("브로콜리"));
        data.add(new FoodIngredients("브로콜리"));
        data.add(new FoodIngredients("브로콜리"));
        data.add(new FoodIngredients("브로콜리"));
        data.add(new FoodIngredients("마늘"));
        data.add(new FoodIngredients("마늘"));
        data.add(new FoodIngredients("마늘"));
        data.add(new FoodIngredients("마늘"));
        data.add(new FoodIngredients("마늘"));
        data.add(new FoodIngredients("마늘"));
        data.add(new FoodIngredients("마늘"));
        data.add(new FoodIngredients("마늘"));
        data.add(new FoodIngredients("마늘"));
        data.add(new FoodIngredients("마늘"));
        data.add(new FoodIngredients("브로콜리"));
        data.add(new FoodIngredients("브로콜리"));
        data.add(new FoodIngredients("마늘"));
        data.add(new FoodIngredients("마늘"));

        MyAdapter adapter = new MyAdapter(data);

        GridView gridView = (GridView) findViewById(R.id.grid_view);
        gridView.setBackgroundResource(R.color.colorVegi);
        gridView.setAdapter(adapter);
        toggleButton = findViewById(R.id.meatButton);
        toggleButton.setChecked(false);
        toggleButton = findViewById(R.id.fishButton);
        toggleButton.setChecked(false);
        toggleButton = findViewById(R.id.etcButton);
        toggleButton.setChecked(false);
    }

    public void onClickMeat(View view) {

        data = new ArrayList<>();
        data.add(new FoodIngredients("치킨"));
        data.add(new FoodIngredients("치킨"));
        data.add(new FoodIngredients("치킨"));
        data.add(new FoodIngredients("치킨"));
        data.add(new FoodIngredients("치킨"));
        data.add(new FoodIngredients("치킨"));
        data.add(new FoodIngredients("치킨"));
        data.add(new FoodIngredients("치킨"));

        MyAdapter adapter = new MyAdapter(data);

        GridView gridView = (GridView) findViewById(R.id.grid_view);
        gridView.setBackgroundResource(R.color.colorMeat);
        gridView.setAdapter(adapter);
        toggleButton = findViewById(R.id.vegiButton);
        toggleButton.setChecked(false);
        toggleButton = findViewById(R.id.fishButton);
        toggleButton.setChecked(false);
        toggleButton = findViewById(R.id.etcButton);
        toggleButton.setChecked(false);
    }
    public void onClickFish(View view) {

        data = new ArrayList<>();
        data.add(new FoodIngredients("생선"));
        data.add(new FoodIngredients("생선"));
        data.add(new FoodIngredients("생선"));
        data.add(new FoodIngredients("생선"));
        data.add(new FoodIngredients("생선"));
        data.add(new FoodIngredients("생선"));
        data.add(new FoodIngredients("생선"));
        data.add(new FoodIngredients("생선"));
        data.add(new FoodIngredients("생선"));
        data.add(new FoodIngredients("생선"));
        data.add(new FoodIngredients("생선"));
        data.add(new FoodIngredients("생선"));
        data.add(new FoodIngredients("생선"));
        data.add(new FoodIngredients("생선"));
        data.add(new FoodIngredients("생선"));
        data.add(new FoodIngredients("생선"));
        data.add(new FoodIngredients("생선"));
        data.add(new FoodIngredients("생선"));
        data.add(new FoodIngredients("생선"));
        data.add(new FoodIngredients("생선"));
        data.add(new FoodIngredients("생선"));
        data.add(new FoodIngredients("생선"));
        data.add(new FoodIngredients("생선"));
        data.add(new FoodIngredients("생선"));
        data.add(new FoodIngredients("생선"));
        data.add(new FoodIngredients("생선"));
        data.add(new FoodIngredients("생선"));
        data.add(new FoodIngredients("생선"));
        data.add(new FoodIngredients("생선"));
        data.add(new FoodIngredients("생선"));
        data.add(new FoodIngredients("생선"));
        data.add(new FoodIngredients("생선"));
        data.add(new FoodIngredients("생선"));
        data.add(new FoodIngredients("생선"));
        data.add(new FoodIngredients("생선"));
        data.add(new FoodIngredients("생선"));
        data.add(new FoodIngredients("생선"));
        data.add(new FoodIngredients("생선"));
        data.add(new FoodIngredients("생선"));
        data.add(new FoodIngredients("생선"));
        data.add(new FoodIngredients("생선"));
        data.add(new FoodIngredients("생선"));
        data.add(new FoodIngredients("생선"));
        data.add(new FoodIngredients("생선"));
        data.add(new FoodIngredients("생선"));
        data.add(new FoodIngredients("생선"));
        data.add(new FoodIngredients("생선"));
        data.add(new FoodIngredients("생선"));
        data.add(new FoodIngredients("생선"));
        data.add(new FoodIngredients("생선"));
        data.add(new FoodIngredients("생선"));
        data.add(new FoodIngredients("생선"));
        data.add(new FoodIngredients("생선"));
        data.add(new FoodIngredients("생선"));
        data.add(new FoodIngredients("생선"));
        data.add(new FoodIngredients("생선"));
        data.add(new FoodIngredients("생선"));
        data.add(new FoodIngredients("생선"));
        data.add(new FoodIngredients("생선"));
        data.add(new FoodIngredients("생선"));

        MyAdapter adapter = new MyAdapter(data);

        GridView gridView = (GridView) findViewById(R.id.grid_view);
        gridView.setBackgroundResource(R.color.colorfish);
        gridView.setAdapter(adapter);
        toggleButton = findViewById(R.id.vegiButton);
        toggleButton.setChecked(false);
        toggleButton = findViewById(R.id.meatButton);
        toggleButton.setChecked(false);
        toggleButton = findViewById(R.id.etcButton);
        toggleButton.setChecked(false);
    }


    public void onClickIngredient(View view) {
        TextView textView = findViewById(R.id.food_nameView);

        Snackbar.make(view,textView.getText() + "를 추가하셨습니다.", Snackbar.LENGTH_LONG).show();
    }
}
