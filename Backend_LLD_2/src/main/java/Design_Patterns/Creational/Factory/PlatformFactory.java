package Design_Patterns.Creational.Factory;

public class PlatformFactory {
    public static Platform getPlatform(String type){
        Platform platform = null;
        if (type.equals("IOS")) {
            platform = new IOS();
        } else if (type.equals("Android")) {
            platform = new Android();
        }
        return platform;
    }
}
