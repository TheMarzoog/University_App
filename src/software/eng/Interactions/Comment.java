package software.eng.Interactions;

import software.eng.Person.Person;

public class Comment extends Interaction implements Likeable {

    public String comment;

    public Comment(Person initiator, String comment) {
        super(initiator);
        this.comment = comment;
    }

    @Override
    public void printInteraction() {
        System.out.printf("%s, comment by %s.%n", comment, initiator.firstName);
    }

    @Override
    public void like() {
        System.out.println("Liked!");
    }
}
