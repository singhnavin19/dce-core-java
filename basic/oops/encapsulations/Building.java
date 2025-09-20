package basic.oops.encapsulations;

import basic.oops.packages.package2.B;

public class Building {
    private int totalNumberOfFloor;
    private int totalNumberOfFltas;
    private int totalNumberOfLifts;

    public int getTotalNumberOfFloor() {
        return totalNumberOfFloor;
    }

    public void setTotalNumberOfFloor(int totalNumberOfFloor) {
        this.totalNumberOfFloor = totalNumberOfFloor;
    }

    public int getTotalNumberOfFltas() {
        return totalNumberOfFltas;
    }

    public void setTotalNumberOfFltas(int totalNumberOfFltas) {
        this.totalNumberOfFltas = totalNumberOfFltas;
    }

    public int getTotalNumberOfLifts() {
        return totalNumberOfLifts;
    }

    public void setTotalNumberOfLifts(int totalNumberOfLifts) {
        this.totalNumberOfLifts = totalNumberOfLifts;
    }
}
