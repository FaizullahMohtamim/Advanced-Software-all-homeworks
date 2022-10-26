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

public class Main {

    public static void main(String[] args) {

        Person p = new Person();
        

        while(p.hasNext()){
            int index = p.position;
            System.out.println(p.persons[index]);
        }

//        for (Person person : p) {
//            int val = p.position;
//                System.out.println(person.persons[val]);
//           
//        }


    }
}
