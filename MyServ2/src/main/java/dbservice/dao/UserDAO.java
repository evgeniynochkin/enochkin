package dbservice.dao;

import dbservice.datasets.UserDataSet;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

public class UserDAO {

    private Session session;

    public UserDAO(Session session) {
        this.session = session;
    }

    public long insertUser(String name, String password) throws HibernateException {
        return (Long) session.save(new UserDataSet(name, password));
    }

    public UserDataSet get(long id) throws HibernateException {
        return (UserDataSet) session.get(UserDataSet.class, id);
    }

    public long getUserId(String login) throws HibernateException {
        Criteria criteria = session.createCriteria(UserDataSet.class);
        return ((UserDataSet) criteria.add(Restrictions.eq("name", login)).uniqueResult()).getId();
    }
}
