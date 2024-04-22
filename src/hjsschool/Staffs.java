
package hjsschool;

import java.util.ArrayList;


public class Staffs {
    
    private int staffNo;
    private String fullname;
    private String email;
    private String password;
    private String contactNo;
    private String role;
    
   public static ArrayList <Staffs> staffdata = new ArrayList<>();

    public Staffs(int staffNo, String fullname, String email, String password, String contactNo, String role) {
        this.staffNo = staffNo;
        this.fullname = fullname;
        this.email = email;
        this.password = password;
        this.contactNo = contactNo;
        this.role = role;
    }

    public int getStaffNo() {
        return staffNo;
    }

    public String getFullname() {
        return fullname;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getContactNo() {
        return contactNo;
    }

    public String getRole() {
        return role;
    }

    public static ArrayList<Staffs> getStaffs() {
        
        Staffs s1 = new Staffs(5001,"Sean Collins","collins@gmail.com","123456","01375 393394","staff");
        Staffs s2 = new Staffs(5002,"Marshall","marshall@gmail.com","123456","01736 366353","staff");
        Staffs s3 = new Staffs(5003,"Leah White","leah@gmail.com","123456","020 8343 7303","staff");
        Staffs s4 = new Staffs(5004,"Bradley","bradley@gmail.com","123456","01423 541888","staff");
        Staffs s5 = new Staffs(5005,"Reece Mitchell","reece@gmail.com","123456","0114 258 0006","staff");
        Staffs s6 = new Staffs(5006,"Isabelle Reynolds","reynolds@gmail.com","123456","01934 510777","staff");
        
        Staffs.staffdata.add(s1);
        Staffs.staffdata.add(s2);
        Staffs.staffdata.add(s3);
        Staffs.staffdata.add(s4);
        Staffs.staffdata.add(s5);
        Staffs.staffdata.add(s6);
        
        return staffdata;
    }
    
    
    
    
    
}
