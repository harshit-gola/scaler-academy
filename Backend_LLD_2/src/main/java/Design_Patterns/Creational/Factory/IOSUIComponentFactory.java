package Design_Patterns.Creational.Factory;

import Design_Patterns.Creational.Factory.components.Button;
import Design_Patterns.Creational.Factory.components.Dropdown;
import Design_Patterns.Creational.Factory.components.IOS.IOSButton;
import Design_Patterns.Creational.Factory.components.IOS.IOSDropdown;

public class IOSUIComponentFactory implements UIComponentFactory{
    @Override
    public Button createButton() {
        return new IOSButton();
    }

    @Override
    public Dropdown createDropdown() {
        return new IOSDropdown();
    }
}
