package org.dreamers.researcher.DAO;

import org.dreamers.researcher.pojo.Admin;
import org.springframework.stereotype.Repository;

/**
 * Created by Yaseen on 7/29/2017.
 */
@Repository
public class AdminDAO extends AbstractDAO<Admin> {

    AdminDAO()
    {
        setClazz(Admin.class);
    }
}
