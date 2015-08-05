package com.blackrock.boris.utilities;

public enum NotificationTemplateType {
    ARTICLE(1),
    TEAM(11),
    EVENT(21);

    private int id;

    NotificationTemplateType(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
}
