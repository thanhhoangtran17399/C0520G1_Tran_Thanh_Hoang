package vn.codegym.repository;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import vn.codegym.model.Blog;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

@Repository
@Transactional
public class BlogRepositoryImpl implements BlogRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Blog> findAll() {
        TypedQuery<Blog> query = entityManager.createQuery("SELECT i FROM Blog i", Blog.class);

        return query.getResultList();
    }

    @Override
    public void save(Blog blog) {
        entityManager.persist(blog);
    }

    @Override
    public Blog findById(int id) {
        return entityManager.find(Blog.class, id);
    }

    @Override
    public void update(Blog blog) {
        entityManager.merge(blog);
    }

    @Override
    public void remove(Blog blog) {
        entityManager.remove(entityManager.merge(blog));
    }
}