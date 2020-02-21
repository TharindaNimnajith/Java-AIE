public class Stopwatch extends javax.swing.JFrame {
    static int miliseconds = 0, seconds = 0, minutes = 0, hours = 0;
    static boolean state = true;
    
    public Stopwatch() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        H = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        M = new javax.swing.JLabel();
        S = new javax.swing.JLabel();
        MS = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 153, 255));

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Start");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        H.setBackground(new java.awt.Color(0, 0, 0));
        H.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        H.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        H.setText("00:");

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Stop");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(0, 0, 0));
        jButton3.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Reset");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        M.setBackground(new java.awt.Color(0, 0, 0));
        M.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        M.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        M.setText("00:");

        S.setBackground(new java.awt.Color(0, 0, 0));
        S.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        S.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        S.setText("00:");

        MS.setBackground(new java.awt.Color(0, 0, 0));
        MS.setFont(new java.awt.Font("Dialog", 0, 30)); // NOI18N
        MS.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MS.setText("00");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(H, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(M, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(S, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(MS, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
                .addGap(18, 18, 18))
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addGap(18, 18, 18)
                .addComponent(jButton3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(H)
                    .addComponent(M)
                    .addComponent(S)
                    .addComponent(MS))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addGap(31, 31, 31))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        state = true;
        
        //Multithreading
        Thread t1 = new Thread() {
        //Thread t1;
        //t1 = new Thread() {};    
            @Override
            public void run() {
                while(true) {  //infinite loop
                    if(state == true) {
                        //Exception Handling
                        try {
                            sleep(1);  //Delay (pause) the program for 1 milisecond
                            
                            if(miliseconds > 999) {
                                miliseconds = 0;
                                seconds++;
                            }
                            
                            if(seconds > 59) {
                                seconds = 0;
                                minutes++;
                            }
                            
                            if(minutes > 59) {
                                minutes = 0;
                                hours++;
                            }      
                            
                            MS.setText(miliseconds + "");
                            S.setText(seconds + ":");
                            M.setText(minutes + ":");
                            H.setText(hours + ":");
                            
                            miliseconds++;
                        }
                        catch(Exception e) {
                            //If any garbage value is entered, it is caught by 'e' 
                            //sleep function requires the try & catch blocks
                        }
                    }
                    else 
                        break;
                }
            }
        };
        
        t1.start();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        state = false;
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        state = false;
        miliseconds = 0;
        seconds = 0;
        minutes = 0;
        hours = 0;
    }//GEN-LAST:event_jButton3ActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Stopwatch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(() -> {
            new Stopwatch().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel H;
    private javax.swing.JLabel M;
    private javax.swing.JLabel MS;
    private javax.swing.JLabel S;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    // End of variables declaration//GEN-END:variables
}
