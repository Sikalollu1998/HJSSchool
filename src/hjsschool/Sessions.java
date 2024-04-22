
package hjsschool;

import java.util.ArrayList;
import java.util.Random;


public class Sessions {
        
    private int sessionID;
    private int userId;
    private String userRole;
    
    public static ArrayList <Sessions> sessiondata = new ArrayList<>();

    public Sessions(int sessionID, int userId, String userRole) {
        this.sessionID = sessionID;
        this.userId = userId;
        this.userRole = userRole;
    }

    public int getSessionID() {
        return sessionID;
    }

    public int getUserId() {
        return userId;
    }

    public String getUserRole() {
        return userRole;
    }

    public static ArrayList<Sessions> getSessions() {
        return sessiondata;
    }
    
    public static ArrayList<Sessions> clearSessions() {
        sessiondata.clear();
        return sessiondata;
    }
        
    /**
     * Generate Session ID
     * @return 
     */
    public static int automatedSessionID(){
        Random random = new Random();
        int randomNumber = random.nextInt(1000);
        return randomNumber;
    }
    
    /**
     * Get logged in user role
     * @return 
     */
    public static String getLoggedInUserRole(){
        ArrayList<Sessions> sessionData = Sessions.getSessions();
        String role = "";
        for (Sessions obj : sessionData) {
            role = obj.getUserRole();
        }
        return role;
    }
    
    /**
     * Get logged in user id
     * @return 
     */
    public static int getLoggedInUserID(){
        ArrayList<Sessions> sessionData = Sessions.getSessions();
        int userID  = 0;
        for (Sessions obj : sessionData) {
            userID = obj.getUserId();
        }
        return userID;
    }
}
