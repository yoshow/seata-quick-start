package com.x3platform.transactions.app1.program.services;

import io.seata.rm.tcc.api.BusinessActionContext;
import io.seata.rm.tcc.api.LocalTCC;
import io.seata.rm.tcc.api.TwoPhaseBusinessAction;

@LocalTCC
public interface Rm1Interface {

    @TwoPhaseBusinessAction(name = "rm1TccAction" , commitMethod = "rm1Commit" ,rollbackMethod = "rm1Rollback")
    public String rm1(BusinessActionContext businessActionContext);

    public boolean rm1Commit(BusinessActionContext businessActionContext);

    public boolean rm1Rollback(BusinessActionContext businessActionContext);
}
