package Design_Patterns.Creational.Factory;

import Design_Patterns.Creational.Factory.components.Button;

import java.util.Scanner;

public class client {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the platform: ");
        String platform = sc.nextLine();
//        Platform platformInstance = null;
//
//        if (platform.equals("IOS")) {
//            platformInstance = new IOS();
//        } else if (platform.equals("Android")) {
//            platformInstance = new Android();
//        }

//        platformInstance.createButton().click();

        // Using simple factory
//        Platform platformInstance = PlatformFactory.getPlatform(platform);
//        platformInstance.createButton().click();

//        Using Abstract factory method
        Platform platformObj = PlatformFactory.getPlatform(platform);
        UIComponentFactory uiComponentFactory = platformObj.createUIComponentFactory();
        Button button = uiComponentFactory.createButton();
        button.click();
    }
}
