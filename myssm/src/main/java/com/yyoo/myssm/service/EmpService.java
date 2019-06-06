package com.yyoo.myssm.service;

import com.yyoo.myssm.beans.auto.EmpBean;

public interface EmpService {

    /**
     *  通过id查询唯一的Emp对象
     * @param id
     * @return
     */
    EmpBean getBeanById(Long id);

    void insert(EmpBean empBean);

    void delete(Long id);
}
