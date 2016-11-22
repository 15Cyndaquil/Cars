package com.example.cynda.cars;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ButtonBarLayout;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

import car.Car;

public class CarActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_car);

        final Button myButton = (Button) findViewById(R.id.myButton);
        final Button herButton = (Button) findViewById(R.id.herButton);
        final Button hisButton = (Button) findViewById(R.id.hisButton);
        final Button outputButton = (Button) findViewById(R.id.outputButton);
        final Button equalButton = (Button) findViewById(R.id.equalButton);

        final TextView myOutput = (TextView) findViewById(R.id.myOutput);
        final TextView herOutput = (TextView) findViewById(R.id.herOutput);
        final TextView hisOutput = (TextView) findViewById(R.id.hisOutput);
        final TextView output = (TextView) findViewById(R.id.count);

        final EditText editColor = (EditText) findViewById(R.id.editColor);
        final EditText editMake = (EditText) findViewById(R.id.editMake);
        final EditText editHorsePower = (EditText) findViewById(R.id.editHorsePower);
        final EditText editEngineSize = (EditText) findViewById(R.id.editEngineSize);

        final Car myCar = new Car();
        final Car hisCar = new Car("Black", 400, 3.5, "Honda");
        final Car herCar = new Car("Pink", 300, 2.5, "Volks");

        myButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                myCar.setMake(editMake.getText().toString());
                myCar.setColor(editColor.getText().toString());
                try{
                    myCar.setEngineSize(Double.parseDouble(editEngineSize.getText().toString()));
                }catch(NumberFormatException n){
                }
                try{
                    myCar.setHorsePower(Integer.parseInt(editHorsePower.getText().toString()));
                }catch(NumberFormatException n){
                }
            }
        });
        herButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                herCar.setMake(editMake.getText().toString());
                herCar.setColor(editColor.getText().toString());
                try{
                    herCar.setEngineSize(Double.parseDouble(editEngineSize.getText().toString()));
                }catch(NumberFormatException n){
                }
                try{
                    herCar.setHorsePower(Integer.parseInt(editHorsePower.getText().toString()));
                }catch(NumberFormatException n){
                }
            }
        });
        hisButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                hisCar.setMake(editMake.getText().toString());
                hisCar.setColor(editColor.getText().toString());
                try{
                    hisCar.setEngineSize(Double.parseDouble(editEngineSize.getText().toString()));
                }catch(NumberFormatException n){
                }
                try{
                    hisCar.setHorsePower(Integer.parseInt(editHorsePower.getText().toString()));
                }catch(NumberFormatException n){
                }
            }
        });
        outputButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                myOutput.setText(myCar.toString());
                herOutput.setText(herCar.toString());
                hisOutput.setText(hisCar.toString());
                output.setText(String.valueOf(Car.getCount()));
            }
        });
        equalButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                if(hisCar.equals(myCar)){
                    hisOutput.setText("His car is equal to My car!");
                }
                if(hisCar.equals(herCar)){
                    hisOutput.setText("His car is equal to Her car!");
                }
                if(hisCar.equals(myCar)&&hisCar.equals(herCar)){
                    hisOutput.setText("His car is equal to both Her and My car!");
                }
                if(true!=(hisCar.equals(myCar)&&hisCar.equals(herCar)||hisCar.equals(myCar)||hisCar.equals(herCar))){
                    hisOutput.setText("His car unique!");
                }


                if(herCar.equals(myCar)){
                    herOutput.setText("Her car is equal to My car!");
                }
                if(herCar.equals(hisCar)){
                    herOutput.setText("Her car is equal to His car!");
                }
                if(herCar.equals(myCar)&&herCar.equals(hisCar)){
                    herOutput.setText("Her car is equal to both His and My car!");
                }
                if(true!=(herCar.equals(myCar)&&herCar.equals(hisCar)||herCar.equals(myCar)||herCar.equals(hisCar))){
                    herOutput.setText("Her car is unique!");
                }

                if(myCar.equals(hisCar)){
                    myOutput.setText("My car is equal to His car!");
                }
                if(myCar.equals(herCar)){
                    myOutput.setText("My car is equal to Her car!");
                }
                if(myCar.equals(herCar)&&myCar.equals(hisCar)){
                    myOutput.setText("My car is equal to both Her and His car!");
                }
                if(true!=(myCar.equals(herCar)&&myCar.equals(hisCar)||myCar.equals(herCar)||myCar.equals(hisCar))){
                    myOutput.setText("My car is unique!");
                }
            }
        });




        myCar.setMake("Jeep");
        myCar.setEngineSize(6);
        myCar.setHorsePower(500);
        myCar.setColor("Blue");

        System.out.println(myCar);
        System.out.println(hisCar);
        System.out.println(herCar);

        hisCar.setColor("Blue");
        herCar.setColor("Blue");
        hisCar.setHorsePower(650);
        herCar.setHorsePower(650);
        hisCar.setEngineSize(6.5);
        herCar.setEngineSize(6.5);
        hisCar.setMake("Ferrari");
        herCar.setMake("Ferrari");
        myCar.setColorHorseEngineMake("Blue", 650, 6.5, "Ferrari");
        System.out.println("My car's color: "+myCar.getColor()+" Horse Power: "
                +myCar.getHorsePower()+" Engine Size: "+myCar.getEngineSize()
                +" Make: "+myCar.getMake());
        System.out.println("His car's color: "+hisCar.getColor()+" Horse Power: "
                +hisCar.getHorsePower()+" Engine Size: "+hisCar.getEngineSize()
                +" Make: "+hisCar.getMake());
        System.out.println("Her car's color: "+herCar.getColor()+" Horse Power: "
                +herCar.getHorsePower()+" Engine Size: "+herCar.getEngineSize()
                +" Make: "+herCar.getMake());
        if(hisCar.equals(myCar)&& herCar.equals(myCar)){
            System.out.println("His, Her , and My car are all the same car");
        }
        else {
            if (hisCar.equals(herCar)) {
                System.out.println("His car is the same as Her car");
            } else {
                System.out.println("His car is different from Her car");
            }
            if (hisCar.equals(myCar)) {
                System.out.println("His car is the same as My car");
            } else {
                System.out.println("His car is different from My car");
            }
            if (herCar.equals(myCar)) {
                System.out.println("Her car is the same as My car");
            } else {
                System.out.println("Her car is different from My car");
            }
        }
        System.out.println(Car.getCount());
    }
}
