package com.blackrock.boris.controllers;

import java.nio.charset.StandardCharsets;
import java.util.List;

import org.apache.log4j.Logger;
import org.jboss.logging.annotations.ValidIdRange;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import com.blackrock.boris.dto.Technology;
import com.blackrock.boris.exceptions.BorisInternalException;
import com.blackrock.boris.services.TechnologyService;

@Controller
public class TechnologyController {

    private static final Logger logger = Logger.getLogger(TechnologyController.class);
    private TechnologyService technologyService;
    
	@RequestMapping(value = "/technology/{id}", method = RequestMethod.GET)
	public ModelAndView technologyPage(@PathVariable("id") String id) throws BorisInternalException {
		ModelAndView modelAndView = new ModelAndView("techPage");
		Technology technology = technologyService.getTechnology(id);
		modelAndView.addObject("technology", technology);
		modelAndView.addObject("technologyDescr", new String(technology.getDescription(), StandardCharsets.UTF_8));
		return modelAndView;
	}
	
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
    public void postTechnology(@RequestBody Technology technology) throws BorisInternalException {
        technologyService.postTechnology(technology);
    }

    public void setTechnologyService(TechnologyService technologyService) {
        this.technologyService = technologyService;
    }
}

