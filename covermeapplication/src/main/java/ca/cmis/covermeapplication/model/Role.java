package ca.cmis.covermeapplication.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.32.1.6535.66c005ced modeling language!*/



// line 26 "model.ump"
// line 122 "model.ump"
@Entity
public class Role
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Role Attributes
  private String name;
  @Id
  @GeneratedValue
  private int roleID;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Role(String aName, int aRoleID)
  {
    name = aName;
    roleID = aRoleID;
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setName(String aName)
  {
    boolean wasSet = false;
    name = aName;
    wasSet = true;
    return wasSet;
  }

  public boolean setRoleID(int aRoleID)
  {
    boolean wasSet = false;
    roleID = aRoleID;
    wasSet = true;
    return wasSet;
  }

  public String getName()
  {
    return name;
  }

  public int getRoleID()
  {
    return roleID;
  }

  public void delete()
  {}


  public String toString()
  {
    return super.toString() + "["+
            "name" + ":" + getName()+ "," +
            "roleID" + ":" + getRoleID()+ "]";
  }
}