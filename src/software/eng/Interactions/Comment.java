package software.eng.Interactions;

public class Comment extends Interaction implements Likeable {

    public Interaction interaction;
    public String comment;

    public Comment(Interaction interaction, String comment) {
        this.interaction = interaction;
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
