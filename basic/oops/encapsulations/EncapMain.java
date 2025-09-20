package basic.oops.encapsulations;

import basic.oops.packages.package2.B;

public class EncapMain {
    static void main(String[] args) {
       Building building=new Building();
        System.out.println(building.getTotalNumberOfFloor());
        building.setTotalNumberOfFloor(10);
        System.out.println(building.getTotalNumberOfFloor());
    }
}
