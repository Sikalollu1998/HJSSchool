
package hjsschool;

import javax.swing.JOptionPane;


public class StaffDashboardGUI extends javax.swing.JFrame {

    
    public StaffDashboardGUI() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        timetableBtn = new javax.swing.JButton();
        learnerBtn = new javax.swing.JButton();
        reservationBtn = new javax.swing.JButton();
        ratingsBtn = new javax.swing.JButton();
        learnerReport = new javax.swing.JButton();
        coachReport = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        logoutBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 0, 51));
        jPanel1.setForeground(new java.awt.Color(51, 0, 51));

        timetableBtn.setBackground(new java.awt.Color(51, 0, 51));
        timetableBtn.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        timetableBtn.setForeground(new java.awt.Color(255, 255, 255));
        timetableBtn.setText("Timetable");
        timetableBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timetableBtnActionPerformed(evt);
            }
        });

        learnerBtn.setBackground(new java.awt.Color(51, 0, 51));
        learnerBtn.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        learnerBtn.setForeground(new java.awt.Color(255, 255, 255));
        learnerBtn.setText("Learners");
        learnerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                learnerBtnActionPerformed(evt);
            }
        });

        reservationBtn.setBackground(new java.awt.Color(51, 0, 51));
        reservationBtn.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        reservationBtn.setForeground(new java.awt.Color(255, 255, 255));
        reservationBtn.setText("Reservations");
        reservationBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reservationBtnActionPerformed(evt);
            }
        });

        ratingsBtn.setBackground(new java.awt.Color(51, 0, 51));
        ratingsBtn.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        ratingsBtn.setForeground(new java.awt.Color(255, 255, 255));
        ratingsBtn.setText("Ratings");
        ratingsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ratingsBtnActionPerformed(evt);
            }
        });

        learnerReport.setBackground(new java.awt.Color(51, 0, 51));
        learnerReport.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        learnerReport.setForeground(new java.awt.Color(255, 255, 255));
        learnerReport.setText("Learner Report");
        learnerReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                learnerReportActionPerformed(evt);
            }
        });

        coachReport.setBackground(new java.awt.Color(51, 0, 51));
        coachReport.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        coachReport.setForeground(new java.awt.Color(255, 255, 255));
        coachReport.setText("Coach Report");
        coachReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                coachReportActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(362, 362, 362)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(timetableBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(learnerBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(reservationBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ratingsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(learnerReport, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(coachReport, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(358, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(timetableBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(learnerBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(reservationBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(ratingsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(learnerReport, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(coachReport, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Hatfield Junior Swimming School ");

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
                .addContainerGap(40, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(92, 92, 92)
                        .addComponent(logoutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(logoutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void timetableBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timetableBtnActionPerformed
        TimetableGUI frame = new TimetableGUI();
        frame.setVisible(true);
        this.setVisible(false);               
    }//GEN-LAST:event_timetableBtnActionPerformed

    private void logoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutBtnActionPerformed
       Sessions.clearSessions();
        JOptionPane.showMessageDialog(null, "Logged Out!");
        MainPageGUI frame = new MainPageGUI();
        frame.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_logoutBtnActionPerformed

    private void learnerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_learnerBtnActionPerformed
        LearnerGUI frame = new LearnerGUI();
        frame.setVisible(true);
        this.setVisible(false);            
    }//GEN-LAST:event_learnerBtnActionPerformed

    private void reservationBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reservationBtnActionPerformed
        ReservationGUI frame = new ReservationGUI();
        frame.setVisible(true);
        this.setVisible(false);  
    }//GEN-LAST:event_reservationBtnActionPerformed

    private void ratingsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ratingsBtnActionPerformed
        RatingGUI frame = new RatingGUI();
        frame.setVisible(true);
        this.setVisible(false);  
    }//GEN-LAST:event_ratingsBtnActionPerformed

    private void learnerReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_learnerReportActionPerformed
        JOptionPane.showMessageDialog(null, "Learner Report in .txt file has been downloaded.");
        ReportGenerator learnerReportGenerator = new ReportGenerator(new LearnerReportStrategy());
        learnerReportGenerator.generateReport();
    }//GEN-LAST:event_learnerReportActionPerformed

    private void coachReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_coachReportActionPerformed
        JOptionPane.showMessageDialog(null, "Coach Report in .txt file has been downloaded.");
        ReportGenerator coachReportGenerator = new ReportGenerator(new CoachReportStrategy());
        coachReportGenerator.generateReport();
    }//GEN-LAST:event_coachReportActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StaffDashboardGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton coachReport;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton learnerBtn;
    private javax.swing.JButton learnerReport;
    private javax.swing.JButton logoutBtn;
    private javax.swing.JButton ratingsBtn;
    private javax.swing.JButton reservationBtn;
    private javax.swing.JButton timetableBtn;
    // End of variables declaration//GEN-END:variables
}
