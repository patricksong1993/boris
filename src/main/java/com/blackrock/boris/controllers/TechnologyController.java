package com.blackrock.boris.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.blackrock.boris.dto.Technology;
import com.blackrock.boris.exceptions.BorisInternalException;
import com.blackrock.boris.services.TechnologyService;

@Controller
public class TechnologyController {

    private TechnologyService technologyService;

    @RequestMapping(value = "/toptechnologies", method = RequestMethod.GET)
    @ResponseBody
    public List<Technology> getTopTechnologies() throws BorisInternalException {
        List<Technology> trendingTechnologies = technologyService.getTrendingTechnologies();

        return trendingTechnologies;
    }

    @RequestMapping(value = "/tech/forName", method = RequestMethod.GET)
    public Technology getTechnologyForName(@PathVariable("technologyName") String technologyName) throws BorisInternalException {
        Technology technology = technologyService.getTechnologyForName(technologyName);

        return technology;
    }

    public void setTechnologyService(TechnologyService technologyService) {
        this.technologyService = technologyService;
    }
}

