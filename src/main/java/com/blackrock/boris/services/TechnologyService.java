package com.blackrock.boris.services;

import java.util.List;

import com.blackrock.boris.dao.TechnologyDao;
import com.blackrock.boris.dto.Technology;
import com.blackrock.boris.exceptions.BorisInternalException;

public class TechnologyService {

    TechnologyDao technologyDao;

    public List<Technology> getTrendingTechnologies() throws BorisInternalException {
        List<Technology> trendingTech = technologyDao.getTrendingTechnologies();
        return trendingTech;
    }

    public List<Technology> getTechnologies() throws BorisInternalException {
        List<Technology> technologies = technologyDao.getTechnologies();

        return technologies;
    }

    public Technology getTechnologyForName(String technologyName) throws BorisInternalException {
        Technology technology = technologyDao.getTechnologyForName(technologyName);

        return technology;
    }

    public Technology getTechnology(String id) throws BorisInternalException {
        return technologyDao.getTechnology(Long.parseLong(id));
    }

    public void setTechnologyDao(TechnologyDao technologyDao) {
        this.technologyDao = technologyDao;
    }

    public void postTechnology(String title, String description) throws BorisInternalException {
        Technology technology = new Technology();
        technology.setTitle(title);
        technology.setDescription(description);

        technologyDao.addTechnology(technology);
    }

    public void postTechnology(Technology technology) throws BorisInternalException {
        technologyDao.addTechnology(technology);
    }
}
