package com.example.menus_and_intents;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
public class SecondActivity extends AppCompatActivity {
TextView txtSumOfNumbers,txtAverageOfNumbers;
 @Override
 protected void onCreate(Bundle savedInstanceState) {
 super.onCreate(savedInstanceState);
 setContentView(R.layout.activity_second);
 txtSumOfNumbers=findViewById(R.id.son);
 txtAverageOfNumbers=findViewById(R.id.aon);
 Intent ObjIntent=getIntent();
 Bundle ObjBundle=ObjIntent.getExtras();
 int ISumOfNumbers=ObjBundle.getInt("KeySumOfNumbers");
 float IAverageOfNumbers=ObjBundle.getFloat("KeyAverageOfNumbers");
 txtSumOfNumbers.setText(Integer.toString(ISumOfNumbers));
 txtAverageOfNumbers.setText(Float.toString(IAverageOfNumbers));
 }
}
