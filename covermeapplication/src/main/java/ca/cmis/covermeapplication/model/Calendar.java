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

  public Calendar() {}

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

  public void setTeam(Team team) {
    this.team = team;
  }

  public Team getTeam() {
    return this.team;
  }

  public void setAccount(Account account) {
    this.account = account;
  }

  public Account geAccount() {
    return this.account;
  }

  public boolean hasTeam() {
    boolean has = team != null;
    return has;
  }

  public boolean hasAccount() {
    boolean has = account != null;
    return has;
  }

  public String toString()
  {
    return super.toString() + "["+
            "calendarID" + ":" + getCalendarID()+ "]" + System.getProperties().getProperty("line.separator");
  }
}