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

    public Technology getTechnologyForName(String technologyName) throws BorisInternalException {
        Technology technology = technologyDao.getTechnologyForName(technologyName);

        return technology;
    }

    public void setTechnologyDao(TechnologyDao technologyDao) {
        this.technologyDao = technologyDao;
    }

}