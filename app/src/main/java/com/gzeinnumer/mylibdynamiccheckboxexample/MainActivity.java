package com.gzeinnumer.mylibdynamiccheckboxexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.gzeinnumer.mylibdynamiccheckbox.DynamicCheckBox;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sample1();
        sample2();
    }


    private void sample1() {
        DynamicCheckBox dynamicCheckBox = findViewById(R.id.dc_1);

        ArrayList<String> listString = new ArrayList<String>();
        listString.add("Satu");
        listString.add("Dua");
        listString.add("Tiga");
        listString.add("Empat");

        dynamicCheckBox.setItemList(listString).setOnCheckedChangeListener(new DynamicCheckBox.OnCheckedChangeListener<String>() {
            @Override
            public void onCheckedChanged(ArrayList<String> items) {
                String str = "";
                for (int i = 0; i < items.size(); i++) {
                    str = str + items.get(i);
                }
                Toast.makeText(MainActivity.this, str, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onCheckedShow(String clickedValue) {
                Toast.makeText(MainActivity.this, clickedValue, Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void sample2() {
        DynamicCheckBox dynamicCheckBox = findViewById(R.id.dc_2);

        ArrayList<ExampleModel> listObject = new ArrayList<>();
        listObject.add(new ExampleModel(1, "Zein", "Balbar"));
        listObject.add(new ExampleModel(2, "Zein2", "Balbar2"));
        listObject.add(new ExampleModel(3, "Zein3", "Balbar3"));
        listObject.add(new ExampleModel(4, "Zein4", "Balbar4"));

        dynamicCheckBox.setItemList(listObject).setOnCheckedChangeListener(new DynamicCheckBox.OnCheckedChangeListener<ExampleModel>() {
            @Override
            public void onCheckedChanged(ArrayList<ExampleModel> items) {
                String str = "";
                for (int i = 0; i < items.size(); i++) {
                    str = str + items.get(i).toString();
                }
                Toast.makeText(MainActivity.this, str, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onCheckedShow(String clickedValue) {
                Toast.makeText(MainActivity.this, clickedValue, Toast.LENGTH_SHORT).show();
            }
        });
    }
}