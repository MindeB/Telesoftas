package org.mindaugas.gradle01.data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Citation {
    @Id
    @GeneratedValue
    private Long id;
    private String message;

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    private Citation() {
    }

    public Citation(String message) {
        this.message = message;
    }

    public String toString() {
        return "Citation{id=" + this.id + ", message='" + this.message + '\'' + '}';
    }
}