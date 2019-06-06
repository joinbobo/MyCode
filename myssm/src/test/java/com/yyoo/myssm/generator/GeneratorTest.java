package com.yyoo.myssm.generator;

import com.yyoo.mybatis.generator.GeneratorUtil;
import org.junit.Test;

public class GeneratorTest {

    @Test
    public void fn(){
        GeneratorUtil.generator("test.xml");
    }
}
