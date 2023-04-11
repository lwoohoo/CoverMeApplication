package ca.cmis.covermeapplication.model;
/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.32.1.6535.66c005ced modeling language!*/

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

// line 90 "model.ump"
// line 167 "model.ump"
@Entity
public class Workday
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Workday Attributes
  private LocalDate date;
  @Id
  @GeneratedValue
  private int workdayID;

  //Workday Associations
  @ManyToOne
  private Workweek workweek;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Workday(LocalDate aDate, int aWorkdayID, Workweek aWorkweek)
  {
    date = aDate;
    workdayID = aWorkdayID;
    if (!setWorkweek(aWorkweek))
    {
      throw new RuntimeException("Unable to create Workday due to aWorkweek. See http://manual.umple.org?RE002ViolationofAssociationMultiplicity.html");
    }
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setDate(LocalDate aDate)
  {
    boolean wasSet = false;
    date = aDate;
    wasSet = true;
    return wasSet;
  }

  public boolean setWorkdayID(int aWorkdayID)
  {
    boolean wasSet = false;
    workdayID = aWorkdayID;
    wasSet = true;
    return wasSet;
  }

  public LocalDate getDate()
  {
    return date;
  }

  public int getWorkdayID()
  {
    return workdayID;
  }
  /* Code from template association_GetOne */
  public Workweek getWorkweek()
  {
    return workweek;
  }
  /* Code from template association_SetUnidirectionalOne */
  public boolean setWorkweek(Workweek aNewWorkweek)
  {
    boolean wasSet = false;
    if (aNewWorkweek != null)
    {
      workweek = aNewWorkweek;
      wasSet = true;
    }
    return wasSet;
  }

  public void delete()
  {
    workweek = null;
  }


  public String toString()
  {
    return super.toString() + "["+
            "workdayID" + ":" + getWorkdayID()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "date" + "=" + (getDate() != null ? !getDate().equals(this)  ? getDate().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "workweek = "+(getWorkweek()!=null?Integer.toHexString(System.identityHashCode(getWorkweek())):"null");
  }
}