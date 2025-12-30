package com.vbs.demo.controller;

import com.vbs.demo.models.Notification;
import com.vbs.demo.repositories.NotificationRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class NotificationController {
    @Autowired
    NotificationRepo notificationRepo;

    @GetMapping("/notifications/{userid}")
    public List<Notification> getNotifications(@PathVariable int userid) {
        return notificationRepo.findByUserId(userid);
    }
}
