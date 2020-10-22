package factory.factorymethod;

import factory.interfaces.Factory;
import factory.interfaces.IMouse;

public class FactoryDemo {
    public static void main(String[] args) {
        Factory dellMouseFactory = new DellMouseFactory();
        IMouse dellMouse = dellMouseFactory.createMouse();
        System.out.println(dellMouse.getMouse());

        Factory hpMouseFactory = new HpMouseFactory();
        IMouse hpMouse = hpMouseFactory.createMouse();
        System.out.println(hpMouse.getMouse());
    }
}
