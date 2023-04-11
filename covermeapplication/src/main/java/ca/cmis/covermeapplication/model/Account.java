package ca.cmis.covermeapplication.model;

/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.32.1.6535.66c005ced modeling language!*/


import java.util.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

// line 2 "model.ump"
// line 108 "model.ump"
@Entity
public class Account
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Account Attributes
  private String name;
  private String email;
  private String phoneNumber;
  private String username;
  private String password;
  @Id
  @GeneratedValue
  private int accountID;
  private boolean isAdmin;

  //Account Associations
  @OneToMany
  private List<Post> posts;
  @OneToMany
  private List<Role> roles;
  @OneToMany
  private List<Event> events;
  @OneToOne
  private Calendar calendar;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Account(String aName, String aEmail, String aPhoneNumber, String aUsername, String aPassword, int aAccountID, boolean aIsAdmin, Calendar aCalendar)
  {
    name = aName;
    email = aEmail;
    phoneNumber = aPhoneNumber;
    username = aUsername;
    password = aPassword;
    accountID = aAccountID;
    isAdmin = aIsAdmin;
    posts = new ArrayList<Post>();
    roles = new ArrayList<Role>();
    events = new ArrayList<Event>();
    if (!setCalendar(aCalendar))
    {
      throw new RuntimeException("Unable to create Account due to aCalendar. See http://manual.umple.org?RE002ViolationofAssociationMultiplicity.html");
    }
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setName(String aName)
  {
    boolean wasSet = false;
    name = aName;
    wasSet = true;
    return wasSet;
  }

  public boolean setEmail(String aEmail)
  {
    boolean wasSet = false;
    email = aEmail;
    wasSet = true;
    return wasSet;
  }

  public boolean setPhoneNumber(String aPhoneNumber)
  {
    boolean wasSet = false;
    phoneNumber = aPhoneNumber;
    wasSet = true;
    return wasSet;
  }

  public boolean setUsername(String aUsername)
  {
    boolean wasSet = false;
    username = aUsername;
    wasSet = true;
    return wasSet;
  }

  public boolean setPassword(String aPassword)
  {
    boolean wasSet = false;
    password = aPassword;
    wasSet = true;
    return wasSet;
  }

  public boolean setAccountID(int aAccountID)
  {
    boolean wasSet = false;
    accountID = aAccountID;
    wasSet = true;
    return wasSet;
  }

  public boolean setIsAdmin(boolean aIsAdmin)
  {
    boolean wasSet = false;
    isAdmin = aIsAdmin;
    wasSet = true;
    return wasSet;
  }

  public String getName()
  {
    return name;
  }

  public String getEmail()
  {
    return email;
  }

  public String getPhoneNumber()
  {
    return phoneNumber;
  }

  public String getUsername()
  {
    return username;
  }

  public String getPassword()
  {
    return password;
  }

  public int getAccountID()
  {
    return accountID;
  }

  public boolean getIsAdmin()
  {
    return isAdmin;
  }
  /* Code from template association_GetMany */
  public Post getPost(int index)
  {
    Post aPost = posts.get(index);
    return aPost;
  }

  public List<Post> getPosts()
  {
    List<Post> newPosts = Collections.unmodifiableList(posts);
    return newPosts;
  }

  public int numberOfPosts()
  {
    int number = posts.size();
    return number;
  }

  public boolean hasPosts()
  {
    boolean has = posts.size() > 0;
    return has;
  }

  public int indexOfPost(Post aPost)
  {
    int index = posts.indexOf(aPost);
    return index;
  }
  /* Code from template association_GetMany */
  public Role getRole(int index)
  {
    Role aRole = roles.get(index);
    return aRole;
  }

  public List<Role> getRoles()
  {
    List<Role> newRoles = Collections.unmodifiableList(roles);
    return newRoles;
  }

  public int numberOfRoles()
  {
    int number = roles.size();
    return number;
  }

  public boolean hasRoles()
  {
    boolean has = roles.size() > 0;
    return has;
  }

  public int indexOfRole(Role aRole)
  {
    int index = roles.indexOf(aRole);
    return index;
  }
  /* Code from template association_GetMany */
  public Event getEvent(int index)
  {
    Event aEvent = events.get(index);
    return aEvent;
  }

  public List<Event> getEvents()
  {
    List<Event> newEvents = Collections.unmodifiableList(events);
    return newEvents;
  }

  public int numberOfEvents()
  {
    int number = events.size();
    return number;
  }

  public boolean hasEvents()
  {
    boolean has = events.size() > 0;
    return has;
  }

  public int indexOfEvent(Event aEvent)
  {
    int index = events.indexOf(aEvent);
    return index;
  }
  /* Code from template association_GetOne */
  public Calendar getCalendar()
  {
    return calendar;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfPosts()
  {
    return 0;
  }
  /* Code from template association_AddUnidirectionalMany */
  public boolean addPost(Post aPost)
  {
    boolean wasAdded = false;
    if (posts.contains(aPost)) { return false; }
    posts.add(aPost);
    wasAdded = true;
    return wasAdded;
  }

  public boolean removePost(Post aPost)
  {
    boolean wasRemoved = false;
    if (posts.contains(aPost))
    {
      posts.remove(aPost);
      wasRemoved = true;
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addPostAt(Post aPost, int index)
  {  
    boolean wasAdded = false;
    if(addPost(aPost))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfPosts()) { index = numberOfPosts() - 1; }
      posts.remove(aPost);
      posts.add(index, aPost);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMovePostAt(Post aPost, int index)
  {
    boolean wasAdded = false;
    if(posts.contains(aPost))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfPosts()) { index = numberOfPosts() - 1; }
      posts.remove(aPost);
      posts.add(index, aPost);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addPostAt(aPost, index);
    }
    return wasAdded;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfRoles()
  {
    return 0;
  }
  /* Code from template association_AddUnidirectionalMany */
  public boolean addRole(Role aRole)
  {
    boolean wasAdded = false;
    if (roles.contains(aRole)) { return false; }
    roles.add(aRole);
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeRole(Role aRole)
  {
    boolean wasRemoved = false;
    if (roles.contains(aRole))
    {
      roles.remove(aRole);
      wasRemoved = true;
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addRoleAt(Role aRole, int index)
  {  
    boolean wasAdded = false;
    if(addRole(aRole))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfRoles()) { index = numberOfRoles() - 1; }
      roles.remove(aRole);
      roles.add(index, aRole);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveRoleAt(Role aRole, int index)
  {
    boolean wasAdded = false;
    if(roles.contains(aRole))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfRoles()) { index = numberOfRoles() - 1; }
      roles.remove(aRole);
      roles.add(index, aRole);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addRoleAt(aRole, index);
    }
    return wasAdded;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfEvents()
  {
    return 0;
  }
  /* Code from template association_AddUnidirectionalMany */
  public boolean addEvent(Event aEvent)
  {
    boolean wasAdded = false;
    if (events.contains(aEvent)) { return false; }
    events.add(aEvent);
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeEvent(Event aEvent)
  {
    boolean wasRemoved = false;
    if (events.contains(aEvent))
    {
      events.remove(aEvent);
      wasRemoved = true;
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addEventAt(Event aEvent, int index)
  {  
    boolean wasAdded = false;
    if(addEvent(aEvent))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfEvents()) { index = numberOfEvents() - 1; }
      events.remove(aEvent);
      events.add(index, aEvent);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveEventAt(Event aEvent, int index)
  {
    boolean wasAdded = false;
    if(events.contains(aEvent))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfEvents()) { index = numberOfEvents() - 1; }
      events.remove(aEvent);
      events.add(index, aEvent);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addEventAt(aEvent, index);
    }
    return wasAdded;
  }
  /* Code from template association_SetUnidirectionalOne */
  public boolean setCalendar(Calendar aNewCalendar)
  {
    boolean wasSet = false;
    if (aNewCalendar != null)
    {
      calendar = aNewCalendar;
      wasSet = true;
    }
    return wasSet;
  }

  public void delete()
  {
    posts.clear();
    roles.clear();
    events.clear();
    calendar = null;
  }


  public String toString()
  {
    return super.toString() + "["+
            "name" + ":" + getName()+ "," +
            "email" + ":" + getEmail()+ "," +
            "phoneNumber" + ":" + getPhoneNumber()+ "," +
            "username" + ":" + getUsername()+ "," +
            "password" + ":" + getPassword()+ "," +
            "accountID" + ":" + getAccountID()+ "," +
            "isAdmin" + ":" + getIsAdmin()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "calendar = "+(getCalendar()!=null?Integer.toHexString(System.identityHashCode(getCalendar())):"null");
  }
}