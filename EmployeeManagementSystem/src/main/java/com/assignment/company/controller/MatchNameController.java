package com.assignment.company.controller;

import com.assignment.company.model.RequestMatchName;
import com.assignment.company.service.MatchNameServicesImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/match")
public class MatchNameController {
    @Autowired
    MatchNameServicesImpl matchNameServicesImpl;

    @PostMapping("/nameMatch")
    public Object nameMatch(@RequestBody RequestMatchName requestMatchName){
        return matchNameServicesImpl.matchName(requestMatchName);
    }
}
