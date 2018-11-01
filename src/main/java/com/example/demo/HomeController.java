package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashSet;
import java.util.Set;

@Controller
public class HomeController {

    @Autowired
    PersonRepository personRepository;

    @Autowired
    PetRepository petRepository;

    @RequestMapping("/")
    public String index(Model model){
        Set<Pet> pets = new HashSet<>();
        //creating a list pets and putting instances in it
        Pet pet = new Pet();

        //creating a set of people
        Set<Person> persons = new HashSet<>();

        //creating a person instances and putting each one in persons list
        Person person;


//creating person cannor
        person = new Person();
        person.setName("Connor");
        persons.add(person);
        //create a list of connor pets
        pets = new HashSet<>();

        //create connor's pets
        pet = new Pet();
        pet.setName("Pinky");
        pets.add(pet);

        pet = new Pet();
        pet.setName("Buffy");
        pets.add(pet);

        //putting list of connor's pets in to connor instance
        person.setPets(pets);
        personRepository.save(person);


//creating person Duffie
        person = new Person();
        person.setName("Dufie ");
        persons.add(person);
        pet = new Pet();
        pet.setName("Fluffy");
        pets = new HashSet<>();
        pets.add(pet);

        pet = new Pet();
        pet.setName("Spot");
        pets.add(pet);
        person.setPets(pets);
        personRepository.save(person);


//creating person Elsie
        person  = new Person();
        person.setName("Elsie ");
        persons.add(person);
        //list of his pets
        pets = new HashSet<>();

        pet = new Pet();
        pet.setName("Snowy");
        pets.add(pet);

        pet = new Pet();
        pet.setName("Sandy");
        pets.add(pet);

        pet = new Pet();
        pet.setName("Rover");
        pets.add(pet);

        person.setPets(pets);
        personRepository.save(person);


//creating another person Bob
        person = new Person();
        person.setName("Bob");
        persons.add(person);

        pets = new HashSet<>();
        pet = new Pet();
        pet.setName("Tinkerbell ");
        pets.add(pet);
        person.setPets(pets);
        personRepository.save(person);


//creating a person
        person = new Person();
        person.setName("Anna");
        persons.add(person);

        pets = new HashSet<>();
        pet = new Pet();
        pet.setName("Cutie");
        pets.add(pet);

        pet = new Pet();
        pet.setName("Ginger");
        pets.add(pet);

        person.setPets(pets);
        personRepository.save(person);


        model.addAttribute("persons", personRepository.findAll());
        return "index";






    }
}
