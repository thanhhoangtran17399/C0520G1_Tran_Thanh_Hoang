package vn.codegym.repository;

import vn.codegym.model.Image;

import java.util.List;

public interface ImageRepository {
    List<Image> findAll();

    void save(Image image);

    Image findById(int id);

    void update(Image image);

    void remove(Image image);
}
