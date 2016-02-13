/*
  Analog Input
 Demonstrates analog input by reading an analog 10K temperature sensor on analog pin A13 and
 sending the converted Temperature to Celsius throw Serial


 Created by Filipe Oliveira

 This example code is in the public domain.

 */

#include <math.h>

double Thermistor(int RawADC) {
 double Temp;
 Temp = log(10000.0*((1024.0/RawADC-1))); 
 Temp = 1 / (0.001129148 + (0.000234125 + (0.0000000876741 * Temp * Temp ))* Temp );
 Temp = Temp - 273.15;            // Convert Kelvin to Celcius
 return Temp;
}

int sensorPin = A13;    // select the input pin for the potentiometer
int sensorValue = 0;  // variable to store the value coming from the sensor

void setup() {
    Serial.begin(9600);
}

void loop() {
 // read the value from the sensor:
 sensorValue = analogRead(sensorPin);
 Serial.println(Thermistor(sensorValue));  // display Celcius
 delay (1000);
}
