package SOLID.v6;

import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How you want to fly?");
        String flyMode = sc.nextLine();

        FlyingBehavior flyingBehavior;
        if (flyMode.equalsIgnoreCase("High")) {
            flyingBehavior = new HighFly();
        } else {
            flyingBehavior = new LowFly();
        }

        Sparrow sparrow = new Sparrow(flyingBehavior);
        sparrow.fly();
    }
}
