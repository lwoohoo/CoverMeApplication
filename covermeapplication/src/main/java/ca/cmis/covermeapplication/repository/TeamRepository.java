package ca.cmis.covermeapplication.repository;

import org.springframework.data.repository.CrudRepository;

import ca.cmis.covermeapplication.model.Team;

public interface TeamRepository extends CrudRepository<Team, Integer>{
    
    //pk
    Team findTeamByTeamID(int teamID);
}
