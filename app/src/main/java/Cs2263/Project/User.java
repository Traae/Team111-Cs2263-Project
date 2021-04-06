/**
 * User class
 *
 * The regular user class. In addition to the UserArchetype's properties
 * it has a list of tasks & lists and other properties supporting that.
 *
 * @author  Traae
 * @version 1.0
 * @since 4/6/2021
 */

package Cs2263.Project;

import Cs2263.Project.listable.lists.ToDoList;
import Cs2263.Project.listable.tasks.ParentTask;
import java.io.Serializable;
import java.util.LinkedList;

public class User implements Serializable {


    // Variables
    private LinkedList<ParentTask> theTasks;
    private LinkedList<ToDoList> theLists;
    private double sectionIDseed;
    private String firstName;
    private String lastName;
    private String pictureFile;
    private String biography;


    // Constructor
    public User(){
        firstName = "";
        lastName = "";
        pictureFile = "";
        biography = "";
        theTasks = new LinkedList<>();
        theLists = new LinkedList<>();
    }

    // Methods
    //GETTERS
    public LinkedList<ParentTask> getTheTasks() {
        return theTasks;
    }
    public LinkedList<ToDoList> getTheLists() {
        return theLists;
    }
    public String getNextSectionID() {
        /**
         * returns a String to be used as an ID for a toDoList.
         * is based off an incrementing double.
         */
        sectionIDseed++;
        return "list" + sectionIDseed;
    }
    // GETTERS
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getBiography() {
        return biography;
    }
    // SETTERS
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setBiography(String biography) {
        this.biography = biography;
    }
}
