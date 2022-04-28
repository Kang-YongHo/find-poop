package com.findpoop.test;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.SerializedName;

public class Photo {
    private String url;
    private String photographer;
//    @SerializedName(value = "photographerUrl", alternate = {"photographer_url"})
    @JsonProperty("photographer_url")
    private String photographerUrl;
    private ImageSrc src;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getPhotographer() {
        return photographer;
    }

    public void setPhotographer(String photographer) {
        this.photographer = photographer;
    }

    public String getPhotographerUrl() {
        return photographerUrl;
    }

    public void setPhotographerUrl(String photographerUrl) {
        this.photographerUrl = photographerUrl;
    }

    public ImageSrc getSrc() {
        return src;
    }

    public void setSrc(ImageSrc src) {
        this.src = src;
    }
}
