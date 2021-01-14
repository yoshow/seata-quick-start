package com.x3platform.transactions.app1.program.services;

import com.x3platform.transactions.app1.program.mappers.Tbl1Mapper;
import com.x3platform.transactions.app1.program.models.Tbl1;
import io.seata.rm.tcc.api.TwoPhaseBusinessAction;
import io.seata.spring.annotation.GlobalTransactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 *
 */
@Service
public class Rm1Service {
  
  @Autowired
  Tbl1Mapper mapper;
  
  
  public String rm1() {
    Tbl1 entity = new Tbl1();
    entity.setId(1);
    entity.setName("rm1");
    mapper.insertSelective(entity);
    
    rm2();
    rm3();
    
    return "";
  }
  
  public int rm1Insert() {
    rm1Insert1();
    rm1Insert2();
    return 0;
  }
  
  public int rm1Insert1() {
    Tbl1 entity = new Tbl1();
    entity.setName("rm1-insert-1");
    mapper.insertSelective(entity);
    
    return 0;
  }
  
  public int rm1Insert2() {
    Tbl1 entity = new Tbl1();
    entity.setName("rm1-insert-2");
    mapper.insertSelective(entity);
    
    return 0;
  }
  
  public String rm2Update() {
    rm2UpdateRemote();
    
    Tbl1 o = new Tbl1();
    o.setId(2);
    o.setName("rm2");
    mapper.insertSelective(o);
    // int i = 1/0;
    return "";
  }
  
  @Autowired
  private RestTemplate restTemplate;
  
  private void rm2() {
    restTemplate.getForEntity("http://x3platform-app2-program/trans/service2/rm2", null);
  }
  
  private void rm2UpdateRemote() {
    restTemplate.getForEntity("http://x3platform-app2-program/trans/service2/rm2-update", null);
  }
  
  private void rm3() {
    restTemplate.getForEntity("http://x3platform-app3-program/trans/service3/rm3", null);
  }
}
