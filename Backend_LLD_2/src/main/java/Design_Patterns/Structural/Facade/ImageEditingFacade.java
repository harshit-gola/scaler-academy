package Design_Patterns.Structural.Facade;

import Design_Patterns.Structural.Facade.models.Image;
import Design_Patterns.Structural.Facade.services.*;

public class ImageEditingFacade {
    private ImageLoader imageLoader;
    private FilterService filterService;
    private ImageModifier imageModifier;
    private ImageWriter imageWriter;
    private AnalyticsService analyticsService;

    public ImageEditingFacade(ImageLoader imageLoader, FilterService filterService, ImageModifier imageModifier, ImageWriter imageWriter, AnalyticsService analyticsService) {
        this.imageLoader = imageLoader;
        this.filterService = filterService;
        this.imageModifier = imageModifier;
        this.imageWriter = imageWriter;
        this.analyticsService = analyticsService;
    }

    public void editImage(String imagePath, String filterType, int brightness) {

        Image image = imageLoader.loadImage(imagePath);

        filterService.applyFilter(image, filterType);
        imageModifier.adjustBrightness(image, brightness);

        imageWriter.saveImage(image);
        analyticsService.store(image);
    }
}
