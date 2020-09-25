package vn.codegym.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.codegym.model.Image;
import vn.codegym.repository.ImageRepository;

import java.util.List;

@Service
public class ImageServiceImpl implements ImageService {
    @Autowired
    ImageRepository imageRepository;
    @Override
    public List<Image> findAll() {
        return imageRepository.findAll();
    }

    @Override
    public void save(Image image) {
        imageRepository.save(image);
    }

    @Override
    public Image findById(int id) {
        return imageRepository.findById(id);
    }

    @Override
    public void update(Image image) {
        imageRepository.update(image);
    }

    @Override
    public void remove(Image image) {
        imageRepository.remove(image);
    }
}
