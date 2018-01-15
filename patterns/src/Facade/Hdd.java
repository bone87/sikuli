package Facade;

public class Hdd {
    void copy(DvdRom dvdRom) {
        if (dvdRom.getData()) {
            System.out.println("Copying data from DVD...");
        }
        else System.out.println("Enter DVD");
    }
}
