package ca.cmis.covermeapplication.model;
/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.32.1.6535.66c005ced modeling language!*/

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

// line 26 "model.ump"
// line 125 "model.ump"
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

  //Role Associations
  @ManyToOne
  private Team team;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Role(String aName, int aRoleID, Team aTeam)
  {
    name = aName;
    roleID = aRoleID;
    if (!setTeam(aTeam))
    {
      throw new RuntimeException("Unable to create Role due to aTeam. See http://manual.umple.org?RE002ViolationofAssociationMultiplicity.html");
    }
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
  /* Code from template association_GetOne */
  public Team getTeam()
  {
    return team;
  }
  /* Code from template association_SetUnidirectionalOne */
  public boolean setTeam(Team aNewTeam)
  {
    boolean wasSet = false;
    if (aNewTeam != null)
    {
      team = aNewTeam;
      wasSet = true;
    }
    return wasSet;
  }

  public void delete()
  {
    team = null;
  }


  public String toString()
  {
    return super.toString() + "["+
            "name" + ":" + getName()+ "," +
            "roleID" + ":" + getRoleID()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "team = "+(getTeam()!=null?Integer.toHexString(System.identityHashCode(getTeam())):"null");
  }
}