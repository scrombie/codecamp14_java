/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



/**
 *
 * @author generaleye
 */
public class ContactList {
    Person[] contacts;
    ContactGroup[] groups;
    
    ContactList(Person[] contacts) {
        this.contacts = contacts;
        this.groups = {"Friends", "Family", "Buisness", "Favorites"};
    }
    ContactList(Person[] contacts, ContactGroup[] groups) {
        this.contacts = contacts;
        this.groups = groups;
    }
    public Person[] getContacts() {
        return this.contacts;
    }
    public ContactGroup[] getGroups() {
        return this.groups;
    }
}
