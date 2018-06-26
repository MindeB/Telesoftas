package org.mindaugas.gradle01;


import org.mindaugas.gradle01.data.Citation;
import org.mindaugas.gradle01.data.CitationRepo;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;

@Component("dbBased")
@Configuration
public class BeanThree {

    @Resource
    private CitationRepo repo;

    public BeanThree() {

    }

    public String offerMessage() {
        Citation c = (Citation)this.repo.findOne(1L);
        return c.getMessage();
    }

    @PostConstruct
    public void saveSomeMessages() {
        Citation c= new Citation("Test our write");
        c = (Citation)this.repo.save(c);
        System.out.println("Saving of citation succeeded? " + c.toString());
        Citation cit2 = (Citation)this.repo.findOne(1L);
        System.out.println("what is read from db:" + cit2.toString());
        System.out.println("How many recs in db?" + this.repo.count());
    }


}
