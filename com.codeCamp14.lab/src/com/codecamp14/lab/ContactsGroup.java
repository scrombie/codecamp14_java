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
        this.maxContacts = 100;
    }

    public ContactsGroup(String name, Person[] contacts, boolean takeCalls, int maxContacts) {
        this.groupContacts = contacts;
        this.groupName = name;
        this.takeCalls = takeCalls;
        if(maxContacts > 100){
            System.out.println("Out of range...Max Contacts reset to 100");
        }else{
            this.maxContacts= maxContacts;
        }
        
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

    public boolean canCall() {
        return takeCalls;
    }
    
    public double getAverageAge(){
        double age = 0;
        for(int i=0;i<this.groupContacts.length;i++){
            age+=(double)groupContacts[i].getAge();
        }
        age = age/groupContacts.length;
        return age;
    }
    
    public void addContact(Person p){
        if(this.groupContacts.length < this.maxContacts){
            for(int i=0;i<this.groupContacts.length;i++){
                if(groupContacts[i]== null){
                    groupContacts[i] = p;
                    System.out.println("Contact Added");
                }else{
                    System.out.println("Contact Group Full");
                }
            }
        }
    }

    public void setTakeCalls(boolean takeCalls) {
        this.takeCalls = takeCalls;
    }
    
    public boolean contactInGroup(Person p){
        for(int i=0;i<this.groupContacts.length;i++){
            if(groupContacts[i].getName().equals(p.getName())){
                return true;
            }
        }
        return false;
    }
    
    public void doNotTakeCalls(ContactsGroup[] contactGroup){
        for(int i=0;i<contactGroup.length;i++){
            contactGroup[i].setTakeCalls(false);
        }
    }

    /**
     * @param args the command line arguments
     */
    
}
