/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package GUI.QuanLyKTX;

import javax.swing.JOptionPane;

import Model.SinhVienKTX;
import Utils.Check;

/**
 *
 * @author Vũ Đình Duy
 */
public class DialogGiaHan extends javax.swing.JDialog {
    private SinhVienKTX sv;

    /**
     * Creates new form DialogGiaHan
     */
    public DialogGiaHan(java.awt.Frame parent, boolean modal, SinhVienKTX sv) {
        super(parent, modal);
        this.sv = sv;
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        xacNhanButton1 = new javax.swing.JButton();
        mainLabel = new javax.swing.JLabel();
        msvTextField = new javax.swing.JTextField();
        msvLabel = new javax.swing.JLabel();
        hoTenLabel = new javax.swing.JLabel();
        hoTenTextField = new javax.swing.JTextField();
        ngaySinhLabel = new javax.swing.JLabel();
        ngaySinhTextField = new javax.swing.JTextField();
        ngayDangKyLabel = new javax.swing.JLabel();
        ngayDangKyTextField = new javax.swing.JTextField();
        ngayHetHanLabel = new javax.swing.JLabel();
        ngayHetHanTextField = new javax.swing.JTextField();
        xacNhanButton = new javax.swing.JButton();
        huyButton = new javax.swing.JButton();

        xacNhanButton1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        xacNhanButton1.setText("Xác nhận");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Gia hạn thêm thời gian");
        setBackground(new java.awt.Color(255, 255, 255));

        mainLabel.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        mainLabel.setText("Gia hạn thêm thời gian");

        msvTextField.setEditable(false);
        msvTextField.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        msvTextField.setText(this.sv.getMaSV());
        msvTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                msvTextFieldActionPerformed(evt);
            }
        });

        msvLabel.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        msvLabel.setText("Mã sinh viên");

        hoTenLabel.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        hoTenLabel.setText("Họ và tên");

        hoTenTextField.setEditable(false);
        hoTenTextField.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        hoTenTextField.setText(this.sv.getTenSV());
        hoTenTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hoTenTextFieldActionPerformed(evt);
            }
        });

        ngaySinhLabel.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        ngaySinhLabel.setText("Ngày sinh");

        ngaySinhTextField.setEditable(false);
        ngaySinhTextField.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        ngaySinhTextField.setText(this.sv.getNgaySinh());
        ngaySinhTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ngaySinhTextFieldActionPerformed(evt);
            }
        });

        ngayDangKyLabel.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        ngayDangKyLabel.setText("Ngày đăng ký");

        ngayDangKyTextField.setEditable(false);
        ngayDangKyTextField.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        ngayDangKyTextField.setText(this.sv.getNgayDangKy());
        ngayDangKyTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ngayDangKyTextFieldActionPerformed(evt);
            }
        });

        ngayHetHanLabel.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        ngayHetHanLabel.setText("Ngày hết hạn");

        ngayHetHanTextField.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        ngayHetHanTextField.setText(this.sv.getNgayHetHan());
        ngayHetHanTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ngayHetHanTextFieldActionPerformed(evt);
            }
        });

        xacNhanButton.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        xacNhanButton.setText("Xác nhận");
        xacNhanButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xacNhanButtonActionPerformed(evt);
            }
        });

        huyButton.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        huyButton.setText("Hủy bỏ");
        huyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                huyButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addComponent(mainLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(94, 94, 94))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ngayDangKyLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(ngayDangKyTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ngaySinhLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(ngaySinhTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(hoTenLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(hoTenTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(msvLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(msvTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ngayHetHanLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(ngayHetHanTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(xacNhanButton, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59)
                        .addComponent(huyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mainLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(msvTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(msvLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hoTenTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hoTenLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ngaySinhTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ngaySinhLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ngayDangKyTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ngayDangKyLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ngayHetHanTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ngayHetHanLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(xacNhanButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(huyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    private void msvTextFieldActionPerformed(java.awt.event.ActionEvent evt) {                                             
        // TODO add your handling code here:
    }                                            

    private void hoTenTextFieldActionPerformed(java.awt.event.ActionEvent evt) {                                               
        // TODO add your handling code here:
    }                                              

    private void ngaySinhTextFieldActionPerformed(java.awt.event.ActionEvent evt) {                                                  
        // TODO add your handling code here:
    }                                                 

    private void ngayDangKyTextFieldActionPerformed(java.awt.event.ActionEvent evt) {                                                    
        // TODO add your handling code here:
    }                                                   

    private void ngayHetHanTextFieldActionPerformed(java.awt.event.ActionEvent evt) {                                                    
        // TODO add your handling code here:
    }                                                   

    private void xacNhanButtonActionPerformed(java.awt.event.ActionEvent evt) {
        String ngayHetHanMoi = ngayHetHanTextField.getText();
        if (ngayHetHanMoi.equals(this.sv.getNgayHetHan())) {
            JOptionPane.showMessageDialog(rootPane, "Vui lòng nhập giá trị mới cho \"Ngày hết hạn\"");
        } else if(!Check.checkDateFormat(ngayHetHanMoi)) {
            JOptionPane.showMessageDialog(rootPane, "Vui lòng nhập giá trị mới \"Ngày hết hạn\" đúng định dạng: dd/MM/yyyy!");
        } else {
            int respone = JOptionPane.showConfirmDialog(rootPane, "Bạn có chắc chắn muốn sửa không?", "Xác nhận sửa", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            
            if(respone == JOptionPane.YES_OPTION) {
                this.sv.setNgayHetHan(ngayHetHanMoi);
                this.dispose();
            }
        }
    }                                             

    private void huyButtonActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        this.dispose();
    }                                         

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(DialogGiaHan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DialogGiaHan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DialogGiaHan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DialogGiaHan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                // DialogGiaHan dialog = new DialogGiaHan(new javax.swing.JFrame(), true);
                // dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                //     @Override
                //     public void windowClosing(java.awt.event.WindowEvent e) {
                //         System.exit(0);
                //     }
                // });
                // dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JLabel hoTenLabel;
    private javax.swing.JTextField hoTenTextField;
    private javax.swing.JButton huyButton;
    private javax.swing.JLabel mainLabel;
    private javax.swing.JLabel msvLabel;
    private javax.swing.JTextField msvTextField;
    private javax.swing.JLabel ngayDangKyLabel;
    private javax.swing.JTextField ngayDangKyTextField;
    private javax.swing.JLabel ngayHetHanLabel;
    private javax.swing.JTextField ngayHetHanTextField;
    private javax.swing.JLabel ngaySinhLabel;
    private javax.swing.JTextField ngaySinhTextField;
    private javax.swing.JButton xacNhanButton;
    private javax.swing.JButton xacNhanButton1;
    // End of variables declaration                   
}
