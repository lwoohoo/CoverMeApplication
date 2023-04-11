package ca.cmis.covermeapplication.model;
/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.32.1.6535.66c005ced modeling language!*/

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

// line 43 "model.ump"
// line 136 "model.ump"
@Entity
public class Calendar
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Calendar Attributes
  @Id
  @GeneratedValue
  private int calendarID;

  //Calendar Associations
  @OneToOne
  private Team team;
  @OneToOne
  private Account account;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Calendar(int aCalendarID, Team aTeam, Account aAccount)
  {
    calendarID = aCalendarID;
    if (!setTeam(aTeam))
    {
      throw new RuntimeException("Unable to create Calendar due to aTeam. See http://manual.umple.org?RE002ViolationofAssociationMultiplicity.html");
    }
    if (!setAccount(aAccount))
    {
      throw new RuntimeException("Unable to create Calendar due to aAccount. See http://manual.umple.org?RE002ViolationofAssociationMultiplicity.html");
    }
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setCalendarID(int aCalendarID)
  {
    boolean wasSet = false;
    calendarID = aCalendarID;
    wasSet = true;
    return wasSet;
  }

  public int getCalendarID()
  {
    return calendarID;
  }
  /* Code from template association_GetOne */
  public Team getTeam()
  {
    return team;
  }
  /* Code from template association_GetOne */
  public Account getAccount()
  {
    return account;
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
  /* Code from template association_SetUnidirectionalOne */
  public boolean setAccount(Account aNewAccount)
  {
    boolean wasSet = false;
    if (aNewAccount != null)
    {
      account = aNewAccount;
      wasSet = true;
    }
    return wasSet;
  }

  public void delete()
  {
    team = null;
    account = null;
  }


  public String toString()
  {
    return super.toString() + "["+
            "calendarID" + ":" + getCalendarID()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "team = "+(getTeam()!=null?Integer.toHexString(System.identityHashCode(getTeam())):"null") + System.getProperties().getProperty("line.separator") +
            "  " + "account = "+(getAccount()!=null?Integer.toHexString(System.identityHashCode(getAccount())):"null");
  }
}