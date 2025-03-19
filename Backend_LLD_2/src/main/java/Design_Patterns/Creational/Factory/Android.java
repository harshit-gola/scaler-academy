package Design_Patterns.Creational.Factory;

import Design_Patterns.Creational.Factory.components.Android.AndroidButton;
import Design_Patterns.Creational.Factory.components.Android.AndroidDropdown;
import Design_Patterns.Creational.Factory.components.Button;
import Design_Patterns.Creational.Factory.components.Dropdown;

public class Android extends Platform{

    @Override
    UIComponentFactory createUIComponentFactory() {
        return new AndroidUIComponentFactory();
    }
}
