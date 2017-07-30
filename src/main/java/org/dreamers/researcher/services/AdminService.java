package org.dreamers.researcher.services;

import org.dreamers.researcher.DAO.AdminDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Yaseen on 7/29/2017.
 */
@Service
@Transactional
public class AdminService {
    @Autowired
    private AdminDAO adminDAO;
}
