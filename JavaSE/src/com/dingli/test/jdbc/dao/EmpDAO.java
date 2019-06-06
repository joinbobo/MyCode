package com.dingli.test.jdbc.dao;

import com.dingli.test.jdbc.Emp;

import java.util.List;

public interface EmpDAO {

    int insert(Emp emp);

    /**
     * 批量添加Emp数据
     * 提示：用到PreparedStatement的 addBech 方法
     * 批量操作
     * @param list
     * @return
     */
    int[] insert(List<Emp> list);

    int update(Emp emp);

    int delete(long empno);

    // 不带条件（查询所有）
    List<Emp> query();


}
