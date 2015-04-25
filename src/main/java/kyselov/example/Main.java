package kyselov.example;

import kyselov.person.Person;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Person husband = new Person.Builder().firstName("Ivan").eMail("kyselov@online.ua").age(30).build();
        Person wife = new Person.Builder().firstName("Tatiana").eMail("kyselova@ukr.net").age(29).build();
        Person son = new Person.Builder().firstName("Mykhail").eMail("mike@baby.com").age(2).build();

        Person[] persons = {husband,wife,son};
        Collection<Person> personLinkedList = new LinkedList<Person>(Arrays.asList(persons));
        for(Person temp:personLinkedList){
                System.out.println(temp.toString());
           }

        HashMap<String, Person> myPersonHashMap = new HashMap<String ,Person>();
        myPersonHashMap.put("husband", husband);
        myPersonHashMap.put("wife", wife);
        myPersonHashMap.put("son", son);



        System.out.println(myPersonHashMap.values().toString());
        System.out.println(myPersonHashMap.containsKey("husband"));

        Collection<Person> myFamily = new HashSet<Person>();
        myFamily.add(husband);
        myFamily.add(wife);
        myFamily.add(son);

        for(Person temp:myFamily){
            System.out.println(temp.toString());
        }
    }
}
