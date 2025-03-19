package Design_Patterns.Creational.Factory;

import Design_Patterns.Creational.Factory.components.Button;
import Design_Patterns.Creational.Factory.components.Dropdown;
import Design_Patterns.Creational.Factory.components.IOS.IOSButton;
import Design_Patterns.Creational.Factory.components.IOS.IOSDropdown;

public class IOS extends Platform{

    @Override
    UIComponentFactory createUIComponentFactory() {
        return new IOSUIComponentFactory();
    }
}
