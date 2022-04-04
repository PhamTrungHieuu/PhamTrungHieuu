/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view;

import controller.IOFile;
import controller.trongghichuException;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import model.Bangchi;
import controller.NgayException;
import controller.TrongException;
import controller.numberException;
import controller.trongngayException;
import controller.trongsotienException;
import controller.trongkhoanchiException;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author trung
 */
public class Formbangchi extends javax.swing.JPanel {

    /**
     * Creates new form Formbangchi
     */
    private DefaultTableModel tm;
    private boolean them,sua;
    private List<Bangchi> lbangchi;
    private String fbangchi;
    public Formbangchi() {
        initComponents();
        fbangchi = "src/controller/Bangchi.DAT";
        String[] cols = {"Ngay", "So tien", "Ghi chu", "Khoan chi"};
        tm = new DefaultTableModel(cols, 0);
        tbbangchi.setModel(tm);
        them = false;
        sua = false;
        ngay_thang.setEnabled(false);
        tfsotien.setEnabled(false);
        tfghichu.setEnabled(false);
        tfkhoanchi.setEnabled(false);
        Date date = new Date();
        ngay_thang.getDateEditor().setDate(date);
        loadData();
    }
    private void loadData() {
        File f = new File(fbangchi);
        if (f.exists()) {
            lbangchi = IOFile.doc(fbangchi);
            tm.setRowCount(0);
            for (Bangchi i: lbangchi) {
                tm.addRow(i.toObject());
            }
        } 
        else {
            lbangchi = new ArrayList<>();
        }
    }
    private void trangthai(boolean b){
        bthem.setEnabled(b);
        bsua.setEnabled(b);
        bxoa.setEnabled(b);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        tfsotien = new javax.swing.JTextField();
        tfghichu = new javax.swing.JTextField();
        tfkhoanchi = new javax.swing.JTextField();
        bluu = new javax.swing.JButton();
        bthem = new javax.swing.JButton();
        bxoa = new javax.swing.JButton();
        bsua = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbbangchi = new javax.swing.JTable();
        bboqua = new javax.swing.JButton();
        ngay_thang = new com.toedter.calendar.JDateChooser();

        jLabel1.setText("Ngay");

        jLabel2.setText("So tien");

        jLabel3.setText("Ghi chu");

        jLabel4.setText("khoan thu");

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });

        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField6, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)))
                .addGap(27, 27, 27))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jTextField5, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
                    .addComponent(jTextField6))
                .addContainerGap())
        );

        setBackground(new java.awt.Color(255, 255, 102));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 51, 255));
        jLabel5.setText("Ngày");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 17, -1, 28));

        jLabel6.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 255));
        jLabel6.setText("Số tiền");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 22, -1, -1));

        jLabel7.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 51, 255));
        jLabel7.setText("Ghi chú");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 20, -1, -1));

        jLabel8.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 51, 255));
        jLabel8.setText("Khoản chi");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 20, -1, -1));

        tfsotien.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tfsotien.setForeground(new java.awt.Color(0, 51, 255));
        tfsotien.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tfsotien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfsotienActionPerformed(evt);
            }
        });
        add(tfsotien, new org.netbeans.lib.awtextra.AbsoluteConstraints(148, 57, 120, 30));

        tfghichu.setForeground(new java.awt.Color(0, 51, 255));
        tfghichu.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        add(tfghichu, new org.netbeans.lib.awtextra.AbsoluteConstraints(283, 57, 150, 30));

        tfkhoanchi.setForeground(new java.awt.Color(0, 51, 255));
        tfkhoanchi.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tfkhoanchi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfkhoanchiActionPerformed(evt);
            }
        });
        add(tfkhoanchi, new org.netbeans.lib.awtextra.AbsoluteConstraints(449, 57, 170, 30));

        bluu.setBackground(new java.awt.Color(255, 204, 204));
        bluu.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        bluu.setForeground(new java.awt.Color(153, 0, 153));
        bluu.setText("Lưu");
        bluu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bluuActionPerformed(evt);
            }
        });
        add(bluu, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 100, -1, -1));

        bthem.setBackground(new java.awt.Color(255, 204, 204));
        bthem.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        bthem.setForeground(new java.awt.Color(153, 0, 153));
        bthem.setText("Thêm");
        bthem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bthemActionPerformed(evt);
            }
        });
        add(bthem, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        bxoa.setBackground(new java.awt.Color(255, 204, 204));
        bxoa.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        bxoa.setForeground(new java.awt.Color(153, 0, 153));
        bxoa.setText("Xóa");
        bxoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bxoaActionPerformed(evt);
            }
        });
        add(bxoa, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 100, -1, -1));

        bsua.setBackground(new java.awt.Color(255, 204, 204));
        bsua.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        bsua.setForeground(new java.awt.Color(153, 0, 153));
        bsua.setText("Sửa");
        bsua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bsuaActionPerformed(evt);
            }
        });
        add(bsua, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, -1, -1));

        tbbangchi.setBackground(new java.awt.Color(153, 255, 153));
        tbbangchi.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tbbangchi.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        tbbangchi.setForeground(new java.awt.Color(102, 102, 0));
        tbbangchi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Ngày", "Số tiền", "Ghi chú", "Khoản chi"
            }
        ));
        tbbangchi.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                tbbangchiAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane1.setViewportView(tbbangchi);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 601, 290));

        bboqua.setBackground(new java.awt.Color(255, 204, 204));
        bboqua.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        bboqua.setForeground(new java.awt.Color(153, 0, 153));
        bboqua.setText("Bỏ qua");
        bboqua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bboquaActionPerformed(evt);
            }
        });
        add(bboqua, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 100, -1, -1));

        ngay_thang.setBackground(new java.awt.Color(51, 255, 204));
        ngay_thang.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ngay_thang.setForeground(new java.awt.Color(0, 255, 204));
        ngay_thang.setDateFormatString("dd-MM-yyyy");
        ngay_thang.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        add(ngay_thang, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 57, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void tfkhoanchiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfkhoanchiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfkhoanchiActionPerformed

    private void tfsotienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfsotienActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfsotienActionPerformed

    private void bthemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bthemActionPerformed
        ngay_thang.setEnabled(true);
        tfsotien.setEnabled(true);
        tfsotien.setText("");
        tfghichu.setEnabled(true);
        tfghichu.setText("");
        tfkhoanchi.setEnabled(true);
        tfkhoanchi.setText("");
        trangthai(false);
        them = true;
        if(lbangchi == null || lbangchi.size() < 1)
            lbangchi = new ArrayList<>();
    }//GEN-LAST:event_bthemActionPerformed

    private void tbbangchiAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_tbbangchiAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_tbbangchiAncestorAdded

    private void bluuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bluuActionPerformed
        // TODO add your handling code here:
        if(them){
            String ngay, sotien, ghichu, khoanchi;
            try{
                SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
                ngay = sdf.format(ngay_thang.getDate());
                sotien = tfsotien.getText();
                ghichu = tfghichu.getText();
                khoanchi = tfkhoanchi.getText();
                if(ngay.isEmpty()) throw new trongngayException();
                if (!ngay.matches("^\\d{2}[-]\\d{2}[-]\\d{4}$")) throw new NgayException();
                if(sotien.isEmpty()) throw new trongsotienException();
                if(!sotien.matches("\\d+")) throw new numberException();
                if(ghichu.isEmpty()) throw new trongghichuException();
                if(khoanchi.isEmpty()) throw new trongkhoanchiException();
                
                int tien = Integer.parseInt(sotien);
                Bangchi bc = new Bangchi(ngay , tien, ghichu, khoanchi);
                tm.addRow(bc.toObject());
                lbangchi.add(bc);
                trangthai(true);
                them = false;
                ngay_thang.setEnabled(false);
                tfsotien.setEnabled(false);
                tfghichu.setEnabled(false);
                tfkhoanchi.setEnabled(false);
            }
            catch(trongngayException e){
                JOptionPane.showMessageDialog(this,"Khong de trong ngay!");
            }
            catch (NgayException e) {
                JOptionPane.showMessageDialog(this,"Nhap dung dinh dang dd-mm-yyyy");
            }
            catch (trongsotienException e) {
                JOptionPane.showMessageDialog(this,"Khong de trong so tien!");
            } 
            catch (numberException e) {
                JOptionPane.showMessageDialog(this,"Nhap so nguyen duong!");
            }
            catch(trongghichuException e){
                JOptionPane.showMessageDialog(this,"Khong de trong ghi chu!");
            }
            catch (trongkhoanchiException e) {
                JOptionPane.showMessageDialog(this,"Khong de trong khoan chi!");
            }
        }
        if(sua){
            int row = tbbangchi.getSelectedRow();
            String ngay, sotien, ghichu, khoanchi;
            try{
               SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
                ngay = sdf.format(ngay_thang.getDate());
                sotien = tfsotien.getText();
                ghichu = tfghichu.getText();
                khoanchi = tfkhoanchi.getText();
                if(ngay.isEmpty()) throw new trongngayException();
                if(sotien.isEmpty()) throw new trongsotienException();
                if(ghichu.isEmpty()) throw new trongghichuException();
                if(khoanchi.isEmpty()) throw new trongkhoanchiException();
                int tien = Integer.parseInt(sotien);
                Bangchi bc = new Bangchi(ngay , tien, ghichu, khoanchi);
                tm.setValueAt(ngay, row, 0);
                tm.setValueAt(sotien, row, 1);
                tm.setValueAt(ghichu, row, 2);
                tm.setValueAt(khoanchi, row, 3);
                lbangchi.set(row, bc);
                trangthai(true);
                sua = false;
                ngay_thang.setEnabled(false);
                tfsotien.setEnabled(false);
                tfghichu.setEnabled(false);
                tfkhoanchi.setEnabled(false);
                tbbangchi.setEnabled(true);
            }
            catch(trongngayException e){
                JOptionPane.showMessageDialog(this,"Khong de trong ngay!");
            }
            catch (trongsotienException e) {
                JOptionPane.showMessageDialog(this,"Khong de trong so tien!");
            } 
            catch(trongghichuException e){
                JOptionPane.showMessageDialog(this,"Khong de trong ghi chu!");
            }
            catch (trongkhoanchiException e) {
                JOptionPane.showMessageDialog(this,"Khong de trong khoan chi!");
            }
        }
        IOFile.viet(fbangchi, lbangchi);
    }//GEN-LAST:event_bluuActionPerformed

    private void bboquaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bboquaActionPerformed
        if (them) {
            them = false;
        }
        if (sua) 
            sua = false;
        ngay_thang.setEnabled(false);
        tfsotien.setEnabled(false);
        tfghichu.setEnabled(false);
        tfkhoanchi.setEnabled(false);
        trangthai(true);
        tbbangchi.setEnabled(true);
    }//GEN-LAST:event_bboquaActionPerformed

    private void bsuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bsuaActionPerformed
        int row = tbbangchi.getSelectedRow();
        
        if (row < 0 || row > tm.getRowCount()-1) {
            JOptionPane.showMessageDialog(this, "Chon ngay can sua");
        }
        else {
            SimpleDateFormat fdate  = new SimpleDateFormat("dd-MM-yyyy");
            String datee = tm.getValueAt(row, 0).toString();
            Date date ;
            try {
                date = fdate.parse(datee);
                ngay_thang.getDateEditor().setDate(date);
            } catch (Exception e) {
                
            }
            tfsotien.setText(tm.getValueAt(row, 1).toString());
            tfghichu.setText(tm.getValueAt(row, 2).toString());
            tfkhoanchi.setText(tm.getValueAt(row, 3).toString());
            ngay_thang.setEnabled(true);
            tfsotien.setEnabled(true);
            tfghichu.setEnabled(true);
            tfkhoanchi.setEnabled(true);
            sua = true;
            trangthai(false);
            tbbangchi.setEnabled(false);
        }
    }//GEN-LAST:event_bsuaActionPerformed

    private void bxoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bxoaActionPerformed
        int row = tbbangchi.getSelectedRow();
        if (row < 0 || row > tm.getRowCount()-1) {
            JOptionPane.showMessageDialog(this, "Chon de xoa");
        } 
        else {
            tm.removeRow(row);
            lbangchi.remove(row);
        }
        ngay_thang.setEnabled(false);
        tfsotien.setEnabled(false);
        tfghichu.setEnabled(false);
        tfkhoanchi.setEnabled(false);
        IOFile.viet(fbangchi, lbangchi);
    }//GEN-LAST:event_bxoaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bboqua;
    private javax.swing.JButton bluu;
    private javax.swing.JButton bsua;
    private javax.swing.JButton bthem;
    private javax.swing.JButton bxoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private com.toedter.calendar.JDateChooser ngay_thang;
    private javax.swing.JTable tbbangchi;
    private javax.swing.JTextField tfghichu;
    private javax.swing.JTextField tfkhoanchi;
    private javax.swing.JTextField tfsotien;
    // End of variables declaration//GEN-END:variables

    private Exception NgayException() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
