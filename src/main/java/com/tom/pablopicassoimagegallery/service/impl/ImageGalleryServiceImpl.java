package com.tom.pablopicassoimagegallery.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tom.pablopicassoimagegallery.entity.ImageGallery;
import com.tom.pablopicassoimagegallery.repository.ImageGalleryRepository;
import com.tom.pablopicassoimagegallery.service.ImageGalleryService;

@Service
public class ImageGalleryServiceImpl implements ImageGalleryService {

    @Autowired
    private ImageGalleryRepository imageGalleryRepository;

    @Override
    public void saveImage(ImageGallery imageGallery) {
        imageGalleryRepository.save(imageGallery);        
    }

    @Override
    public List<ImageGallery> getAllActiveImages() {
        return imageGalleryRepository.findAll();
    }

    @Override
    public Optional<ImageGallery> getImageById(Long id) {
        return imageGalleryRepository.findById(id);
    }
}
