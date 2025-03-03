package Design_Patterns.Creational.Builder.CarProduction.Components;

public class GPSNavigator {
    private String route;

    public GPSNavigator() {
        route = "R1A-1608, Arocon Rainbow, Jaipuria Sunrise, Ghaziabad, Uttar Pradesh";
    }

    GPSNavigator(String manualRoute) {
        this.route = manualRoute;
    }

    public String getRoute() {
        return route;
    }
}
