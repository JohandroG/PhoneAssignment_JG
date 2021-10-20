package com.phone;

public abstract class Phone {
	private String versionNumber;
    private int batteryPercentage;
    private String carrier;
    private String ringTone;
    
    
    public Phone(String versionNumber, int batteryPercentage, String carrier, String ringTone){
        this.versionNumber = versionNumber;
        this.batteryPercentage = batteryPercentage;
        this.carrier = carrier;
        this.ringTone = ringTone;
    }
    
    
    public abstract void displayInfo();
    
    public String getVersion() {
    	return this.versionNumber;
    }
    public int getBattery() {
    	return this.batteryPercentage;
    }
    public String getCarrier() {
    	return this.carrier;
    }
    public String getRingTone() {
    	return this.ringTone;

    
    }
}
