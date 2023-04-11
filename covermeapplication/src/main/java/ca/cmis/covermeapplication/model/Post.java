package ca.cmis.covermeapplication.model;
/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.32.1.6535.66c005ced modeling language!*/

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

// line 19 "model.ump"
// line 120 "model.ump"
@Entity
public abstract class Post
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Post Attributes
  private LocalDateTime date;
  @Id
  @GeneratedValue
  private int postID;

  //Post Associations
  @ManyToOne
  private Account account;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Post(LocalDateTime aDate, int aPostID, Account aAccount)
  {
    date = aDate;
    postID = aPostID;
    if (!setAccount(aAccount))
    {
      throw new RuntimeException("Unable to create Post due to aAccount. See http://manual.umple.org?RE002ViolationofAssociationMultiplicity.html");
    }
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setDate(LocalDateTime aDate)
  {
    boolean wasSet = false;
    date = aDate;
    wasSet = true;
    return wasSet;
  }

  public boolean setPostID(int aPostID)
  {
    boolean wasSet = false;
    postID = aPostID;
    wasSet = true;
    return wasSet;
  }

  public LocalDateTime getDate()
  {
    return date;
  }

  public int getPostID()
  {
    return postID;
  }
  /* Code from template association_GetOne */
  public Account getAccount()
  {
    return account;
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
    account = null;
  }


  public String toString()
  {
    return super.toString() + "["+
            "postID" + ":" + getPostID()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "date" + "=" + (getDate() != null ? !getDate().equals(this)  ? getDate().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "account = "+(getAccount()!=null?Integer.toHexString(System.identityHashCode(getAccount())):"null");
  }
}