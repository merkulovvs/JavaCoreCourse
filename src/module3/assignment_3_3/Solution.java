package module3.assignment_3_3;


import java.util.Date;

/**
 * Created by merkulovvs on 11/10/2016.
 */
public class Solution {

        Date d = new Date();

        Course history = new Course();
        Course math = new Course(d,"Victor");
        Course biology = new Course(3, "Johnes", "Galbraith");
        Course chemistry = new Course();
        Course english = new Course(d, "Sam");
        Course science = new Course (3, "Smith", "Wilson");
        Course[] coursesTaken = {history, math, biology, chemistry};


        Student student1 = new Student("William", "Low", 5);
        Student student2 = new Student("Close", coursesTaken);

        CollegeStudent collegeStudent1 = new CollegeStudent("Ronald", "Regan", 10);
        CollegeStudent collegeStudent2 = new CollegeStudent("Bush", coursesTaken);
        CollegeStudent collegeStudent3 = new CollegeStudent("Jim", "Carter", 3,
                                                            "BYU-Idaho", 4, 1120330);

        SpecialStudent specialStudent1 = new SpecialStudent("William", "Clinton", 1);
        SpecialStudent specialStudent2 = new SpecialStudent("Einstein", coursesTaken);
        SpecialStudent specialStudent3 = new SpecialStudent(12231582);
}
