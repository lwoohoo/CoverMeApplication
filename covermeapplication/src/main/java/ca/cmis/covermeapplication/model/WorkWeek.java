package ca.cmis.covermeapplication.model;
/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.32.1.6535.66c005ced modeling language!*/

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

// line 76 "model.ump"
// line 156 "model.ump"
@Entity
public class Workweek
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Workweek Attributes
  private LocalDate startDate;
  @Id
  @GeneratedValue
  private int workweekID;

  //Workweek Associations
  @ManyToOne
  private Team team;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Workweek(){}

  public Workweek(LocalDate aStartDate, Team aTeam)
  {
    startDate = aStartDate;
    if (!setTeam(aTeam))
    {
      throw new RuntimeException("Unable to create Workweek due to aTeam. See http://manual.umple.org?RE002ViolationofAssociationMultiplicity.html");
    }
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setStartDate(LocalDate aStartDate)
  {
    boolean wasSet = false;
    startDate = aStartDate;
    wasSet = true;
    return wasSet;
  }

  public boolean setWorkweekID(int aWorkweekID)
  {
    boolean wasSet = false;
    workweekID = aWorkweekID;
    wasSet = true;
    return wasSet;
  }

  public LocalDate getStartDate()
  {
    return startDate;
  }

  public int getWorkweekID()
  {
    return workweekID;
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
            "workweekID" + ":" + getWorkweekID()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "startDate" + "=" + (getStartDate() != null ? !getStartDate().equals(this)  ? getStartDate().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "team = "+(getTeam()!=null?Integer.toHexString(System.identityHashCode(getTeam())):"null");
  }
}