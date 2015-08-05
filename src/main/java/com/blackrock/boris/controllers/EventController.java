package com.blackrock.boris.controllers;

import com.blackrock.boris.dto.Event;
import com.blackrock.boris.exceptions.BorisInternalException;
import com.blackrock.boris.services.EventService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class EventController {

    private EventService eventService;

    public void setEventService(EventService eventService) {
        this.eventService = eventService;
    }

    @RequestMapping(value = "/events", method = RequestMethod.POST)
    @ResponseBody
    public void postEvent(@RequestBody Event event) throws BorisInternalException {
        eventService.postEvent(event);
    }
}
