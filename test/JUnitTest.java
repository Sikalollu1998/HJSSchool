

import hjsschool.Coaches;
import hjsschool.Reservations;
import hjsschool.Reviews;
import hjsschool.Timetables;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import org.junit.Test;
import static org.junit.Assert.*;


public class JUnitTest {
    

    @Test
    public void filterTimetableByDay() {
        System.out.println("\nFilter By Day ; ");
        String givenDay = "Fri";
        ArrayList<Coaches> coaches = Coaches.getCoaches();
        ArrayList<Timetables> timetables = Timetables.getTimetable();
        HashSet<String> uniqueRecords = new HashSet<>();
        
        System.out.println("SlotNo,Lesson Name,Lesson Day, Grade Level, Slot, Taken By, No. Of Seats, Lesson Date");
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
                    System.out.println(slotNo +","+lessonName +","+ lessonDay +","+ gradeNo +","+ lessonSlot +","+ takenBy +","+ 
                            String.valueOf(noOfSeats)+","+ lessonDate);
                }
            }
        }
    }
     
     

     @Test
     public void filterTimetableByGradeLevel() {
        System.out.println("\nFilter By Grade Level :");
        int gradeLevel = 3;
         
        ArrayList<Coaches> coaches = Coaches.getCoaches();
        HashSet<String> uniqueRecords = new HashSet<>();
        ArrayList<Timetables> timetables = Timetables.getTimetable();
        System.out.println("SlotNo,Lesson Name,Lesson Day, Grade Level, Slot, Taken By, No. Of Seats, Lesson Date");

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
                    System.out.println(slotNo +","+lessonName +","+ lessonDay +","+ gradeNo +","+ lessonSlot +","+ takenBy +","+ 
                            String.valueOf(noOfSeats)+","+ lessonDate);
                }
            }
        }
     }
     
     

     @Test
     public void reserveLesson() {
        System.out.println("\nReserve Lesson : ");
        int learnerRollNo = 5001;
        int slotNo = 78003;
        
        
        //Is already reserved
        boolean alreadyReserved = Reservations.alreadyReserved(learnerRollNo,slotNo);
       
        if(alreadyReserved){
            System.out.println("Already Reserved!");
            return;
        }
         
        boolean isReserved =  Reservations.bookReservation(learnerRollNo,slotNo);
        assertTrue(isReserved);
        System.out.println("Success!");
     }
     

     @Test
     public void addReview() {
        System.out.println("\nAdd Review : ");
        int reservationNo = 145;
        int learnerRollNo = 5001;
        int rating = 4;
        int addedFor = 6002;
        String reviewText = "Satisfied with the lesson";
        
         
        Reviews obj1 = new Reviews(reservationNo,addedFor,learnerRollNo,rating,reviewText);
        Reviews.reviewdata.add(obj1);
        
        ArrayList<Reviews> data = Reviews.getReviews();
        
        assertTrue(data.size() > 0);
        System.out.println("Success!");
     }
     

     @Test
     public void cancelLesson() {
        System.out.println("\nCancel Lesson: ");
        int reservationNo = 145;
         
         SimpleDateFormat dateFormat = new SimpleDateFormat("d-M-Y H:m:s");

        // Format the timestamp using the SimpleDateFormat object
        long currentTimestamp = System.currentTimeMillis();
        String formattedTimestamp = dateFormat.format(new Date(currentTimestamp));
        
        Reservations obj = new Reservations(reservationNo,5001,78003,Reservations.CLASS_BOOKED,formattedTimestamp);
        Reservations.reservationdata.add(obj);
        
         boolean isCancelled = Reservations.cancelReservations(reservationNo);
         assertTrue(isCancelled);
         System.out.println("Success!");
     }
     
     
}
