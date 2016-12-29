/**************************************************************************
 OmegaT - Computer Assisted Translation (CAT) tool 
          with fuzzy matching, translation memory, keyword search, 
          glossaries, and translation leveraging into updated projects.

 Copyright (C) 2013 Zoltan Bartko, Aaron Madlon-Kay
               2015 Aaron Madlon-Kay
               2016 Aaron Madlon-Kay
               Home page: http://www.omegat.org/
               Support center: http://groups.yahoo.com/group/OmegaT/

 This file is part of OmegaT.

 OmegaT is free software: you can redistribute it and/or modify
 it under the terms of the GNU General Public License as published by
 the Free Software Foundation, either version 3 of the License, or
 (at your option) any later version.

 OmegaT is distributed in the hope that it will be useful,
 but WITHOUT ANY WARRANTY; without even the implied warranty of
 MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 GNU General Public License for more details.

 You should have received a copy of the GNU General Public License
 along with this program.  If not, see <http://www.gnu.org/licenses/>.
 **************************************************************************/

package org.omegat.gui.preferences.view;

import org.omegat.util.OStrings;

/**
 * @author bartkoz
 * @author Aaron Madlon-Kay
 */
@SuppressWarnings("serial")
public class CharTableAutoCompleterOptionsPanel extends javax.swing.JPanel {


    /**
     * Creates new form CharTableAutoCompleterDialog
     */
    public CharTableAutoCompleterOptionsPanel() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        enabledCheckBox = new javax.swing.JCheckBox();
        selectedCharsCheckBox = new javax.swing.JCheckBox();
        customPanel = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        descriptionTextArea = new javax.swing.JTextArea();
        jPanel7 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        allCharLabel = new javax.swing.JLabel();
        allCharScrollPane = new javax.swing.JScrollPane();
        allCharTable = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        selCharLabel = new javax.swing.JLabel();
        selCharScrollPane = new javax.swing.JScrollPane();
        selCharTable = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        clearButton = new javax.swing.JButton();
        uniqueCheckBox = new javax.swing.JCheckBox();

        setLayout(new java.awt.BorderLayout());

        jPanel3.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
        jPanel3.setLayout(new java.awt.BorderLayout());

        jPanel9.setLayout(new java.awt.GridLayout(2, 0));

        org.openide.awt.Mnemonics.setLocalizedText(enabledCheckBox, OStrings.getString("AC_CHARTABLE_ENABLED")); // NOI18N
        jPanel9.add(enabledCheckBox);

        org.openide.awt.Mnemonics.setLocalizedText(selectedCharsCheckBox, OStrings.getString("AC_CHARTABLE_CUSTOM")); // NOI18N
        jPanel9.add(selectedCharsCheckBox);

        jPanel3.add(jPanel9, java.awt.BorderLayout.NORTH);

        customPanel.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEmptyBorder(5, 0, 0, 0), javax.swing.BorderFactory.createEtchedBorder()));
        customPanel.setLayout(new java.awt.BorderLayout());

        jPanel8.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
        jPanel8.setLayout(new java.awt.BorderLayout());

        descriptionTextArea.setEditable(false);
        descriptionTextArea.setFont(getFont());
        descriptionTextArea.setLineWrap(true);
        descriptionTextArea.setText(OStrings.getString("AC_CHARTABLE_EXPLANATION")); // NOI18N
        descriptionTextArea.setWrapStyleWord(true);
        descriptionTextArea.setOpaque(false);
        jPanel8.add(descriptionTextArea, java.awt.BorderLayout.NORTH);

        customPanel.add(jPanel8, java.awt.BorderLayout.NORTH);

        jPanel7.setLayout(new javax.swing.BoxLayout(jPanel7, javax.swing.BoxLayout.Y_AXIS));

        jPanel6.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
        jPanel6.setLayout(new java.awt.BorderLayout());

        org.openide.awt.Mnemonics.setLocalizedText(allCharLabel, OStrings.getString("AC_CHARTABLE_ALL_LABEL")); // NOI18N
        jPanel6.add(allCharLabel, java.awt.BorderLayout.NORTH);

        allCharTable.setCellSelectionEnabled(true);
        allCharTable.setFillsViewportHeight(true);
        allCharTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        allCharTable.setTableHeader(null);
        allCharScrollPane.setViewportView(allCharTable);

        jPanel6.add(allCharScrollPane, java.awt.BorderLayout.CENTER);

        jPanel7.add(jPanel6);

        jPanel5.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 5, 5, 5));
        jPanel5.setLayout(new java.awt.BorderLayout());

        org.openide.awt.Mnemonics.setLocalizedText(selCharLabel, OStrings.getString("AC_CHARTABLE_CUSTOM_LABEL")); // NOI18N
        jPanel5.add(selCharLabel, java.awt.BorderLayout.NORTH);

        selCharTable.setCellSelectionEnabled(true);
        selCharTable.setFillsViewportHeight(true);
        selCharTable.setTableHeader(null);
        selCharScrollPane.setViewportView(selCharTable);

        jPanel5.add(selCharScrollPane, java.awt.BorderLayout.CENTER);

        jPanel7.add(jPanel5);

        customPanel.add(jPanel7, java.awt.BorderLayout.CENTER);

        jPanel4.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 5, 5, 5));
        jPanel4.setLayout(new java.awt.BorderLayout());

        org.openide.awt.Mnemonics.setLocalizedText(clearButton, OStrings.getString("AC_CHARTABLE_CLEAR_BUTTON")); // NOI18N
        jPanel4.add(clearButton, java.awt.BorderLayout.EAST);

        org.openide.awt.Mnemonics.setLocalizedText(uniqueCheckBox, OStrings.getString("AC_CHARTABLE_CUSTOM_UNIQUE")); // NOI18N
        jPanel4.add(uniqueCheckBox, java.awt.BorderLayout.WEST);

        customPanel.add(jPanel4, java.awt.BorderLayout.SOUTH);

        jPanel3.add(customPanel, java.awt.BorderLayout.CENTER);

        add(jPanel3, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel allCharLabel;
    javax.swing.JScrollPane allCharScrollPane;
    javax.swing.JTable allCharTable;
    javax.swing.JButton clearButton;
    javax.swing.JPanel customPanel;
    private javax.swing.JTextArea descriptionTextArea;
    javax.swing.JCheckBox enabledCheckBox;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JLabel selCharLabel;
    javax.swing.JScrollPane selCharScrollPane;
    javax.swing.JTable selCharTable;
    javax.swing.JCheckBox selectedCharsCheckBox;
    javax.swing.JCheckBox uniqueCheckBox;
    // End of variables declaration//GEN-END:variables
}
