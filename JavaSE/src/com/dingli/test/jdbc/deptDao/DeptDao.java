package com.dingli.test.jdbc.deptDao;


import java.util.List;

public interface DeptDao {
    int insert(Dept dept);

    /**
     * 批量添加Emp数据
     * 提示：用到PreparedStatement的 addBech 方法
     * 批量操作
     * @param list
     * @return
     */
    int[] insert(List<Dept> list);

    int update(Dept dept);

    int delete(int deptno);

    // 不带条件（查询所有）
    List<Dept> query();
}
