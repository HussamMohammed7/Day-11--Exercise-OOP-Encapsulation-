import java.util.ArrayList;

public class Employee {
    private static ArrayList<String> ids = new ArrayList<>();


    private String id;
    private String name;
    private int salary = 0;

    Employee(){

    }
    Employee(String id, String name, int salary) throws IllegalArgumentException{
        if (ids.contains(id)) {
            throw new IllegalArgumentException("ID already exists.");
        }
        this.id = id;
        this.name = name;
        this.salary = salary;
        ids.add(id);

    }

    public String getId() {
        return id;
    }

    public void setId(String id) throws IllegalArgumentException {
        int index = ids.indexOf(this.id);
        if (index != -1) {
            ids.set(index, id);
        } else if (ids.contains(id)) {
            throw new IllegalArgumentException("ID already exists.");
        } else {
            ids.add(id);
        }
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAnnualSalary() {

        return this.salary*12;
    }
    public int raisedSalary(int percentage) {

        this.salary += this.salary * (percentage / 100.0);
        return this.salary;
    }


    public String toString() {
        return "Employee{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
