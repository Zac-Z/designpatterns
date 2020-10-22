package factory.simplefactory.statical;

import factory.interfaces.IMouse;
public class FactoryDemo {
    public static void main(String[] args) {
        IMouse hpMouse = MouseFactory.createMouse("hp");
        IMouse dellMouse = MouseFactory.createMouse("dell");
        System.out.println(hpMouse.getMouse());
        System.out.println(dellMouse.getMouse());
    }
}
