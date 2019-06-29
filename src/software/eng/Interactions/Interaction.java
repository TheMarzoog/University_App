package software.eng.Interactions;

import software.eng.Person.Person;

abstract class Interaction {
    public Person initiator;

    public Interaction(Person initiator){
    }

    abstract void printInteraction();

}
