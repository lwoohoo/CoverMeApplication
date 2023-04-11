package ca.cmis.covermeapplication.model;
/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.32.1.6535.66c005ced modeling language!*/

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

// line 50 "model.ump"
// line 177 "model.ump"
@Entity
public class Team
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Team Attributes
  @Id
  @GeneratedValue
  private int teamID;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Team(int aTeamID)
  {
    teamID = aTeamID;
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setTeamID(int aTeamID)
  {
    boolean wasSet = false;
    teamID = aTeamID;
    wasSet = true;
    return wasSet;
  }

  public int getTeamID()
  {
    return teamID;
  }

  public void delete()
  {}


  public String toString()
  {
    return super.toString() + "["+
            "teamID" + ":" + getTeamID()+ "]";
  }
}