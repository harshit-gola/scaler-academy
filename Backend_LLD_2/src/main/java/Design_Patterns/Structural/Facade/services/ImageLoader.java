package Design_Patterns.Structural.Facade.services;

import Design_Patterns.Structural.Facade.models.Image;

public class ImageLoader {
    public Image loadImage(String imagePath) {
        return new Image();
    }
}
