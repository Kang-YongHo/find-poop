package com.findpoop.test;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class PexelsImageService implements ImageService {
    private static final int MAX_IMAGES_PER_PAGE = 20;

    private final PexelsClient client;

    private static final String PEXELS = "Pexels";

    @Override
    public List<Image> getImages(int page) {
        PexelsRes photos = client.getPhotos(MAX_IMAGES_PER_PAGE, page);
        return photos.getPhotos().stream()
                .map(photo -> new Image(PEXELS,
                        photo.getPhotographer(),
                        photo.getSrc().getLarge(),
                        photo.getPhotographerUrl()))
                .collect(Collectors.toList());
    }

    @Override
    public List<Image> getImages(String topic, int page) {
        PexelsRes response = client.getPhotos(topic, MAX_IMAGES_PER_PAGE, page);
        return response.getPhotos().stream()
                .map(photo -> new Image(PEXELS,
                        photo.getPhotographer(),
                        photo.getSrc().getLarge(),
                        photo.getPhotographerUrl()))
                .collect(Collectors.toList());
    }
}
