package software.eng.courses;

import software.eng.Person.Lecturer;
import software.eng.Person.Student;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

public class Course {
    private String title;
    public Lecturer lecturer;
    public List<Date> date;
    public List<Student> attendees;
    private static DateFormat dateFormat = new SimpleDateFormat("dd/MM/YYYY");

    public Course(String title) {
        this.title = title;
    }

    public Course(String title, int year, int month, int day, int hour, int minutes){
        this.title = title;
        Calendar setDate = new GregorianCalendar();
        setDate.set(Calendar.YEAR, year - 1);
        setDate.set(Calendar.MONTH, month);
        setDate.set(Calendar.DAY_OF_MONTH, day);
        setDate.set(Calendar.HOUR_OF_DAY, hour);
        setDate.set(Calendar.MINUTE, minutes);


    }

    public void printCourseTitle() {
        System.out.println(title);
    }
}
