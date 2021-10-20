package com.phoneClasses;
import com.phone.*;


public class Galaxy extends Phone implements Ringable {
    public Galaxy(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }
    @Override
    public String ring() {
		return "Galaxy "+super.getVersion() + " says " + super.getRingTone();
    }
    @Override
    public String unlock() {
		return "Galaxy "+super.getVersion() + " unlocking cellphone";
    }
    @Override
    public void displayInfo() {
       System.out.println("Galaxy "+ super.getVersion() + " from " + super.getCarrier());           
    }
}
