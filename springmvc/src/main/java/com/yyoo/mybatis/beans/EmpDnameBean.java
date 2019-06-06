package com.yyoo.mybatis.beans;

public class EmpDnameBean {
    private long empno;
    private String ename;
    private long deptno;
    private String dname;

    public EmpDnameBean() {
    }

    public EmpDnameBean(long empno, String ename, long deptno, String dname) {
        this.empno = empno;
        this.ename = ename;
        this.deptno = deptno;
        this.dname = dname;
    }

    public long getEmpno() {
        return empno;
    }

    public void setEmpno(long empno) {
        this.empno = empno;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public long getDeptno() {
        return deptno;
    }

    public void setDeptno(long deptno) {
        this.deptno = deptno;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    @Override
    public String toString() {
        return "EmpDnameBean{" +
                "empno=" + empno +
                ", ename='" + ename + '\'' +
                ", deptno=" + deptno +
                ", dname='" + dname + '\'' +
                '}';
    }
}
