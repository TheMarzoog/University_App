package software.eng.Interactions;

import software.eng.Person.Person;

public class Like extends Interaction {

    public Like(Person initiator) {
        super(initiator);
    }

    @Override
    public void printInteraction(){
        System.out.printf("Liked by %s", initiator.firstName);
    }
}
