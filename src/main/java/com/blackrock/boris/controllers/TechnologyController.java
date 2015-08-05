package com.blackrock.boris.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.blackrock.boris.dto.Technology;
import com.blackrock.boris.exceptions.BorisInternalException;
import com.blackrock.boris.services.TechnologyService;

@Controller
public class TechnologyController {

    private TechnologyService technologyService;

    @RequestMapping(value = "/technologies/trending", method = RequestMethod.GET)
    @ResponseBody
    public List<Technology> getTopTechnologies() throws BorisInternalException {
        List<Technology> trendingTechnologies = technologyService.getTrendingTechnologies();

        return trendingTechnologies;
    }

    @RequestMapping(value = "/technologies", method = RequestMethod.GET)
    public Technology getTechnologies() throws BorisInternalException {
        return null;
    }

    public void setTechnologyService(TechnologyService technologyService) {
        this.technologyService = technologyService;
    }
}

