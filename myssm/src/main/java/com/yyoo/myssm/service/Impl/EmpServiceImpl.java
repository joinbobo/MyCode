package com.yyoo.myssm.service.Impl;

import com.yyoo.myssm.beans.auto.EmpBean;
import com.yyoo.myssm.mapper.auto.EmpBeanMapper;
import com.yyoo.myssm.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class EmpServiceImpl implements EmpService {

    @Autowired
    private EmpBeanMapper empBeanMapper;

    @Override
    public EmpBean getBeanById(Long id) {
        return empBeanMapper.selectByPrimaryKey(id);
    }

    @Override
    @Transactional //事务控制（它还有参数）
    /**
     * 参数包含两个部分：
     *      事务的传播特性
     *      事务的隔离级别
     *
     *      在一个事务内，要么都成功，要么都失败
     */
    public void insert(EmpBean empBean) {
        empBeanMapper.insertSelective(empBean);

//        if(true){
//            throw new RuntimeException("添加失败");
//        }
    }



    // 总结：所有的对数据库进行修改的操作方法上都要添加@Transactional注解

    @Override
    @Transactional
    public void delete(Long id) {
        empBeanMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void update(EmpBean empbean) {
        empBeanMapper.updateByPrimaryKey(empbean);
    }


}
