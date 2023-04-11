package ca.cmis.covermeapplication.repository;

import org.springframework.data.repository.CrudRepository;

import ca.cmis.covermeapplication.model.Group;

public interface GroupRepository extends CrudRepository<Group, Integer>{
    
    //pk
    Group findGroupByGroupID(int groupID);
}
