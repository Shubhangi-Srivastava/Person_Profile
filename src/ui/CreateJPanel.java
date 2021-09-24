/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import Person_Profile.Profile;
import java.awt.Graphics2D;
import java.awt.GraphicsConfiguration;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author shubhangisrivastava
 */
public class CreateJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreateJPanel
     */
    Profile profile;
    
    public CreateJPanel(Profile profile) {
        initComponents();
        this.profile = profile;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        LblTitle = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        lblGeographicData = new javax.swing.JLabel();
        lblDOB = new javax.swing.JLabel();
        lblTelNum = new javax.swing.JLabel();
        lblFaxNum = new javax.swing.JLabel();
        lblEmailAddr = new javax.swing.JLabel();
        lblSSN = new javax.swing.JLabel();
        lblMedicalRecNum = new javax.swing.JLabel();
        lblHealthPlanBenefitNum = new javax.swing.JLabel();
        lblBankAcNum = new javax.swing.JLabel();
        lblLicenseNum = new javax.swing.JLabel();
        lblVehicleIdentifier = new javax.swing.JLabel();
        lblDeviceIdentifier = new javax.swing.JLabel();
        lblLinkedIn = new javax.swing.JLabel();
        lblIPAddr = new javax.swing.JLabel();
        lblFingerPrnt = new javax.swing.JLabel();
        lblImage = new javax.swing.JLabel();
        lblUniqueID = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtCity = new javax.swing.JTextField();
        txttelnum = new javax.swing.JTextField();
        txtFaxNum = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtSSN = new javax.swing.JTextField();
        txtMedicalRecNum = new javax.swing.JTextField();
        txtHealthBenNum = new javax.swing.JTextField();
        txtLicenseNum = new javax.swing.JTextField();
        txtVehicleIdent = new javax.swing.JTextField();
        deviceIdenttxt = new javax.swing.JTextField();
        txtLinkedIn = new javax.swing.JTextField();
        txtIPAddr = new javax.swing.JTextField();
        txtFingerPrint = new javax.swing.JTextField();
        txtUniqueID = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        txtBankAccNum = new javax.swing.JTextField();
        txtDOB = new com.toedter.calendar.JDateChooser();
        btnImg = new javax.swing.JButton();
        label = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        LblTitle.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        LblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LblTitle.setText("CREATE PERSON DETAILS");

        lblName.setText("Name :");

        lblGeographicData.setText("City :");

        lblDOB.setText("Date Of Birth :");

        lblTelNum.setText("Telephone Number :");

        lblFaxNum.setText("Email Address :");

        lblEmailAddr.setText("Fax Number :");

        lblSSN.setText("SSN :");

        lblMedicalRecNum.setText("Medical Record Number :");

        lblHealthPlanBenefitNum.setText("Health Plan Benefit Number :");

        lblBankAcNum.setText("Bank Account Number :");

        lblLicenseNum.setText("License Number :");

        lblVehicleIdentifier.setText("Vehicle Identifier :");

        lblDeviceIdentifier.setText("Device Identifier :");

        lblLinkedIn.setText("LinkedIn Profile :");

        lblIPAddr.setText("IP Address :");

        lblFingerPrnt.setText("FingerPrint :");

        lblImage.setText("Image :");

        lblUniqueID.setText("Unique ID :");

        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });

        txtCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCityActionPerformed(evt);
            }
        });

        txttelnum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttelnumActionPerformed(evt);
            }
        });

        txtFaxNum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFaxNumActionPerformed(evt);
            }
        });

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        txtBankAccNum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBankAccNumActionPerformed(evt);
            }
        });

        btnImg.setText("Upload");
        btnImg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImgActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(212, 212, 212)
                .addComponent(btnSave)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblName)
                            .addComponent(lblGeographicData)
                            .addComponent(lblEmailAddr)
                            .addComponent(lblSSN)
                            .addComponent(lblMedicalRecNum)
                            .addComponent(lblBankAcNum)
                            .addComponent(lblLicenseNum)
                            .addComponent(lblDeviceIdentifier)
                            .addComponent(lblLinkedIn)
                            .addComponent(lblIPAddr)
                            .addComponent(lblUniqueID)
                            .addComponent(lblTelNum, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblDOB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblFaxNum)
                            .addComponent(lblHealthPlanBenefitNum)
                            .addComponent(lblVehicleIdentifier)
                            .addComponent(lblFingerPrnt)
                            .addComponent(lblImage))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtName)
                            .addComponent(txttelnum, javax.swing.GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE)
                            .addComponent(txtFaxNum)
                            .addComponent(txtEmail)
                            .addComponent(txtSSN)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txtHealthBenNum, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtBankAccNum, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtLicenseNum, javax.swing.GroupLayout.Alignment.LEADING)))
                            .addComponent(txtMedicalRecNum, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCity)
                            .addComponent(txtDOB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtUniqueID, javax.swing.GroupLayout.DEFAULT_SIZE, 530, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtVehicleIdent)
                                    .addComponent(deviceIdenttxt)
                                    .addComponent(btnImg, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtLinkedIn)
                                    .addComponent(txtIPAddr)
                                    .addComponent(txtFingerPrint))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(label, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(LblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {lblBankAcNum, lblDOB, lblDeviceIdentifier, lblEmailAddr, lblFaxNum, lblFingerPrnt, lblGeographicData, lblHealthPlanBenefitNum, lblIPAddr, lblImage, lblLicenseNum, lblLinkedIn, lblMedicalRecNum, lblName, lblSSN, lblTelNum, lblUniqueID, lblVehicleIdentifier});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {deviceIdenttxt, txtBankAccNum, txtCity, txtEmail, txtFaxNum, txtFingerPrint, txtHealthBenNum, txtIPAddr, txtLicenseNum, txtLinkedIn, txtName, txtSSN, txtUniqueID, txtVehicleIdent, txttelnum});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LblTitle)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblName)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblGeographicData)
                                .addGap(8, 8, 8)
                                .addComponent(lblDOB)
                                .addGap(8, 8, 8)
                                .addComponent(lblTelNum)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblEmailAddr)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblFaxNum)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblSSN)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblMedicalRecNum)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblHealthPlanBenefitNum)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblBankAcNum, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblLicenseNum))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtDOB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(txttelnum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(txtFaxNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(36, 36, 36))
                                            .addComponent(txtSSN, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(36, 36, 36))
                                    .addComponent(txtMedicalRecNum, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtHealthBenNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtBankAccNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtLicenseNum, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtVehicleIdent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblVehicleIdentifier))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDeviceIdentifier)
                            .addComponent(deviceIdenttxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblLinkedIn)
                            .addComponent(txtLinkedIn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblIPAddr)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblFingerPrnt)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblImage)
                            .addComponent(btnImg)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(428, 428, 428)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtIPAddr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtFingerPrint, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12))
                            .addComponent(label, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblUniqueID)
                    .addComponent(txtUniqueID, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addComponent(btnSave)
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {lblBankAcNum, lblDOB, lblDeviceIdentifier, lblEmailAddr, lblFaxNum, lblFingerPrnt, lblGeographicData, lblHealthPlanBenefitNum, lblIPAddr, lblImage, lblLicenseNum, lblLinkedIn, lblMedicalRecNum, lblName, lblSSN, lblTelNum, lblUniqueID, lblVehicleIdentifier});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {deviceIdenttxt, txtBankAccNum, txtCity, txtEmail, txtFaxNum, txtFingerPrint, txtHealthBenNum, txtIPAddr, txtLinkedIn, txtMedicalRecNum, txtName, txtSSN, txtVehicleIdent, txttelnum});

    }// </editor-fold>//GEN-END:initComponents

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void txtCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCityActionPerformed

    private void txttelnumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttelnumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttelnumActionPerformed

    private void txtFaxNumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFaxNumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFaxNumActionPerformed

    
    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        
        profile.setName(txtName.getText());
        profile.setCity(txtCity.getText());
        profile.setDOB(txtDOB.getDate());
        profile.setTelephone(txttelnum.getText());
        profile.setFax_num(txtFaxNum.getText());
        profile.setEmail_addr(txtEmail.getText());
        profile.setSsn(txtSSN.getText());
        profile.setMedicaid_rec_num(txtMedicalRecNum.getText());
        profile.setHealth_plan_ben_num(txtHealthBenNum.getText());
        profile.setBank_acc_num(Long.parseLong(txtBankAccNum.getText()));
        profile.setLicense_num(txtLicenseNum.getText());
        profile.setVehicle_identifier(txtVehicleIdent.getText());
        profile.setDevice_identifier(deviceIdenttxt.getText());
        profile.setLinkedIn(txtLinkedIn.getText());
        profile.setIPAddr(txtIPAddr.getText());
        profile.setBio_identity(txtFingerPrint.getText());
        profile.setPhoto(label.getIcon());
        profile.setUnique_Identifier(txtUniqueID.getText());   
        
        JOptionPane.showMessageDialog(this, "Person Deatils Saved.");
       
    }//GEN-LAST:event_btnSaveActionPerformed

    private void txtBankAccNumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBankAccNumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBankAccNumActionPerformed

    private void btnImgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImgActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("4 extensions supported", "jpg", "png", "jpeg", "gif");
        fileChooser.setFileFilter(filter);
        int selected = fileChooser.showOpenDialog(this);
        if(selected == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            String getSelectedImage = file.getAbsolutePath();
            JOptionPane.showMessageDialog(null, getSelectedImage);
            ImageIcon iicon = new ImageIcon(getSelectedImage);
            Image imgFit = iicon.getImage();
            Image dimg = imgFit.getScaledInstance(label.getWidth(), label.getHeight(),
        Image.SCALE_SMOOTH);
            label.setIcon(iicon);
            
        }

    }//GEN-LAST:event_btnImgActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LblTitle;
    private javax.swing.JButton btnImg;
    private javax.swing.JButton btnSave;
    private javax.swing.JTextField deviceIdenttxt;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel label;
    private javax.swing.JLabel lblBankAcNum;
    private javax.swing.JLabel lblDOB;
    private javax.swing.JLabel lblDeviceIdentifier;
    private javax.swing.JLabel lblEmailAddr;
    private javax.swing.JLabel lblFaxNum;
    private javax.swing.JLabel lblFingerPrnt;
    private javax.swing.JLabel lblGeographicData;
    private javax.swing.JLabel lblHealthPlanBenefitNum;
    private javax.swing.JLabel lblIPAddr;
    private javax.swing.JLabel lblImage;
    private javax.swing.JLabel lblLicenseNum;
    private javax.swing.JLabel lblLinkedIn;
    private javax.swing.JLabel lblMedicalRecNum;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblSSN;
    private javax.swing.JLabel lblTelNum;
    private javax.swing.JLabel lblUniqueID;
    private javax.swing.JLabel lblVehicleIdentifier;
    private javax.swing.JTextField txtBankAccNum;
    private javax.swing.JTextField txtCity;
    private com.toedter.calendar.JDateChooser txtDOB;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFaxNum;
    private javax.swing.JTextField txtFingerPrint;
    private javax.swing.JTextField txtHealthBenNum;
    private javax.swing.JTextField txtIPAddr;
    private javax.swing.JTextField txtLicenseNum;
    private javax.swing.JTextField txtLinkedIn;
    private javax.swing.JTextField txtMedicalRecNum;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtSSN;
    private javax.swing.JTextField txtUniqueID;
    private javax.swing.JTextField txtVehicleIdent;
    private javax.swing.JTextField txttelnum;
    // End of variables declaration//GEN-END:variables
}
