
package hjsschool;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;


public class LearnerReportStrategy implements ReportStrategy {
    @Override
    public void generateReport() {
       try (PrintWriter writer = new PrintWriter("learner_report.txt")) {
            ArrayList<Reservations> reservationsData = Reservations.getReservations();
            ArrayList<Learners> learnerData = Learners.getLearners();

            Map<String, int[]> lessonCounter = new HashMap<>();

            // Iterate through bookings to count lessons for each learner
            for (Reservations obj : reservationsData) {
                int learnerRollNo = obj.getLearnerRollNo();
                String status = obj.getReservationStatus();

                Learners learner = Learners.findLearnerById(learnerData, learnerRollNo);

                if (learner != null) {
                    String learnerName = learner.getFullname();
                    int[] counter = lessonCounter.getOrDefault(learnerName, new int[3]);

                    if (status.equalsIgnoreCase(Reservations.CLASS_BOOKED) || status.equalsIgnoreCase(Reservations.CLASS_CHANGED)) {
                        counter[0]++;
                    } else if (status.equalsIgnoreCase(Reservations.CLASS_ATTENDED)) {
                        counter[1]++;
                    } else if (status.equalsIgnoreCase(Reservations.CLASS_CANCELLED)) {
                        counter[2]++;
                    }

                    lessonCounter.put(learnerName, counter);
                }
            }

            // Write the report to the file
            writer.println("Learner name: Booked Lesssons " + "- " + "Attended Lessons" + " - " + "Cancelled Lessons");
            for (String learnerName : lessonCounter.keySet()) {
                int[] counter = lessonCounter.get(learnerName);
                writer.println(learnerName + ": " + counter[0] + " - " + counter[1] + " - " + counter[2]);
            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(LearnerReportStrategy.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}


