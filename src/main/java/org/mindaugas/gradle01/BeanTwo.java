package org.mindaugas.gradle01;


import org.mindaugas.gradle01.dto.CitationDto;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class BeanTwo {

    // git comment
    @Resource(name = "optimist")
    private BeanOne messageBean;

    @Resource(name = "pessimist")
    private BeanOne pessimistBean;
    @Resource(name = "dbBased")
    private BeanThree dbBean;


    public BeanTwo() {
    }

    @RequestMapping(path = {"v2/hello"})
    public String hello2() {
        return this.messageBean.offerMessage();
    }

    @RequestMapping(path = {"v1/hello"})
    public CitationDto hello1() {
        CitationDto result = new CitationDto();
        result.message = this.messageBean.offerMessage();
        return result;
    }

    @RequestMapping(path = {"v3/hello"})
    public String hello3() {
        return this.dbBean.offerMessage();
    }


}
