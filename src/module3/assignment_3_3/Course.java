package module3.assignment_3_3;
import java.util.Date;
/**
 * Created by merkulovvs on 11/10/2016.
 */
public class Course {
    private Date startDate;
    private String name;
    private int courseDuration;
    private String teacherName;

    public Course(){

    }

    public Course(int startDate, String name){

    }
    public Course(int courseDuration, String name, String teacherName){

    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCourseDuration() {
        return courseDuration;
    }

    public void setCourseDuration(int courseDuration) {
        this.courseDuration = courseDuration;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }
}
