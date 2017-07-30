package org.dreamers.researcher.controllers;

import org.dreamers.researcher.services.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Yaseen on 7/29/2017.
 */
@RestController
public class AdminController {
    @Autowired
    private AdminService adminService;
}
