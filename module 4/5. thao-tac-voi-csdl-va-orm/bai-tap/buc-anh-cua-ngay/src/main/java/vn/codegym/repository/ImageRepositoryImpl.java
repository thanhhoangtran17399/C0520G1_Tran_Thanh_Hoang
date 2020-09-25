package vn.codegym.repository;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;
import vn.codegym.model.Image;

import java.util.List;

@Repository
public class ImageRepositoryImpl implements ImageRepository {

    @Override
    public List findAll() {
        Session session = null;
        List<Image> studentList = null;
        try {
            session = ConnectionUtil.sessionFactory.openSession();
            studentList = session.createQuery("FROM Image").getResultList();

        } finally {
            if (session != null) {
                session.close();
            }
        }
        return studentList;
    }

    @Override
    public void save(Image image) {
        Session session = null;
        Transaction transaction = null;
        try {
            session = ConnectionUtil.sessionFactory.openSession();
            transaction = session.beginTransaction();

            session.save(image);

            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
            if (transaction != null) {
                transaction.rollback();
            }
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }

    @Override
    public Image findById(int id) {
        Session session = null;
        Image image = null;
        try {
            session = ConnectionUtil.sessionFactory.openSession();

            image = session.get(Image.class, id);

        } finally {
            if (session != null) {
                session.close();
            }
        }
        return image;
    }

    @Override
    public void update(Image image) {
        Session session = null;
        Transaction transaction = null;
        try {
            session = ConnectionUtil.sessionFactory.openSession();
            transaction = session.beginTransaction();

            session.update(image);

            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
            if (transaction != null) {
                transaction.rollback();
            }
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }

    @Override
    public void remove(Image image) {
        Session session = null;
        Transaction transaction = null;
        try {
            session = ConnectionUtil.sessionFactory.openSession();
            transaction = session.beginTransaction();

            session.remove(image);

            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
            if (transaction != null) {
                transaction.rollback();
            }
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }
}