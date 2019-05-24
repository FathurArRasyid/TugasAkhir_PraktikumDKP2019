public class GUI1 extends javax.swing.JFrame {

    int hargahtl, hargatjn;

    public GUI1() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label1 = new java.awt.Label();
        label2 = new java.awt.Label();
        label3 = new java.awt.Label();
        label4 = new java.awt.Label();
        Jumlah = new java.awt.Label();
        Jumlah1 = new java.awt.Label();
        nama1 = new javax.swing.JTextField();
        jumlah1 = new javax.swing.JTextField();
        total1 = new javax.swing.JTextField();
        tujuan1 = new javax.swing.JComboBox<>();
        hotel1 = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        report1 = new javax.swing.JTextArea();
        label5 = new java.awt.Label();
        reset = new javax.swing.JButton();
        Jumlah2 = new java.awt.Label();
        jumlah2 = new javax.swing.JTextField();
        pesan = new javax.swing.JButton();
        harga1 = new javax.swing.JTextField();
        harga2 = new javax.swing.JTextField();
        label6 = new java.awt.Label();
        label7 = new java.awt.Label();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        label1.setAlignment(java.awt.Label.CENTER);
        label1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        label1.setText("Flight & Hotel");

        label2.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        label2.setName("Nama"); // NOI18N
        label2.setText("Nama");

        label3.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        label3.setName("Tujuan"); // NOI18N
        label3.setText("Harga");

        label4.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        label4.setText("Hotel");

        Jumlah.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        Jumlah.setText("Jumlah Kamar");

        Jumlah1.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        Jumlah1.setText("Total");

        jumlah1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jumlah1ActionPerformed(evt);
            }
        });

        tujuan1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Jakarta-Bandung", "Jakarta-Semarang", "Jakarta-Bali" }));
        tujuan1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tujuan1ActionPerformed(evt);
            }
        });

        hotel1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hotel1ActionPerformed(evt);
            }
        });

        report1.setColumns(20);
        report1.setRows(5);
        jScrollPane1.setViewportView(report1);

        label5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        label5.setName(""); // NOI18N
        label5.setText("Report");

        reset.setText("Reset");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });

        Jumlah2.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        Jumlah2.setText("Jumlah Tiket");

        jumlah2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jumlah2ActionPerformed(evt);
            }
        });

        pesan.setText("Pesan");
        pesan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesanActionPerformed(evt);
            }
        });

        label6.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        label6.setName("Tujuan"); // NOI18N
        label6.setText("Tujuan");

        label7.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        label7.setName("Tujuan"); // NOI18N
        label7.setText("Harga");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(230, 230, 230)
                        .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(82, 82, 82)
                        .addComponent(nama1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(170, 170, 170)
                        .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(78, 78, 78)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(tujuan1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(harga1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(hotel1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(harga2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(58, 58, 58)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addComponent(pesan, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Jumlah1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(89, 89, 89)
                                .addComponent(total1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Jumlah2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Jumlah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(35, 35, 35)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jumlah1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jumlah2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(160, 160, 160)
                                .addComponent(reset)))))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(nama1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(label6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)
                        .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(label7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(tujuan1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)
                        .addComponent(harga1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(hotel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)
                        .addComponent(harga2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(Jumlah2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(Jumlah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jumlah1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jumlah2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(reset)))
                .addGap(10, 10, 10)
                .addComponent(pesan)
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Jumlah1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(total1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(60, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tujuan1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tujuan1ActionPerformed
        int hargatjn = 0;
        if (tujuan1.getSelectedItem().equals("Jakarta-Bandung")) {
            hargatjn = 300000;
            hotel1.addItem("---Hotel---");
            hotel1.addItem("Horizon Hotel");
            hotel1.addItem("Azkara Hotel");
            harga1.setText(String.valueOf(hargatjn));
        } else if (tujuan1.getSelectedItem().equals("Jakarta-Semarang")){ 
            hargatjn = 350000;
            hotel1.addItem("---Hotel---");
            hotel1.addItem("Quest Hotel");
            hotel1.addItem("Rumi Hotel");
            harga1.setText(String.valueOf(hargatjn));
        } else if (tujuan1.getSelectedItem().equals("Jakarta-Bali")){ 
            hargatjn = 400000;
            hotel1.addItem("---Hotel---");
            hotel1.addItem("Bingo Hotel");
            hotel1.addItem("Finest Hotel");
            harga1.setText(String.valueOf(hargatjn));
        }
    }//GEN-LAST:event_tujuan1ActionPerformed

    private void hotel1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hotel1ActionPerformed
        int hargahtl = 0;
        if (hotel1.getSelectedItem().equals("Horizon Hotel")) {
            hargahtl = 300000;
            harga2.setText(String.valueOf(hargahtl));
        } else if (hotel1.getSelectedItem().equals("Azkara Hotel")){
            hargahtl = 350000;
            harga2.setText(String.valueOf(hargahtl));
        } else if (hotel1.getSelectedItem().equals("Quest Hotel")){
            hargahtl = 3750000;
            harga2.setText(String.valueOf(hargahtl));
        } else if (hotel1.getSelectedItem().equals("Rumi Hotel")){
            hargahtl = 325000;
            harga2.setText(String.valueOf(hargahtl));
        } else if (hotel1.getSelectedItem().equals("Bingo Hotel")){
            hargahtl = 450000;
            harga2.setText(String.valueOf(hargahtl));
        } else if (hotel1.getSelectedItem().equals("Finest Hotel")){
            hargahtl = 475000;
            harga2.setText(String.valueOf(hargahtl));
        }
    }//GEN-LAST:event_hotel1ActionPerformed

    private void jumlah1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jumlah1ActionPerformed
        
    }//GEN-LAST:event_jumlah1ActionPerformed

    private void jumlah2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jumlah2ActionPerformed
        
    }//GEN-LAST:event_jumlah2ActionPerformed

    private void pesanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesanActionPerformed
        String nama = nama1.getText();
        Integer jumlahtkt = Integer.parseInt( jumlah1.getText() );
        Integer jumlahkmr = Integer.parseInt( jumlah2.getText() );
        Integer hargatujuan = Integer.parseInt( harga1.getText() );
        Integer hargahotel = Integer.parseInt( harga2.getText() );
        int tujuan = tujuan1.getSelectedIndex();
        int hotel = hotel1.getSelectedIndex();
        int total;
        total = (hargahotel * jumlahkmr) + (hargatujuan * jumlahtkt);
        total1.setText("Rp. "+total);
        report1.setText("Pelanggan "+nama+" berhasil membeli \ntiket travel tujuan "+tujuan1.getItemAt(tujuan)+ " \ndan memesan penginapan di"+hotel1.getItemAt(hotel));
    }//GEN-LAST:event_pesanActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        nama1.setText("");
        harga1.setText("");
        harga2.setText("");
        jumlah1.setText("");
        jumlah2.setText("");
        total1.setText("");
        report1.setText("");
    }//GEN-LAST:event_resetActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUI1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Label Jumlah;
    private java.awt.Label Jumlah1;
    private java.awt.Label Jumlah2;
    private javax.swing.JTextField harga1;
    private javax.swing.JTextField harga2;
    private javax.swing.JComboBox<String> hotel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jumlah1;
    private javax.swing.JTextField jumlah2;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private java.awt.Label label3;
    private java.awt.Label label4;
    private java.awt.Label label5;
    private java.awt.Label label6;
    private java.awt.Label label7;
    private javax.swing.JTextField nama1;
    private javax.swing.JButton pesan;
    private javax.swing.JTextArea report1;
    private javax.swing.JButton reset;
    private javax.swing.JTextField total1;
    private javax.swing.JComboBox<String> tujuan1;
    // End of variables declaration//GEN-END:variables
}
