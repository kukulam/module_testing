package kukulam.module.testing.level.D.person;

class PersonRepository {
    private Person[] people = new Person[0];

    Person[] findAll() {
        return people;
    }

    Person[] findByAge(int age) {
        int amountOfFoundPeople = 0;

        for (int i = 0; i < people.length; i++) {
            if (people[i].getAge() == age) {
                amountOfFoundPeople++;
            }
        }

        Person[] foundPeople = new Person[amountOfFoundPeople];
        for (int i = 0, j = 0; i < people.length; i++) {
            if (people[i].getAge() == age) {
                foundPeople[j] = people[i];
                j++;
            }
        }

        return foundPeople;
    }

    void add(Person person) {
        Person[] updatedPeople = new Person[people.length + 1];
        for (int i = 0; i < people.length; i++) {
            updatedPeople[i] = people[i];
        }
        updatedPeople[people.length] = person;

        people = updatedPeople;
    }
}