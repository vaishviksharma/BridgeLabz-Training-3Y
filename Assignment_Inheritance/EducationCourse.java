
class Course {
    String courseName;
    int duration; // weeks

    Course(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;
    }
}

class OnlineCourse extends Course {
    String platform;
    boolean isRecorded;

    OnlineCourse(String courseName, int duration, String platform, boolean isRecorded) {
        super(courseName, duration);
        this.platform = platform;
        this.isRecorded = isRecorded;
    }
}

class PaidOnlineCourse extends OnlineCourse {
    double fee;
    double discount;

    PaidOnlineCourse(String courseName, int duration, String platform, boolean isRecorded, double fee, double discount) {
        super(courseName, duration, platform, isRecorded);
        this.fee = fee;
        this.discount = discount;
    }

    void displayInfo() {
        System.out.println("Course: " + courseName);
        System.out.println("Duration: " + duration + " weeks");
        System.out.println("Platform: " + platform);
        System.out.println("Recorded: " + isRecorded);
        System.out.println("Fee: " + fee);
        System.out.println("Discount: " + discount + "%");
    }
}

public class EducationalCourse {
    public static void main(String[] args) {
        PaidOnlineCourse poc = new PaidOnlineCourse("Java Programming", 8, "Udemy", true, 4999, 20);
        poc.displayInfo();
    }
}