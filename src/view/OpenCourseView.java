/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.CourseInfoHandler;
import controller.CourseEffectivenessHandler;
import javax.swing.JOptionPane;

/**
 * 강의를 개설하기 위한 화면을 보여주는 Boundary 클래스.
 *
 * @author Sungrae
 */
public class OpenCourseView extends javax.swing.JFrame {

    /**
     * Creates new form OpenCourseView
     */
    String pId;
    String cId;
    String min_enroll;
    String max_enroll;

    CourseInfoHandler cHandler = new CourseInfoHandler();
    CourseEffectivenessHandler cEHandler = new CourseEffectivenessHandler();

    public OpenCourseView() {
    }

    public OpenCourseView(String cId, String dName) {
        this.cId = cId;
        initComponents();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        //창을 껐을때 프로그램이 종료되지 않게 하기 위해

        setTitle("수업 관리");
        setVisible(true);
        setResizable(false); //프레임 크기 조정 x
        setLocationRelativeTo(null); //프레임을 중앙으로 배치.

        if (cHandler.getProfInfoState(dName) == true) {
            for (int i = 0; i < cHandler.getProfNameInfoData().size(); i++) {
                System.out.println(cHandler.getProfNameInfoData());
                jComboBox1.addItem(cHandler.getProfIdInfoData().get(i) + "  " + cHandler.getProfNameInfoData().get(i));
            }
        } else {
            JOptionPane.showMessageDialog(null, "교수 정보가 없습니다.", "교수 정보 조회 실패", JOptionPane.WARNING_MESSAGE);
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jMinEnrollField = new javax.swing.JTextField();
        jMaxEnrollField = new javax.swing.JTextField();
        jOpenBtn = new javax.swing.JButton();
        jCancelBtn = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("굴림", 1, 24)); // NOI18N
        jLabel1.setText("강의 개설");

        jLabel2.setFont(new java.awt.Font("굴림", 0, 18)); // NOI18N
        jLabel2.setText("담  당 교  수 :");

        jLabel3.setFont(new java.awt.Font("굴림", 0, 18)); // NOI18N
        jLabel3.setText("최대 학생 수 :");

        jLabel4.setFont(new java.awt.Font("굴림", 0, 18)); // NOI18N
        jLabel4.setText("최소 학생 수 :");

        jOpenBtn.setFont(new java.awt.Font("굴림", 0, 14)); // NOI18N
        jOpenBtn.setText("개  설");
        jOpenBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jOpenBtnActionPerformed(evt);
            }
        });

        jCancelBtn.setFont(new java.awt.Font("굴림", 0, 14)); // NOI18N
        jCancelBtn.setText("취  소");
        jCancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCancelBtnActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "담당 교수 선택" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jMinEnrollField, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jMaxEnrollField, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jOpenBtn)
                .addGap(18, 18, 18)
                .addComponent(jCancelBtn))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jMinEnrollField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jMaxEnrollField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jOpenBtn)
                    .addComponent(jCancelBtn))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jOpenBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jOpenBtnActionPerformed
        // TODO add your handling code here:

        String str = jComboBox1.getSelectedItem().toString();
        pId = str.substring(0, 4);

        min_enroll = jMinEnrollField.getText().trim();
        max_enroll = jMaxEnrollField.getText().trim();
        if (jComboBox1.getSelectedIndex() != 0) {
            if (cEHandler.checkOpenCourseNum(min_enroll, max_enroll) == true) {
                if (cHandler.getOpenCourseHandler(cId, pId, min_enroll, max_enroll) == true) {
                    JOptionPane.showMessageDialog(null, "강좌 개설에 성공하셨습니다.", "개설 성공", JOptionPane.PLAIN_MESSAGE);
                    this.dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "강좌 개설에 실패하였습니다.", "개설 실패", JOptionPane.WARNING_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(null, "숫자를 잘못 입력하였거나 \n최소 학생 수가 최대 학생 수를 초과하였습니다.", "개설 실패", JOptionPane.WARNING_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "담당 교수를 선택해주세요.", "개설 실패", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jOpenBtnActionPerformed

    private void jCancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCancelBtnActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jCancelBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jCancelBtn;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField jMaxEnrollField;
    private javax.swing.JTextField jMinEnrollField;
    private javax.swing.JButton jOpenBtn;
    // End of variables declaration//GEN-END:variables
}
