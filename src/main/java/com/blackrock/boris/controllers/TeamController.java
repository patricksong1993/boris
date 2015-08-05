package com.blackrock.boris.controllers;

import com.blackrock.boris.dto.Team;
import com.blackrock.boris.exceptions.BorisInternalException;
import com.blackrock.boris.services.TeamService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class TeamController {

    private TeamService teamService;

    public void setTeamService(TeamService teamService) {
        this.teamService = teamService;
    }

    @RequestMapping(value = "/teams", method = RequestMethod.GET)
    @ResponseBody
    public List<Team> getTeams() throws BorisInternalException {
        return teamService.getTeams();
    }
}
