package ca.cmis.covermeapplication.repository;

import org.springframework.data.repository.CrudRepository;

import ca.cmis.covermeapplication.model.Account;
import ca.cmis.covermeapplication.model.Role;
import ca.cmis.covermeapplication.model.ShiftRequest;

public interface RoleRepository extends CrudRepository<Role, Integer>{
    
    //pk
    Role findRoleByRoleID(int roleID);

    //find by role name
    Role findRoleByName(String name);

    //find role by account
    Role findRoleByAccount(Account account);

    //find role by shiftrequest
    Role findRoleByShiftRequest(ShiftRequest shiftRequest);
}
