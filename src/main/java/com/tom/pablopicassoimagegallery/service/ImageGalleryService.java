package com.tom.pablopicassoimagegallery.service;

import java.util.List;
import java.util.Optional;

import com.tom.pablopicassoimagegallery.entity.ImageGallery;

public interface ImageGalleryService {
    
    void saveImage(ImageGallery imageGallery);

    List<ImageGallery> getAllActiveImages();

    Optional<ImageGallery> getImageById(Long id);

}
