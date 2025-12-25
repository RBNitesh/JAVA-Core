package Iheritance;

// In Java, Multiple Inheritance is acheived using interface
interface LandVehicle {
    default void LandVehicle() {
        System.out.println("This runs on land");
    }
}

interface WaterVehicle {
    default void WaterVehicle() {
        System.out.println("This runs in water");
    }
}

public class AmbhibiousVehicles implements LandVehicle, WaterVehicle {
    AmbhibiousVehicles() {
        System.out.println("This runs on land as well as in water");
    }
}

 













