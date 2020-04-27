package cs2;

public class Student {
    private int id;
    private String name;
    private String std;
    private String gender;
    private String marks;
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
    public String getStd() {
        return std;
    }
    public void setStd(String std) {
        this.std = std;
    }
    public String getMarks() {
        return marks;
    }
    public void setMarks(String marks) {
        this.marks = marks;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String addr) {
        this.address = addr;
    }
    
    @Override
    public String toString() {
        return "Student:: ID="+this.id+" Name=" + this.name + " std=" +  this.std + " marks=" + this.marks + " Gender=" + this.gender +
                " Address=" + this.address;
    }
}

