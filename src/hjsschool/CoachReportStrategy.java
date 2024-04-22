
package hjsschool;

import java.awt.List;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;


public class CoachReportStrategy implements ReportStrategy {
    @Override
    public void generateReport() {
        PrintWriter writer = null;
        try {
            writer = new PrintWriter("coach_report.txt");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(CoachReportStrategy.class.getName()).log(Level.SEVERE, null, ex);
        }

        System.out.println("coach reprt");
        HashMap<String, Double> coachRating = new HashMap<>();
        HashMap<String, Integer> totalNumOfRatings = new HashMap<>();
        HashMap<String, Integer> totalRatingCount = new HashMap<>();
        ArrayList<Coaches> coachData = Coaches.getCoaches();
        ArrayList<Reviews> reviewsdata = Reviews.getReviews();

        for (Reviews obj : reviewsdata){
            int coachNo = obj.getAddedFor();
            int currentRating = obj.getRating();

            Coaches coach = Coaches.findCoachById(coachData, coachNo);

            // Get the name of the coach based on their ID
             String givenFor = coach.getFullname();

            totalNumOfRatings.put(givenFor, totalNumOfRatings.getOrDefault(givenFor, 0) + currentRating);
            totalRatingCount.put(givenFor, totalRatingCount.getOrDefault(givenFor, 0) + 1);
        }

        for (String coachName : totalNumOfRatings.keySet()) {
            int totalRating = totalNumOfRatings.get(coachName);
            int numberOfRatings = totalRatingCount.get(coachName);

            if (numberOfRatings > 0) {
                double averageRatingCalculate = (double) totalRating / numberOfRatings;
                double roundedAverageRating = Math.round(averageRatingCalculate * 10.0) / 10.0; 
                coachRating.put(coachName, roundedAverageRating);
            }
        }

        // Write the coach report to the file
        for (String coachName : coachRating.keySet()) {
            double averageRating = coachRating.get(coachName);
            writer.println(coachName + ": " + averageRating);
        }

        writer.close();

    }
}