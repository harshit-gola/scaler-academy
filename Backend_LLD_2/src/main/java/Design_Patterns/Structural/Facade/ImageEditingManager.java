package Design_Patterns.Structural.Facade;

import Design_Patterns.Structural.Facade.services.*;

public class ImageEditingManager {

    private ImageEditingFacade imageEditingFacade;

    public ImageEditingManager(ImageLoader imageLoader, FilterService filterService, ImageModifier imageModifier, ImageWriter imageWriter, AnalyticsService analyticsService) {
        this.imageEditingFacade = new ImageEditingFacade(imageLoader, filterService, imageModifier, imageWriter, analyticsService);
    }

    public void editImage(String imagePath, String filterType, int brightness) {
        imageEditingFacade.editImage(imagePath, filterType, brightness);
    }

}