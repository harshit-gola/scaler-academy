package Design_Patterns.Creational.Factory;

import Design_Patterns.Creational.Factory.components.Button;
import Design_Patterns.Creational.Factory.components.Dropdown;

public abstract class Platform {
//    abstract Button createButton();

    // platform will have other methods as well, which will violates SRP
    // Move it to UIComponentFactory

    abstract UIComponentFactory createUIComponentFactory();
}
