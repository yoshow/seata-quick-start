package com.x3platform.transactions.app2.program.services;

import io.seata.rm.tcc.api.BusinessActionContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.client.RestTemplate;

@Component
public class Rm2InterfaceImpl implements Rm2Interface {

    @Override
    @Transactional
    public String rm2(BusinessActionContext businessActionContext) {
        System.out.println("rm2 try");
//        System.out.println(1/0);

        return null;
    }

    @Override
    @Transactional
    public boolean rm1Commit(BusinessActionContext businessActionContext) {
        System.out.println("rm2 confirm");
        return true;
    }

    @Override
    @Transactional
    public boolean rm1Rollback(BusinessActionContext businessActionContext) {
        System.out.println("rm2 rollback");
        return true;
    }


    @Autowired
    private RestTemplate restTemplate;

    private void rm2() {
        restTemplate.getForEntity("http://two/rm2-tcc", null);
    }

    private void rm3() {
        restTemplate.getForEntity("http://three/rm3-tcc", null);
    }
}
