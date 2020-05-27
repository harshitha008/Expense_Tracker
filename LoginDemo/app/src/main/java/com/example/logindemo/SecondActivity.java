package com.example.logindemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity {

    private Button AddIncome;
    private Button AddExpense;
    private Button MovementList;
    private Button ReportsByDate;
    private Button FrequentRecords;
    private Button Settings;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        AddIncome=(Button)findViewById(R.id.buttonAddIncome);
        AddExpense=(Button)findViewById(R.id.buttonAddExpense);
        MovementList=(Button)findViewById(R.id.buttonMovementList);
        ReportsByDate=(Button)findViewById(R.id.buttonReportsByDate);
        FrequentRecords=(Button)findViewById(R.id.buttonFrequentRecords);
        Settings=(Button)findViewById(R.id.buttonSettings);

        AddIncome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              openActivityIn();
            }
        });

        AddExpense.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              openActivityEx();
            }
        });

        MovementList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              openActivityML();
            }
        });

        ReportsByDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityRBD();
            }
        });

        FrequentRecords.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityFR();
            }
        });

        Settings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityS();
            }
        });

    }

    private void openActivityIn(){
        Intent intent=new Intent(SecondActivity.this,ActivityIn.class);
        startActivity(intent);
    }

    private void openActivityEx() {
        Intent intent = new Intent(SecondActivity.this,ActivityEx.class);
        startActivity(intent);
    }

    private void openActivityML() {
        Intent intent = new Intent(SecondActivity.this,ActivityML.class);
        startActivity(intent);
    }

    private void openActivityRBD() {
        Intent intent = new Intent(SecondActivity.this,ActivityRBD.class);
        startActivity(intent);
    }

    private void openActivityFR() {
        Intent intent = new Intent(SecondActivity.this,ActivityFR.class);
        startActivity(intent);
    }

    private void openActivityS() {
        Intent intent = new Intent(SecondActivity.this,ActivityS.class);
        startActivity(intent);
    }
}
