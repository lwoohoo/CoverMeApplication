package ca.cmis.covermeapplication.repository;

import org.springframework.data.repository.CrudRepository;

import ca.cmis.covermeapplication.model.Role;

public interface RoleRepository extends CrudRepository<Role, Integer>{
    
    //pk
    Role findRoleByRoleID(int roleID);

    //find by role name
    Role findRoleByName(String name);

}
