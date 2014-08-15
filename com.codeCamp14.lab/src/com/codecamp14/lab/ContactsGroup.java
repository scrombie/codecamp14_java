package com.codecamp14.lab;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MATTHEW
 */
public class ContactsGroup {
    String groupName;
    Person[] groupContacts;
    boolean takeCalls;
    int maxContacts;

    public ContactsGroup(String name, Person[] contacts, boolean takeCalls) {
        this.groupContacts = contacts;
        this.groupName = name;
        this.takeCalls = takeCalls;
    }

    public ContactsGroup(String name, Person[] contacts, boolean takeCalls, int maxContacts) {
        this.groupContacts = contacts;
        this.groupName = name;
        this.takeCalls = takeCalls;
        this.maxContacts= maxContacts;
    }

    public Person[] getGroupContacts() {
        return groupContacts;
    }

    public String getGroupName() {
        return groupName;
    }

    public int getMaxContacts() {
        return maxContacts;
    }

    public boolean isTakeCalls() {
        return takeCalls;
    }
    
    

    /**
     * @param args the command line arguments
     */
    
}
