package StrategyPattern.WithStrategyPattern;

import StrategyPattern.WithStrategyPattern.Strategy.DriveStrategy;

public class Vehicle {
    DriveStrategy driveStrategyObject;
    public Vehicle(DriveStrategy driveStrategyObj){
        this.driveStrategyObject = driveStrategyObj;
    }
    public void drive() {
        driveStrategyObject.drive();
    }
}
