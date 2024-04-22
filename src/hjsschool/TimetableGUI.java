
package hjsschool;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;


public class TimetableGUI extends javax.swing.JFrame {

    
    public TimetableGUI() {
        initComponents();
        
        DefaultTableModel tableModel = (DefaultTableModel) tableData.getModel();
        tableData.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        tableData.setDefaultEditor(Object.class, null);
        
        int loggedUserId = Sessions.getLoggedInUserID();
        
        int gradeLevel = Learners.returnGradeLevel(loggedUserId);
        
         //Display Change Button
         String role = Sessions.getLoggedInUserRole();
         if(role.equalsIgnoreCase("staff")){
             reservationNo.setVisible(false);
             reservationNoLabel.setVisible(false);
             changeBtn.setVisible(false);
             continueBtn.setVisible(false);
             gradeText.setVisible(false);
             levelLbl.setVisible(false);
         }else{
             reservationNo.setVisible(true);
             reservationNoLabel.setVisible(true);
             changeBtn.setVisible(true);
             continueBtn.setVisible(true);
             gradeText.setVisible(true);
             levelLbl.setVisible(true);
           
             gradeText.setText(String.valueOf(gradeLevel));
         }
         
        // Coach loaded in ComboBox
        loadCoaches();
        
        // Reservation loaded in ComboBox
        loadReservationNo();
       
    }

    public void loadCoaches(){
        Set<String> uniqueCoaches = new HashSet<>();
        coachWise.removeAllItems();
        coachWise.addItem("Select");

        ArrayList<Coaches> coachList = Coaches.getCoaches();

        for (Coaches coach : coachList) {
            String name = coach.getFullname();
            if (uniqueCoaches.add(name)) { 
                coachWise.addItem(name);
                coachWise.setSelectedItem(coach.getCoachNo());
            }
        }
    }
    
    public void loadReservationNo(){
        Set<String> uniqueReservation = new HashSet<>();
        reservationNo.removeAllItems();
        reservationNo.addItem("Select");

        ArrayList<Reservations> reservationList = Reservations.getReservations();
        ArrayList<Timetables> timetables = Timetables.getTimetable();

        int learnerRollNo = Sessions.getLoggedInUserID();

        for (Reservations obj : reservationList) {
            if(obj.getReservationStatus().equalsIgnoreCase(Reservations.CLASS_BOOKED) 
                    || obj.getReservationStatus().equalsIgnoreCase(Reservations.CLASS_CHANGED)){
                String lessonName = "";
                for (Timetables tobj : timetables) {
                    if(tobj.getSlotNo().equalsIgnoreCase(String.valueOf(obj.getSlotNo()))){
                        lessonName = tobj.getLessonName();
                        if(obj.getLearnerRollNo() == learnerRollNo){
                            int reservationNum = obj.getReservationNo();
                            if (uniqueReservation.add(String.valueOf(reservationNum))) { 
                                reservationNo.addItem(String.valueOf(reservationNum));
                                reservationNo.setSelectedItem(reservationNum);
                            }
                        }
                    }
                }
            }
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableData = new javax.swing.JTable();
        continueBtn = new javax.swing.JButton();
        coachWise = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        reservationNo = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        dayWise = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        gradeWise = new javax.swing.JComboBox<>();
        reservationNoLabel = new javax.swing.JLabel();
        changeBtn = new javax.swing.JButton();
        levelLbl = new javax.swing.JLabel();
        gradeText = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        backBtn = new javax.swing.JButton();
        logoutBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 0, 51));
        jPanel1.setForeground(new java.awt.Color(51, 0, 51));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 0, 51));
        jLabel1.setText("Timetable");

        tableData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "SlotNo", "LessonName", "Lesson Day", "Grade Level", "Lesson Time", "Taken By", "No Of Seats", "Lesson Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tableData);

        continueBtn.setBackground(new java.awt.Color(51, 0, 51));
        continueBtn.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        continueBtn.setForeground(new java.awt.Color(255, 255, 255));
        continueBtn.setText("Continue");
        continueBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                continueBtnActionPerformed(evt);
            }
        });

        coachWise.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Mon", "Wed", "Fri", "Sat" }));
        coachWise.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                coachWiseItemStateChanged(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 0, 51));
        jLabel3.setText("Grade Level : ");

        reservationNo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Grade Level 1", "Grade Level 2", "Grade Level 3", "Grade Level 4", "Grade Level 5" }));
        reservationNo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                reservationNoItemStateChanged(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 0, 51));
        jLabel4.setText("Coach Wise : ");

        dayWise.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Mon", "Wed", "Fri", "Sat" }));
        dayWise.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                dayWiseItemStateChanged(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 0, 51));
        jLabel5.setText("Day Wise : ");

        gradeWise.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Grade Level 1", "Grade Level 2", "Grade Level 3", "Grade Level 4", "Grade Level 5" }));
        gradeWise.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                gradeWiseItemStateChanged(evt);
            }
        });

        reservationNoLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        reservationNoLabel.setForeground(new java.awt.Color(51, 0, 51));
        reservationNoLabel.setText("Reservation No :");

        changeBtn.setBackground(new java.awt.Color(51, 0, 51));
        changeBtn.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        changeBtn.setForeground(new java.awt.Color(255, 255, 255));
        changeBtn.setText("Change");
        changeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeBtnActionPerformed(evt);
            }
        });

        levelLbl.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        levelLbl.setForeground(new java.awt.Color(51, 0, 51));
        levelLbl.setText("Grade Level : ");

        gradeText.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        gradeText.setForeground(new java.awt.Color(51, 0, 51));
        gradeText.setText("8");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(0, 35, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(182, 182, 182)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(reservationNoLabel)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(reservationNo, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 889, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(gradeWise, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(159, 159, 159)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dayWise, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(coachWise, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(changeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(68, 68, 68))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(398, 398, 398)
                        .addComponent(levelLbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(gradeText))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(376, 376, 376)
                        .addComponent(continueBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(reservationNoLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(reservationNo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(changeBtn))))
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gradeWise, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dayWise, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(coachWise, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(levelLbl)
                    .addComponent(gradeText))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(continueBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Hatfield Junior Swimming School ");

        backBtn.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        backBtn.setForeground(new java.awt.Color(51, 0, 51));
        backBtn.setText("Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        logoutBtn.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        logoutBtn.setForeground(new java.awt.Color(51, 0, 51));
        logoutBtn.setText("Logout");
        logoutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(107, 107, 107)
                .addComponent(logoutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(logoutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 760, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        String role = Sessions.getLoggedInUserRole();
        if(role.equalsIgnoreCase("staff")){
              StaffDashboardGUI frame = new StaffDashboardGUI();
              frame.setVisible(true);
              this.setVisible(false);
        }else{
              LearnerDashboardGUI frame = new LearnerDashboardGUI();
              frame.setVisible(true);
              this.setVisible(false);
        }
    }//GEN-LAST:event_backBtnActionPerformed

    private void continueBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_continueBtnActionPerformed
        int row = tableData.getSelectedRow();
        //If no row selected 
        if(row < 0){
            JOptionPane.showMessageDialog(null, "Select Class to Continue Reservation");
            return;
        }
        //If row selected 
        if (row >= 0) {
            String slotNo = String.valueOf(tableData.getValueAt(row,0));
            String seats = String.valueOf(tableData.getValueAt(row,6));
            
            if(seats.equalsIgnoreCase("0")){
                JOptionPane.showMessageDialog(null, "Seats are full!");
                return;
            }
            
            Timetables.SELECTED_FOR_RESERVATION = Integer.parseInt(slotNo);
            
            int learnerRollNo = Sessions.getLoggedInUserID();
        
            //Check Current Level
            boolean notOfLevel = Learners.checkCurrentLevel(learnerRollNo);

            if(notOfLevel){
                JOptionPane.showMessageDialog(null, "Selected Class is not for your current Grade Level!");
                return;
            }
        
            BookReservationGUI frame = new BookReservationGUI();
            frame.setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_continueBtnActionPerformed

    private void logoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutBtnActionPerformed
        Sessions.clearSessions();
        JOptionPane.showMessageDialog(null, "Logged Out!");
        MainPageGUI frame = new MainPageGUI();
        frame.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_logoutBtnActionPerformed

    private void reservationNoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_reservationNoItemStateChanged
        int gradeLevel = gradeWise.getSelectedIndex();
        String givenDay = String.valueOf(dayWise.getSelectedItem());
        String givenCoach = String.valueOf(coachWise.getSelectedIndex());
                
        DefaultTableModel tableModel = (DefaultTableModel) tableData.getModel();
        tableData.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        tableData.setDefaultEditor(Object.class, null);
        
        tableModel.setRowCount(0);
        //If only grade select
        if(gradeLevel != 0 && givenDay.equalsIgnoreCase("Select") && givenCoach.equalsIgnoreCase("Select")){
            Timetables.getTimetableByGradeLevel(tableModel,gradeLevel);
        //If only day select
        }else if(!givenDay.equalsIgnoreCase("Select") && givenCoach.equalsIgnoreCase("Select") && gradeLevel == 0){
            Timetables.getTimetableByDay(tableModel,givenDay);
        //If only coach select
        }else if(!givenCoach.equalsIgnoreCase("Select") && givenDay.equalsIgnoreCase("Select") && gradeLevel == 0){
            Timetables.getTimetableByCoach(tableModel,givenCoach);
        }
        //If Coach & Day
        else if(!givenCoach.equalsIgnoreCase("Select") && !givenDay.equalsIgnoreCase("Select") && gradeLevel == 0){
            Timetables.getTimetableByDayAndCoach(tableModel,givenDay,givenCoach);
        }
        //If Coach & Grade
        else if(!givenCoach.equalsIgnoreCase("Select") && givenDay.equalsIgnoreCase("Select") && gradeLevel != 0){
            Timetables.getTimetableByCoachAndGrade(tableModel,givenCoach,gradeLevel);
        }
        //If Day & Grade
        else if(givenCoach.equalsIgnoreCase("Select") && !givenDay.equalsIgnoreCase("Select") && gradeLevel != 0){
            Timetables.getTimetableByDayAndGrade(tableModel,givenDay,gradeLevel);
        }
        //If Day & Grade & Coach
        else if((!givenCoach.equalsIgnoreCase("Select") || !givenCoach.equalsIgnoreCase("0")) && !givenDay.equalsIgnoreCase("Select") 
                && gradeLevel != 0){            
            Timetables.getTimetableByDayCoachAndGrade(tableModel,givenDay,givenCoach,gradeLevel);
        }else{
            Timetables.getAllTimetable(tableModel);
        }
    }//GEN-LAST:event_reservationNoItemStateChanged

    private void dayWiseItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_dayWiseItemStateChanged
        int gradeLevel = gradeWise.getSelectedIndex();
        String givenDay = String.valueOf(dayWise.getSelectedItem());
        String givenCoach = String.valueOf(coachWise.getSelectedIndex());
                
        DefaultTableModel tableModel = (DefaultTableModel) tableData.getModel();
        tableData.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        tableData.setDefaultEditor(Object.class, null);
        
        tableModel.setRowCount(0);
        //If only grade select
        if(gradeLevel != 0 && givenDay.equalsIgnoreCase("Select") && givenCoach.equalsIgnoreCase("Select")){
            Timetables.getTimetableByGradeLevel(tableModel,gradeLevel);
        //If only day select
        }else if(!givenDay.equalsIgnoreCase("Select") && givenCoach.equalsIgnoreCase("Select") && gradeLevel == 0){
            Timetables.getTimetableByDay(tableModel,givenDay);
        //If only coach select
        }else if(!givenCoach.equalsIgnoreCase("Select") && givenDay.equalsIgnoreCase("Select") && gradeLevel == 0){
            Timetables.getTimetableByCoach(tableModel,givenCoach);
        }
        //If Coach & Day
        else if(!givenCoach.equalsIgnoreCase("Select") && !givenDay.equalsIgnoreCase("Select") && gradeLevel == 0){
            Timetables.getTimetableByDayAndCoach(tableModel,givenDay,givenCoach);
        }
        //If Coach & Grade
        else if(!givenCoach.equalsIgnoreCase("Select") && givenDay.equalsIgnoreCase("Select") && gradeLevel != 0){
            Timetables.getTimetableByCoachAndGrade(tableModel,givenCoach,gradeLevel);
        }
        //If Day & Grade
        else if(givenCoach.equalsIgnoreCase("Select") && !givenDay.equalsIgnoreCase("Select") && gradeLevel != 0){
            Timetables.getTimetableByDayAndGrade(tableModel,givenDay,gradeLevel);
        }
        //If Day & Grade & Coach
        else if((!givenCoach.equalsIgnoreCase("Select") || !givenCoach.equalsIgnoreCase("0")) && !givenDay.equalsIgnoreCase("Select") 
                && gradeLevel != 0){
            Timetables.getTimetableByDayCoachAndGrade(tableModel,givenDay,givenCoach,gradeLevel);
        }else{
            Timetables.getAllTimetable(tableModel);
        }
    }//GEN-LAST:event_dayWiseItemStateChanged

    private void coachWiseItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_coachWiseItemStateChanged
        int gradeLevel = gradeWise.getSelectedIndex();
        String givenDay = String.valueOf(dayWise.getSelectedItem());
        String givenCoach = String.valueOf(coachWise.getSelectedIndex());
                        
        DefaultTableModel tableModel = (DefaultTableModel) tableData.getModel();
        tableData.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        tableData.setDefaultEditor(Object.class, null);
        
        tableModel.setRowCount(0);
        //If only grade select
        if(gradeLevel != 0 && givenDay.equalsIgnoreCase("Select") && givenCoach.equalsIgnoreCase("Select")){
            Timetables.getTimetableByGradeLevel(tableModel,gradeLevel);
        //If only day select
        }else if(!givenDay.equalsIgnoreCase("Select") && givenCoach.equalsIgnoreCase("Select") && gradeLevel == 0){
            Timetables.getTimetableByDay(tableModel,givenDay);
        //If only coach select
        }else if(!givenCoach.equalsIgnoreCase("Select") && givenDay.equalsIgnoreCase("Select") && gradeLevel == 0){
            Timetables.getTimetableByCoach(tableModel,givenCoach);
        }
        //If Coach & Day
        else if(!givenCoach.equalsIgnoreCase("Select") && !givenDay.equalsIgnoreCase("Select") && gradeLevel == 0){
            Timetables.getTimetableByDayAndCoach(tableModel,givenDay,givenCoach);
        }
        //If Coach & Grade
        else if(!givenCoach.equalsIgnoreCase("Select") && givenDay.equalsIgnoreCase("Select") && gradeLevel != 0){
            Timetables.getTimetableByCoachAndGrade(tableModel,givenCoach,gradeLevel);
        }
        //If Day & Grade
        else if(givenCoach.equalsIgnoreCase("Select") && !givenDay.equalsIgnoreCase("Select") && gradeLevel == 0){
            Timetables.getTimetableByDayAndGrade(tableModel,givenDay,gradeLevel);
        }
        //If Day & Grade & Coach
        else if((!givenCoach.equalsIgnoreCase("Select") || !givenCoach.equalsIgnoreCase("0")) && !givenDay.equalsIgnoreCase("Select") 
                && gradeLevel != 0){
            Timetables.getTimetableByDayCoachAndGrade(tableModel,givenDay,givenCoach,gradeLevel);
        }else{
            Timetables.getAllTimetable(tableModel);
        }
    }//GEN-LAST:event_coachWiseItemStateChanged

    private void gradeWiseItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_gradeWiseItemStateChanged
        int gradeLevel = gradeWise.getSelectedIndex();
        String givenDay = String.valueOf(dayWise.getSelectedItem());
        String givenCoach = String.valueOf(coachWise.getSelectedIndex());
                
        DefaultTableModel tableModel = (DefaultTableModel) tableData.getModel();
        tableData.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        tableData.setDefaultEditor(Object.class, null);
        
        tableModel.setRowCount(0);
        //If only grade select
        if(gradeLevel != 0 && givenDay.equalsIgnoreCase("Select") && givenCoach.equalsIgnoreCase("Select")){
            Timetables.getTimetableByGradeLevel(tableModel,gradeLevel);
        //If only day select
        }else if(!givenDay.equalsIgnoreCase("Select") && givenCoach.equalsIgnoreCase("Select") && gradeLevel == 0){
            Timetables.getTimetableByDay(tableModel,givenDay);
        //If only coach select
        }else if(!givenCoach.equalsIgnoreCase("Select") && givenDay.equalsIgnoreCase("Select") && gradeLevel == 0){
            Timetables.getTimetableByCoach(tableModel,givenCoach);
        }
        //If Coach & Day
        else if(!givenCoach.equalsIgnoreCase("Select") && !givenDay.equalsIgnoreCase("Select") && gradeLevel == 0){
            Timetables.getTimetableByDayAndCoach(tableModel,givenDay,givenCoach);
        }
        //If Coach & Grade
        else if(!givenCoach.equalsIgnoreCase("Select") && givenDay.equalsIgnoreCase("Select") && gradeLevel != 0){
            Timetables.getTimetableByCoachAndGrade(tableModel,givenCoach,gradeLevel);
        }
        //If Day & Grade
        else if(givenCoach.equalsIgnoreCase("Select") && !givenDay.equalsIgnoreCase("Select") && gradeLevel != 0){
            Timetables.getTimetableByDayAndGrade(tableModel,givenDay,gradeLevel);
        }
        //If Day & Grade & Coach
        else if((!givenCoach.equalsIgnoreCase("Select") || !givenCoach.equalsIgnoreCase("0")) && !givenDay.equalsIgnoreCase("Select") 
                && gradeLevel != 0){
            Timetables.getTimetableByDayCoachAndGrade(tableModel,givenDay,givenCoach,gradeLevel);
        }else{
            Timetables.getAllTimetable(tableModel);
        }
    }//GEN-LAST:event_gradeWiseItemStateChanged

    private void changeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeBtnActionPerformed
        int row = tableData.getSelectedRow();
        
        String reservationNum = reservationNo.getSelectedItem().toString();
        
        //If no reservation no selected
        if(reservationNum.equalsIgnoreCase("Select")){
            JOptionPane.showMessageDialog(null, "Select ReservationNo. From Dropdown");
            return;
        }

        //If no row selected 
        if(row < 0){
            JOptionPane.showMessageDialog(null, "Select New Lesson");
            return;
        }

        //If row selected 
        if (row >= 0 && !reservationNum.equalsIgnoreCase("")) {
            String slotNo = String.valueOf(tableData.getValueAt(row,0));
            
             //Is already cancelled
            boolean alreadyCancelled = Reservations.alreadyCancelled(Integer.parseInt(reservationNum));

            if(alreadyCancelled){
                JOptionPane.showMessageDialog(null, "Already Cancelled!");
                return;
            }
        
             //Is already attended
            boolean alreadyAttended = Reservations.alreadyAttended(Integer.parseInt(reservationNum));

            if(alreadyAttended){
                JOptionPane.showMessageDialog(null, "Already Attended!");
                return;
            }
        
            boolean isChanged = Reservations.changeReservations(Integer.parseInt(reservationNum),Integer.parseInt(slotNo));
            if(isChanged){
                JOptionPane.showMessageDialog(null, "Class Changed!");
                ReservationGUI frame = new ReservationGUI();
                frame.setVisible(true);
                this.setVisible(false);
            }
        }
    }//GEN-LAST:event_changeBtnActionPerformed

    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TimetableGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JButton changeBtn;
    private javax.swing.JComboBox<String> coachWise;
    private javax.swing.JButton continueBtn;
    private javax.swing.JComboBox<String> dayWise;
    private javax.swing.JLabel gradeText;
    private javax.swing.JComboBox<String> gradeWise;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel levelLbl;
    private javax.swing.JButton logoutBtn;
    private javax.swing.JComboBox<String> reservationNo;
    private javax.swing.JLabel reservationNoLabel;
    private javax.swing.JTable tableData;
    // End of variables declaration//GEN-END:variables
}
