#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.domain;

import ${package}.bean.TestBean;
import ${package}.dao.master.TestMasterDAO;
import ${package}.dao.slave.TestSlaveDAO;
import ${package}.domain.TestDomain;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by jiangli on 16/8/6.
 */
@Service
public class TestRepository {


    @Autowired
    TestMasterDAO testMasterDAO;
    @Autowired
    TestSlaveDAO testSlaveDAO;

    public TestDomain createTestDomain(){
        return new TestDomain(this);
    }

    protected  int addOne(TestBean bean ){
        return testMasterDAO.addOne(bean);
    }


}
