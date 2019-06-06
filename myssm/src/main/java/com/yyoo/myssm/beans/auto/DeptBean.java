package com.yyoo.myssm.beans.auto;

import java.io.Serializable;

public class DeptBean implements Serializable {
    /**
     * 部门编号
     */
    private Long deptno;

    /**
     * 部门名称
     */
    private String dname;

    /**
     * 部门地址
     */
    private String loc;

    /**
     * ruanjian..dept
     */
    private static final long serialVersionUID = 1L;

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
     * 部门名称
     * @return dname 部门名称
     */
    public String getDname() {
        return dname;
    }

    /**
     * 部门名称
     * @param dname 部门名称
     */
    public void setDname(String dname) {
        this.dname = dname == null ? null : dname.trim();
    }

    /**
     * 部门地址
     * @return loc 部门地址
     */
    public String getLoc() {
        return loc;
    }

    /**
     * 部门地址
     * @param loc 部门地址
     */
    public void setLoc(String loc) {
        this.loc = loc == null ? null : loc.trim();
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
        sb.append(", deptno=").append(deptno);
        sb.append(", dname=").append(dname);
        sb.append(", loc=").append(loc);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}