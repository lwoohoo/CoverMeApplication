package ca.cmis.covermeapplication.model;

import java.time.LocalDate;

/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.32.1.6535.66c005ced modeling language!*/



// line 72 "model.ump"
public class WorkWeek
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //WorkWeek Attributes
  private LocalDate startDate;

  //WorkWeek Associations
  private WorkDay workDay;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public WorkWeek(LocalDate aStartDate, WorkDay aWorkDay)
  {
    startDate = aStartDate;
    boolean didAddWorkDay = setWorkDay(aWorkDay);
    if (!didAddWorkDay)
    {
      throw new RuntimeException("Unable to create workWeek due to workDay. See http://manual.umple.org?RE002ViolationofAssociationMultiplicity.html");
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

  public LocalDate getStartDate()
  {
    return startDate;
  }
  /* Code from template association_GetOne */
  public WorkDay getWorkDay()
  {
    return workDay;
  }
  /* Code from template association_SetOneToAtMostN */
  public boolean setWorkDay(WorkDay aWorkDay)
  {
    boolean wasSet = false;
    //Must provide workDay to workWeek
    if (aWorkDay == null)
    {
      return wasSet;
    }

    //workDay already at maximum (7)
    if (aWorkDay.numberOfWorkWeeks() >= WorkDay.maximumNumberOfWorkWeeks())
    {
      return wasSet;
    }
    
    WorkDay existingWorkDay = workDay;
    workDay = aWorkDay;
    if (existingWorkDay != null && !existingWorkDay.equals(aWorkDay))
    {
      boolean didRemove = existingWorkDay.removeWorkWeek(this);
      if (!didRemove)
      {
        workDay = existingWorkDay;
        return wasSet;
      }
    }
    workDay.addWorkWeek(this);
    wasSet = true;
    return wasSet;
  }

  public void delete()
  {
    WorkDay placeholderWorkDay = workDay;
    this.workDay = null;
    if(placeholderWorkDay != null)
    {
      placeholderWorkDay.removeWorkWeek(this);
    }
  }


  public String toString()
  {
    return super.toString() + "["+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "startDate" + "=" + (getStartDate() != null ? !getStartDate().equals(this)  ? getStartDate().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "workDay = "+(getWorkDay()!=null?Integer.toHexString(System.identityHashCode(getWorkDay())):"null");
  }
}