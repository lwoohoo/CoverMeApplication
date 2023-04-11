package ca.cmis.covermeapplication.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import ca.cmis.covermeapplication.model.Account;
import ca.cmis.covermeapplication.model.Team;

public interface AccountRepository extends CrudRepository<Account, Integer>{
    
    //pk
    Account findAccountByAccountID(int accountID);
    
    //delete
    void deleteAccountByAccountID(int accountID);
    
    //find all
    List<Account> findAll();

    //find with name
    List<Account> findAccountByName(String name);

    //Associated queries

    //find all of a role
    List<Account> findAccountByRoles_RoleID(int roleID);

    //find by group
    List<Account> findAccountByTeam(Team team);



}
