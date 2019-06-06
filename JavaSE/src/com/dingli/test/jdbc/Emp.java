package com.dingli.test.jdbc;

import java.util.Date;


/**
 *  在类体中需要定义的东西
 *     必须：
 *          1.成员变量（对数据库中的表的字段）
 *          2.构造函数（一定要有无参构造）
 *          3.set get方法
 *     非须：
 *          4.hashCode equals 方法 在需要比较两个对象是否相等的时候需要
 *          5.toString 方法 需要打印出内容的情况下
 *
 *     非必须：
 *          可序列化（实现可序列化接口）
 *          可比较（实现Compareable）
 *
 * 注意：成员变量对应表的字段
 * 数据库字段的命名规则为：多个单词之间用“_”隔开，不分区大小写
 * Java中成员变量命名规则为：多个单词之间按首字母大写来区分
 * 如：
 *      数据库：s_name
 *      成员变量：sName
 */
public class Emp {
    private int empno;
    private String ename;
    private String job;
    private int mgr;
    private Date hiredate;
    private double sal;
    private double comm;
    private int deptno;

    public Emp(int empno, String ename, String job, int mgr, Date hiredate, double sal, double comm, int deptno) {
        this.empno = empno;
        this.ename = ename;
        this.job = job;
        this.mgr = mgr;
        this.hiredate = hiredate;
        this.sal = sal;
        this.comm = comm;
        this.deptno = deptno;
    }

    public Emp() {
    }

    public int getMgr() {
        return mgr;
    }

    public void setMgr(int mgr) {
        this.mgr = mgr;
    }

    public int getEmpno() {
        return empno;
    }

    public void setEmpno(int empno) {
        this.empno = empno;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public Date getHiredate() {
        return hiredate;
    }

    public void setHiredate(Date hiredate) {
        this.hiredate = hiredate;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    public double getComm() {
        return comm;
    }

    public void setComm(double comm) {
        this.comm = comm;
    }

    public int getDeptno() {
        return deptno;
    }

    public void setDeptno(int deptno) {
        this.deptno = deptno;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "empno=" + empno +
                ", ename='" + ename + '\'' +
                ", job='" + job + '\'' +
                ", hiredate=" + hiredate +
                ", sal=" + sal +
                ", comm=" + comm +
                ", deptno=" + deptno +
                '}';
    }
}
