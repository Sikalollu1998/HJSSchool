
package hjsschool;

import java.util.ArrayList;
import java.util.HashSet;
import javax.swing.table.DefaultTableModel;


public class Reviews {
    
    private int reservationNo;
    private int addedFor;
    private int addedBy;
    private int rating;
    private String addedReview;
    
    public static ArrayList <Reviews> reviewdata = new ArrayList<>();

    public Reviews(int reservationNo, int addedFor, int addedBy, int rating, String addedReview) {
        this.reservationNo = reservationNo;
        this.addedFor = addedFor;
        this.addedBy = addedBy;
        this.rating = rating;
        this.addedReview = addedReview;
    }

    public int getReservationNo() {
        return reservationNo;
    }

    public int getAddedFor() {
        return addedFor;
    }

    public int getAddedBy() {
        return addedBy;
    }

    public int getRating() {
        return rating;
    }

    public String getAddedReview() {
        return addedReview;
    }

    public static ArrayList<Reviews> getReviews() {
        return reviewdata;
    }
    
     
   /**
    * Return All Ratings
    * @param tableModel
    * @param learerRollNo
    * @return 
    */
    public static ArrayList getGivenRatings(DefaultTableModel tableModel, int learerRollNo){
        ArrayList<Coaches> coaches = Coaches.getCoaches();
        ArrayList<Reviews> ratings = Reviews.getReviews();
        ArrayList<Learners> learners = Learners.getLearners();
        HashSet<String> uniqueRecords = new HashSet<>();
        ArrayList<Timetables> timetables = Timetables.getTimetable();
        ArrayList<Timetables> data = new ArrayList<>(); 
        
        if(learerRollNo != 0){
            for (Reviews obj : ratings) {
                if(obj.getAddedBy() == learerRollNo){
                    Coaches coach = null;
                    for (Timetables tObj : timetables) {
                        if(tObj.getTakenBy() == obj.getAddedFor()){
                            coach = Coaches.findCoachById(coaches, tObj.getTakenBy()); 
                        }
                    }
                    Learners learner = Learners.findLearnerById(learners, learerRollNo); 

                    int reservationNo = obj.getReservationNo();
                    int rate = obj.getRating();
                    String review = obj.getAddedReview();
                    String addedFor = coach.getFullname();
                    String addedBy = learner.getFullname();

                     // Create a unique key for each record
                    String recordKey = reservationNo + addedFor + addedBy + rate + review;

                    // Check if the record is unique before adding it
                    if (uniqueRecords.add(recordKey)) {
                        String[] arr = {String.valueOf(reservationNo), addedFor, addedBy, String.valueOf(rate), review};
                        tableModel.addRow(arr);
                    }
                }
            }
        //If staff
        }else{
            for (Reviews obj : ratings) {
                Coaches coach = null;
                for (Timetables tObj : timetables) {
                    if(tObj.getTakenBy() == obj.getAddedFor()){
                        coach = Coaches.findCoachById(coaches, tObj.getTakenBy()); 
                    }
                }
                Learners learner = Learners.findLearnerById(learners, obj.getAddedBy()); 

                int reservationNo = obj.getReservationNo();
                int rate = obj.getRating();
                String review = obj.getAddedReview();
                String addedFor = coach.getFullname();
                String addedBy = learner.getFullname();

                 // Create a unique key for each record
                String recordKey = reservationNo + addedFor + addedBy + rate + review;

                // Check if the record is unique before adding it
                if (uniqueRecords.add(recordKey)) {
                    String[] arr = {String.valueOf(reservationNo), addedFor, addedBy, String.valueOf(rate), review};
                    tableModel.addRow(arr);
                }
            }
        }
        return data;
    }
}
