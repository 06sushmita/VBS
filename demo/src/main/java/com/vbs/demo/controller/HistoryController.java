package com.vbs.demo.controller;

import com.vbs.demo.models.History;
import com.vbs.demo.repositories.HistoryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

public class HistoryController {
    @Autowired
    HistoryRepo historyRepo;

    @GetMapping("/histories")
    public List<History> getHistory(){
        return historyRepo.findAll();
    }
}
