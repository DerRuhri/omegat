/**************************************************************************
 OmegaT - Computer Assisted Translation (CAT) tool
          with fuzzy matching, translation memory, keyword search,
          glossaries, and translation leveraging into updated projects.

 Copyright (C) 2000-2006 Keith Godfrey and Maxym Mykhalchuk
               2008 Didier Briel
               2016 Aaron Madlon-Kay
               Home page: http://www.omegat.org/
               Support center: https://omegat.org/support

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
 * @author Maxym Mykhalchuk
 * @author Didier Briel
 * @author Aaron Madlon-Kay
 */
@SuppressWarnings("serial")
public class FontSelectionPanel extends javax.swing.JPanel {

    /** Creates new form FontSelectionPanel */
    public FontSelectionPanel() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        fontComboBox = new javax.swing.JComboBox<>();
        fontLabel = new javax.swing.JLabel();
        sizeSpinner = new javax.swing.JSpinner();
        sizeLabel = new javax.swing.JLabel();
        previewTextArea = new javax.swing.JTextArea();
        applyToProjectFilesCheckBox = new javax.swing.JCheckBox();
        applyToDictionaryPaneCheckBox = new javax.swing.JCheckBox();
        sizeDictionaryLabel = new javax.swing.JLabel();
        sizeDictionarySpinner = new javax.swing.JSpinner();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 32767));

        setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
        setLayout(new java.awt.GridBagLayout());

        fontComboBox.setMaximumRowCount(20);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        add(fontComboBox, gridBagConstraints);

        org.openide.awt.Mnemonics.setLocalizedText(fontLabel, OStrings.getString("TF_SELECT_SOURCE_FONT")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        add(fontLabel, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        add(sizeSpinner, gridBagConstraints);

        org.openide.awt.Mnemonics.setLocalizedText(sizeLabel, OStrings.getString("TF_SELECT_FONTSIZE")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        add(sizeLabel, gridBagConstraints);

        previewTextArea.setEditable(false);
        previewTextArea.setLineWrap(true);
        previewTextArea.setText(OStrings.getString("TF_FONT_SAMPLE_TEXT")); // NOI18N
        previewTextArea.setWrapStyleWord(true);
        previewTextArea.setBorder(javax.swing.BorderFactory.createTitledBorder(null, OStrings.getString("TF_FONT_SAMPLE_TITLE"), javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, fontLabel.getFont())); // NOI18N
        previewTextArea.setOpaque(false);
        previewTextArea.setPreferredSize(new java.awt.Dimension(116, 100));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        add(previewTextArea, gridBagConstraints);

        org.openide.awt.Mnemonics.setLocalizedText(applyToProjectFilesCheckBox, OStrings.getString("TF_APPLY_TO_PROJECT_FILES"));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        add(applyToProjectFilesCheckBox, gridBagConstraints);

        org.openide.awt.Mnemonics.setLocalizedText(applyToDictionaryPaneCheckBox, OStrings.getString("TF_APPLY_TO_DICTIONARY"));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        add(applyToDictionaryPaneCheckBox, gridBagConstraints);

        org.openide.awt.Mnemonics.setLocalizedText(sizeDictionaryLabel, OStrings.getString("TF_SELECT_FONTSIZE_DICTIONARY")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        add(sizeDictionaryLabel, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        add(sizeDictionarySpinner, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.weighty = 1.0;
        add(filler1, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    javax.swing.JCheckBox applyToDictionaryPaneCheckBox;
    javax.swing.JCheckBox applyToProjectFilesCheckBox;
    private javax.swing.Box.Filler filler1;
    javax.swing.JComboBox<String> fontComboBox;
    private javax.swing.JLabel fontLabel;
    javax.swing.JTextArea previewTextArea;
    private javax.swing.JLabel sizeDictionaryLabel;
    javax.swing.JSpinner sizeDictionarySpinner;
    private javax.swing.JLabel sizeLabel;
    javax.swing.JSpinner sizeSpinner;
    // End of variables declaration//GEN-END:variables
}
