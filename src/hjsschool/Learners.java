
package hjsschool;

import java.util.ArrayList;
import java.util.HashSet;
import javax.swing.table.DefaultTableModel;


public class Learners {
    
    private int learnerRollNo;
    private String fullname;
    private String email;
    private String password;
    private String contactNo;
    private int age;
    private String gender;
    private int currentGradeLevel;
    
    public static int MIN_AGE = 4;
    public static int MAX_AGE = 11;
    
    public static ArrayList <Learners> learnerdata = new ArrayList<>();

    public Learners(int learnerRollNo, String fullname, String email, String password, String contactNo, int age, String gender, int currentGradeLevel) {
        this.learnerRollNo = learnerRollNo;
        this.fullname = fullname;
        this.email = email;
        this.password = password;
        this.contactNo = contactNo;
        this.age = age;
        this.gender = gender;
        this.currentGradeLevel = currentGradeLevel;
    }

    public int getLearnerRollNo() {
        return learnerRollNo;
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

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public int getCurrentGradeLevel() {
        return currentGradeLevel;
    }

    public void setCurrentGradeLevel(int currentGradeLevel) {
        this.currentGradeLevel = currentGradeLevel;
    }    
    
    public static ArrayList<Learners> getLearners() {
        Learners l1 = new Learners(5001,"Elsie Cooper","cooper@gmail.com","123456","01463 237499",8,"Male",2);
        Learners l2 = new Learners(5002,"Teagan Stevens","stevens@gmail.com","123456","0845 373 0955",9,"Male",4);
        Learners l3 = new Learners(5003,"James","james@gmail.com","123456","01639 642733",10,"Male",5);
        Learners l4 = new Learners(5004,"Edward","edward@gmail.com","123456","01929 400200",11,"Male",3);
        Learners l5 = new Learners(5005,"Tyler Palmer","tyler@gmail.com","123456","0800 035 1054",5,"Male",1);
        Learners.learnerdata.add(l1);
        Learners.learnerdata.add(l2);
        Learners.learnerdata.add(l3);
        Learners.learnerdata.add(l4);
        Learners.learnerdata.add(l5);
        return learnerdata;
    }
    
     
    /**
     *  Method to check current level of grade with the selected slot
     * @param learnerRollNo
     * @return 
     */
    public static boolean checkCurrentLevel(int learnerRollNo){
        
        ArrayList<Learners> learnerData = Learners.getLearners();
        ArrayList<Timetables> timetables = Timetables.getTimetable();
        int slotNo = Timetables.SELECTED_FOR_RESERVATION;
        
        int slotGrade = 0;
        int learnerGrade = 0;
        boolean notOfCurrentGrade = false;
        
        for (Timetables tObj : timetables) {
            if(tObj.getSlotNo().equalsIgnoreCase(String.valueOf(slotNo))){
                slotGrade = tObj.getGradeNo();
            }
        }
         
        for (Learners obj : learnerData) {
            if(obj.getLearnerRollNo() == learnerRollNo){
                learnerGrade = obj.getCurrentGradeLevel();
                break;
            }
        }
        
        if(slotGrade > (learnerGrade+1) || slotGrade < learnerGrade){
            notOfCurrentGrade = true;
        }
        
        return notOfCurrentGrade;
    }
    
     
    /**
     * Method to find coach by coachNo
     * @param learners
     * @param learnerRollNo
     * @return 
     */
    public static Learners findLearnerById(ArrayList<Learners> learners, int learnerRollNo){
        
        ArrayList<Learners> learnerData = Learners.getLearners();
        
        Learners objData = null;
        for (Learners obj : learnerData) {
            if(obj.getLearnerRollNo() == learnerRollNo){
                objData = obj;
            }
        }
        return objData;
    }
    
    
     
    /**
     *  Method to update current level
     * @param learnerRollNo 
     */
    public static void updateCurrentGradeLevel(int learnerRollNo){
        ArrayList<Learners> learnerData = Learners.getLearners();
        
       for(int i=0; i<learnerData.size(); i++){
            if(learnerData.get(i).getLearnerRollNo() == learnerRollNo){
                int level = learnerData.get(i).getCurrentGradeLevel();
                learnerData.get(i).setCurrentGradeLevel(level + 1);   
                break;
            }
        }
    }
    
    
    /**
     * Return All Learners
     * @param tableModel
     * @return 
     */
    public static ArrayList getLearnerList(DefaultTableModel tableModel){
        ArrayList<Learners> learners = Learners.getLearners();
        HashSet<String> uniqueRecords = new HashSet<>();
        ArrayList<Timetables> data = new ArrayList<>(); 
        
        for (Learners obj : learners) {
               
            int rollNo = obj.getLearnerRollNo();
            int age = obj.getAge();
            int currentGrade = obj.getCurrentGradeLevel();
            String fullname = obj.getFullname();
            String email = obj.getEmail();
            String contact = obj.getContactNo();
            String gender = obj.getGender();

             // Create a unique key for each record
            String recordKey = rollNo + fullname + email + contact + age + gender;

            // Check if the record is unique before adding it
            if (uniqueRecords.add(recordKey)) {
                String[] arr = {String.valueOf(rollNo), fullname, email, contact,String.valueOf(age), gender, String.valueOf(currentGrade)};
                tableModel.addRow(arr);
            }
        }
           
        return data;
    }
    
    
    
     
    /**
     *  Method to return current grade level
     * @param learnerRollNo 
     * @return  
     */
    public static int returnGradeLevel(int learnerRollNo){
        
        ArrayList<Learners> learnerData = Learners.getLearners();
                
        int gradeLevel = 0;
        for(int i=0; i<learnerData.size(); i++){
            if(learnerData.get(i).getLearnerRollNo() == learnerRollNo){
                gradeLevel = learnerData.get(i).getCurrentGradeLevel();
                break;
            }
        }
        
        return gradeLevel;
    }
    
    /**
     * Validate age is numeric or not
     * @param str
     * @return 
     */  
    public static boolean validateAge(String str)
    {
        for (int i = 0; i < str.length(); i++)
        {
            if (!Character.isDigit(str.charAt(i)))
                return false;
        }
        return true;
    }
    
    
   /**
    * Add Learner 
    * @param name
    * @param email
    * @param contact
    * @param password
    * @param age
    * @param grade
    * @param genders 
    */
    public static void addLearner(String name, String email, String contact, String password, int age, int grade, String genders)
    {
        int rollNo = Reservations.reservationNo();
        Learners obj = new Learners(rollNo,name,email,password,contact,age,genders,grade);
        Learners.learnerdata.add(obj);
    }
    
}
