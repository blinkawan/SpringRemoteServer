package com.agungsetiawan.springremoteserver.service;

import com.agungsetiawan.springremoteserver.entity.Person;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Agung Setiawan
 */
public class PersonServiceImpl implements PersonService{

    List<Person> persons;
    
    public PersonServiceImpl(){
        persons=new ArrayList<Person>();
        Person person1=new Person("Agung Setiawan","blinkawan@gmail.com");
        Person person2=new Person("Hauril Maulida Nisfari", "aurielhaurilnisfari@yahoo.com");
        persons.add(person1);
        persons.add(person2);
    }
    public List<Person> getAll() {
        return persons;
    }
    
}
