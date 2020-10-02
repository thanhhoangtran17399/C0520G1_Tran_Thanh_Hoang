package vn.codegym.demo.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import vn.codegym.demo.model.Image;

import java.util.List;

public interface ImageService {
    List<Image> findAll();

    void save(Image image);

    Image findById(int id);

    void update(Image image);

    void remove(Image image);

    Page<Image> findAll(Pageable pageable);

    List<String> noiTucLaXau();
}
