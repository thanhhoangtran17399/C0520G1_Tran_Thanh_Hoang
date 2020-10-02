package vn.codegym.demo.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import vn.codegym.demo.model.Image;
import vn.codegym.demo.repository.ImageRepository;

import java.util.ArrayList;
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
        return imageRepository.findById(id).orElse(null);
    }

    @Override
    public void update(Image image) {
        imageRepository.save(image);
    }

    @Override
    public void remove(Image image) {
        imageRepository.delete(image);
    }

    @Override
    public Page<Image> findAll(Pageable pageable) {
        return imageRepository.findAll(pageable);
    }

    @Override
    public List<String> noiTucLaXau(){
        List<String> list = new ArrayList<>();
            list.add("cac");
            list.add("lon");
            list.add("dit me may");
            list.add("an cuc an dau buoi");
            list.add("dau cat moi");
        return list;
    }
}
