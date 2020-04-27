package cs1;

public class Employee {
    private int id;
    private String name;
    private String gender;
    private String salary;
    private String address;
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public String getSalary() {
        return salary;
    }
    public void setSalary(String salary) {
        this.salary = salary;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String addr) {
        this.address = addr;
    }
    
    @Override
    public String toString() {
        return "Employee:: ID="+this.id+" Name=" + this.name + " Salary=" + this.salary + " Gender=" + this.gender +
                " Address=" + this.address;
    }
}

