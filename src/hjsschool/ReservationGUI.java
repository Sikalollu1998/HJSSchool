
package hjsschool;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;


public class ReservationGUI extends javax.swing.JFrame {

    
    public ReservationGUI() {
        initComponents();
        
        DefaultTableModel tableModel = (DefaultTableModel) tableData.getModel();
        tableData.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        tableData.setDefaultEditor(Object.class, null);
        
        //Get Reservations
         String role = Sessions.getLoggedInUserRole();
         int learnerRollNo = Sessions.getLoggedInUserID();
         if(role.equalsIgnoreCase("learner")){
            Reservations.getReservations(tableModel,learnerRollNo);
            attendBtn.setVisible(true);
            cancelBtn.setVisible(true);
         }else{
            Reservations.getReservations(tableModel,0);
            attendBtn.setVisible(false);
            cancelBtn.setVisible(false);
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
        cancelBtn = new javax.swing.JButton();
        attendBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        backBtn = new javax.swing.JButton();
        logoutBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 0, 51));
        jPanel1.setForeground(new java.awt.Color(51, 0, 51));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 0, 51));
        jLabel1.setText("Reservations ");

        tableData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ReservationNo", "Learner", "LessonName", "Lesson Day", "Grade Level", "Lesson Time", "Taken By", "Lesson Date", "Status", "Reserved On"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, false, false, false, false, false, true, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tableData);

        cancelBtn.setBackground(new java.awt.Color(51, 0, 51));
        cancelBtn.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        cancelBtn.setForeground(new java.awt.Color(255, 255, 255));
        cancelBtn.setText("Cancel");
        cancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBtnActionPerformed(evt);
            }
        });

        attendBtn.setBackground(new java.awt.Color(51, 0, 51));
        attendBtn.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        attendBtn.setForeground(new java.awt.Color(255, 255, 255));
        attendBtn.setText("Attend");
        attendBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                attendBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(attendBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addComponent(cancelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 35, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 889, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(29, 29, 29))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(attendBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 447, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
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
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(logoutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void logoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutBtnActionPerformed
        Sessions.clearSessions();
        JOptionPane.showMessageDialog(null, "Logged Out!");
        MainPageGUI frame = new MainPageGUI();
        frame.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_logoutBtnActionPerformed

    private void cancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBtnActionPerformed
        int row = tableData.getSelectedRow();

        //If no row selected 
        if(row < 0){
            JOptionPane.showMessageDialog(null, "Select Class");
            return;
        }

        //If row selected 
        if (row >= 0) {
            String reservationNo = String.valueOf(tableData.getValueAt(row,0));
            
             //Is already cancelled
            boolean alreadyCancelled = Reservations.alreadyCancelled(Integer.parseInt(reservationNo));

            if(alreadyCancelled){
                JOptionPane.showMessageDialog(null, "Already Cancelled!");
                return;
            }
        
             //Is already attended
            boolean alreadyAttended = Reservations.alreadyAttended(Integer.parseInt(reservationNo));

            if(alreadyAttended){
                JOptionPane.showMessageDialog(null, "Already Attended!");
                return;
            }
        
            boolean isCancelled = Reservations.cancelReservations(Integer.parseInt(reservationNo));
            if(isCancelled){
                JOptionPane.showMessageDialog(null, "Class Cancelled!");
                ReservationGUI frame = new ReservationGUI();
                frame.setVisible(true);
                this.setVisible(false);
            }
        }
    }//GEN-LAST:event_cancelBtnActionPerformed

    private void attendBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_attendBtnActionPerformed
        int row = tableData.getSelectedRow();

        //If no row selected 
        if(row < 0){
            JOptionPane.showMessageDialog(null, "Select Class");
            return;
        }

        //If row selected 
        if (row >= 0) {
            String reservationNo = String.valueOf(tableData.getValueAt(row,0));
             //Is already cancelled
            boolean alreadyCancelled = Reservations.alreadyCancelled(Integer.parseInt(reservationNo));

            if(alreadyCancelled){
                JOptionPane.showMessageDialog(null, "Already Cancelled!");
                return;
            }
        
             //Is already attended
            boolean alreadyAttended = Reservations.alreadyAttended(Integer.parseInt(reservationNo));

            if(alreadyAttended){
                JOptionPane.showMessageDialog(null, "Already Attended!");
                return;
            }
        
            Reservations.SELECTED_FOR_ATTEND_CLASS = Integer.parseInt(reservationNo);
            AttendReservationGUI frame = new AttendReservationGUI();
            frame.setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_attendBtnActionPerformed

    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReservationGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton attendBtn;
    private javax.swing.JButton backBtn;
    private javax.swing.JButton cancelBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton logoutBtn;
    private javax.swing.JTable tableData;
    // End of variables declaration//GEN-END:variables
}
