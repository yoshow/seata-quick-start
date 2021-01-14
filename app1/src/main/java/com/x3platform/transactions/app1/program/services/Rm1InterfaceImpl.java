package com.x3platform.transactions.app1.program.services;

import io.seata.rm.tcc.api.BusinessActionContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.client.RestTemplate;

@Component
public class Rm1InterfaceImpl implements Rm1Interface {
  
  @Override
  @Transactional
  public String rm1(BusinessActionContext businessActionContext) {
    // 查询是事务记录表，xxxx
    System.out.println("rm1 try");
    
    rm2();
    rm3();
    // System.out.println(1/0);
    return null;
  }
  
  @Override
  @Transactional
  public boolean rm1Commit(BusinessActionContext businessActionContext) {
    System.out.println("rm1 confirm");
    return true;
  }
  
  @Override
  @Transactional
  public boolean rm1Rollback(BusinessActionContext businessActionContext) {
    System.out.println("rm1 rollback");
    return true;
  }
  
  @Autowired
  private RestTemplate restTemplate;
  
  private void rm2() {
    restTemplate.getForEntity("http://x3platform-app2-program/trans/service2/rm2-tcc", null);
  }
  
  private void rm3() {
    restTemplate.getForEntity("http://x3platform-app3-program/trans/service3/rm3-tcc", null);
  }
}
