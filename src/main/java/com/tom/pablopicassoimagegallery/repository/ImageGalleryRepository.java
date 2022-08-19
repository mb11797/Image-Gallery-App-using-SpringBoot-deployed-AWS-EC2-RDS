package com.tom.pablopicassoimagegallery.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tom.pablopicassoimagegallery.entity.ImageGallery;

@Repository
public interface ImageGalleryRepository extends JpaRepository<ImageGallery, Long>  {
    
}
