package com.yyoo.myssm.param;

public class QueryEmpById {

    private Long id;

    public QueryEmpById() {
    }

    public QueryEmpById(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "QueryEmpById{" +
                "id=" + id +
                '}';
    }
}
