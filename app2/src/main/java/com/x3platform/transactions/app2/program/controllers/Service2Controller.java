package com.x3platform.transactions.app2.program.controllers;

import com.x3platform.transactions.app2.program.services.Rm2Interface;
import com.x3platform.transactions.app2.program.services.Rm2Service;
import io.seata.spring.annotation.GlobalTransactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/trans/service2")
public class Service2Controller {
  
  @Autowired
  private Rm2Service rm2Service;
  
  @Autowired
  private Rm2Interface rm2Interface;
  
  @GetMapping("/rm2")
  public String two() {
    rm2Service.rm2();
    // int i = 1/0;
    return "success";
  }
  
  @GetMapping("/rm2-tcc")
  @GlobalTransactional(rollbackFor = Exception.class)
  public String twoTcc() {
    rm2Interface.rm2(null);
    // int i = 1/0;
    return "success";
  }
}
