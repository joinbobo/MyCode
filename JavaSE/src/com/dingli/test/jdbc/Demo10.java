package com.dingli.test.jdbc;

import com.dingli.test.jdbc.dao.EmpDAO;
import com.dingli.test.jdbc.dao.EmpDAOImpl;

import java.util.Date;
import java.util.List;

public class Demo10{


    public static void main(String[] args) {

        EmpDAO dao = new EmpDAOImpl();

        Emp emp = new Emp();
        emp.setEmpno(9999);
        emp.setEname("张鹏");
        emp.setJob("学生");
        emp.setMgr(8888);
        emp.setHiredate(new Date());
        emp.setSal(2000);
        emp.setComm(2000);
        emp.setDeptno(30);
        dao.update(emp);

        List<Emp> list = dao.query();
        System.out.println(list);

    }

}
