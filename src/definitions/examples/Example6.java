/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 29/08/20
 *  Time: 12:04 PM
 *  File Name : Example6.java
 * */
package definitions.examples;

public class Example6 {
    public static void main(String[] args) {

    }
}

class Bike {
    private final int serialNumber;

    public Bike(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public void printBikeInformation() {
        System.out.println("serialNumber = " + serialNumber);
    }
}

class SuperBike extends Bike {
    int maxSpeed;

    public SuperBike(int serialNumber) {
        super(serialNumber); // calling the constructor of the Bike class
        // and passing the serialNumber parameter as an argument.
    }
}
