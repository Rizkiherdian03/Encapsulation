public class Teacher extends Person {
    private int numCourses = 0;
    private String[] courses = {};

    public Teacher(String name, String address) {
        super(name, address);
    }

    public boolean addCourse(String course) {
        if (!isCourseExist(course)) {
            String[] newCourses = new String[numCourses + 1];
            System.arraycopy(courses, 0, newCourses, 0, numCourses);
            newCourses[numCourses++] = course;
            courses = newCourses;
            return true;
        }
        return false;
    }

    public boolean removeCourse(String course) {
        if (isCourseExist(course)) {
            int index = findCourseIndex(course);
            String[] newCourses = new String[numCourses - 1];
            System.arraycopy(courses, 0, newCourses, 0, index);
            System.arraycopy(courses, index + 1, newCourses, index, numCourses - index - 1);
            courses = newCourses;
            numCourses--;
            return true;
        }
        return false;
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
}
    
        
    
