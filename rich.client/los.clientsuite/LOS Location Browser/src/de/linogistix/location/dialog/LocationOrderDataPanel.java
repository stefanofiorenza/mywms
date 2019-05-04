/*
 * Copyright (c) 2012 LinogistiX GmbH
 *
 *  www.linogistix.com
 *
 *  Project myWMS-LOS
 */
package de.linogistix.location.dialog;

import de.linogistix.common.gui.component.controls.BOAutoFilteringComboBox;
import de.linogistix.location.res.LocationBundleResolver;
import de.linogistix.los.location.model.LOSRack;
import java.math.BigDecimal;
import java.text.ParseException;
import org.openide.util.NbBundle;

/**
 *
 * @author krane
 */
public class LocationOrderDataPanel extends javax.swing.JPanel {

    /** Creates new form AbstractCenterPanel */
    public LocationOrderDataPanel() {
        initComponents();

        fValueStart.setTitle( NbBundle.getMessage(LocationBundleResolver.class,"LocationOrderWizard.labelValueStart") );
        fValueStart.setMandatory(false);
        fValueStart.setMinimumValue(BigDecimal.valueOf(-1), true);

        fValueDiff.setTitle( NbBundle.getMessage(LocationBundleResolver.class,"LocationOrderWizard.labelValueDiff") );
        fValueDiff.setMandatory(false);
        fValueDiff.setMinimumValue(BigDecimal.valueOf(-2), true);

        fRack.setBoClass(LOSRack.class);
        fRack.initAutofiltering();
        fRack.setEditorLabelTitle( NbBundle.getMessage(LocationBundleResolver.class,"LocationOrderWizard.labelRack") );

        lNumLoc.setText( NbBundle.getMessage(LocationBundleResolver.class, "LocationOrderWizard.labelNumLocation")+":");
        valNumLoc.setText( "" );
        lIndexMin.setText( NbBundle.getMessage(LocationBundleResolver.class, "LocationOrderWizard.labelIndexMin")+":");
        valIndexMin.setText( "" );
        lIndexMax.setText( NbBundle.getMessage(LocationBundleResolver.class, "LocationOrderWizard.labelIndexMax")+":");
        valIndexMax.setText( "" );
    }

    public BOAutoFilteringComboBox getRackComboBox() {
        return fRack;
    }



    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        buttonGroup1 = new javax.swing.ButtonGroup();
        fRack = new de.linogistix.common.gui.component.controls.BOAutoFilteringComboBox();
        fValueStart = new de.linogistix.common.gui.component.controls.LOSNumericFormattedTextField();
        fValueDiff = new de.linogistix.common.gui.component.controls.LOSNumericFormattedTextField();
        lNumLoc = new javax.swing.JLabel();
        valNumLoc = new javax.swing.JLabel();
        lIndexMin = new javax.swing.JLabel();
        valIndexMin = new javax.swing.JLabel();
        lIndexMax = new javax.swing.JLabel();
        valIndexMax = new javax.swing.JLabel();

        setAlignmentX(0.0F);
        setAlignmentY(0.0F);
        setAutoscrolls(true);
        setLayout(new java.awt.GridBagLayout());

        fRack.setEditorLabelTitle("Rack");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        add(fRack, gridBagConstraints);

        fValueStart.setColumns(8);
        fValueStart.setTitle("Offset Value");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 0, 0, 0);
        add(fValueStart, gridBagConstraints);

        fValueDiff.setColumns(8);
        fValueDiff.setTitle("Difference Value");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 0);
        add(fValueDiff, gridBagConstraints);

        lNumLoc.setForeground(new java.awt.Color(70, 70, 70));
        lNumLoc.setText("Num Locations:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 0, 10);
        add(lNumLoc, gridBagConstraints);

        valNumLoc.setForeground(new java.awt.Color(70, 70, 70));
        valNumLoc.setText("0");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 0, 0);
        add(valNumLoc, gridBagConstraints);

        lIndexMin.setForeground(new java.awt.Color(70, 70, 70));
        lIndexMin.setText("Min Index:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 10);
        add(lIndexMin, gridBagConstraints);

        valIndexMin.setForeground(new java.awt.Color(70, 70, 70));
        valIndexMin.setText("0");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        add(valIndexMin, gridBagConstraints);

        lIndexMax.setForeground(new java.awt.Color(70, 70, 70));
        lIndexMax.setText("Max Index:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 10);
        add(lIndexMax, gridBagConstraints);

        valIndexMax.setForeground(new java.awt.Color(70, 70, 70));
        valIndexMax.setText("0");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        add(valIndexMax, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private de.linogistix.common.gui.component.controls.BOAutoFilteringComboBox fRack;
    private de.linogistix.common.gui.component.controls.LOSNumericFormattedTextField fValueDiff;
    private de.linogistix.common.gui.component.controls.LOSNumericFormattedTextField fValueStart;
    private javax.swing.JLabel lIndexMax;
    private javax.swing.JLabel lIndexMin;
    private javax.swing.JLabel lNumLoc;
    private javax.swing.JLabel valIndexMax;
    private javax.swing.JLabel valIndexMin;
    private javax.swing.JLabel valNumLoc;
    // End of variables declaration//GEN-END:variables
    

    public void setIndexMin( Integer indexMin ) {
        valIndexMin.setText("");
        if( indexMin != null ) {
            valIndexMin.setText(indexMin.toString());
        }
    }
    public void setIndexMax( Integer indexMax ) {
        valIndexMax.setText("");
        if( indexMax != null ) {
            valIndexMax.setText(indexMax.toString());
        }
    }
    public void setNumLocation( Integer num ) {
        valNumLoc.setText("");
        if( num != null ) {
            valNumLoc.setText(num.toString());
        }
    }

    public void setValueStart( Integer valueStart ) {
        fValueStart.setValue(null);
        if( valueStart != null ) {
            fValueStart.setValue(BigDecimal.valueOf(valueStart));
        }
    }
    public int getValueStart() {
        try {
            return fValueStart.getValue().intValue();
        } catch (ParseException ex) {
            return 0;
        }
    }

    public void setValueDiff( Integer valueDiff ) {
        fValueDiff.setValue(null);
        if( valueDiff != null ) {
            fValueDiff.setValue(BigDecimal.valueOf(valueDiff));
        }
    }
    public int getValueDiff() {
        try {
            return fValueDiff.getValue().intValue();
        } catch (ParseException ex) {
            return 0;
        }
    }
}