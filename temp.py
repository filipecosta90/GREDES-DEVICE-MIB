#!/usr/bin/python
import serial
import time

ser = serial.Serial('/dev/ttyACM0', 9600)
while True :
    	f = open("/home/pi/GREDES-DEVICE-MIB/snmp_sensor_temperature", "w")
	temperature = ser.readline().rstrip()
	print temperature
	f.write( temperature )
	f.close()
	time.sleep(1) # delays for 1 second
