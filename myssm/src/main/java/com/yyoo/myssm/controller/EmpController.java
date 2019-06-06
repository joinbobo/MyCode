package com.yyoo.myssm.controller;

import com.yyoo.controller.bean.MyResponse;
import com.yyoo.myssm.beans.auto.EmpBean;
import com.yyoo.myssm.param.QueryEmpById;
import com.yyoo.myssm.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/emp")
public class EmpController {

//    @RequestMapping("/queryEmpBean")
//    public EmpBean queryEmpBean(@RequestBody QueryEmpId queryEmpById){
////        System.out.println(queryEmpById);
//        return empService.getBeanById(queryEmpById.getId());
//    }
    @Autowired
    private EmpService empService;

    @RequestMapping("/queryEmpBean")
    public MyResponse<EmpBean> queryEmpBean(@RequestBody QueryEmpById queryEmpById){
        EmpBean empBean = empService.getBeanById(queryEmpById.getId());
        return MyResponse.success("查询成功",empBean);

    }

    @RequestMapping("/insert")
    public MyResponse insert(@RequestBody EmpBean empBean){
        empService.insert(empBean);
        return MyResponse.success("添加成功");
    }

    @RequestMapping("/delete")
    public MyResponse delete(@RequestBody QueryEmpById queryEmpById){
        EmpBean empBean = empService.getBeanById(queryEmpById.getId());
        return MyResponse.success("删除成功");
    }
}
