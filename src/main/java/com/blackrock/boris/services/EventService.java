package com.blackrock.boris.services;

import com.blackrock.boris.dao.EventDao;
import com.blackrock.boris.dto.Event;
import com.blackrock.boris.exceptions.BorisInternalException;

public class EventService {

    private EventDao eventDao;

    public void setEventDao(EventDao eventDao) {
        this.eventDao = eventDao;
    }

    public void postEvent(Event event) throws BorisInternalException {
        eventDao.postEvent(event);
    }
}
