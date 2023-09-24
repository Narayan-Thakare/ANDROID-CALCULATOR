package com.example.day2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.day2.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        EditText et_name=findViewById(R.id.edit_name);
        EditText et_email=findViewById(R.id.edit_email);

        TextView result=findViewById(R.id.result);
        Button btn=findViewById(R.id.btn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String input1=et_name.getText().toString();
                String input2=et_email.getText().toString();


                int n1 = Integer.parseInt(input1);
                int n2 = Integer.parseInt(input2);

                // Calculate the sum
                int sum = n1 + n2;


                result.setText("Total:- "+sum);
            }
   });
}
}