package Facade;

public class Computer {
    private Power power = new Power();
    private DvdRom dvd = new DvdRom();
    private Hdd hdd = new Hdd();

    public void copy() {
        power.on();
        dvd.loadData();
        hdd.copy(dvd);
        power.off();
    }
}
