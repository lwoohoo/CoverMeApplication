package ca.cmis.covermeapplication.model;
/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.32.1.6535.66c005ced modeling language!*/

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

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
  private String name;
  private String description;

  //Team Associations
  @OneToOne
  @NotFound(action = NotFoundAction.IGNORE)
  private Calendar calendar;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Team() {}

  public Team(String name)
  {
    this.name = name;
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

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDescription() {
    return this.description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Calendar getCalendar() {
    return this.calendar;
  }

  public void setCalendar(Calendar calendar) {
    this.calendar = calendar;
  }
}