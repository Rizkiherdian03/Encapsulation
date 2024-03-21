public class Student extends Person {
    private int numCourses = 0;
    private String[] courses = {};
    private int[] grades = {};

    public Student(String name, String address) {
        super(name, address);
    }

    public void addCourse(String course) {
        if (!isCourseExist(course)) {
            String[] newCourses = new String[numCourses + 1];
            System.arraycopy(courses, 0, newCourses, 0, numCourses);
            newCourses[numCourses++] = course;
            courses = newCourses;
        }
    }

    public void addCourseGrade(String course, int grade) {
        if (isCourseExist(course)) {
            int index = findCourseIndex(course);
            grades[index] = grade;
        }
    }

    public void printGrades() {
        for (int i = 0; i < numCourses; i++) {
            System.out.println(String.format("%s: %d", courses[i], grades[i]));
        }
    }

    public double getAverageGrade() {
        double total = 0;
        for (int grade : grades) {
            total += grade;
        }
        return total / numCourses;
    }

    private boolean isCourseExist(String course) {
        for (String c : courses) {
            if (c.equals(course)) {
                return true;
            }
        }
        return false;
    }

    private int findCourseIndex(String course) {
        for (int i = 0; i < numCourses; i++) {
            if (courses[i].equals(course)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public String toString() {
        return String.format("Student: %s", super.toString());
    }
}
