package br.eng.crisjr.sst.app;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void buttonStart_onClick(View view) {
        Intent intent = new Intent(this, StopSignalActivity.class);
        startActivity(intent);

    }

    public void buttonSettings_onClick(View view) {
        Toast.makeText(MainActivity.this,
                       getResources().getString(R.string.settings_callback),
                       Toast.LENGTH_SHORT)
             .show();
    }
}
