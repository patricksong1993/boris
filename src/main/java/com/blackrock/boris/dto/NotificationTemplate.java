package com.blackrock.boris.dto;

import javax.persistence.*;

@Entity
@Table(name = "notification_templates")
public class NotificationTemplate {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;

    @Column(name = "template")
    private String template;

    public NotificationTemplate() {
        // empty constructor
    }

    public NotificationTemplate(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTemplate() {
        return template;
    }

    public void setTemplate(String template) {
        this.template = template;
    }
}
