package br.eng.crisjr.sst.app;

import android.graphics.Point;
import android.view.Display;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

public class StopSignalActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_sst);
        fixProportions();
    }

    public void buttonLeft_onClick(View view) {
        Toast.makeText(StopSignalActivity.this,
                       "<-",
                       Toast.LENGTH_SHORT)
             .show();
    }

    public void buttonRight_onClick(View view) {
        Toast.makeText(StopSignalActivity.this,
                       "->",
                       Toast.LENGTH_SHORT)
             .show();
    }

    private void fixProportions() {
        Display display = getWindowManager().getDefaultDisplay();
        Point size = new Point();
        display.getSize(size);
        int width = size.x;
//        int height = size.y;
        Button button = (Button) findViewById(R.id.buttonLeft);
        button.setWidth(width/2);
        button = (Button) findViewById(R.id.buttonRight);
        button.setWidth(width/2);
    }
}
