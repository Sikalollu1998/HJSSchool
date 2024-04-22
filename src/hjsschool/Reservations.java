
package hjsschool;

import static hjsschool.AttendReservationGUI.addedFor;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Random;
import javax.swing.table.DefaultTableModel;


public class Reservations {
    
      
    private int reservationNo;
    private int learnerRollNo;
    private int slotNo;
    private String reservationStatus;
    private String reservationOn;
    
     
    public static String CLASS_BOOKED = "Booked";
    public static String CLASS_ATTENDED = "Attended";
    public static String CLASS_CHANGED = "Changed";
    public static String CLASS_CANCELLED = "Cancelled";
    public static int SELECTED_FOR_ATTEND_CLASS = 0;

    
    public static ArrayList <Reservations> reservationdata = new ArrayList<>();

    public Reservations(int reservationNo, int learnerRollNo, int slotNo, String reservationStatus, String reservationOn) {
        this.reservationNo = reservationNo;
        this.learnerRollNo = learnerRollNo;
        this.slotNo = slotNo;
        this.reservationStatus = reservationStatus;
        this.reservationOn = reservationOn;
    }

    public int getReservationNo() {
        return reservationNo;
    }

    public int getLearnerRollNo() {
        return learnerRollNo;
    }

    public int getSlotNo() {
        return slotNo;
    }

    public String getReservationStatus() {
        return reservationStatus;
    }

    public String getReservationOn() {
        return reservationOn;
    }

     
    /**
     * Generate reservationNo
     * @return 
     */
    public static int reservationNo(){
        Random random = new Random();
        int reservationNo = random.nextInt(1000);
        return reservationNo;
    }
    
    
    
    public void setReservationStatus(String reservationStatus) {
        this.reservationStatus = reservationStatus;
    }

    public void setSlotNo(int slotNo) {
        this.slotNo = slotNo;
    }
        
    public static ArrayList<Reservations> getReservations() {
        return reservationdata;
    }
    
     
    
    /**
     * Return All Reservations
     * @param tableModel
     * @param learerRollNo
     * @return 
     */
    public static ArrayList getReservations(DefaultTableModel tableModel, int learerRollNo){
        ArrayList<Coaches> coaches = Coaches.getCoaches();
        ArrayList<Learners> learners = Learners.getLearners();
        HashSet<String> uniqueRecords = new HashSet<>();
        ArrayList<Timetables> timetables = Timetables.getTimetable();
        ArrayList<Reservations> reservations = Reservations.getReservations();
        ArrayList<Timetables> data = new ArrayList<>(); 
                
        // if learner
        if(learerRollNo != 0){
            for (Reservations obj : reservations) {
                if(obj.getLearnerRollNo() == learerRollNo){
                    for (Timetables timetable : timetables) {
                        if(timetable.getSlotNo().equalsIgnoreCase(String.valueOf(obj.getSlotNo()))){
                            Coaches coach = Coaches.findCoachById(coaches, timetable.getTakenBy()); 
                            Learners learner = Learners.findLearnerById(learners, learerRollNo); 

                            int reservationNo = obj.getReservationNo();
                            String gradeNo = String.valueOf(timetable.getGradeNo());
                            String lessonDay = timetable.getLessonDay();
                            String lessonSlot = timetable.getLessonSlot();
                            String lessonDate = timetable.getLessonDate();
                            String takenBy = coach.getFullname();
                            String learnerName = learner.getFullname();
                            String lessonName = timetable.getLessonName();
                            String reservedOn = obj.getReservationOn();
                            String status = obj.getReservationStatus();

                             // Create a unique key for each record
                            String recordKey = reservationNo + learnerName + lessonName + lessonDay + gradeNo + lessonSlot + takenBy + lessonDate + status + reservedOn;

                            // Check if the record is unique before adding it
                            if (uniqueRecords.add(recordKey)) {
                                String[] arr = {String.valueOf(reservationNo), learnerName, lessonName, lessonDay, gradeNo, lessonSlot, takenBy, lessonDate, status, reservedOn};
                                tableModel.addRow(arr);
                            }
                        }
                    }
                }
            }
        //If Staff
        }else{
            for (Reservations obj : reservations) {
                for (Timetables timetable : timetables) {
                    if(timetable.getSlotNo().equalsIgnoreCase(String.valueOf(obj.getSlotNo()))){
                        Coaches coach = Coaches.findCoachById(coaches, timetable.getTakenBy()); 
                        Learners learner = Learners.findLearnerById(learners, obj.getLearnerRollNo()); 

                        int reservationNo = obj.getReservationNo();
                        String gradeNo = String.valueOf(timetable.getGradeNo());
                        String lessonDay = timetable.getLessonDay();
                        String lessonSlot = timetable.getLessonSlot();
                        String lessonDate = timetable.getLessonDate();
                        String takenBy = coach.getFullname();
                        String learnerName = learner.getFullname();
                        String lessonName = timetable.getLessonName();
                        String reservedOn = obj.getReservationOn();
                        String status = obj.getReservationStatus();

                         // Create a unique key for each record
                        String recordKey = reservationNo + learnerName + lessonName + lessonDay + gradeNo + lessonSlot + takenBy + lessonDate + status + reservedOn;

                        // Check if the record is unique before adding it
                        if (uniqueRecords.add(recordKey)) {
                            String[] arr = {String.valueOf(reservationNo), learnerName, lessonName, lessonDay, gradeNo, lessonSlot, takenBy, lessonDate, status, reservedOn};
                            tableModel.addRow(arr);
                        }
                    }
                }
            }
        }
        return data;
    }
          
    
    /**
     * Already Reserved
     * @param learnerRollNo
     * @param slotNo
     * @return 
     */
    public static boolean alreadyReserved(int learnerRollNo, int slotNo){
        ArrayList<Reservations> reservations = Reservations.getReservations();
        
        //Update status
        boolean alreadyReserved = false;
        for (Reservations obj : reservations) {
            if(obj.getLearnerRollNo() == learnerRollNo && obj.getSlotNo() == slotNo 
                    && (obj.getReservationStatus().equalsIgnoreCase(Reservations.CLASS_BOOKED) 
                    || obj.getReservationStatus().equalsIgnoreCase(Reservations.CLASS_CHANGED))){
                alreadyReserved = true;
            }
        }
        return alreadyReserved;
       
    }
          
     
          
    
   /**
    * Already Attended
    * @param reservationNo
    * @return 
    */
    public static boolean alreadyAttended(int reservationNo){
        ArrayList<Reservations> reservations = Reservations.getReservations();
        
        //Update status
        boolean alreadyAttended = false;
        for (Reservations obj : reservations) {
            if(obj.getReservationNo() == reservationNo && obj.getReservationStatus().equalsIgnoreCase(Reservations.CLASS_ATTENDED)){
                alreadyAttended = true;
            }
        }
        return alreadyAttended;
       
    }
          
     
          
    
   /**
    * Already Cancelled
    * @param reservationNo
    * @return 
    */
    public static boolean alreadyCancelled(int reservationNo){
        ArrayList<Reservations> reservations = Reservations.getReservations();
        
        //Update status
        boolean alreadyCancelled = false;
        for (Reservations obj : reservations) {
            if(obj.getReservationNo() == reservationNo && obj.getReservationStatus().equalsIgnoreCase( Reservations.CLASS_CANCELLED)){
                alreadyCancelled = true;
            }
        }
        return alreadyCancelled;
       
    }
          
     
    
    
    /**
     * Book Reservations
     * @param learnerRollNo
     * @param slotNo
     * @return 
     */
    public static boolean bookReservation(int learnerRollNo, int slotNo){
        
        int reservationNo = Reservations.reservationNo();
        long currentTimestamp = System.currentTimeMillis();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-M-Y H:m:s");

        // Format the timestamp using the SimpleDateFormat object
        String formattedTimestamp = dateFormat.format(new Date(currentTimestamp));
        
        boolean isReserved = false;
        
        Reservations obj = new Reservations(reservationNo,learnerRollNo,slotNo,Reservations.CLASS_BOOKED,formattedTimestamp);
        Reservations.reservationdata.add(obj);
        // Update seats 
        Timetables.updateSeats(slotNo,0,1);
        isReserved = true;
        Timetables.SELECTED_FOR_RESERVATION = 0;
       
        return isReserved;
    }
          
     
    
    
    /**
     * Change Reservations
     * @param reservationNo
     * @param slotNo
     * @return 
     */
    public static boolean changeReservations(int reservationNo, int slotNo){
        
       ArrayList<Reservations> reservations = Reservations.getReservations();
        
        //Update status
        boolean isChanged = false;
        for (Reservations obj : reservations) {
            if(obj.getReservationNo() == reservationNo){
                //Update seats in previous booked lesson
                Timetables.updateSeats(obj.getSlotNo(),1,0);
                obj.setReservationStatus(Reservations.CLASS_CHANGED);
                obj.setSlotNo(slotNo);
                isChanged = true;
                //Update seats in new booked lesson
                Timetables.updateSeats(slotNo,0,1);
            }
        }
        return isChanged;
    }
          
     
    
          
    
    /**
     *  Cancel Reservations
     * @param reservationNo
     * @return 
     */
    public static boolean cancelReservations(int reservationNo){
        ArrayList<Reservations> reservations = Reservations.getReservations();
        int slotNo = 0;
        boolean isCancelled = false;
        for (Reservations obj : reservations) {
            if(obj.getReservationNo() == reservationNo){
                slotNo = obj.getSlotNo();
                obj.setReservationStatus(Reservations.CLASS_CANCELLED);
                isCancelled = true;
                // Update seats 
                Timetables.updateSeats(slotNo,1,0);
            }
        }
        return isCancelled;
    }
              
          
    
    /**
     * Attend Reservations
     * @param reservationNo
     * @param learnerRollNo
     * @param rating
     * @param review
     * @return 
     */
    public static boolean attendClass(int reservationNo, int learnerRollNo, int rating, String review){
        ArrayList<Reservations> reservations = Reservations.getReservations();
        //Add Review
        Reviews obj1 = new Reviews(reservationNo,addedFor,learnerRollNo,rating,review);
        Reviews.reviewdata.add(obj1);
        
        int slotNo = 0;
        boolean isAttended = false;
        for (Reservations obj : reservations) {
            if(obj.getReservationNo() == reservationNo){
                slotNo = obj.getSlotNo();
                //Update status
                obj.setReservationStatus(Reservations.CLASS_ATTENDED);
                isAttended = true;
                
                // Update seats 
                Timetables.updateSeats(slotNo,1,0);
                
                //Check attended lesson grade is higher or not
                boolean isHigher = isAttendedHigherLevel(learnerRollNo,slotNo);
                //Update Current Level of Learner - if attended higher level of lesson
                if(isHigher){
                    Learners.updateCurrentGradeLevel(learnerRollNo);
                }
            }
        }
        Reservations.SELECTED_FOR_ATTEND_CLASS = 0;
        return isAttended;
    }
          
     

    
   /**
    * Check attended lesson grade is higher or not
    * @param learnerRollNo
    * @param slotNo
    * @return 
    */
    public static boolean isAttendedHigherLevel(int learnerRollNo, int slotNo){
        ArrayList<Timetables> timetables = Timetables.getTimetable();
        ArrayList<Learners> learners = Learners.getLearners();
        Learners learner = Learners.findLearnerById(learners, learnerRollNo);
        
        boolean isHigher = false;
        int slotGrade = 0;
        int learnerGrade = Learners.returnGradeLevel(learnerRollNo);
        
        for (Timetables obj : timetables) {
            if(obj.getSlotNo().equalsIgnoreCase(String.valueOf(slotNo))){
                slotGrade = obj.getGradeNo();
            }
        }
        if(slotGrade > learnerGrade){
             isHigher = true;
        }
        return isHigher;
    }
          
     
    
}
