class Employee{
    
    String name;
    int id;
    int salary;

    Employee(String name, id, salary){
        this.name= name;
        this.id= id;
        this.sal= salary
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: " + salary);
    }

    public static void main(String[] args){
        Employee emp= new Employee("Akshay", 42, 100);
        emp.displayInfo();
    }
}