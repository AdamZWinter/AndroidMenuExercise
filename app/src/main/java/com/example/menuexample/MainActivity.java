package com.example.menuexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.PopupMenu;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button puButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item){
        int itemID = item.getItemId();
        if(itemID == R.id.contact){
            Toast.makeText(getApplicationContext(), "Contact button is clicked", Toast.LENGTH_LONG).show();
        }else if(itemID == R.id.profile){
            Toast.makeText(getApplicationContext(), "Profile button is clicked", Toast.LENGTH_LONG).show();
        }else if(itemID == R.id.settings){
            Toast.makeText(getApplicationContext(), "Settings button is clicked", Toast.LENGTH_LONG).show();
        }else if(itemID == R.id.phone){
            Toast.makeText(getApplicationContext(), "Phone button is clicked", Toast.LENGTH_LONG).show();
        }else if(itemID == R.id.email){
            Toast.makeText(getApplicationContext(), "Email button is clicked", Toast.LENGTH_LONG).show();
        }
        return true;
    }

    //onclick listenter for popup button
    public void onPuButtonClick(View view){
        PopupMenu popupMenu = new PopupMenu(MainActivity.this, view);
        popupMenu.getMenuInflater().inflate(R.menu.popupmenu, popupMenu.getMenu());
        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                int itemID = item.getItemId();
                if(itemID == R.id.edit){
                    Toast.makeText(getApplicationContext(), "Edit button is clicked", Toast.LENGTH_LONG).show();
                }else if(itemID == R.id.view){
                    Toast.makeText(getApplicationContext(), "View button is clicked", Toast.LENGTH_LONG).show();
                }else if(itemID == R.id.delete){
                    Toast.makeText(getApplicationContext(), "Delete button is clicked", Toast.LENGTH_LONG).show();
                }
                    return true;
            }
        });
        popupMenu.show();
    }

}