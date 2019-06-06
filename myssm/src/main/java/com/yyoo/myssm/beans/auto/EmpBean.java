package com.yyoo.myssm.beans.auto;

import java.io.Serializable;
import java.util.Date;

public class EmpBean implements Serializable {
    /**
     * 员工编号
     */
    private Long empno;

    /**
     * 员工姓名
     */
    private String ename;

    /**
     * 岗位名称
     */
    private String job;

    /**
     * 直接上级编号
     */
    private Long mgr;

    /**
     * 入职日期
     */
    private Date hiredate;

    /**
     * 工资
     */
    private Double sal;

    /**
     * 奖金
     */
    private Double comm;

    /**
     * 部门编号
     */
    private Long deptno;

    /**
     * ruanjian..emp
     */
    private static final long serialVersionUID = 1L;

    /**
     * 员工编号
     * @return empno 员工编号
     */
    public Long getEmpno() {
        return empno;
    }

    /**
     * 员工编号
     * @param empno 员工编号
     */
    public void setEmpno(Long empno) {
        this.empno = empno;
    }

    /**
     * 员工姓名
     * @return ename 员工姓名
     */
    public String getEname() {
        return ename;
    }

    /**
     * 员工姓名
     * @param ename 员工姓名
     */
    public void setEname(String ename) {
        this.ename = ename == null ? null : ename.trim();
    }

    /**
     * 岗位名称
     * @return job 岗位名称
     */
    public String getJob() {
        return job;
    }

    /**
     * 岗位名称
     * @param job 岗位名称
     */
    public void setJob(String job) {
        this.job = job == null ? null : job.trim();
    }

    /**
     * 直接上级编号
     * @return mgr 直接上级编号
     */
    public Long getMgr() {
        return mgr;
    }

    /**
     * 直接上级编号
     * @param mgr 直接上级编号
     */
    public void setMgr(Long mgr) {
        this.mgr = mgr;
    }

    /**
     * 入职日期
     * @return hiredate 入职日期
     */
    public Date getHiredate() {
        return hiredate;
    }

    /**
     * 入职日期
     * @param hiredate 入职日期
     */
    public void setHiredate(Date hiredate) {
        this.hiredate = hiredate;
    }

    /**
     * 工资
     * @return sal 工资
     */
    public Double getSal() {
        return sal;
    }

    /**
     * 工资
     * @param sal 工资
     */
    public void setSal(Double sal) {
        this.sal = sal;
    }

    /**
     * 奖金
     * @return comm 奖金
     */
    public Double getComm() {
        return comm;
    }

    /**
     * 奖金
     * @param comm 奖金
     */
    public void setComm(Double comm) {
        this.comm = comm;
    }

    /**
     * 部门编号
     * @return deptno 部门编号
     */
    public Long getDeptno() {
        return deptno;
    }

    /**
     * 部门编号
     * @param deptno 部门编号
     */
    public void setDeptno(Long deptno) {
        this.deptno = deptno;
    }

    /**
     *
     * @mbg.generated 2019-05-13
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", empno=").append(empno);
        sb.append(", ename=").append(ename);
        sb.append(", job=").append(job);
        sb.append(", mgr=").append(mgr);
        sb.append(", hiredate=").append(hiredate);
        sb.append(", sal=").append(sal);
        sb.append(", comm=").append(comm);
        sb.append(", deptno=").append(deptno);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}