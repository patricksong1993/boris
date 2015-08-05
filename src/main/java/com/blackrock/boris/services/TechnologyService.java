package com.blackrock.boris.services;

import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.List;

import com.blackrock.boris.dao.TechnologyDao;
import com.blackrock.boris.dto.Event;
import com.blackrock.boris.dto.Technology;
import com.blackrock.boris.exceptions.BorisInternalException;

public class TechnologyService {

	TechnologyDao technologyDao;

	public List<Technology> getTrendingTechnologies()
			throws BorisInternalException {
		List<Technology> trendingTech = technologyDao.getTrendingTechnologies();

		return trendingTech;
	}

	public List<Technology> getTechnologies() throws BorisInternalException {
		List<Technology> technologies = technologyDao.getTechnologies();

		return technologies;
	}

	public Technology getTechnologyForName(String technologyName)
			throws BorisInternalException {
		Technology technology = technologyDao
				.getTechnologyForName(technologyName);

		return technology;
	}

	public Technology getTechnology(String id) throws BorisInternalException {
		Technology technology = technologyDao.getTechnology(Long.parseLong(id));

		List<Event> techEvents = technology.getEventsForTechnology();

		for (Event event : techEvents) {
			SimpleDateFormat dateFormatter = new SimpleDateFormat(
					"dd-M-yyyy hh:mm:ss");
			event.setReadableDate(dateFormatter.format(event.getDate()));
		}

		return technology;
	}

	public void setTechnologyDao(TechnologyDao technologyDao) {
		this.technologyDao = technologyDao;
	}

	public void postTechnology(String title, String description)
			throws BorisInternalException {
		Technology technology = new Technology();
		technology.setTitle(title);
		technology.setDescription(description);

		technologyDao.addTechnology(technology);
	}

	public void postTechnology(Technology technology)
			throws BorisInternalException {
		technologyDao.addTechnology(technology);
	}
}
