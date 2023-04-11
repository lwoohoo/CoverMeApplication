package ca.cmis.covermeapplication.Repository;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import ca.cmis.covermeapplication.model.Account;
import ca.cmis.covermeapplication.model.Role;
import ca.cmis.covermeapplication.model.Team;
import ca.cmis.covermeapplication.repository.AccountRepository;
import ca.cmis.covermeapplication.repository.RoleRepository;
import ca.cmis.covermeapplication.repository.TeamRepository;

@SpringBootTest
public class AccountRepoTests {

    @Autowired
    private AccountRepository accountRepository;

    @Autowired
    private RoleRepository roleRepository;

    @Autowired
    private TeamRepository teamRepository;

    @AfterEach
    @BeforeEach
    public void clear() {
        accountRepository.deleteAll();
        roleRepository.deleteAll();
    }

    @Test
    public void testFindAccount() {
        //create account
        String name = "Peter Quinley";
        String email = "Peter@yandex.ru";
        String phoneNumber = "902-310-3030";
        String username = "peteyboy";
        String password = "password123";
        boolean isAdmin = false;

        Account account = new Account(name, email, phoneNumber, username, password, isAdmin);

        account = accountRepository.save(account);

        account = accountRepository.findAccountByAccountID(account.getAccountID());

        assertNotNull(account);
        assertEquals(name, account.getName());
        assertEquals(email, account.getEmail());
        assertEquals(phoneNumber, account.getPhoneNumber());
        assertEquals(username, account.getUsername());
        assertEquals(password, account.getPassword());
        assertEquals(isAdmin, account.getIsAdmin());
    }

    @Test
    public void testFindAccountByName() {
        //create account
        String name = "Peter Quinley";
        String email = "Peter@yandex.ru";
        String phoneNumber = "902-310-3030";
        String username = "peteyboy";
        String password = "password123";
        boolean isAdmin = false;

        Account account = new Account(name, email, phoneNumber, username, password, isAdmin);

        account = accountRepository.save(account);
        
        List<Account> accounts = accountRepository.findAccountByName(account.getName());
    
        account = accounts.get(0); //should return the only object in the db with name peter quinley

        assertNotNull(account);
        assertEquals(name, account.getName());
        assertEquals(email, account.getEmail());
        assertEquals(phoneNumber, account.getPhoneNumber());
        assertEquals(username, account.getUsername());
        assertEquals(password, account.getPassword());
        assertEquals(isAdmin, account.getIsAdmin());

    }

    @Test
    public void testFindAccountByRole() {
        //create account
        String name = "Peter Quinley";
        String email = "Peter@yandex.ru";
        String phoneNumber = "902-310-3030";
        String username = "peteyboy";
        String password = "password123";
        boolean isAdmin = false;

        Account account = new Account(name, email, phoneNumber, username, password, isAdmin); 
    
        //create role
        String roleName = "Cook";
        
        Role role = new Role(roleName);

        role = roleRepository.save(role);

        account.addRole(role);

        account = accountRepository.save(account);

        List<Account> accounts = accountRepository.findAccountByRoles_RoleID(role.getRoleID());
        account = accounts.get(0); //should return the only account in db

        assertNotNull(account);
        assertEquals(role.getName(), account.getRole(0).getName());
        assertEquals(name, account.getName());
        assertEquals(email, account.getEmail());
        assertEquals(phoneNumber, account.getPhoneNumber());
        assertEquals(username, account.getUsername());
        assertEquals(password, account.getPassword());
        assertEquals(isAdmin, account.getIsAdmin());
    }

    @Test
    public void testfindAccountByTeam() {
        //create account
        String name = "Peter Quinley";
        String email = "Peter@yandex.ru";
        String phoneNumber = "902-310-3030";
        String username = "peteyboy";
        String password = "password123";
        boolean isAdmin = false;

        Account account = new Account(name, email, phoneNumber, username, password, isAdmin); 

        //create team
        Team team = new Team("Taco Boyz");

        team = teamRepository.save(team);

        account.setTeam(team);

        account = accountRepository.save(account);

        List<Account> accounts = accountRepository.findAccountByTeam(team);
        account = accounts.get(0);//return only member of team

        assertNotNull(account);
        assertEquals(team.getName(), account.getTeam().getName());
        assertEquals(name, account.getName());
        assertEquals(email, account.getEmail());
        assertEquals(phoneNumber, account.getPhoneNumber());
        assertEquals(username, account.getUsername());
        assertEquals(password, account.getPassword());
        assertEquals(isAdmin, account.getIsAdmin());
    }

}
