package org.mindaugas.gradle01;


import org.springframework.stereotype.Component;

import java.util.concurrent.ThreadLocalRandom;

@Component("one")
public class BeanOne {

    private static final String[] messages = new String[]
                    {"Go away, it's a bad day",
                    "Yes, I like it too",
                    "No, that's not gonna work",
                    "Really? I didn't know it", "Mindaugas"};

    private String[] myMessages;

    public BeanOne() {
        this.myMessages = messages;
    }

    public BeanOne(String[] msgChoices) {
        this.myMessages = messages;
        this.myMessages = msgChoices;
    }

    public String offerMessage() {
        return this.myMessages[ThreadLocalRandom.current().nextInt(0, this.myMessages.length)];
    }

}
