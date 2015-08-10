package com.blackrock.boris.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.blackrock.boris.dto.Technology;
import com.blackrock.boris.exceptions.BorisInternalException;
import com.blackrock.boris.services.TechnologyService;

@Controller
public class TechnologyController {

    private TechnologyService technologyService;
    
	@RequestMapping(value = "/technology/{id}", method = RequestMethod.GET)
	public ModelAndView technologyPage(@PathVariable("id") String id) throws BorisInternalException {
		ModelAndView modelAndView = new ModelAndView("techPage");
		Technology technology = technologyService.getTechnology(id);
		modelAndView.addObject("technology", technology);
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
    public Technology postTechnology(@RequestBody Technology technology) throws BorisInternalException {
        technologyService.postTechnology(technology);

        return technology;
    }

    public void setTechnologyService(TechnologyService technologyService) {
        this.technologyService = technologyService;
    }
}

