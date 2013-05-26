package com.agungsetiawan.springremoteserver.service;

import com.agungsetiawan.springremoteserver.entity.Person;
import java.util.List;

/**
 *
 * @author Agung Setiawan
 */
public interface PersonService {
    public List<Person> getAll();
}
