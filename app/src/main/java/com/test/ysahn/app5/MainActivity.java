package com.test.ysahn.app5;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button mButton;
    private Button mButton2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mButton = (Button) findViewById(R.id.button);
        mButton2 = (Button) findViewById(R.id.button2);

        registerForContextMenu(mButton);
        registerForContextMenu(mButton2);
        Log.d("test", "menu1");

    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v,
                                    ContextMenu.ContextMenuInfo menuInfo) {
        Log.d("test", "menu");
        if(v.getId() == R.id.button){
            menu.add(Menu.NONE, 1, Menu.NONE, "1");
            menu.add(Menu.NONE, 2, Menu.NONE, "2");
            menu.add(Menu.NONE, 3, Menu.NONE, "3");
        }else{
            MenuInflater inflater = this.getMenuInflater();
            inflater.inflate(R.menu.menu,menu);
        }

        super.onCreateContextMenu(menu,v,menuInfo);
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        AdapterView.AdapterContextMenuInfo info = (AdapterView.AdapterContextMenuInfo) item.getMenuInfo();
        switch (item.getItemId()) {
            default:
                return super.onContextItemSelected(item);
        }
    }
}
