package org.mindaugas.gradle01;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MessageConfig {

    public MessageConfig() {
    }

    @Bean(name = {"optimist"})
    public BeanOne configureOptimist() {
        return new BeanOne(new String[]{"The sun is shining, so it's a cool day to learn Spring!", "Yeah, I like you too", "Hard in training? Easy in battle"});
    }

    @Bean(name = {"pessimist"})
    public BeanOne configurePessimist() {
        return new BeanOne(new String[]{"Go away. I'm tired", "Mondays are not easy. Go get some rest", "Who's calling? I'm not in a mood to pick up the call today"});
    }
}