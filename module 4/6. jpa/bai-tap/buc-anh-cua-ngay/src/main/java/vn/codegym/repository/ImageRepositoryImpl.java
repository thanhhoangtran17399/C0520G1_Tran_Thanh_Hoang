package vn.codegym.repository;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import vn.codegym.model.Image;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

@Repository
@Transactional
public class ImageRepositoryImpl implements ImageRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Image> findAll() {
        TypedQuery<Image> query = entityManager.createQuery("SELECT i FROM Image i", Image.class);

        return query.getResultList();
    }

    @Override
    public void save(Image image) {
        entityManager.persist(image);
    }

    @Override
    public Image findById(int id) {
        return entityManager.find(Image.class, id);
    }

    @Override
    public void update(Image image) {
        entityManager.merge(image);
    }

    @Override
    public void remove(Image image) {
        entityManager.remove(image);
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