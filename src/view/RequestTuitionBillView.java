/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.CourseInfoHandler;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 * 수강료 청구서를 발급하기 위한 화면을 보여주는 Boundary 클래스.
 *
 * @author Sungrae
 */
public class RequestTuitionBillView extends javax.swing.JFrame {

    Logger logger = Logger.getLogger(RequestTuitionBillView.class.getName());
    /**
     * Creates new form RequestTuitionBillView
     */
    CourseInfoHandler cHandler = new CourseInfoHandler();
    DefaultTableModel model;
    ArrayList<String> reqBillArray = new ArrayList<>();

    String sId;
    boolean chk = false;

    public RequestTuitionBillView() {
        initComponents();
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        //창을 껐을때 프로그램이 종료되지 않게 하기 위해

        setTitle("수강료 청구서 발급");
        setVisible(true);
        setResizable(false); //프레임 크기 조정 x
        setLocationRelativeTo(null); //프레임을 중앙으로 배치.

        model = (DefaultTableModel) this.jBinfoTable.getModel();
        model.setNumRows(0); //테이블에 정보가 중복해서 저장되지 않도록 테이블 초기화
        if (cHandler.setBillDataInfo() == true) {
            for (int i = 0; i < cHandler.getStuBillArray().size(); i = i + 2) {
                model.addRow(new Object[]{
                    cHandler.getStuBillArray().get(i),
                    cHandler.getStuBillArray().get(i + 1),
                    Boolean.FALSE
                });
            }
        } else {
            JOptionPane.showMessageDialog(null, "테이블 조회에 실패하였습니다.", "테이블 조회 실패", JOptionPane.WARNING_MESSAGE);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jBinfoTable = new javax.swing.JTable();
        jProvideBillBtn = new javax.swing.JButton();
        jCancelBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("굴림", 1, 24)); // NOI18N
        jLabel1.setText("수강료 청구서 발급");

        jBinfoTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "학  번", "이  름", "발  급"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jBinfoTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jBinfoTable);
        if (jBinfoTable.getColumnModel().getColumnCount() > 0) {
            jBinfoTable.getColumnModel().getColumn(0).setResizable(false);
            jBinfoTable.getColumnModel().getColumn(1).setResizable(false);
            jBinfoTable.getColumnModel().getColumn(2).setResizable(false);
        }

        jProvideBillBtn.setFont(new java.awt.Font("굴림", 0, 24)); // NOI18N
        jProvideBillBtn.setText("발  급");
        jProvideBillBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jProvideBillBtnActionPerformed(evt);
            }
        });

        jCancelBtn.setFont(new java.awt.Font("굴림", 0, 24)); // NOI18N
        jCancelBtn.setText("취  소");
        jCancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCancelBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jProvideBillBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
                            .addComponent(jCancelBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jProvideBillBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCancelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jProvideBillBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jProvideBillBtnActionPerformed
        // TODO add your handling code here:
        if (jBinfoTable.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(null, "수강료 청구서를 발급받을 학생을 선택해주세요.", "발급 실패", JOptionPane.WARNING_MESSAGE);
        } else {
            for (int i = 0; i < jBinfoTable.getRowCount(); i++) {
                chk = (boolean) jBinfoTable.getValueAt(i, 2);
                if (chk == true) {
                    sId = (String) jBinfoTable.getValueAt(i, 0);
                    reqBillArray.add(sId);
                }
            }
            if (cHandler.getRequestBillInfo(reqBillArray) == true && !reqBillArray.isEmpty()) {
                logger.log(Level.SEVERE, "청구서 발급이 잘 됨");
                JOptionPane.showMessageDialog(null, "수강료 청구서 발급에 성공하였습니다.", "발급 성공", JOptionPane.PLAIN_MESSAGE);
                reqBillArray.clear();
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(null, "수강료 청구서 발급에 실패하였습니다.", "발급 실패", JOptionPane.WARNING_MESSAGE);
            }
        }
    }//GEN-LAST:event_jProvideBillBtnActionPerformed

    private void jCancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCancelBtnActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jCancelBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable jBinfoTable;
    private javax.swing.JButton jCancelBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton jProvideBillBtn;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}