package Design_Patterns.Creational.Factory.components.Android;

import Design_Patterns.Creational.Factory.components.Dropdown;

public class AndroidDropdown implements Dropdown {
    @Override
    public void showOptions() {
        System.out.println("Showing Android Dropdown");
    }
}
