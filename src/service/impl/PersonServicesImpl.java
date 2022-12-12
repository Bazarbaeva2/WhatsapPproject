package service.impl;

import classes.Person;
import enums.Gender;
import service.PersonServicesAble;

import java.awt.*;
import java.util.ArrayList;

public interface PersonServicesImpl {
    public class PersonServicesImpl implements PersonServicesAble {
        List<Person> people = new ArrayList<>();
        List<Gender>genders = new ArrayList<>();
        @Override
        public String create(Person people) {
            this.people.add(people);
            return "GOOD JOB!!!";
        }

        @Override
        public List<Person> getPerson() {
            return people;
        }

        @Override
        public Person getPersonFirsName(String name, List<Person> people) {
            for (Person person : people) {
                if(person.getFirstName().equals(name)){
                    return person;
                }
            }
            return null;
        }
        public String grateGender(List<Gender>genders){
            this.genders.addAll(genders);
            return "";
        }
        public List<Gender>getGender(){
            return genders;
        };

    }
