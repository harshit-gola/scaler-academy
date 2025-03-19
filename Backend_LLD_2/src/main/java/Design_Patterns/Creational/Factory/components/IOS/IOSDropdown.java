package Design_Patterns.Creational.Factory.components.IOS;

import Design_Patterns.Creational.Factory.components.Dropdown;

public class IOSDropdown implements Dropdown {
    @Override
    public void showOptions() {
        System.out.println("Showing IOS Dropdown");
    }
}
