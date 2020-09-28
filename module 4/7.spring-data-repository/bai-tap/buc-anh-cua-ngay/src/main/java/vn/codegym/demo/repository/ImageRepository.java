package vn.codegym.demo.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import vn.codegym.demo.model.Image;

import java.util.List;

public interface ImageRepository extends JpaRepository<Image, Integer> {

}
