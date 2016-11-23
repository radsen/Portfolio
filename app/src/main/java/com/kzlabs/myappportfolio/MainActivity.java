package com.kzlabs.myappportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btnPopularMovies;
    private Button btnStockHawk;
    private Button btnBuildItBigger;
    private Button btnMakeYourAppMaterial;
    private Button btnGoUbiquitous;
    private Button btnCapstone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnPopularMovies = (Button) findViewById(R.id.btnPopularMovies);
        btnPopularMovies.setOnClickListener(this);

        btnStockHawk = (Button) findViewById(R.id.btnStockHawk);
        btnStockHawk.setOnClickListener(this);

        btnBuildItBigger = (Button) findViewById(R.id.btnBuildItBigger);
        btnBuildItBigger.setOnClickListener(this);

        btnMakeYourAppMaterial = (Button) findViewById(R.id.btnMakeYourAppMaterial);
        btnMakeYourAppMaterial.setOnClickListener(this);

        btnGoUbiquitous = (Button) findViewById(R.id.btnGoUbiquitous);
        btnGoUbiquitous.setOnClickListener(this);

        btnCapstone = (Button) findViewById(R.id.btnCapstone);
        btnCapstone.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        String strProject = null;

        switch (view.getId()){
            case R.id.btnPopularMovies:
                strProject = getString(R.string.txt_popular_movies);
                break;
            case R.id.btnStockHawk:
                strProject = getString(R.string.txt_stock_hawk);
                break;
            case R.id.btnBuildItBigger:
                strProject = getString(R.string.txt_build_it_bigger);
                break;
            case R.id.btnMakeYourAppMaterial:
                strProject = getString(R.string.txt_make_material);
                break;
            case R.id.btnGoUbiquitous:
                strProject = getString(R.string.txt_go_ubiquitous);
                break;
            case R.id.btnCapstone:
                strProject = getString(R.string.txt_capstone);
                break;
        }

        String message = String.format(getString(R.string.txt_msg_format), strProject);
        Toast toast = Toast.makeText(this, message, Toast.LENGTH_SHORT);

        // Taken from:
        // http://stackoverflow.com/questions/3522023/center-text-in-a-toast-in-android
        TextView tv = (TextView) toast.getView().findViewById(android.R.id.message);
        if( tv != null) tv.setGravity(Gravity.CENTER);
        // end

        toast.show();

    }
}
