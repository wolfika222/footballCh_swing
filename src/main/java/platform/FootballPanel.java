
package platform;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import javax.swing.DefaultListModel;

import model.Husband;
import model.Match;
import model.Pairs;
import model.Team;
import model.Wife;
import utilities.Reader;


public class FootballPanel extends javax.swing.JPanel {

    private DefaultListModel<Pairs> pairsModel = new DefaultListModel<>();
    private DefaultListModel<Husband> husbandModel = new DefaultListModel<>();
    private DefaultListModel<Wife> wifeModel = new DefaultListModel<>();
    private DefaultListModel<Team> teamModel = new DefaultListModel<>();
    private final Reader reader = new Reader();
    Random random = new Random();
    List<Pairs> pairs;


    public FootballPanel() {
        initComponents();
        pairs = reader.getAllHuman();
        uploadPairs(pairs);
        uploadHusband(reader.getAllHusband());
        uploadWife(reader.getAllWife());
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        matchBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        pairsList = new javax.swing.JList();
        jScrollPane2 = new javax.swing.JScrollPane();
        husbandList = new javax.swing.JList();
        jScrollPane3 = new javax.swing.JScrollPane();
        wifeList = new javax.swing.JList();
        matchesLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        averageLabel = new javax.swing.JLabel();
        sumLabel = new javax.swing.JLabel();
        teamBtn = new javax.swing.JButton();
        pairsBtn = new javax.swing.JButton();
        extBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 204));
        setPreferredSize(new java.awt.Dimension(750, 450));

        matchBtn.setText("Meccs");
        matchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                matchBtnActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(pairsList);

        jScrollPane2.setViewportView(husbandList);

        jScrollPane3.setViewportView(wifeList);

        matchesLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        matchesLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Párok");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Férjek");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Feleségek");

        teamBtn.setText("TeamUp");
        teamBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teamBtnActionPerformed(evt);
            }
        });

        pairsBtn.setText("PairsUp");
        pairsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pairsBtnActionPerformed(evt);
            }
        });

        extBtn.setText("exit");
        extBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                extBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(matchesLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(averageLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE))
                                .addGap(35, 35, 35)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE)
                                    .addComponent(sumLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(matchBtn)
                        .addGap(30, 30, 30)
                        .addComponent(teamBtn)
                        .addGap(18, 18, 18)
                        .addComponent(pairsBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(extBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21))))
            .addGroup(layout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addComponent(jLabel1)
                .addGap(191, 191, 191)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 196, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(114, 114, 114))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(matchesLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
                    .addComponent(jScrollPane2)
                    .addComponent(jScrollPane1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sumLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE)
                    .addComponent(averageLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(matchBtn)
                    .addComponent(teamBtn)
                    .addComponent(pairsBtn)
                    .addComponent(extBtn))
                .addGap(32, 32, 32))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void matchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_matchBtnActionPerformed
        Match match = createMatch();
        matchesLabel.setText(match.toString());
        uplodData(match);
    }//GEN-LAST:event_matchBtnActionPerformed

    private void teamBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teamBtnActionPerformed
        UploadTeamFrame upTeam = new UploadTeamFrame();
        upTeam.setVisible(true);
    }//GEN-LAST:event_teamBtnActionPerformed

    private void pairsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pairsBtnActionPerformed
        UploadPairsFrame upPairs = new UploadPairsFrame();
        upPairs.setVisible(true);
    }//GEN-LAST:event_pairsBtnActionPerformed

    private void extBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_extBtnActionPerformed
        System.exit(0);
    }//GEN-LAST:event_extBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel averageLabel;
    private javax.swing.JButton extBtn;
    private javax.swing.JList husbandList;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton matchBtn;
    private javax.swing.JLabel matchesLabel;
    private javax.swing.JButton pairsBtn;
    private javax.swing.JList pairsList;
    private javax.swing.JLabel sumLabel;
    private javax.swing.JButton teamBtn;
    private javax.swing.JList wifeList;
    // End of variables declaration//GEN-END:variables


    private void uploadPairs(List<Pairs> pairs) {
        pairsModel.clear();
        for (Pairs pair : pairs) {
            pairsModel.addElement(pair);
        }
        pairsList.setModel(pairsModel);
    }

    private void uploadHusband(List<Husband> husbands) {
        husbandModel.clear();
        for (Husband husband : husbands) {
            husbandModel.addElement(husband);
        }
        husbandList.setModel(husbandModel);
    }

    private void uploadWife(List<Wife> wifes) {
        wifeModel.clear();
        for (Wife wife : wifes) {
            wifeModel.addElement(wife);
        }
        wifeList.setModel(wifeModel);
    }

    private Match createMatch() {
        List<Team> teamList = reader.getAllTeam();
        Team team1 = teamList.get(random.nextInt(teamList.size()));
        Team team2;
        do {
            team2 = teamList.get(random.nextInt(teamList.size()));
        } while (team1.equals(team2));

        return new Match(team1, team2);
    }

    private void uplodData(Match match) {
        Pairs pair = pairs.get(random.nextInt(pairs.size()));
        pair.addMatch(match);

        int human2Sum = pair.getHuman2().getScore();
        double human1Sum = pair.getHuman1().getScore();


        if (pair.isWatch()) {
            pair.getHuman1().setScore(match);
            pair.getHuman2().setScore(match);
        }

        List<Wife> wifes = new ArrayList<>();
        List<Husband> husbands = new ArrayList<>();
        for (Pairs pair1 : pairs) {
            wifes.add((Wife) pair1.getHuman2());
            husbands.add((Husband) pair1.getHuman1());
        }
        uploadWife(wifes);
        uploadHusband(husbands);

        for (Husband husband : husbands) {
            human1Sum += husband.getScore();
        }
        for (Wife wife : wifes) {
            human2Sum += wife.getScore();
        }
        DecimalFormat df = new DecimalFormat("0.0");
        double human1Avg = human1Sum / husbands.size();
        averageLabel.setText("Átlagosan " + df.format(human1Avg) + " sört fogyasztott.");
        sumLabel.setText("Összesen " + human2Sum + " perc");
    }
}
