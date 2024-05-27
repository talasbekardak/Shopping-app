package com.example.finalmob.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Window;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.example.finalmob.Adapter.PopularAdapter;
import com.example.finalmob.R;
import com.example.finalmob.databinding.ActivityMainBinding;
import com.example.finalmob.domain.PopularDomain;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        statusBarColor();
        initRecyclerView();
        bottomNavigation();
    }

    private void bottomNavigation() {
        binding.cartBtn.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, CartActivity.class)));
    }

    private void statusBarColor() {
        Window window=MainActivity.this.getWindow();
        window.setStatusBarColor(ContextCompat.getColor(MainActivity.this, R.color.darkPink));
    }

    private void initRecyclerView() {
        ArrayList<PopularDomain> items=new ArrayList<>();
        items.add(new PopularDomain("T-shirt black","item_1",15,4,500,"Black shirt with a classic design." +
                " Made from soft and durable fabric. " +
                " Features a straight cut, a classic collar, and long sleeves with buttoned cuffs. " +
                " The versatile black color suits both business and casual styles."));
        items.add(new PopularDomain("Smart watch","item_2",24,4.5,450,"A modern smartwatch with a high-resolution touchscreen display." +
                " Offers health and fitness tracking such as heart rate monitoring and sleep tracking." +
                " Stay connected with notifications for calls, messages, and apps." +
                " Customizable watch faces and interchangeable bands for personalization." +
                " Long battery life and water-resistant, ideal for daily use."));
        items.add(new PopularDomain("Phone","item_3",96,4.9,800,"A sleek smartphone with a high-resolution display and powerful processor." +
                " Offers ample storage and a high-quality camera for stunning photos and videos." +
                " Supports fast charging, long battery life, and 5G connectivity." +
                " Advanced security features include facial recognition and fingerprint scanning." +
                " Ideal for work and entertainment."));
        items.add(new PopularDomain("Laptop","item_4",7,4.8,1000,"A computer is an electronic device that processes data, executes instructions, and performs tasks using hardware and software components."+
                " It includes a CPU, memory, storage, and input/output devices. " +
                " Computers vary in size and power, ranging from laptops to desktops and servers."));
        items.add(new PopularDomain("Shoes1", "shoes1", 2, 4.5,160,"Refresh your look with our stylish sneakers!" +
                " Whether you are doing sports or just looking for comfortable and fashionable shoes for everyday wear, our sneakers are perfect for all occasions."));
        items.add(new PopularDomain("Shoes3","shoes2", 76,4.9,100,"Step forward with our collection of sneakers designed for a dynamic lifestyle! " +
                " Ideal for both sports and everyday use, our sneakers provide unparalleled comfort and style."));
        items.add(new PopularDomain("Shoes2","shoes4", 6,4.9,100,"Comfort and style in every step! " +
                " Sophisticated sneakers crafted from premium materials for an active lifestyle."));
        items.add(new PopularDomain("Cleanser Centella","item_5",2,4.8,13,"A cleanser with centella contains Centella asiatica extract known for its soothing, healing, and anti-inflammatory properties. " +
                " It's beneficial for calming irritation, reducing redness, and improving skin condition, particularly for sensitive or acne-prone skin." ));



        binding.PopularView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,false));
        binding.PopularView.setAdapter(new PopularAdapter(items));
    }
}