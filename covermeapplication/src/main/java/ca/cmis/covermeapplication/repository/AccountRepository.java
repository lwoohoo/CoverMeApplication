package ca.cmis.covermeapplication.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import ca.cmis.covermeapplication.model.Account;
import ca.cmis.covermeapplication.model.Role;
import ca.cmis.covermeapplication.model.Shift;

public interface AccountRepository extends CrudRepository<Account, Integer>{
    
    //pk
    Account findAccountByAccountID(int accountID);
    
    //delete
    void deleteAccountByAccountID(int accountID);
    
    //find all
    List<Account> findAll();

    // //find all of a role
    // List<Account> findAccountByRole(Role role);

    // //find with name
    // List<Account> findAccountByName(String name);

    // //find by group
    // List<Account> findAccountByGroup(Group group);

    // //find by shift
    // Account findAccountByShift(Shift shift);

}
