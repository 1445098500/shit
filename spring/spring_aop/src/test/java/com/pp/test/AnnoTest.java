package com.pp.test;

import com.pp.anno.Config;
import com.pp.anno.Target;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration("classpath:applicationContext-anno.xml")
@ContextConfiguration(classes = {Config.class})
public class AnnoTest {

    @Autowired
    private Target target;

    @Test
    public void test1(){
        target.save();
    }
}
