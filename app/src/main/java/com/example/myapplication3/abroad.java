package com.example.myapplication3;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.PopupMenu;

public class abroad extends AppCompatActivity implements PopupMenu.OnMenuItemClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abroad);
    }

    public void showPopup(View v) {
        PopupMenu popup = new PopupMenu(this, v);
        popup.setOnMenuItemClickListener(this);
        popup.inflate(R.menu.popup_menu);
        popup.show();
    }


    @Override
    public boolean onMenuItemClick(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.england:
                return true;

            case R.id.france:
                return true;

            case R.id.usa:
                return true;

            case R.id.asia:
                return true;

            case R.id.germnay:
                return true;

            case R.id.italy:
                return true;

            case R.id.spain:
                return true;

            default:
                return false;
        }
    }
}