package com.x3platform.transactions.app3.program.controllers;

import com.x3platform.transactions.app3.program.mappers.Tbl3Mapper;
import com.x3platform.transactions.app3.program.services.Rm3Interface;
import com.x3platform.transactions.app3.program.services.Rm3Service;
// import com.netflix.discovery.converters.Auto;
import io.seata.spring.annotation.GlobalTransactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/trans/service3")
public class Service3Controller {

    @Autowired
    private Rm3Service rm3Service;

    @Autowired
    private Rm3Interface rm3Interface;

    @GetMapping("/rm3")
    @Transactional
    public String rm3(){
        rm3Service.rm3();
        // int i = 1/0;
        return "success";
    }

    @GetMapping("/rm3-tcc")
    @GlobalTransactional(rollbackFor = Exception.class)
    public String rm3Tcc(){
        rm3Interface.rm3(null);
        return "success";
    }
}
