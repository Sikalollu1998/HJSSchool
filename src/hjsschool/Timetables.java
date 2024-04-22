
package hjsschool;

import java.util.ArrayList;
import java.util.HashSet;
import javax.swing.table.DefaultTableModel;


public class Timetables {
    

    private String slotNo;
    private String lessonName;
    private String lessonDay;
    private int gradeNo;
    private int takenBy;
    private String lessonSlot;
    private int noOfSeats;
    private String lessonDate;
    
    public static ArrayList <Timetables> timetabledata = new ArrayList<>();
    public static int SELECTED_FOR_RESERVATION = 0;


    public Timetables(String slotNo, String lessonName, String lessonDay, int gradeNo, int takenBy, String lessonSlot, int noOfSeats, String lessonDate) {
        this.slotNo = slotNo;
        this.lessonName = lessonName;
        this.lessonDay = lessonDay;
        this.gradeNo = gradeNo;
        this.takenBy = takenBy;
        this.lessonSlot = lessonSlot;
        this.noOfSeats = noOfSeats;
        this.lessonDate = lessonDate;
    }
    
    public String getSlotNo() {
        return slotNo;
    }

    public int getGradeNo() {
        return gradeNo;
    }

    public String getLessonName() {
        return lessonName;
    }

    public String getLessonDay() {
        return lessonDay;
    }

    public String getLessonSlot() {
        return lessonSlot;
    }

    public String getLessonDate() {
        return lessonDate;
    }

    public int getNoOfSeats() {
        return noOfSeats;
    }

    public int getTakenBy() {
        return takenBy;
    }

    public void setNoOfSeats(int noOfSeats) {
        this.noOfSeats = noOfSeats;
    }

    public void setLessonName(String lessonName) {
        this.lessonName = lessonName;
    }
    
    public static ArrayList<Timetables> getTimetable() {
        
        Timetables t1 = new Timetables("78001","Lesson1","Mon",1,6001,"4-5pm",4,"6May,2024");
        Timetables t2 = new Timetables("78002","Lesson2","Mon",2,6002,"5-6pm",4,"6May,2024");
        Timetables t3 = new Timetables("78003","Lesson3","Mon",3,6003,"6-7pm",4,"6May,2024");
               
        Timetables t4 = new Timetables("78004","Lesson4","Wed",4,6004,"4-5pm",4,"8May,2024");        
        Timetables t5 = new Timetables("78005","Lesson5","Wed",5,6005,"5-6pm",4,"8May,2024");
        Timetables t6 = new Timetables("78006","Lesson6","Wed",1,6006,"6-7pm",4,"8May,2024");
        
        Timetables t7 = new Timetables("78007","Lesson7","Fri",2,6001,"4-5pm",4,"10May,2024");
        Timetables t8 = new Timetables("78008","Lesson8","Fri",3,6002,"5-6pm",4,"10May,2024");
        Timetables t9 = new Timetables("78009","Lesson9","Fri",4,6003,"6-7pm",4,"10May,2024");
        
        Timetables t10 = new Timetables("78010","Lesson10","Sat",5,6004,"2-3pm",4,"11May,2024");
        Timetables t11 = new Timetables("78011","Lesson11","Sat",1,6005,"3-4pm",4,"11May,2024");
        
        
        Timetables t12 = new Timetables("78012","Lesson12","Mon",3,6006,"4-5pm",4,"13May,2024");
        Timetables t13 = new Timetables("78013","Lesson13","Mon",5,6001,"5-6pm",4,"13May,2024");
        Timetables t14 = new Timetables("78014","Lesson14","Mon",4,6002,"6-7pm",4,"13May,2024");
                
        Timetables t15 = new Timetables("78015","Lesson15","Wed",3,6004,"4-5pm",4,"15May,2024");        
        Timetables t16 = new Timetables("78016","Lesson16","Wed",2,6003,"5-6pm",4,"15May,2024");
        Timetables t17 = new Timetables("78017","Lesson17","Wed",1,6005,"6-7pm",4,"15May,2024");
        
        Timetables t18 = new Timetables("78018","Lesson18","Fri",5,6006,"4-5pm",4,"17May,2024");
        Timetables t19 = new Timetables("78019","Lesson19","Fri",4,6001,"5-6pm",4,"17May,2024");
        Timetables t20 = new Timetables("78020","Lesson20","Fri",3,6002,"6-7pm",4,"17May,2024");
        
        Timetables t21 = new Timetables("78021","Lesson21","Sat",2,6003,"2-3pm",4,"18May,2024");
        Timetables t22 = new Timetables("78022","Lesson22","Sat",1,6004,"3-4pm",4,"18May,2024");
        
        
        Timetables t23 = new Timetables("78023","Lesson23","Mon",1,6005,"4-5pm",4,"20May,2024");
        Timetables t24 = new Timetables("78024","Lesson24","Mon",2,6006,"5-6pm",4,"20May,2024");
        Timetables t25 = new Timetables("78025","Lesson25","Mon",3,6001,"6-7pm",4,"20May,2024");
                
        Timetables t26 = new Timetables("78026","Lesson26","Wed",4,6002,"4-5pm",4,"22May,2024");        
        Timetables t27 = new Timetables("78027","Lesson27","Wed",5,6003,"5-6pm",4,"22May,2024");
        Timetables t28 = new Timetables("78028","Lesson28","Wed",1,6004,"6-7pm",4,"22May,2024");
        
        Timetables t29 = new Timetables("78029","Lesson29","Fri",2,6006,"4-5pm",4,"24May,2024");
        Timetables t30 = new Timetables("78030","Lesson30","Fri",3,6004,"5-6pm",4,"24May,2024");
        Timetables t31 = new Timetables("78031","Lesson31","Fri",4,6003,"6-7pm",4,"24May,2024");
        
        Timetables t32 = new Timetables("78032","Lesson32","Sat",5,6002,"2-3pm",4,"25May,2024");
        Timetables t33 = new Timetables("78033","Lesson33","Sat",1,6001,"3-4pm",4,"25May,2024");
                
        
        Timetables t34 = new Timetables("78034","Lesson34","Mon",4,6005,"4-5pm",4,"27May,2024");
        Timetables t35 = new Timetables("78035","Lesson35","Mon",3,6006,"5-6pm",4,"27May,2024");
        Timetables t36 = new Timetables("78036","Lesson36","Mon",5,6001,"6-7pm",4,"27May,2024");
                
        Timetables t37 = new Timetables("78037","Lesson37","Wed",2,6002,"4-5pm",4,"29May,2024");        
        Timetables t38 = new Timetables("78038","Lesson38","Wed",1,6003,"5-6pm",4,"29May,2024");
        Timetables t39 = new Timetables("78039","Lesson39","Wed",5,6004,"6-7pm",4,"29May,2024");
        
        Timetables t40 = new Timetables("78040","Lesson40","Fri",4,6006,"4-5pm",4,"31May,2024");
        Timetables t41 = new Timetables("78041","Lesson41","Fri",1,6004,"5-6pm",4,"31May,2024");
        Timetables t42 = new Timetables("78042","Lesson42","Fri",5,6003,"6-7pm",4,"31May,2024");
        
        Timetables t43 = new Timetables("78043","Lesson43","Sat",4,6002,"2-3pm",4,"1June,2024");
        Timetables t44 = new Timetables("78044","Lesson44","Sat",2,6001,"3-4pm",4,"1June,2024");
                
        
        Timetables.timetabledata.add(t1);
        Timetables.timetabledata.add(t2);
        Timetables.timetabledata.add(t3);
        Timetables.timetabledata.add(t4);
        Timetables.timetabledata.add(t5);
        Timetables.timetabledata.add(t6);
        Timetables.timetabledata.add(t7);
        Timetables.timetabledata.add(t8);
        Timetables.timetabledata.add(t9);
        Timetables.timetabledata.add(t10);
        Timetables.timetabledata.add(t11);
        Timetables.timetabledata.add(t12);        
        Timetables.timetabledata.add(t13);
        Timetables.timetabledata.add(t14);
        Timetables.timetabledata.add(t15);
        Timetables.timetabledata.add(t16);
        Timetables.timetabledata.add(t17);
        Timetables.timetabledata.add(t18);
        Timetables.timetabledata.add(t19);
        Timetables.timetabledata.add(t20);
        Timetables.timetabledata.add(t21);
        Timetables.timetabledata.add(t22);
        Timetables.timetabledata.add(t23);
        Timetables.timetabledata.add(t24);
        Timetables.timetabledata.add(t25);
        Timetables.timetabledata.add(t26);
        Timetables.timetabledata.add(t27);
        Timetables.timetabledata.add(t28);
        Timetables.timetabledata.add(t29);
        Timetables.timetabledata.add(t30);
        Timetables.timetabledata.add(t31);
        Timetables.timetabledata.add(t32);
        Timetables.timetabledata.add(t33);
        Timetables.timetabledata.add(t34);
        Timetables.timetabledata.add(t35);
        Timetables.timetabledata.add(t36);
        Timetables.timetabledata.add(t37);
        Timetables.timetabledata.add(t38);
        Timetables.timetabledata.add(t39);
        Timetables.timetabledata.add(t40);
        Timetables.timetabledata.add(t41);
        Timetables.timetabledata.add(t42);
        Timetables.timetabledata.add(t43);
        Timetables.timetabledata.add(t44);
        
        return timetabledata;
    }
    
    
   /**
    * Return All Timetable
    * @param tableModel
    * @return 
    */
    public static ArrayList getAllTimetable(DefaultTableModel tableModel){
        ArrayList<Coaches> coaches = Coaches.getCoaches();
        ArrayList<Timetables> timetables = Timetables.getTimetable();
        HashSet<String> uniqueRecords = new HashSet<>();
        ArrayList<Timetables> data = new ArrayList<>(); 
        for (Timetables timetable : timetables) {
            Coaches coach = Coaches.findCoachById(coaches, timetable.getTakenBy()); 
            String slotNo = timetable.getSlotNo();
            String gradeNo = String.valueOf(timetable.getGradeNo());
            String lessonDay = timetable.getLessonDay();
            String lessonSlot = timetable.getLessonSlot();
            String lessonDate = timetable.getLessonDate();
            String takenBy = coach.getFullname();
            String lessonName = timetable.getLessonName();
            int noOfSeats = timetable.getNoOfSeats();

            // Create a unique key for each record
            String recordKey = slotNo + lessonName + lessonDay + gradeNo + lessonSlot + takenBy + lessonDate;

            // Check if the record is unique before adding it
            if (uniqueRecords.add(recordKey)) {
                String[] arr = {slotNo, lessonName, lessonDay, gradeNo, lessonSlot, takenBy, String.valueOf(noOfSeats), lessonDate};
                tableModel.addRow(arr);
            }
        }
        return data;
    }
          
     
    
    /**
     *  Return All Timetable by given grade level
     * @param tableModel
     * @param gradeLevel
     * @return 
     */
    public static ArrayList getTimetableByGradeLevel(DefaultTableModel tableModel, int gradeLevel){
        ArrayList<Coaches> coaches = Coaches.getCoaches();
        HashSet<String> uniqueRecords = new HashSet<>();
        ArrayList<Timetables> timetables = Timetables.getTimetable();
        ArrayList<Timetables> data = new ArrayList<>(); 
        
        for (Timetables timetable : timetables) {
            if(timetable.getGradeNo() == gradeLevel){
                Coaches coach = Coaches.findCoachById(coaches, timetable.getTakenBy()); 
                String slotNo = timetable.getSlotNo();
                String gradeNo = String.valueOf(timetable.getGradeNo());
                String lessonDay = timetable.getLessonDay();
                String lessonSlot = timetable.getLessonSlot();
                String lessonDate = timetable.getLessonDate();
                String takenBy = coach.getFullname();
                String lessonName = timetable.getLessonName();
                int noOfSeats = timetable.getNoOfSeats();

                 // Create a unique key for each record
                String recordKey = slotNo + lessonName + lessonDay + gradeNo + lessonSlot + takenBy + lessonDate;

                // Check if the record is unique before adding it
                if (uniqueRecords.add(recordKey)) {
                    String[] arr = {slotNo, lessonName, lessonDay, gradeNo, lessonSlot, takenBy, String.valueOf(noOfSeats), lessonDate};
                    tableModel.addRow(arr);
                }
            }
        }
        return data;
    }
          
     
    
    /**
     * Return All Timetable by given day
     * @param tableModel
     * @param givenDay
     * @return 
     */
    public static ArrayList getTimetableByDay(DefaultTableModel tableModel, String givenDay){
        ArrayList<Coaches> coaches = Coaches.getCoaches();
        ArrayList<Timetables> timetables = Timetables.getTimetable();
        ArrayList<Timetables> data = new ArrayList<>(); 
        HashSet<String> uniqueRecords = new HashSet<>();
        
        for (Timetables timetable : timetables) {
            if(timetable.getLessonDay().equalsIgnoreCase(givenDay)){
                Coaches coach = Coaches.findCoachById(coaches, timetable.getTakenBy()); 
                String slotNo = timetable.getSlotNo();
                String gradeNo = String.valueOf(timetable.getGradeNo());
                String lessonDay = timetable.getLessonDay();
                String lessonSlot = timetable.getLessonSlot();
                String lessonDate = timetable.getLessonDate();
                String takenBy = coach.getFullname();
                String lessonName = timetable.getLessonName();
                int noOfSeats = timetable.getNoOfSeats();

               // Create a unique key for each record
                String recordKey = slotNo + lessonName + lessonDay + gradeNo + lessonSlot + takenBy + lessonDate;

                // Check if the record is unique before adding it
                if (uniqueRecords.add(recordKey)) {
                    String[] arr = {slotNo, lessonName, lessonDay, gradeNo, lessonSlot, takenBy, String.valueOf(noOfSeats), lessonDate};
                    tableModel.addRow(arr);
                }
            }
        }
        return data;
    }
          
     
     
    /**
     * Return All Timetable by given coach
     * @param tableModel
     * @param givenCoach
     * @return 
     */
    public static ArrayList getTimetableByCoach(DefaultTableModel tableModel, String givenCoach){
        ArrayList<Coaches> coaches = Coaches.getCoaches();
        ArrayList<Timetables> timetables = Timetables.getTimetable();
        ArrayList<Timetables> data = new ArrayList<>(); 
        HashSet<String> uniqueRecords = new HashSet<>();
        
        int num = 0;
        if(givenCoach.equalsIgnoreCase("-1")){
            num = 6001;
        }
        else  if(givenCoach.equalsIgnoreCase("0")){
            num = 6001;
        }else{
            num = Integer.parseInt(givenCoach);
        }
        
        int coachNum = getCoachNum(num);
        
        for (Timetables timetable : timetables) {
             Coaches coach = null;
             if(coachNum > 0){
                coach = Coaches.findCoachById(coaches, coachNum); 
            }else{
                coach = Coaches.findCoachById(coaches, timetable.getTakenBy()); 
            }
            if(timetable.getTakenBy() == coach.getCoachNo()){
                String slotNo = timetable.getSlotNo();
                String gradeNo = String.valueOf(timetable.getGradeNo());
                String lessonDay = timetable.getLessonDay();
                String lessonSlot = timetable.getLessonSlot();
                String lessonDate = timetable.getLessonDate();
                String takenBy = coach.getFullname();
                String lessonName = timetable.getLessonName();
                int noOfSeats = timetable.getNoOfSeats();

               // Create a unique key for each record
                String recordKey = slotNo + lessonName + lessonDay + gradeNo + lessonSlot + takenBy + lessonDate;

                // Check if the record is unique before adding it
                if (uniqueRecords.add(recordKey)) {
                    String[] arr = {slotNo, lessonName, lessonDay, gradeNo, lessonSlot, takenBy, String.valueOf(noOfSeats), lessonDate};
                    tableModel.addRow(arr);
                }
            }
        }
        return data;
    }
          
    private static int getCoachNum(int num){
        int coachNum = 0;
        switch (num) {
            case 1:
                coachNum = 6001;
                break;
            case 2:
                coachNum = 6002;
                break;
            case 3:
                coachNum = 6003;
                break;
            case 4:
                coachNum = 6004;
                break;
            case 5:
                coachNum = 6005;
                break;
            case 6:
                coachNum = 6006;
                break;
            default:
                coachNum = 0;
                break;
        }
        return coachNum;
    }
     
    
    /**
     * Return All Timetable by given day and grade
     * @param tableModel
     * @param givenDay
     * @param gradeLevel
     * @return 
     */
    public static ArrayList getTimetableByDayAndGrade(DefaultTableModel tableModel, String givenDay, int gradeLevel){
        ArrayList<Coaches> coaches = Coaches.getCoaches();
        ArrayList<Timetables> timetables = Timetables.getTimetable();
        ArrayList<Timetables> data = new ArrayList<>(); 
        HashSet<String> uniqueRecords = new HashSet<>();
        
        for (Timetables timetable : timetables) {
            if(timetable.getLessonDay().equalsIgnoreCase(givenDay) && timetable.getGradeNo() == gradeLevel){
                Coaches coach = Coaches.findCoachById(coaches, timetable.getTakenBy()); 
                String slotNo = timetable.getSlotNo();
                String gradeNo = String.valueOf(timetable.getGradeNo());
                String lessonDay = timetable.getLessonDay();
                String lessonSlot = timetable.getLessonSlot();
                String lessonDate = timetable.getLessonDate();
                String takenBy = coach.getFullname();
                String lessonName = timetable.getLessonName();
                int noOfSeats = timetable.getNoOfSeats();

                // Create a unique key for each record
                String recordKey = slotNo + lessonName + lessonDay + gradeNo + lessonSlot + takenBy + lessonDate;

                // Check if the record is unique before adding it
                if (uniqueRecords.add(recordKey)) {
                    String[] arr = {slotNo, lessonName, lessonDay, gradeNo, lessonSlot, takenBy, String.valueOf(noOfSeats), lessonDate};
                    tableModel.addRow(arr);
                }
            }
        }
        return data;
    }
          
     
    
    /**
     * Return All Timetable by given day and coach
     * @param tableModel
     * @param givenDay
     * @param givenCoach
     * @return 
     */
    public static ArrayList getTimetableByDayAndCoach(DefaultTableModel tableModel, String givenDay, String givenCoach){
        ArrayList<Coaches> coaches = Coaches.getCoaches();
        ArrayList<Timetables> timetables = Timetables.getTimetable();
        ArrayList<Timetables> data = new ArrayList<>(); 
        HashSet<String> uniqueRecords = new HashSet<>();
        
        int num = 0;
        if(givenCoach.equalsIgnoreCase("-1")){
            num = 6001;
        }
        else  if(givenCoach.equalsIgnoreCase("0")){
            num = 6001;
        }else{
            num = Integer.parseInt(givenCoach);
        }
       int coachNum = getCoachNum(num);
       
        for (Timetables timetable : timetables) {
             Coaches coach = null;
             if(coachNum > 0){
                coach = Coaches.findCoachById(coaches, coachNum); 
            }else{
                coach = Coaches.findCoachById(coaches, timetable.getTakenBy()); 
            }
            if(timetable.getLessonDay().equalsIgnoreCase(givenDay) && timetable.getTakenBy() == coach.getCoachNo()){
                String slotNo = timetable.getSlotNo();
                String gradeNo = String.valueOf(timetable.getGradeNo());
                String lessonDay = timetable.getLessonDay();
                String lessonSlot = timetable.getLessonSlot();
                String lessonDate = timetable.getLessonDate();
                String takenBy = coach.getFullname();
                String lessonName = timetable.getLessonName();
                int noOfSeats = timetable.getNoOfSeats();

                // Create a unique key for each record
                String recordKey = slotNo + lessonName + lessonDay + gradeNo + lessonSlot + takenBy + lessonDate;

                // Check if the record is unique before adding it
                if (uniqueRecords.add(recordKey)) {
                    String[] arr = {slotNo, lessonName, lessonDay, gradeNo, lessonSlot, takenBy, String.valueOf(noOfSeats), lessonDate};
                    tableModel.addRow(arr);
                }
            }
        }
        return data;
    }
          
     
     
    
    /**
     * Return All Timetable by given day and coach
     * @param tableModel
     * @param givenDay
     * @param givenCoach
     * @param gradeLevel
     * @return 
     */
    public static ArrayList getTimetableByDayCoachAndGrade(DefaultTableModel tableModel, String givenDay, String givenCoach, int gradeLevel){
        ArrayList<Coaches> coaches = Coaches.getCoaches();
        ArrayList<Timetables> timetables = Timetables.getTimetable();
        ArrayList<Timetables> data = new ArrayList<>(); 
        HashSet<String> uniqueRecords = new HashSet<>();
        
        int num = 0;
        if(givenCoach.equalsIgnoreCase("-1")){
            num = 6001;
        }
        else  if(givenCoach.equalsIgnoreCase("0")){
            num = 6001;
        }else{
            num = Integer.parseInt(givenCoach);
        }
        int coachNum = getCoachNum(num);
       
        for (Timetables timetable : timetables) {
             Coaches coach = null;
             if(coachNum > 0){
                coach = Coaches.findCoachById(coaches, coachNum); 
            }else{
                coach = Coaches.findCoachById(coaches, timetable.getTakenBy()); 
            }
            if(timetable.getLessonDay().equalsIgnoreCase(givenDay) && timetable.getTakenBy() == coach.getCoachNo() && timetable.getGradeNo() == gradeLevel){
                String slotNo = timetable.getSlotNo();
                String gradeNo = String.valueOf(timetable.getGradeNo());
                String lessonDay = timetable.getLessonDay();
                String lessonSlot = timetable.getLessonSlot();
                String lessonDate = timetable.getLessonDate();
                String takenBy = coach.getFullname();
                String lessonName = timetable.getLessonName();
                int noOfSeats = timetable.getNoOfSeats();

                // Create a unique key for each record
                String recordKey = slotNo + lessonName + lessonDay + gradeNo + lessonSlot + takenBy + lessonDate;

                // Check if the record is unique before adding it
                if (uniqueRecords.add(recordKey)) {
                    String[] arr = {slotNo, lessonName, lessonDay, gradeNo, lessonSlot, takenBy, String.valueOf(noOfSeats), lessonDate};
                    tableModel.addRow(arr);
                }
            }
        }
        return data;
    }
          
     
     
    
    /**
     *  Return All Timetable by given grade and coach
     * @param tableModel
     * @param givenCoach
     * @param gradeLevel
     * @return 
     */
    public static ArrayList getTimetableByCoachAndGrade(DefaultTableModel tableModel,String givenCoach, int gradeLevel){
        ArrayList<Coaches> coaches = Coaches.getCoaches();
        ArrayList<Timetables> timetables = Timetables.getTimetable();
        ArrayList<Timetables> data = new ArrayList<>(); 
        HashSet<String> uniqueRecords = new HashSet<>();
                 
        int num = 0;
        if(givenCoach.equalsIgnoreCase("-1")){
            num = 6001;
        }
        else  if(givenCoach.equalsIgnoreCase("0")){
            num = 6001;
        }else{
            num = Integer.parseInt(givenCoach);
        }
        int coachNum = getCoachNum(num);
        
        for (Timetables timetable : timetables) {
            Coaches coach = null;
             if(coachNum > 0){
                coach = Coaches.findCoachById(coaches, coachNum); 
            }else{
                coach = Coaches.findCoachById(coaches, timetable.getTakenBy()); 
            }
            if(timetable.getGradeNo() == gradeLevel && timetable.getTakenBy() == coach.getCoachNo()){
                String slotNo = timetable.getSlotNo();
                String gradeNo = String.valueOf(timetable.getGradeNo());
                String lessonDay = timetable.getLessonDay();
                String lessonSlot = timetable.getLessonSlot();
                String lessonDate = timetable.getLessonDate();
                String takenBy = coach.getFullname();
                String lessonName = timetable.getLessonName();
                int noOfSeats = timetable.getNoOfSeats();

                // Create a unique key for each record
                String recordKey = slotNo + lessonName + lessonDay + gradeNo + lessonSlot + takenBy + lessonDate;

                // Check if the record is unique before adding it
                if (uniqueRecords.add(recordKey)) {
                    String[] arr = {slotNo, lessonName, lessonDay, gradeNo, lessonSlot, takenBy, String.valueOf(noOfSeats), lessonDate};
                    tableModel.addRow(arr);
                }
            }
        }
        return data;
    }
          
    
       
    
    /**
     * Update Seats
     * @param slotNo
     * @param increment
     * @param decrement 
     */
    public static void updateSeats(int slotNo, int increment, int decrement){
     ArrayList<Timetables> timetables = Timetables.getTimetable();
        for (int i=0; i<timetables.size(); i++){
            if(timetables.get(i).getSlotNo().equalsIgnoreCase(String.valueOf(slotNo)) && increment != 0 && decrement == 0){
                int seats = timetables.get(i).getNoOfSeats();
                timetables.get(i).setNoOfSeats(seats + 1);
            }
            else if(timetables.get(i).getSlotNo().equalsIgnoreCase(String.valueOf(slotNo)) && decrement != 0 && increment == 0){
                int seats = timetables.get(i).getNoOfSeats();
                timetables.get(i).setNoOfSeats(seats - 1);
            }
        }
    }
     
}
