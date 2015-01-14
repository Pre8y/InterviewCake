
package in.icake.practice;

public class Employee implements Comparable<Employee> {

    private int id;
    private String name;
    private int salary;

    public Employee(int id, int salary, String name) {
        this.id = id;
        this.salary = salary;
        this.name = name;
    }

    @Override
    public int compareTo(Employee o) {

        return this.salary - o.salary;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return name;
    }

}
