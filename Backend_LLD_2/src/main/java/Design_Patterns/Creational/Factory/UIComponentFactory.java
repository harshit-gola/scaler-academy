package Design_Patterns.Creational.Factory;

import Design_Patterns.Creational.Factory.components.Button;
import Design_Patterns.Creational.Factory.components.Dropdown;

public interface UIComponentFactory {
    Button createButton();
    Dropdown createDropdown();
}
