package Design_Patterns.Creational.Factory.components.Android;

import Design_Patterns.Creational.Factory.components.Button;

public class AndroidButton implements Button {
    @Override
    public void click() {
        System.out.println("Android Button clicked");
    }
}
