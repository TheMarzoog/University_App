package software.eng;

import software.eng.courses.Course;
import software.eng.courses.LectureCourse;
import software.eng.courses.OnlineCourse;

public class Main {

    public static void main(String[] args) {
	    Course course = new Course("SEECx", 2017, 5, 30, 12, 0);
	    course.printCourseTitle();

        LectureCourse lectureCourse = new LectureCourse("POM", 100, 70);
        lectureCourse.printCourseTitle();

        OnlineCourse onlineCourse = new OnlineCourse("SEECx", "www.pmu.edu.sa");
        onlineCourse.printCourseTitle();
    }
}
