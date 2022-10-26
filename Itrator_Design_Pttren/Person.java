/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Itrator_Design_Pttren;

/**
 *
 * @author Mohtamim
 */
import java.util.Iterator;

public class Person implements Iterable<Person>, Iterator<Person> {
    
    int size = 0;
    String[] persons;
    int position = -1;

    public Person(){
        this.size = 5;
        persons = new String[size];


        persons[0] = "Ahmad";
        persons[1] = "Mohammad";
        persons[2] = "Shakir";
        persons[3] = "Danish";
        persons[4] = "Yassen";
    }

    @Override
    public Iterator<Person> iterator() {
        // TODO Auto-generated method stub
        return this;
    }

    @Override
    public boolean hasNext() {
        // TODO Auto-generated method stub
        if(position < size - 1 ){
            position ++;
            return true;
        } else {
            return false;
        }
    }

    @Override
    public Person next() {
        // TODO Auto-generated method stub
        return (Person) iterator();
    }

}
