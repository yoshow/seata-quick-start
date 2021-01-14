package com.x3platform.transactions.app1.program.controllers;

import com.x3platform.transactions.app1.program.services.Rm1Interface;
import com.x3platform.transactions.app1.program.services.Rm1Service;
import io.seata.spring.annotation.GlobalTransactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

@RestController
@RequestMapping("/trans/service1")
public class Service1Controller {
  
  @Autowired
  Rm1Service rm1Service;
  
  @GetMapping("/method1-at")
  @GlobalTransactional(rollbackFor = Exception.class)
  public String method1At() throws InterruptedException {
    rm1Service.rm1();
    // TimeUnit.MINUTES.sleep(1);
    // System.out.println(1/0);
    return "success";
  }
  
  @Autowired
  private Rm1Interface rm1Interface;
  
  @GetMapping("/method1-tcc")
  @GlobalTransactional(rollbackFor = Exception.class)
  public String method1Tcc() throws InterruptedException {
    rm1Interface.rm1(null);
    return "success";
  }
  
  @GetMapping("/method1-local")
  @GlobalTransactional(rollbackFor = Exception.class)
  public String method1Local() throws InterruptedException {
    rm1Service.rm1Insert();
    System.out.println(1/0);
    return "success";
  }
}
