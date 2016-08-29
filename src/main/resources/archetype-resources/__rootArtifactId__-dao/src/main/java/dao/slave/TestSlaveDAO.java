#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.dao.slave;

import ${package}.bean.TestBean;
import org.springframework.stereotype.Repository;

/**
 * Created by jiangli on 16/6/30.
 */
@Repository
public interface TestSlaveDAO {

    public TestBean getOne();
}
