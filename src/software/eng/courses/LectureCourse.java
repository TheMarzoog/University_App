package software.eng.courses;

import java.awt.*;

public class LectureCourse extends Course {
    public Point location;


    public LectureCourse(String title, int x, int y) {
        super(title);
        location = new Point();
        location.setLocation(x, y);
    }

}
