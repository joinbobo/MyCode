package com.yyoo.mybatis.mapper;

import com.yyoo.mybatis.beans.EmpBean;
import com.yyoo.mybatis.beans.EmpDnameBean;
import com.yyoo.mybatis.param.QueryByParam;

import java.util.List;
import java.util.Map;

//TestMapper的全类名，与对应的mapper.xml文件的namespace对应
public interface EmpMapper {

    // 方法名称与xml映射文件中的id属性对应，有没有参数也与xml配置有关
    List<EmpBean> queryAll();

    List<EmpBean> queryByParam(Map<String,Object> whereMap);

    List<EmpBean> queryByParamBean(QueryByParam queryByPraram);

    List<EmpDnameBean> queryDname();
}
