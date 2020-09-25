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






//    @Override
//    public List findAll() {
//        Session session = null;
//        List<Image> studentList = null;
//        try {
//            session = ConnectionUtil.sessionFactory.openSession();
//            studentList = session.createQuery("FROM Image").getResultList();
//
//        } finally {
//            if (session != null) {
//                session.close();
//            }
//        }
//        return studentList;
//    }
//
//    @Override
//    public void save(Image image) {
//        Session session = null;
//        Transaction transaction = null;
//        try {
//            session = ConnectionUtil.sessionFactory.openSession();
//            transaction = session.beginTransaction();
//
//            session.save(image);
//
//            transaction.commit();
//        } catch (Exception e) {
//            e.printStackTrace();
//            if (transaction != null) {
//                transaction.rollback();
//            }
//        } finally {
//            if (session != null) {
//                session.close();
//            }
//        }
//    }
//
//    @Override
//    public Image findById(int id) {
//        Session session = null;
//        Image image = null;
//        try {
//            session = ConnectionUtil.sessionFactory.openSession();
//
//            image = session.get(Image.class, id);
//
//        } finally {
//            if (session != null) {
//                session.close();
//            }
//        }
//        return image;
//    }
//
//    @Override
//    public void update(Image image) {
//        Session session = null;
//        Transaction transaction = null;
//        try {
//            session = ConnectionUtil.sessionFactory.openSession();
//            transaction = session.beginTransaction();
//
//            session.update(image);
//
//            transaction.commit();
//        } catch (Exception e) {
//            e.printStackTrace();
//            if (transaction != null) {
//                transaction.rollback();
//            }
//        } finally {
//            if (session != null) {
//                session.close();
//            }
//        }
//    }
//
//    @Override
//    public void remove(Image image) {
//        Session session = null;
//        Transaction transaction = null;
//        try {
//            session = ConnectionUtil.sessionFactory.openSession();
//            transaction = session.beginTransaction();
//
//            session.remove(image);
//
//            transaction.commit();
//        } catch (Exception e) {
//            e.printStackTrace();
//            if (transaction != null) {
//                transaction.rollback();
//            }
//        } finally {
//            if (session != null) {
//                session.close();
//            }
//        }
//    }



}