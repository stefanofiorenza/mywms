/*
 * Copyright (c) 2006 - 2010 LinogistiX GmbH
 * 
 *  www.linogistix.com
 *  
 *  Project myWMS-LOS
 */
package de.linogistix.inventory.report.querystockunits.gui.gui_builder;

import de.linogistix.common.gui.component.controls.BOAutoFilteringComboBox;
import de.linogistix.reports.res.ReportsBundleResolver;
import de.linogistix.inventory.report.querystockunits.gui.component.StockUnitTreeTablePanel;
import de.wms2.mywms.inventory.Lot;
import de.wms2.mywms.location.StorageLocation;
import de.wms2.mywms.product.ItemData;
import org.openide.util.NbBundle;

/**
 *
 * @author  trautm
 */
public abstract class AbstractCenterPanel extends javax.swing.JPanel {

    protected StockUnitTreeTablePanel stockUnitTreeTablePanel;
    
    /** Creates new form HeaderPanel */
    public AbstractCenterPanel() {
        
        initComponents();        
        
//        this.stockUnitTreeTablePanel = new StockUnitTreeTablePanel();        
//        add(this.stockUnitTreeTablePanel, java.awt.BorderLayout.CENTER);
        
//        this.itemDataComboBox = new BOAutoFilteringComboBox(ItemData.class);
//        this.lotComboBox = new BOAutoFilteringComboBox(Lot.class);
//        this.storageLocationComboBox = new BOAutoFilteringComboBox(LOSStorageLocation.class);
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

        reloadButton = new javax.swing.JButton();
        itemDataAutoFiltering = new BOAutoFilteringComboBox(ItemData.class);
        storageLocationComboBox = new BOAutoFilteringComboBox(StorageLocation.class);
        lotComboBox = new BOAutoFilteringComboBox(Lot.class);

        setLayout(new java.awt.GridBagLayout());

        reloadButton.setText("null");
        reloadButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reloadButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.5;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 5, 0);
        add(reloadButton, gridBagConstraints);

        itemDataAutoFiltering.setMinimumSize(new java.awt.Dimension(100, 22));
        itemDataAutoFiltering.setPreferredSize(new java.awt.Dimension(250, 22));

        org.jdesktop.layout.GroupLayout itemDataAutoFilteringLayout = new org.jdesktop.layout.GroupLayout(itemDataAutoFiltering);
        itemDataAutoFiltering.setLayout(itemDataAutoFilteringLayout);
        itemDataAutoFilteringLayout.setHorizontalGroup(
            itemDataAutoFilteringLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 400, Short.MAX_VALUE)
        );
        itemDataAutoFilteringLayout.setVerticalGroup(
            itemDataAutoFilteringLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 22, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 0, 0);
        add(itemDataAutoFiltering, gridBagConstraints);

        org.jdesktop.layout.GroupLayout storageLocationComboBoxLayout = new org.jdesktop.layout.GroupLayout(storageLocationComboBox);
        storageLocationComboBox.setLayout(storageLocationComboBoxLayout);
        storageLocationComboBoxLayout.setHorizontalGroup(
            storageLocationComboBoxLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 0, Short.MAX_VALUE)
        );
        storageLocationComboBoxLayout.setVerticalGroup(
            storageLocationComboBoxLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 0, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 0, 0);
        add(storageLocationComboBox, gridBagConstraints);

        org.jdesktop.layout.GroupLayout lotComboBoxLayout = new org.jdesktop.layout.GroupLayout(lotComboBox);
        lotComboBox.setLayout(lotComboBoxLayout);
        lotComboBoxLayout.setHorizontalGroup(
            lotComboBoxLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 0, Short.MAX_VALUE)
        );
        lotComboBoxLayout.setVerticalGroup(
            lotComboBoxLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 0, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 0, 0);
        add(lotComboBox, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    public abstract void process() ;
    
private void reloadButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reloadButtonActionPerformed
    process();
}//GEN-LAST:event_reloadButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel itemDataAutoFiltering;
    private javax.swing.JPanel lotComboBox;
    private javax.swing.JButton reloadButton;
    private javax.swing.JPanel storageLocationComboBox;
    // End of variables declaration//GEN-END:variables

    @SuppressWarnings("unchecked")
    public BOAutoFilteringComboBox<ItemData> getItemDataComboBox(){
        return (BOAutoFilteringComboBox) itemDataAutoFiltering;
    }
    
    @SuppressWarnings("unchecked")
    public BOAutoFilteringComboBox<Lot> getLotComboBox(){
        return (BOAutoFilteringComboBox<Lot>) lotComboBox;
    }
    
    @SuppressWarnings("unchecked")
    public BOAutoFilteringComboBox<StorageLocation> getStorageLocationComboBox(){
        return (BOAutoFilteringComboBox<StorageLocation>) storageLocationComboBox;
    }
}
