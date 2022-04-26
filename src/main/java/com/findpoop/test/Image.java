package com.findpoop.test;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Image {

    private final String source;
    private final String photographer;
    private final String photographerUrl;
    private final String imageUrl;

    public Image(String source, String photographer, String imageUrl, String photographerUrl) {
        this.source = source;
        this.photographer = photographer;
        this.imageUrl = imageUrl;
        this.photographerUrl = photographerUrl;
    }

}
