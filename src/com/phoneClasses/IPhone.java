package com.phoneClasses;
import com.phone.*;

public class IPhone extends Phone implements Ringable {
    public IPhone(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }
    @Override
    public String ring() {
		return "IPhone "+super.getVersion() + " says " + super.getRingTone();
    }
    @Override
    public String unlock() {
		return "IPhone "+super.getVersion() + " unlocking cellphone";
    }
    @Override
    public void displayInfo() {
       System.out.println("IPhone "+ super.getVersion() + " from " + super.getCarrier());           
    }
}
