package com.example.menus_and_intents;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.EditText;
public class MainActivity extends AppCompatActivity {
 EditText edtFirstNumber, edtSecondNumber, edtThirdNumber;
 @Override
 protected void onCreate(Bundle savedInstanceState) {
 super.onCreate(savedInstanceState);
 setContentView(R.layout.activity_main);
 edtFirstNumber = findViewById(R.id.first);
 edtSecondNumber = findViewById(R.id.second);
 edtThirdNumber = findViewById(R.id.third);
 }
 @Override
 public boolean onCreateOptionsMenu(Menu menu) {
 MenuInflater ObjMenuInflater=getMenuInflater();
 ObjMenuInflater.inflate(R.menu.optionmenufile,menu);
 return super.onCreateOptionsMenu(menu);
 }
 @Override
 public boolean onOptionsItemSelected(@NonNull MenuItem item){
 int IFirstNumber=Integer.parseInt(edtFirstNumber.getText().toString());
 int ISecondNumber=Integer.parseInt(edtSecondNumber.getText().toString());
 int IThirdNumber=Integer.parseInt(edtThirdNumber.getText().toString());
 int ISumOfNumbers=IFirstNumber+ISecondNumber+IThirdNumber;
 float FAverageOfNumbers=ISumOfNumbers/3;
 switch (item.getItemId()){
 case R.id.IDOptionMenuSecondActivity:
 Intent ObjIntent=new Intent(MainActivity.this,SecondActivity.class);
 Bundle ObjBundle=new Bundle();
 ObjBundle.putInt("KeySumOfNumbers",ISumOfNumbers);
 ObjBundle.putFloat("KeyAverageOfNumbers",FAverageOfNumbers);
 ObjIntent.putExtras(ObjBundle);
 startActivity(ObjIntent);
 }
 return super.onOptionsItemSelected(item);
 }
}
