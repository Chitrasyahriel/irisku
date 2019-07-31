package com.example.iriskuu;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class hasil extends AppCompatActivity {

    Button backToCapture;
    TextView information;
    ClassifierResult classifierResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        backToCapture = findViewById(R.id.reDetect);
        information = findViewById(R.id.finalResult);
        getInformation();

    }
        private void getInformation(){
            Intent intent = getIntent();
            classifierResult = (ClassifierResult) intent.getSerializableExtra("classifierResult");
            Log.d("Tag","Normal = "+classifierResult.getMaxResultId()+" "+String.valueOf(classifierResult.getMaxResultConfidence()));
            information.setText("Kolesterol anda normal, tetap Cek kadar kolesterol anda setiap minggu ya! "+String.valueOf(classifierResult.getMaxResultConfidence()*100));

            backToCapture.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(hasil.this, layer2.class);
                    startActivity(intent);
                }
            });
        }

}
