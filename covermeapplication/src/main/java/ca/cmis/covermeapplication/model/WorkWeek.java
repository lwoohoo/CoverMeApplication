package ca.cmis.covermeapplication.model;

/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.32.1.6535.66c005ced modeling language!*/


import java.time.LocalDate;
import java.util.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

// line 75 "model.ump"
// line 158 "model.ump"
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
  @OneToMany
  private List<Workday> workdays;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Workweek(LocalDate aStartDate, int aWorkweekID, Workday... allworkdays)
  {
    startDate = aStartDate;
    workweekID = aWorkweekID;
    workdays = new ArrayList<Workday>();
    boolean didAddworkdays = setworkdays(allworkdays);
    if (!didAddworkdays)
    {
      throw new RuntimeException("Unable to create Workweek, must have 7 workdays. See http://manual.umple.org?RE002ViolationofAssociationMultiplicity.html");
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
  /* Code from template association_GetMany */
  public Workday getWorkday(int index)
  {
    Workday aWorkday = workdays.get(index);
    return aWorkday;
  }

  public List<Workday> getworkdays()
  {
    List<Workday> newworkdays = Collections.unmodifiableList(workdays);
    return newworkdays;
  }

  public int numberOfworkdays()
  {
    int number = workdays.size();
    return number;
  }

  public boolean hasworkdays()
  {
    boolean has = workdays.size() > 0;
    return has;
  }

  public int indexOfWorkday(Workday aWorkday)
  {
    int index = workdays.indexOf(aWorkday);
    return index;
  }
  /* Code from template association_RequiredNumberOfMethod */
  public static int requiredNumberOfworkdays()
  {
    return 7;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfworkdays()
  {
    return 7;
  }
  /* Code from template association_MaximumNumberOfMethod */
  public static int maximumNumberOfworkdays()
  {
    return 7;
  }
  /* Code from template association_SetUnidirectionalN */
  public boolean setworkdays(Workday... newworkdays)
  {
    boolean wasSet = false;
    ArrayList<Workday> verifiedworkdays = new ArrayList<Workday>();
    for (Workday aWorkday : newworkdays)
    {
      if (verifiedworkdays.contains(aWorkday))
      {
        continue;
      }
      verifiedworkdays.add(aWorkday);
    }

    if (verifiedworkdays.size() != newworkdays.length || verifiedworkdays.size() != requiredNumberOfworkdays())
    {
      return wasSet;
    }

    workdays.clear();
    workdays.addAll(verifiedworkdays);
    wasSet = true;
    return wasSet;
  }

  public void delete()
  {
    workdays.clear();
  }


  public String toString()
  {
    return super.toString() + "["+
            "workweekID" + ":" + getWorkweekID()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "startDate" + "=" + (getStartDate() != null ? !getStartDate().equals(this)  ? getStartDate().toString().replaceAll("  ","    ") : "this" : "null");
  }
}