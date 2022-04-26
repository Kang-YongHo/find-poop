package com.findpoop.test;

import java.util.List;

public interface ImageService {
    //Returns random images pagewise
    public List<Image> getImages(int page);

    // Returns list of images for a topic
    public List<Image> getImages(String topic, int page);
}
