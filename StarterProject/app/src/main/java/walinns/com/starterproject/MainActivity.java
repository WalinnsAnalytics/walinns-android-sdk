package walinns.com.starterproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.walinns.walinnsapi.WalinnsAPI;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        WalinnsAPI.getInstance().initialize(MainActivity.this,"PROJECT_TOKEN");


    }
}
