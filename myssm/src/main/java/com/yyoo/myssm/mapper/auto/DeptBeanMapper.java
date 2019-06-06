package com.yyoo.myssm.mapper.auto;

import com.yyoo.myssm.beans.auto.DeptBean;

public interface DeptBeanMapper {
    /**
     *
     * @mbg.generated 2019-05-13
     */
    int deleteByPrimaryKey(Long deptno);

    /**
     *
     * @mbg.generated 2019-05-13
     */
    int insert(DeptBean record);

    /**
     *
     * @mbg.generated 2019-05-13
     */
    int insertSelective(DeptBean record);

    /**
     *
     * @mbg.generated 2019-05-13
     */
    DeptBean selectByPrimaryKey(Long deptno);

    /**
     *
     * @mbg.generated 2019-05-13
     */
    int updateByPrimaryKeySelective(DeptBean record);

    /**
     *
     * @mbg.generated 2019-05-13
     */
    int updateByPrimaryKey(DeptBean record);
}