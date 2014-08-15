/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab;

/**
 *
 * @author Lakunle
 */
public class Person {
    String name;
    String phoneNumber;
    int age;
    int count = 0;
    public static int allCounts = 0;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void birthday(){
        this.age++;
    }
    public boolean sameAge(Person p1, Person p2){
        if(p1.getAge() == p2.getAge()){
            return true;
        }
        return false;
    }
    public void dial(){
        count++;
        allCounts++;
        System.out.println("Dial contact_name");
    }
    public int timesDialed(){
        return count;
    }
    public int totalDials(){
        return allCounts;
    }
}
