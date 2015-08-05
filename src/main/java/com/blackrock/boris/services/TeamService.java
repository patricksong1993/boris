package com.blackrock.boris.services;

import com.blackrock.boris.dao.TeamDao;
import com.blackrock.boris.dto.Team;
import com.blackrock.boris.exceptions.BorisInternalException;

import java.util.List;

public class TeamService {

    private TeamDao teamDao;

    public void setTeamDao(TeamDao teamDao) {
        this.teamDao = teamDao;
    }

    public List<Team> getTeams() throws BorisInternalException {
        return teamDao.getTeams();
    }
}
