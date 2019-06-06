package com.yyoo.myssm.mapper.auto;

import com.yyoo.myssm.beans.auto.EmpBean;

public interface EmpBeanMapper {
    /**
     *
     * @mbg.generated 2019-05-13
     */
    int deleteByPrimaryKey(Long empno);

    /**
     *
     * @mbg.generated 2019-05-13
     */
    int insert(EmpBean record);

    /**
     *
     * @mbg.generated 2019-05-13
     */
    int insertSelective(EmpBean record);

    /**
     *
     * @mbg.generated 2019-05-13
     */
    EmpBean selectByPrimaryKey(Long empno);

    /**
     *
     * @mbg.generated 2019-05-13
     */
    int updateByPrimaryKeySelective(EmpBean record);

    /**
     *
     * @mbg.generated 2019-05-13
     */
    int updateByPrimaryKey(EmpBean record);
}