/*
Name:Enamur Rabbi Ferdausi
ID:2012020144
Section:C
Email:cse_2012020144@lus.ac.bd
Date:08-08-2021
 */
package ferdausi;
public class Student {
    //Instance variable
    String name;
    int id;
    //class variable
    static String universityName;
    Student(){
        System.out.println("Default Constractor");
    }
    Student(String name){
        this.name=name;
        System.out.println("Name:"+this.name);
    }
    Student(String name,int id){
        this.name=name;
        this.id=id;
        System.out.println("ID:"+this.id);
    }
    void display(){

        System.out.println("University Name:"+universityName);
    }


}
