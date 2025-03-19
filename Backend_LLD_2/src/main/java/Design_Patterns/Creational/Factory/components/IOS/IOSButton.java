package Design_Patterns.Creational.Factory.components.IOS;

import Design_Patterns.Creational.Factory.components.Button;

public class IOSButton implements Button {
    @Override
    public void click() {
        System.out.println("Clicked IOS Button");
    }
}
