package com.example.menu_bar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater inflater =getMenuInflater();
        inflater.inflate(R.menu.example_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.item1:
                Intent s= new Intent(getApplicationContext(), shareActivity.class);
                startActivity(s);
                return true;

            case R.id.item2:
                Intent g= new Intent(getApplicationContext(), Gmail_Activity.class);
                startActivity(g);
                return true;

            case R.id.item3:
                Intent b= new Intent(getApplicationContext(), Blueetooth.class);
                startActivity(b);
                return true;
                //create these two activities
//            case R.id.item4:
//                Intent p= new Intent(getApplicationContext(), Picasa.class);
//                startActivity(p);
//                return true;
//
//            case R.id.item5:
//                Intent m= new Intent(getApplicationContext(), Message.class);
//                startActivity(m);
//                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}