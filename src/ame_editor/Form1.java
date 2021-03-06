/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ame_editor;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import javax.swing.JFileChooser;
import java.nio.file.Paths;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.ListIterator;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JOptionPane;

/**
 *
 * @author Thomas
 */
public class Form1 extends javax.swing.JFrame {

    /**
     * Creates new form Form1
     */
    public Form1() {
        initComponents();
        useHash.setSelected(true);
        buttonGroup1.add(useHash);
        buttonGroup1.add(useArray);
    }
    
    private Path batchFile = null;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        fileLocation = new javax.swing.JTextField();
        L_fileLocation = new javax.swing.JLabel();
        DetectFile = new javax.swing.JButton();
        L_key = new javax.swing.JLabel();
        L_value = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        keyArea = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        valueArea = new javax.swing.JTextArea();
        files = new javax.swing.JButton();
        process = new javax.swing.JButton();
        L_projectPath = new javax.swing.JLabel();
        projectPathField = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        ext = new javax.swing.JTextField();
        populateNested = new javax.swing.JButton();
        nest1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        nest2 = new javax.swing.JTextField();
        useHash = new javax.swing.JRadioButton();
        useArray = new javax.swing.JRadioButton();
        nestPrefix = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Adobe Media Encoder Batch Editor");
        setMinimumSize(new java.awt.Dimension(400, 500));

        jPanel1.setMinimumSize(new java.awt.Dimension(400, 500));

        L_fileLocation.setText("Adobe Media Encoder File Location (batch.xml)");

        DetectFile.setText("Detect");
        DetectFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DetectFileActionPerformed(evt);
            }
        });

        L_key.setText("Existing Entries:");

        L_value.setText("Rename to:");
        L_value.setToolTipText("");

        keyArea.setColumns(10);
        keyArea.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        keyArea.setRows(5);
        jScrollPane1.setViewportView(keyArea);

        valueArea.setColumns(10);
        valueArea.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        valueArea.setRows(5);
        jScrollPane2.setViewportView(valueArea);

        files.setText("Populate From BMP Files in Folder");
        files.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filesActionPerformed(evt);
            }
        });

        process.setText("Process");
        process.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                processActionPerformed(evt);
            }
        });

        L_projectPath.setText("Export Destination Path:");

        jButton1.setText("Read From batch.xml");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Extension on Destination File Names:");

        populateNested.setText("Populate Left:");
        populateNested.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                populateNestedActionPerformed(evt);
            }
        });

        jLabel2.setText("to");
        jLabel2.setToolTipText("");

        useHash.setText("Left items are unique and all instances in batch file are mapped regardless of order (hash)");

        useArray.setText("Left items can be duplicates and are mapped in order (array)");

        jLabel3.setText(".prproj - Nested Sequence");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(process, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(fileLocation)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(L_fileLocation)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(DetectFile))
                    .addComponent(useArray, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(L_projectPath)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(projectPathField))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ext))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(L_key)
                                .addGap(157, 157, 157)
                                .addComponent(L_value))
                            .addComponent(useHash))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(populateNested)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nestPrefix))
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
                            .addComponent(jScrollPane1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(files, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(nest1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nest2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(L_fileLocation)
                    .addComponent(DetectFile))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fileLocation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(L_key)
                    .addComponent(L_value))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(files))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(populateNested)
                    .addComponent(nest1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(nest2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nestPrefix, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(ext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(L_projectPath)
                    .addComponent(projectPathField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(useArray)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(useHash)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(process, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DetectFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DetectFileActionPerformed
        batchFile = Paths.get(System.getProperty("user.home"), "AppData", "Roaming", "Adobe", "Adobe Media Encoder", "5.0", "batch.xml");
        fileLocation.setText(batchFile.toString());
    }//GEN-LAST:event_DetectFileActionPerformed

    private void populateNestedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_populateNestedActionPerformed
        int start;
        int end;
        try {
            start = Integer.parseInt(nest1.getText());
            end = Integer.parseInt(nest2.getText());
        } catch (NumberFormatException e) {
            return;
        }
        if (end < start)
            return;
        keyArea.setText("");
        for (int i = start; i <= end; i++) {
            keyArea.append(nestPrefix.getText() + String.format(".prproj - Nested Sequence %02d", i) + "\n");
        }
    }//GEN-LAST:event_populateNestedActionPerformed

    private void filesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filesActionPerformed
        JFileChooser folder = new JFileChooser();
        folder.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        if (folder.showOpenDialog(this) == JFileChooser.APPROVE_OPTION)
        {
            valueArea.setText("");
            Path projectPath = folder.getSelectedFile().toPath();
            projectPathField.setText(projectPath.toString());
            try {
                for (String file : projectPath.toFile().list()) {
                    if (file.length() > 4 && file.substring(file.length() - 4).equals(".bmp"))
                        valueArea.append(file.substring(0, file.length() - 4) + "\n");
                }
            } catch (NullPointerException e) {
                JOptionPane.showMessageDialog(this, "Failed to read file from export path: \n\n" + e, "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_filesActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        keyArea.setText("");
        getCurrentBatchFileNames();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void processActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_processActionPerformed
        // Make sure we have a project path
        if (projectPathField.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Export path should not be blank.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Update the batch path in case it changed
        batchFile = Paths.get(fileLocation.getText());
        fileLocation.setText(batchFile.toString());

        // Put our keys and values into arrays and a hash map
        String [] keys = keyArea.getText().split("\n");
        String [] values = valueArea.getText().split("\n");
        if (keys.length != values.length) {
            JOptionPane.showMessageDialog(this, "Left and right panes should have equal lines.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        HashMap<String, String> map = new HashMap();
        for (int i = 0; i < keys.length; i++)
        map.put(keys[i], values[i]);

        // Set up the output ArrayList
        ArrayList<String> newBatch = new ArrayList();

        // Create an iterator to go through the batch file
        ListIterator<String> batch;
        try {
            batch = Files.readAllLines(batchFile, Charset.forName("UTF-8")).listIterator();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Failed to read batch.xml file.\n\n" + e, "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Loop through each line until we hit a file
        int i = 0;
        while (batch.hasNext()) {
            String line = batch.next();
            if (line.startsWith("\t\t<SourceInfo>")) {

                // Found file, split this line to get sequence name
                String[] split = line.split("\", \"");
                String sequence = split[2].substring(8);
                String[] projectSplit = split[3].split("\\\\\\\\");
                    sequence = projectSplit[3] + " - " + sequence;

                    // Check if we have a mapped value for it
                    // or
                    // Check if the key we're on matches the sequence name
                    if ((useHash.isSelected() && map.containsKey(sequence))
                        ||
                        (useArray.isSelected() && keys[i].equals(sequence))) {

                        // We have our key name, keep going until we hit the line to replace
                        newBatch.add(line);
                        while (batch.hasNext()) {
                            String line2 = batch.next();
                            if (line2.startsWith("\t\t<OutputBaseName>")) {

                                // Write our two replacement lines, then break out
                                String name = "";
                                if (useHash.isSelected())
                                {
                                    name = map.get(sequence);
                                }
                                if (useArray.isSelected())
                                {
                                    name = values[i];
                                }
                                newBatch.add("\t\t<OutputBaseName>" + projectPathField.getText() + System.getProperty("file.separator") + name + "</OutputBaseName>");
                                newBatch.add("\t\t<OutputFileName>" + projectPathField.getText() + System.getProperty("file.separator") + name + "." + ext.getText() + "</OutputFileName>");
                                batch.next();
                                break;
                            } else {
                                newBatch.add(line2);
                            }
                        }
                        i++;
                    } else {
                        newBatch.add(line);
                    }
                } else {
                    newBatch.add(line);
                }
            }

            // Our new file is done, back up batch and write new one
            try {
                Files.copy(batchFile, Paths.get(batchFile.getParent().toString(), "batch_old.xml"), StandardCopyOption.REPLACE_EXISTING);
                Files.delete(batchFile);
                Files.write(batchFile, newBatch, Charset.forName("UTF-8"));
            } catch (IOException e) {
                JOptionPane.showMessageDialog(this, "Failed to back up batch.xml and write new one.\n\n" + e, "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            JOptionPane.showMessageDialog(this, "Process completed successfully.");
    }//GEN-LAST:event_processActionPerformed

    private void getCurrentBatchFileNames()
    {
        try {
            // Create an iterator to go through the batch file
            ListIterator<String> batch;
            batch = Files.readAllLines(batchFile, Charset.forName("UTF-8")).listIterator();

            // Loop through each line until we hit a file
            while (batch.hasNext()) {
                String line = batch.next();
                if (line.startsWith("\t\t<SourceInfo>")) {
                    // Found file, split this line to get sequence name
                    String[] split = line.split("\", \"");
                    String sequence = split[2].substring(8);
                    String[] projectSplit = split[3].split("\\\\\\\\");
                    // Also put the sequence name in the value area
                    valueArea.append(sequence + "\n");
                    sequence = projectSplit[3] + " - " + sequence;

                    // Add the sequence name to our map
                    keyArea.append(sequence + "\n");
                }
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Failed to read batch.xml file.\n\n" + e, "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // Set default system look and feel
        try {
            javax.swing.UIManager.setLookAndFeel(javax.swing.UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException|InstantiationException|IllegalAccessException|javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Form1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        // Create and display the form
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Form1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DetectFile;
    private javax.swing.JLabel L_fileLocation;
    private javax.swing.JLabel L_key;
    private javax.swing.JLabel L_projectPath;
    private javax.swing.JLabel L_value;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField ext;
    private javax.swing.JTextField fileLocation;
    private javax.swing.JButton files;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea keyArea;
    private javax.swing.JTextField nest1;
    private javax.swing.JTextField nest2;
    private javax.swing.JTextField nestPrefix;
    private javax.swing.JButton populateNested;
    private javax.swing.JButton process;
    private javax.swing.JTextField projectPathField;
    private javax.swing.JRadioButton useArray;
    private javax.swing.JRadioButton useHash;
    private javax.swing.JTextArea valueArea;
    // End of variables declaration//GEN-END:variables
}
