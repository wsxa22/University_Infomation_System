/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.ProfInfoHandler;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 * 성적 부여를 할 수 있는 Boundary Class.
 *
 * @author 박지동
 */
public class GradeGrantView extends javax.swing.JFrame {

    Logger logger = Logger.getLogger(GradeGrantView.class.getName());
    /**
     * Creates new form GradeGrantView
     */
    String c_id;
    String grade;
    String grade_num;

    DefaultTableModel model;
    ArrayList<String> sArray = new ArrayList<>();
    ProfInfoHandler pHandler = new ProfInfoHandler();

    public GradeGrantView() {
        initComponents();
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        setTitle("성적 부여");
        setVisible(true);
        setResizable(false); //프레임 크기 조정 x
        setLocationRelativeTo(null); //프레임을 중앙으로 배치
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
        jLabel2 = new javax.swing.JLabel();
        gradeCombo = new javax.swing.JComboBox();
        jCancelBtn = new javax.swing.JButton();
        jOKBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("굴림", 0, 36)); // NOI18N
        jLabel1.setText("성적 부여");

        jLabel2.setFont(new java.awt.Font("굴림", 0, 18)); // NOI18N
        jLabel2.setText("학점 :");

        gradeCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "학점을 선택하세요.", "A", "B", "C", "D", "F" }));

        jCancelBtn.setText("취소");
        jCancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCancelBtnActionPerformed(evt);
            }
        });

        jOKBtn.setText("확인");
        jOKBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jOKBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jOKBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jCancelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(gradeCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gradeCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCancelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jOKBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
public void setUseInfo(ArrayList<String> sArray, String c_id, DefaultTableModel model) {
        this.sArray = sArray;
        this.c_id = c_id;
        this.model = model;
    }
    private void jOKBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jOKBtnActionPerformed
        // TODO add your handling code here:

        switch (gradeCombo.getSelectedIndex()) {
            case 1:
                grade = "A";  //A학점
                grade_num = "4.0";
                break;
            case 2:
                grade = "B";  //B학점
                grade_num = "3.0";
                break;
            case 3:
                grade = "C";  //C학점
                grade_num = "2.0";
                break;
            case 4:
                grade = "D";  //D학점
                grade_num = "1.0";
                break;
            case 5:
                grade = "F";  //F학점
                grade_num = "0";
                break;
        }
        if (pHandler.setGradeGrant(sArray, c_id, grade, grade_num) == true) {
            logger.logp(Level.INFO, c_id, grade, grade_num);
            JOptionPane.showMessageDialog(null, "성적 부여 성공하셨습니다.", "성적 부여 성공", JOptionPane.PLAIN_MESSAGE);

            sArray.clear();
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(null, "성적 부여 실패하셨습니다.", "성적 부여 실패", JOptionPane.WARNING_MESSAGE);
        }

        model.setNumRows(0); //테이블에 정보가 중복해서 저장되지 않도록 테이블 초기화

        if (pHandler.showStuState(c_id) == true) {
            for (int i = 0; i < pHandler.getShowStuInfoData().size(); i = i + 4) {
                model.addRow(new Object[]{
                    pHandler.getShowStuInfoData().get(i),
                    pHandler.getShowStuInfoData().get(i + 1),
                    pHandler.getShowStuInfoData().get(i + 2),
                    pHandler.getShowStuInfoData().get(i + 3),
                    Boolean.FALSE
                });
            }
        } else {
            JOptionPane.showMessageDialog(null, "테이블 조회에 실패하였습니다.", "테이블 조회 실패", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jOKBtnActionPerformed

    private void jCancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCancelBtnActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jCancelBtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox gradeCombo;
    private javax.swing.JButton jCancelBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton jOKBtn;
    // End of variables declaration//GEN-END:variables
}
