/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */


    
package supplychaintrackingsystem;

import java.sql.Connection;
import javax.swing.JOptionPane;

public class RawMaterial_Gui extends javax.swing.JFrame {

    Connection con;
    private RawMaterial rawMaterial = new RawMaterial();

    public RawMaterial_Gui() {
        initComponents();

        pack();
        setLocationRelativeTo(null);

        // Database connection (optional if you still use DB)
        con = DBConnection.connect();

        // Fix ComboBoxes (use correct components)
        status3.setModel(new javax.swing.DefaultComboBoxModel<>(
            new String[]{"Pending", "Approved", "Revoked", "Issue Reported"}
        ));

        quality3.setModel(new javax.swing.DefaultComboBoxModel<>(
            new String[]{"Not Checked", "Checked"}
        ));

        // Activity log not editable
        acrivitylog.setEditable(false);
    }
    

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane3 = new javax.swing.JScrollPane();
        jPanel8 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        materialID3 = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        MaterialDate3 = new javax.swing.JTextField();
        Register3 = new javax.swing.JButton();
        link3 = new javax.swing.JButton();
        clear3 = new javax.swing.JButton();
        jLabel36 = new javax.swing.JLabel();
        status3 = new javax.swing.JComboBox<>();
        jLabel37 = new javax.swing.JLabel();
        quality3 = new javax.swing.JComboBox<>();
        jPanel4 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        adminID = new javax.swing.JTextField();
        approvalMaterial = new javax.swing.JButton();
        checkQuality = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        acrivitylog = new javax.swing.JTextArea();
        jPanel5 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        revokeReason = new javax.swing.JTextField();
        revoke = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        newMaterialdate = new javax.swing.JTextField();
        updateMaterial = new javax.swing.JButton();
        issueDescription = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        reportissue = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Register Material", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(51, 102, 255))); // NOI18N

        jLabel8.setText("Material ID");

        materialID3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                materialID3materialIDActionPerformed(evt);
            }
        });

        jLabel35.setText("Material Data ");

        MaterialDate3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MaterialDate3MaterialDateActionPerformed(evt);
            }
        });

        Register3.setBackground(new java.awt.Color(0, 102, 152));
        Register3.setForeground(new java.awt.Color(255, 255, 255));
        Register3.setText("Resgister");
        Register3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Register3RegisterActionPerformed(evt);
            }
        });

        link3.setForeground(new java.awt.Color(0, 102, 152));
        link3.setText("Link ID only");
        link3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 152)));
        link3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                link3linkActionPerformed(evt);
            }
        });

        clear3.setForeground(new java.awt.Color(0, 102, 152));
        clear3.setText("Clear");
        clear3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 152)));
        clear3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clear3clearActionPerformed(evt);
            }
        });

        jLabel36.setText("Status");

        status3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pending", "Processing ", "Confirmed" }));
        status3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                status3statusActionPerformed(evt);
            }
        });

        jLabel37.setText("Quality");

        quality3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Checked ", "Not Checked", " " }));
        quality3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quality3qualityActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(Register3)
                                .addGap(18, 18, 18)
                                .addComponent(link3, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(clear3, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(status3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(materialID3, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                                        .addComponent(MaterialDate3))
                                    .addComponent(quality3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(236, Short.MAX_VALUE))))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(materialID3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel35)
                    .addComponent(MaterialDate3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel36)
                    .addComponent(status3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel37)
                    .addComponent(quality3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Register3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(link3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clear3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(632, Short.MAX_VALUE))
        );

        jScrollPane3.setViewportView(jPanel8);

        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel11.setForeground(new java.awt.Color(0, 51, 204));
        jLabel11.setText("Approval Quality");

        jLabel12.setText("Admin ID");

        adminID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminIDActionPerformed(evt);
            }
        });

        approvalMaterial.setBackground(new java.awt.Color(0, 102, 152));
        approvalMaterial.setForeground(new java.awt.Color(255, 255, 255));
        approvalMaterial.setText("Approval Material");
        approvalMaterial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                approvalMaterialActionPerformed(evt);
            }
        });

        checkQuality.setForeground(new java.awt.Color(0, 102, 152));
        checkQuality.setText("Check Quality");
        checkQuality.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 152)));
        checkQuality.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkQualityActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(adminID, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(approvalMaterial)
                        .addGap(18, 18, 18)
                        .addComponent(checkQuality, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel11)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(adminID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(approvalMaterial)
                    .addComponent(checkQuality, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        acrivitylog.setColumns(20);
        acrivitylog.setRows(5);
        acrivitylog.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Activity Log", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(0, 102, 152))); // NOI18N
        jScrollPane1.setViewportView(acrivitylog);

        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel13.setText("Revoke Reason ");

        revokeReason.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                revokeReasonActionPerformed(evt);
            }
        });

        revoke.setBackground(new java.awt.Color(255, 0, 51));
        revoke.setForeground(new java.awt.Color(255, 255, 255));
        revoke.setText("Revoke Approval");
        revoke.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                revokeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(revokeReason, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(revoke, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(revokeReason, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(revoke)
                .addGap(14, 14, 14))
        );

        jPanel1.setBackground(new java.awt.Color(0, 102, 156));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Raw Material ");

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Register,approve and manage raw material");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel14.setForeground(new java.awt.Color(0, 0, 255));
        jLabel14.setText("Update & Issues");

        jLabel15.setText("New Material Data");

        newMaterialdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newMaterialdateActionPerformed(evt);
            }
        });

        updateMaterial.setBackground(new java.awt.Color(0, 102, 152));
        updateMaterial.setForeground(new java.awt.Color(255, 255, 255));
        updateMaterial.setText("Updata Material Data");
        updateMaterial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateMaterialActionPerformed(evt);
            }
        });

        issueDescription.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                issueDescriptionActionPerformed(evt);
            }
        });

        jLabel16.setText("Issues Description");

        reportissue.setBackground(new java.awt.Color(0, 102, 152));
        reportissue.setForeground(new java.awt.Color(255, 255, 255));
        reportissue.setText("Report Issue");
        reportissue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reportissueActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(updateMaterial)
                        .addGap(43, 43, 43)
                        .addComponent(reportissue, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(issueDescription, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                            .addComponent(newMaterialdate))))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14)
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(newMaterialdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(issueDescription, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(updateMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(reportissue, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void materialID3materialIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_materialID3materialIDActionPerformed
        // TODO add your handling code here:
         if (rawMaterial.checkQuality()) {
        JOptionPane.showMessageDialog(this, "Quality checked successfully");
        refreshRawMaterialView();
    } else {
        JOptionPane.showMessageDialog(this, "Cannot check quality before registering material");
    }
        
    }//GEN-LAST:event_materialID3materialIDActionPerformed

    private void MaterialDate3MaterialDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MaterialDate3MaterialDateActionPerformed
        // TODO add your handling code here:
        try {
        int admin = Integer.parseInt(adminID.getText().trim());

        if (rawMaterial.approveMaterial(admin)) {
            JOptionPane.showMessageDialog(this, "Material approved successfully");
            refreshRawMaterialView();
        } else {
            JOptionPane.showMessageDialog(this, "Cannot approve. Check Material ID, Material Data, or Admin ID");
        }

    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Admin ID must be a number");
    }

        
    }//GEN-LAST:event_MaterialDate3MaterialDateActionPerformed

    private void Register3RegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Register3RegisterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Register3RegisterActionPerformed

    private void link3linkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_link3linkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_link3linkActionPerformed

    private void clear3clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clear3clearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_clear3clearActionPerformed

    private void status3statusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_status3statusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_status3statusActionPerformed

    private void quality3qualityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quality3qualityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_quality3qualityActionPerformed

    private void adminIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_adminIDActionPerformed

    private void approvalMaterialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_approvalMaterialActionPerformed
        try {
            int admin = Integer.parseInt(adminID.getText().trim());

            if (rawMaterial.approveMaterial(admin)) {
                JOptionPane.showMessageDialog(this, "Material approved successfully");
                refreshRawMaterialView();
            } else {
                JOptionPane.showMessageDialog(this, "Cannot approve. Check Material ID, Material Data, or Admin ID");
            }

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Admin ID must be a number");
        }
    }//GEN-LAST:event_approvalMaterialActionPerformed

    private void checkQualityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkQualityActionPerformed
        if (rawMaterial.checkQuality()) {
            JOptionPane.showMessageDialog(this, "Quality checked successfully");
            refreshRawMaterialView();
        } else {
            JOptionPane.showMessageDialog(this, "Cannot check quality before registering material");
        }
    }//GEN-LAST:event_checkQualityActionPerformed

    private void revokeReasonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_revokeReasonActionPerformed
        String reason = revokeReason.getText().trim();

        if (rawMaterial.revokeApproval(reason)) {
            JOptionPane.showMessageDialog(this, "Approval revoked successfully");
            refreshRawMaterialView();
        } else {
            JOptionPane.showMessageDialog(this, "Cannot revoke. Material must be approved and reason is required");
        }
    }//GEN-LAST:event_revokeReasonActionPerformed

    private void revokeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_revokeActionPerformed
String reason = revokeReason.getText().trim();

    if (rawMaterial.revokeApproval(reason)) {
        JOptionPane.showMessageDialog(this, "Approval revoked successfully");
        refreshRawMaterialView();
    } else {
        JOptionPane.showMessageDialog(this, "Cannot revoke. Material must be approved and reason is required");
    }

    }//GEN-LAST:event_revokeActionPerformed

    private void newMaterialdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newMaterialdateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_newMaterialdateActionPerformed

    private void updateMaterialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateMaterialActionPerformed

        String newData = newMaterialdate.getText().trim();

        if (rawMaterial.updateMaterialData(newData)) {
            JOptionPane.showMessageDialog(this, "Material data updated successfully");
            refreshRawMaterialView();
        } else {
            JOptionPane.showMessageDialog(this, "Please enter valid new material data");
        }
    }//GEN-LAST:event_updateMaterialActionPerformed

    private void issueDescriptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_issueDescriptionActionPerformed

    }//GEN-LAST:event_issueDescriptionActionPerformed

    private void reportissueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reportissueActionPerformed
        String issue = issueDescription.getText().trim();

        if (rawMaterial.reportIssue(issue)) {
            JOptionPane.showMessageDialog(this, "Issue reported successfully");
            refreshRawMaterialView();
        } else {
            JOptionPane.showMessageDialog(this, "Please enter issue description");
        }

    }//GEN-LAST:event_reportissueActionPerformed

    /**
     * @param args the command line arguments
     */
    
    
private void refreshRawMaterialView() {
    materialID3.setText(rawMaterial.getMaterialID() == null ? "" : rawMaterial.getMaterialID());
    MaterialDate3.setText(rawMaterial.getMaterialData() == null ? "" : rawMaterial.getMaterialData());

    status3.setSelectedItem(rawMaterial.getStatus());
    quality3.setSelectedItem(rawMaterial.getQualityStatus());

    acrivitylog.setText("");

    for (String log : rawMaterial.getActivityLog()) {
        acrivitylog.append(log + "\n");
    }
}




    
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
            java.util.logging.Logger.getLogger(RawMaterial_Gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RawMaterial_Gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RawMaterial_Gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RawMaterial_Gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RawMaterial_Gui().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField MaterialDate3;
    private javax.swing.JButton Register3;
    private javax.swing.JTextArea acrivitylog;
    private javax.swing.JTextField adminID;
    private javax.swing.JButton approvalMaterial;
    private javax.swing.JButton checkQuality;
    private javax.swing.JButton clear3;
    private javax.swing.JTextField issueDescription;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton link3;
    private javax.swing.JTextField materialID3;
    private javax.swing.JTextField newMaterialdate;
    private javax.swing.JComboBox<String> quality3;
    private javax.swing.JButton reportissue;
    private javax.swing.JButton revoke;
    private javax.swing.JTextField revokeReason;
    private javax.swing.JComboBox<String> status3;
    private javax.swing.JButton updateMaterial;
    // End of variables declaration//GEN-END:variables
}
