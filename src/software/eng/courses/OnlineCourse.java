package software.eng.courses;




public class OnlineCourse extends Course{

    private String url;

    public OnlineCourse(String title, String url) {
        super(title);
        this.url = url;

    }
}
