
package arraydemo;


public class Student {
    //comment added at 9:27AM
    //comment added for modification
    //comment added for fetch and merge
    //comment for pull
    private String sId;
    private String sName;
    private String address;
    
    public Student(String sId, String sName) {
        this.sId = sId;
        this.sName = sName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getsId() {
        return sId;
    }

    public void setsId(String sId) {
        this.sId = sId;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }
    
    
}
