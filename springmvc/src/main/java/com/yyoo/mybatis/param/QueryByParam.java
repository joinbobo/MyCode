package com.yyoo.mybatis.param;

public class QueryByParam {
    private String ename;
    private Double begin;
    private Double end;

    public QueryByParam() {
    }

    public QueryByParam(String ename, Double begin, Double end) {
        this.ename = ename;
        this.begin = begin;
        this.end = end;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public Double getBegin() {
        return begin;
    }

    public void setBegin(Double begin) {
        this.begin = begin;
    }

    public Double getEnd() {
        return end;
    }

    public void setEnd(Double end) {
        this.end = end;
    }

    @Override
    public String toString() {
        return "QueryByParam{" +
                "ename='" + ename + '\'' +
                ", begin=" + begin +
                ", end=" + end +
                '}';
    }
}
