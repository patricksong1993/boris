package com.blackrock.boris.controllers;

import java.util.List;

import org.apache.log4j.Logger;
import org.jboss.logging.annotations.ValidIdRange;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import com.blackrock.boris.dto.Technology;
import com.blackrock.boris.exceptions.BorisInternalException;
import com.blackrock.boris.services.TechnologyService;

@Controller
public class TechnologyController {

    private static final Logger logger = Logger.getLogger(TechnologyController.class);
    private TechnologyService technologyService;

    @RequestMapping(value = "/technologies/trending", method = RequestMethod.GET)
    @ResponseBody
    public List<Technology> getTopTechnologies() throws BorisInternalException {
        return technologyService.getTrendingTechnologies();
    }

    @RequestMapping(value = "/technologies", method = RequestMethod.GET)
    @ResponseBody
    public List<Technology> getTechnologies() throws BorisInternalException {
        return technologyService.getTechnologies();
    }

    @RequestMapping(value = "/technologies/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Technology getTechnology(@PathVariable("id") String id) throws BorisInternalException {
        return technologyService.getTechnology(id);
    }

    @RequestMapping(value = "/technologies", method = RequestMethod.POST)
    @ResponseBody
    public Technology postTechnology(@RequestBody Technology technology) throws BorisInternalException {
        technologyService.postTechnology(technology);

        return technology;
    }

    public void setTechnologyService(TechnologyService technologyService) {
        this.technologyService = technologyService;
    }
}

