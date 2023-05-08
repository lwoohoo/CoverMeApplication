package ca.cmis.covermeapplication.Repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import ca.cmis.covermeapplication.model.Role;
import ca.cmis.covermeapplication.model.Team;
import ca.cmis.covermeapplication.repository.RoleRepository;
import ca.cmis.covermeapplication.repository.TeamRepository;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


@SpringBootTest
public class RoleRepoTests {

    @Autowired
    RoleRepository roleRepository;

    @Autowired
    TeamRepository teamRepository;

    @BeforeEach
    @AfterEach
    public void clear() {
        roleRepository.deleteAll();
        teamRepository.deleteAll();
    }

    @Test
    public void testFindRoleByID() {

       Team team = new Team("Bell Aliant Centre");
       team = teamRepository.save(team);

       Role role = new Role("Lifeguard");
       role.setTeam(team);
       role = roleRepository.save(role);

       int roleID = role.getRoleID();

       role = roleRepository.findRoleByRoleID(roleID);

       assertNotNull(role);
       assertEquals("Lifeguard", role.getName());
       assertEquals(team.getTeamID(), role.getTeam().getTeamID());
    }

    @Test
    public void testFindRoleByName() {
        Team team = new Team("Charlottetown Airport");
        team = teamRepository.save(team);

        Role role = new Role("Experience Coordinator");
        role.setTeam(team);
        role = roleRepository.save(role);

        role = roleRepository.findRoleByName("Experience Coordinator");
       
        assertNotNull(role);
        assertEquals("Experience Coordinator", role.getName());
        assertEquals(team.getTeamID(), role.getTeam().getTeamID());
    }

    

}
