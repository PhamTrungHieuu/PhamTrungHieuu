/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view;

/**
 *
 * @author trung
 */
import controller.IOFile;
import controller.NgayException;
import controller.numberException;
import controller.trongghichuException;
import controller.trongkhoanchiException;
import controller.trongngayException;
import controller.trongsotienException;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;
import javax.swing.JOptionPane;
import javax.swing.SpringLayout;
import javax.swing.table.DefaultTableModel;
import model.Bangthu;
public class Formbangthu extends javax.swing.JPanel {

    /**
     * Creates new form Formbangchi
     */
    private DefaultTableModel tm;
    private boolean them,sua;
    private List<Bangthu> lbangthu;
    private String fbangthu;
    public Formbangthu() {
        initComponents();
        fbangthu = "src/controller/Bangthu.DAT";
        String[] cols = {"Ngay", "So tien", "Ghi chu", "Khoan chi"};
        tm = new DefaultTableModel(cols, 0);
        tbbangthu.setModel(tm);
        them = false;
        sua = false;
        ngay_thang.setEnabled(false);
        tfsotien.setEnabled(false);
        tfghichu.setEnabled(false);
        tfkhoanthu.setEnabled(false);
        Date date = new Date();
        ngay_thang.getDateEditor().setDate(date);
        loadData();
    }
    private void loadData() {
        File f = new File(fbangthu);
        if (f.exists()) {
            lbangthu = IOFile.doc(fbangthu);
            tm.setRowCount(0);
            for (Bangthu i: lbangthu) {
                tm.addRow(i.toObject());
            }
        } 
        else {
            lbangthu = new ArrayList<>();
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

        tfsotien = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        tfghichu = new javax.swing.JTextField();
        tfkhoanthu = new javax.swing.JTextField();
        bthem = new javax.swing.JButton();
        bluu = new javax.swing.JButton();
        bsua = new javax.swing.JButton();
        bxoa = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbbangthu = new javax.swing.JTable();
        bboqua = new javax.swing.JButton();
        ngay_thang = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 102));
        setForeground(new java.awt.Color(255, 0, 0));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tfsotien.setForeground(new java.awt.Color(0, 51, 255));
        tfsotien.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tfsotien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfsotienActionPerformed(evt);
            }
        });
        add(tfsotien, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, 120, 30));

        jLabel6.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 255));
        jLabel6.setText("Số tiền");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 23, -1, -1));

        jLabel7.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 51, 255));
        jLabel7.setText("Ghi chú");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(315, 23, -1, -1));

        jLabel8.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 51, 255));
        jLabel8.setText("Khoản thu");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 23, -1, -1));

        tfghichu.setForeground(new java.awt.Color(0, 51, 255));
        tfghichu.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tfghichu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfghichuActionPerformed(evt);
            }
        });
        add(tfghichu, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 50, 150, 30));

        tfkhoanthu.setForeground(new java.awt.Color(0, 51, 255));
        tfkhoanthu.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        add(tfkhoanthu, new org.netbeans.lib.awtextra.AbsoluteConstraints(448, 50, 180, 30));

        bthem.setBackground(new java.awt.Color(255, 204, 204));
        bthem.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        bthem.setForeground(new java.awt.Color(204, 0, 204));
        bthem.setText("Thêm");
        bthem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bthemActionPerformed(evt);
            }
        });
        add(bthem, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        bluu.setBackground(new java.awt.Color(255, 204, 204));
        bluu.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        bluu.setForeground(new java.awt.Color(153, 0, 153));
        bluu.setText("Lưu");
        bluu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bluuActionPerformed(evt);
            }
        });
        add(bluu, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 90, -1, -1));

        bsua.setBackground(new java.awt.Color(255, 204, 204));
        bsua.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        bsua.setForeground(new java.awt.Color(153, 0, 153));
        bsua.setText("Sửa");
        bsua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bsuaActionPerformed(evt);
            }
        });
        add(bsua, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, -1, -1));

        bxoa.setBackground(new java.awt.Color(255, 204, 204));
        bxoa.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        bxoa.setForeground(new java.awt.Color(153, 0, 153));
        bxoa.setText("Xóa");
        bxoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bxoaActionPerformed(evt);
            }
        });
        add(bxoa, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 90, -1, -1));

        tbbangthu.setBackground(new java.awt.Color(153, 255, 153));
        tbbangthu.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tbbangthu.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        tbbangthu.setForeground(new java.awt.Color(102, 102, 0));
        tbbangthu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Ngày", "Số tiền", "Ghi chú", "Khoản thu"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbbangthu.setSelectionBackground(new java.awt.Color(0, 153, 255));
        tbbangthu.setSelectionForeground(new java.awt.Color(255, 0, 0));
        jScrollPane1.setViewportView(tbbangthu);
        if (tbbangthu.getColumnModel().getColumnCount() > 0) {
            tbbangthu.getColumnModel().getColumn(0).setResizable(false);
            tbbangthu.getColumnModel().getColumn(3).setResizable(false);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 601, 300));

        bboqua.setBackground(new java.awt.Color(255, 204, 204));
        bboqua.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        bboqua.setForeground(new java.awt.Color(153, 0, 153));
        bboqua.setText("Bỏ qua");
        bboqua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bboquaActionPerformed(evt);
            }
        });
        add(bboqua, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 90, -1, -1));

        ngay_thang.setBackground(new java.awt.Color(102, 255, 255));
        ngay_thang.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ngay_thang.setForeground(new java.awt.Color(0, 51, 255));
        ngay_thang.setToolTipText("");
        ngay_thang.setDateFormatString("dd-MM-yyyy");
        ngay_thang.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                ngay_thangAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        add(ngay_thang, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 120, 30));

        jLabel1.setFont(new java.awt.Font("Arial Narrow", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 255));
        jLabel1.setText("Ngày");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 17, 43, 32));
    }// </editor-fold>//GEN-END:initComponents

    private void tfsotienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfsotienActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfsotienActionPerformed

    private void tfghichuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfghichuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfghichuActionPerformed

    private void bsuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bsuaActionPerformed
        int row = tbbangthu.getSelectedRow();
        
        if (row < 0 || row > tm.getRowCount()-1) {
            JOptionPane.showMessageDialog(this, "Chon ngay can sua");
        }
        else {
            sua = true;
            trangthai(false);
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
            tfkhoanthu.setText(tm.getValueAt(row, 3).toString());
            ngay_thang.setEnabled(true);
            tfsotien.setEnabled(true);
            tfghichu.setEnabled(true);
            tfkhoanthu.setEnabled(true);
            tbbangthu.setEnabled(false);
        }
    }//GEN-LAST:event_bsuaActionPerformed

    private void bluuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bluuActionPerformed
        if(them){
            String ngay, sotien, ghichu, khoanthu;
            try{
//                ngay = tfngay.getText();
                SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
                ngay = sdf.format(ngay_thang.getDate());
                sotien = tfsotien.getText();
                ghichu = tfghichu.getText();
                khoanthu = tfkhoanthu.getText();
                if(ngay.isEmpty()) throw new trongngayException();
                if (!ngay.matches("^\\d{2}[-]\\d{2}[-]\\d{4}$")) throw new NgayException();
                if(sotien.isEmpty()) throw new trongsotienException();
                if(!sotien.matches("\\d+")) throw new numberException();
                if(ghichu.isEmpty()) throw new trongghichuException();
                if(khoanthu.isEmpty()) throw new trongkhoanchiException();
                int tien = Integer.parseInt(sotien);
                Bangthu bc = new Bangthu(ngay , tien, ghichu, khoanthu);
                tm.addRow(bc.toObject());
                lbangthu.add(bc);
                trangthai(true);
                them = false;
                ngay_thang.setEnabled(false);
                tfsotien.setEnabled(false);
                tfghichu.setEnabled(false);
                tfkhoanthu.setEnabled(false);
                Date date = new Date();
                String strDateFormat = "dd/MM/yyyy";
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat(strDateFormat);
                ngay_thang.getDateEditor().setDate(date);
                
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
            int row = tbbangthu.getSelectedRow();
            String ngay, sotien, ghichu, khoanthu;
            try{
                SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
                ngay = sdf.format(ngay_thang.getDate());
                sotien = tfsotien.getText();
                ghichu = tfghichu.getText();
                khoanthu = tfkhoanthu.getText();
                if(ngay.isEmpty()) throw new trongngayException();
                if (!ngay.matches("^\\d{2}[-]\\d{2}[-]\\d{4}$")) throw new NgayException();
                if(sotien.isEmpty()) throw new trongsotienException();
                if(ghichu.isEmpty()) throw new trongghichuException();
                if(khoanthu.isEmpty()) throw new trongkhoanchiException();
                int tien = Integer.parseInt(sotien);
                Bangthu bc = new Bangthu(ngay , tien, ghichu, khoanthu);
                tm.setValueAt(ngay, row, 0);
                tm.setValueAt(sotien, row, 1);
                tm.setValueAt(ghichu, row, 2);
                tm.setValueAt(khoanthu, row, 3);
                lbangthu.set(row, bc);
                trangthai(true);
                sua = false;
                ngay_thang.setEnabled(false);
                tfsotien.setEnabled(false);
                tfghichu.setEnabled(false);
                tfkhoanthu.setEnabled(false);
                tbbangthu.setEnabled(true);
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
            catch(trongghichuException e){
                JOptionPane.showMessageDialog(this,"Khong de trong ghi chu!");
            }
            catch (trongkhoanchiException e) {
                JOptionPane.showMessageDialog(this,"Khong de trong khoan chi!");
            }
        }
        IOFile.viet(fbangthu, lbangthu);
    }//GEN-LAST:event_bluuActionPerformed

    private void bxoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bxoaActionPerformed
        int row = tbbangthu.getSelectedRow();
        if (row < 0 || row > tm.getRowCount()-1) {
            JOptionPane.showMessageDialog(this, "Chon de xoa");
        } 
        else {
            tm.removeRow(row);
            lbangthu.remove(row);
        }
        ngay_thang.setEnabled(false);
        tfsotien.setEnabled(false);
        tfghichu.setEnabled(false);
        tfkhoanthu.setEnabled(false);
        IOFile.viet(fbangthu, lbangthu);
    }//GEN-LAST:event_bxoaActionPerformed

    private void bthemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bthemActionPerformed
        ngay_thang.setEnabled(true);
        tfsotien.setEnabled(true);
        tfsotien.setText("");
        tfghichu.setEnabled(true);
        tfghichu.setText("");
        tfkhoanthu.setEnabled(true);
        tfkhoanthu.setText("");
        trangthai(false);
        them = true;
        if(lbangthu == null || lbangthu.size() < 1)
            lbangthu = new ArrayList<>();
    }//GEN-LAST:event_bthemActionPerformed

    private void bboquaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bboquaActionPerformed
        if (them) {
            them = false;
        }
        if (sua) 
            sua = false;
        
        trangthai(true);
        ngay_thang.setEnabled(false);
        tfsotien.setEnabled(false);
        tfghichu.setEnabled(false);
        tfkhoanthu.setEnabled(false);
        tbbangthu.setEnabled(true);
    }//GEN-LAST:event_bboquaActionPerformed

    private void ngay_thangAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_ngay_thangAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_ngay_thangAncestorAdded


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bboqua;
    private javax.swing.JButton bluu;
    private javax.swing.JButton bsua;
    private javax.swing.JButton bthem;
    private javax.swing.JButton bxoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private com.toedter.calendar.JDateChooser ngay_thang;
    private javax.swing.JTable tbbangthu;
    private javax.swing.JTextField tfghichu;
    private javax.swing.JTextField tfkhoanthu;
    private javax.swing.JTextField tfsotien;
    // End of variables declaration//GEN-END:variables
}
