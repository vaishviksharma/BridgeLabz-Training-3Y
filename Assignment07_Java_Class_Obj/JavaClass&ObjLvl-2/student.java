class Student{
    String name;
    int rollNumber;
    int marks;

    Student(String name, int rollNumber, int marks){
        this.name= name;
        this.rollNumber= rollNumber;
        this.marks= marks;
    }

    public String grade(){
        if(marks >= 90){
            return "A";
        } else if(marks >= 80){
            return "B";
        } else if(marks >= 70){
            return "C";
        } else {
            return "D";
        }
    }

    public void displayDetails(){
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + grade());
    }
}