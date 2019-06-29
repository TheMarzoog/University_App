package software.eng.Interactions;

public class Like extends Interaction {

    public Interaction interaction;

    public Like(Interaction interaction) {
        this.interaction = interaction;
    }

    @Override
    public void printInteraction(){
        System.out.printf("Liked by %s", initiator.firstName);
    }
}
