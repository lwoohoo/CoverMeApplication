package ca.cmis.covermeapplication.model;

/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.32.1.6535.66c005ced modeling language!*/


import java.time.LocalDate;
import java.util.*;

// line 75 "model.ump"
// line 158 "model.ump"
public class Workweek
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Workweek Attributes
  private LocalDate startDate;
  private int workweekID;

  //Workweek Associations
  private List<Workday> workdaies;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Workweek(LocalDate aStartDate, int aWorkweekID, Workday... allWorkdaies)
  {
    startDate = aStartDate;
    workweekID = aWorkweekID;
    workdaies = new ArrayList<Workday>();
    boolean didAddWorkdaies = setWorkdaies(allWorkdaies);
    if (!didAddWorkdaies)
    {
      throw new RuntimeException("Unable to create Workweek, must have 7 workdaies. See http://manual.umple.org?RE002ViolationofAssociationMultiplicity.html");
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
    Workday aWorkday = workdaies.get(index);
    return aWorkday;
  }

  public List<Workday> getWorkdaies()
  {
    List<Workday> newWorkdaies = Collections.unmodifiableList(workdaies);
    return newWorkdaies;
  }

  public int numberOfWorkdaies()
  {
    int number = workdaies.size();
    return number;
  }

  public boolean hasWorkdaies()
  {
    boolean has = workdaies.size() > 0;
    return has;
  }

  public int indexOfWorkday(Workday aWorkday)
  {
    int index = workdaies.indexOf(aWorkday);
    return index;
  }
  /* Code from template association_RequiredNumberOfMethod */
  public static int requiredNumberOfWorkdaies()
  {
    return 7;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfWorkdaies()
  {
    return 7;
  }
  /* Code from template association_MaximumNumberOfMethod */
  public static int maximumNumberOfWorkdaies()
  {
    return 7;
  }
  /* Code from template association_SetUnidirectionalN */
  public boolean setWorkdaies(Workday... newWorkdaies)
  {
    boolean wasSet = false;
    ArrayList<Workday> verifiedWorkdaies = new ArrayList<Workday>();
    for (Workday aWorkday : newWorkdaies)
    {
      if (verifiedWorkdaies.contains(aWorkday))
      {
        continue;
      }
      verifiedWorkdaies.add(aWorkday);
    }

    if (verifiedWorkdaies.size() != newWorkdaies.length || verifiedWorkdaies.size() != requiredNumberOfWorkdaies())
    {
      return wasSet;
    }

    workdaies.clear();
    workdaies.addAll(verifiedWorkdaies);
    wasSet = true;
    return wasSet;
  }

  public void delete()
  {
    workdaies.clear();
  }


  public String toString()
  {
    return super.toString() + "["+
            "workweekID" + ":" + getWorkweekID()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "startDate" + "=" + (getStartDate() != null ? !getStartDate().equals(this)  ? getStartDate().toString().replaceAll("  ","    ") : "this" : "null");
  }
}