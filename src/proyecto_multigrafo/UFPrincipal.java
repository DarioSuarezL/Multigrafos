package proyecto_multigrafo;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.awt.Color;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.plaf.metal.MetalLookAndFeel;
import javax.swing.plaf.multi.MultiLookAndFeel;
import javax.swing.plaf.synth.SynthLookAndFeel;

public class UFPrincipal extends javax.swing.JFrame {

    private Multigrafo MG;
    private final Gson gson;
    boolean archivoAbierto;
    String nombreArchivo;
    JFileChooser seleccion;
    File archivo;
    String jsonText;
    /**
     * Creates new form UFPrincipal
     */
    public UFPrincipal() {
        MG = new Multigrafo();
        gson = new GsonBuilder().setPrettyPrinting().create();
        nombreArchivo = "";
        seleccion = new JFileChooser();
        FileNameExtensionFilter txtFiltro = new FileNameExtensionFilter("JSON (JavaScript Object Notation)","json");
        seleccion.setFileFilter(txtFiltro);
        archivoAbierto = false;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        textArea1 = new java.awt.TextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem12 = new javax.swing.JMenuItem();

        jMenu4.setText("jMenu4");

        jMenu5.setText("jMenu5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Proyecto Multigrafo");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);
        setSize(new java.awt.Dimension(0, 0));

        textArea1.setBackground(new java.awt.Color(0, 0, 0));
        textArea1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        textArea1.setEditable(false);
        textArea1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        textArea1.setForeground(new java.awt.Color(255, 255, 255));

        jMenu1.setText("File");

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setLabel("New file");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setLabel("Open file");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem3.setText("Save as");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem4.setText("Save");
        jMenuItem4.setEnabled(false);
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");

        jMenuItem5.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem5.setLabel("addVertice");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem5);

        jMenuItem6.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem6.setLabel("addArista");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem6);

        jMenuItem7.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem7.setLabel("delArista");
        jMenuItem7.setName(""); // NOI18N
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem7);

        jMenuItem8.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem8.setLabel("cleanGrafo");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem8);

        jMenuItem9.setLabel("existsArista");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem9);

        jMenuItem10.setLabel("modPesoArista");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem10);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("CREAR");

        jMenuItem11.setText("crear");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem11);

        jMenuBar1.add(jMenu3);

        jMenu6.setText("DEFENSA");

        jMenuItem12.setText("defensa");
        jMenuItem12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem12ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem12);

        jMenuBar1.add(jMenu6);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(textArea1, javax.swing.GroupLayout.DEFAULT_SIZE, 487, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(textArea1, javax.swing.GroupLayout.DEFAULT_SIZE, 615, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void estadoBotonSave(){
        if(archivoAbierto){
            this.jMenuItem4.setEnabled(true);
        }else{
            this.jMenuItem4.setEnabled(false);
        }
    }
    
    private void actualizarGrafo(){
        this.textArea1.setText(MG.printListas());
    }
    
    private boolean nombreExistente(String x){
        return !MG.nombreValido(x);
    }
    
    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // NUEVO ARCHIVO
        this.textArea1.setText("");
        MG = new Multigrafo();
        archivoAbierto = false;
        estadoBotonSave();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // ABRIR ARCHIVO
        seleccion.setDialogType(JFileChooser.OPEN_DIALOG);
        if(seleccion.showDialog(null, "Abrir") == JFileChooser.APPROVE_OPTION){
            archivo = seleccion.getSelectedFile();
            if(archivo.canRead()){
                String direccion = archivo.getAbsolutePath();
                        try {
                            MG = gson.fromJson(new FileReader(direccion), Multigrafo.class);
                            actualizarGrafo();
                            nombreArchivo = archivo.getName();
                            archivoAbierto = true;
                        }catch(FileNotFoundException ex) {
                            Logger.getLogger(UFPrincipal.class.getName()).log(Level.SEVERE, null, ex);
                        }catch(com.google.gson.JsonSyntaxException ex){
                            JOptionPane.showMessageDialog(this, "ERROR:\n Archivo no soportado o corrupto");
                        }catch(java.lang.IllegalStateException ex){
                            JOptionPane.showMessageDialog(this, "ERROR:\n El archivo no corresponde a un objeto Multigrafo");
                        }
            }
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // GUARDAR COMO    
        seleccion.setDialogType(JFileChooser.SAVE_DIALOG);
        seleccion.setSelectedFile(new File("nuevo archivo.json"));
        if(seleccion.showDialog(null, "Guardar") == JFileChooser.APPROVE_OPTION){
            archivo = seleccion.getSelectedFile();
            jsonText = gson.toJson(MG);
            try (PrintWriter pw = new PrintWriter(archivo)){
                pw.write(jsonText);
                archivoAbierto = true;
            }catch (FileNotFoundException ex){
                Logger.getLogger(UFPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // GUARDAR
        jsonText = gson.toJson(MG);        
        try (PrintWriter pw = new PrintWriter(archivo)){
            pw.write(jsonText);
            this.jMenuItem4.setEnabled(false);
        }catch(FileNotFoundException ex) {
            Logger.getLogger(UFPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        // CREAR VERTICE
        try{
            
            String name = JOptionPane.showInputDialog(this,"Ingrese el nombre del vértice: ");
            if(!nombreExistente(name) && name.length() > 0)
                MG.addVertice(name);
            else
                JOptionPane.showMessageDialog(this, "ERROR:\n El nombre ingresado está ocupado o no es válido"); 
            
        }catch(java.lang.NullPointerException ex){}catch(java.lang.ArrayIndexOutOfBoundsException ex){}
        actualizarGrafo();
        estadoBotonSave();          
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        // CREAR ARISTA
        try{
            
        String v1 = JOptionPane.showInputDialog(this,"Ingrese el nombre del vértice de donde origina la arista: ");
        String v2 = JOptionPane.showInputDialog(this,"Ingrese el nombre del vértice a donde apunta la arista: ");
        int p = Integer.parseInt(JOptionPane.showInputDialog(this,"Ingrese el peso de la arista: \n NOTA: el peso tiene que ser distinto al de otras aristas con misma direccion y origen."));
        if (v1 != null && v2 != null &&!v1.isEmpty() && !v2.isEmpty() && nombreExistente(v1) && nombreExistente(v2) && p > 0)
            MG.addArista(v1, p, v2);
        else
            if (p <= 0)
                JOptionPane.showMessageDialog(this, "ERROR:\n Por favor, ingrese un peso mayor que 0"); 
            else
                JOptionPane.showMessageDialog(this, "ERROR:\n Por favor, ingrese nombres válidos de aristas existentes"); 
        
        }catch(java.lang.NumberFormatException ex){}catch(java.lang.NullPointerException ex){}catch(java.lang.ArrayIndexOutOfBoundsException ex){}
        
        actualizarGrafo();
        estadoBotonSave();
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        // ELIMINAR ARISTA
        try{
            
        String v1 = JOptionPane.showInputDialog(this,"Ingrese el nombre del vértice de donde origina la arista a eliminar: ");
        String v2 = JOptionPane.showInputDialog(this,"Ingrese el nombre del vértice a donde apunta la arista a eliminar: ");
        int p = Integer.parseInt(JOptionPane.showInputDialog(this,"Ingrese el peso de la arista a eliminar: "));       
        if (!v1.isEmpty() && !v2.isEmpty() && nombreExistente(v1) && nombreExistente(v2) && p > 0)
            MG.delArista(v1, p, v2);
        else
            if (p < 0)
                JOptionPane.showMessageDialog(this, "ERROR:\n Por favor, ingrese un peso mayor que 0"); 
            else
                JOptionPane.showMessageDialog(this, "ERROR:\n Por favor, ingrese nombres válidos de aristas existentes");  
        
        }catch(java.lang.NumberFormatException ex){}catch(java.lang.NullPointerException ex){}catch(java.lang.ArrayIndexOutOfBoundsException ex){}
            
        actualizarGrafo();
        estadoBotonSave();
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        // LIMPIAR GRAFO
        this.textArea1.setText("");
        MG = new Multigrafo();
        estadoBotonSave();
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        // ARISTA EXISTE?
        
        try{
        
        String v1 = JOptionPane.showInputDialog(this,"Ingrese el nombre del vértice de donde origina la arista a buscar: ");
        String v2 = JOptionPane.showInputDialog(this,"Ingrese el nombre del vértice a donde apunta la arista a buscar: ");
        int p =  Integer.parseInt(JOptionPane.showInputDialog(this,"Ingrese el peso de la arista a buscar: "));
        if(nombreExistente(v1) && nombreExistente(v2) && MG.aristaExiste(v1, p, v2))
            JOptionPane.showMessageDialog(null, "Si, la arista que parte de "+v1+" hasta "+v2+" con peso de "+p+", si existe.");
        else
            JOptionPane.showMessageDialog(null, "No, la arista que parte de "+v1+" hasta "+v2+" con peso de "+p+", no existe.");
        
        }catch(java.lang.NumberFormatException ex){}catch(java.lang.NullPointerException ex){}catch(java.lang.ArrayIndexOutOfBoundsException ex){}
        
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        // MODIFICAR PESO DE LA ARISTA
        
        try{
        
        String v1 = JOptionPane.showInputDialog(this,"Ingrese el nombre del vértice de donde origina la arista a modificar: ");
        String v2 = JOptionPane.showInputDialog(this,"Ingrese el nombre del vértice a donde apunta la arista a modificar: ");
        int pa =  Integer.parseInt(JOptionPane.showInputDialog(this,"Ingrese el peso que desea cambiar: "));
        int p =  Integer.parseInt(JOptionPane.showInputDialog(this,"Ingrese el peso que desea cambiar: "));
        if(MG.aristaExiste(v1, pa, v2)){
            MG.modPesoArista(v1, pa, v2, p);
            actualizarGrafo();
            
            estadoBotonSave();
        }
        else{
            if((nombreExistente(v1) && nombreExistente(v2)) && MG.aristaExiste(v1, p, v2))
                JOptionPane.showMessageDialog(null, "ERROR:\n No puede modificar esa arista con ese peso, porque otra arista en misma direccion ya tiene ese peso");
            else
                JOptionPane.showMessageDialog(null, "ERROR:\n La arista a modificar no existe");
        }
        
        }catch(java.lang.NumberFormatException ex){}catch(java.lang.NullPointerException ex){}catch(java.lang.ArrayIndexOutOfBoundsException ex){}
        
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void GenerarMultigrafo(){
        MG = new Multigrafo();
        MG.addVertice("SCZ");
        MG.addVertice("CBBA");
        MG.addVertice("LPZ");
        MG.addVertice("SUCRE");
        
        MG.addArista("SCZ", 20, "CBBA");
        MG.addArista("SCZ", 10, "CBBA");
        MG.addArista("SCZ", 5, "SUCRE");
        MG.addArista("SCZ", 15, "SUCRE");
        
        MG.addArista("SUCRE", 60, "SCZ");
        
        MG.addArista("CBBA", 20, "SCZ");
        MG.addArista("CBBA", 60, "LPZ");
        MG.addArista("CBBA", 90, "LPZ");
        
        MG.addArista("LPZ", 30, "CBBA");
    }
    
    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
        // TODO add your handling code here:
        GenerarMultigrafo();       
        actualizarGrafo();
        seleccion.setDialogType(JFileChooser.SAVE_DIALOG);
        seleccion.setSelectedFile(new File("defensa.json"));
        if(seleccion.showDialog(null, "Guardar") == JFileChooser.APPROVE_OPTION){
            archivo = seleccion.getSelectedFile();
            jsonText = gson.toJson(MG);
            try (PrintWriter pw = new PrintWriter(archivo)){
                pw.write(jsonText);
                archivoAbierto = true;
            }catch (FileNotFoundException ex){
                Logger.getLogger(UFPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jMenuItem11ActionPerformed

    private void GenerarVerticeEspecial(){
        MG.addVertice("ACME");
        MG.addArista("LPZ", 100, "ACME");
        MG.addArista("LPZ", 200, "ACME");
        actualizarGrafo();
    }
    
    private String generarRecorrido(String partida, String llegada){
        String res = "RECORRIDO:  ";
        if (MG.V[MG.nombreVertice("LPZ")].Existe(MG.nombreVertice(partida), MG.getPeso("LPZ", partida))){
            res = res + partida+" --"+MG.getPeso("LPZ", partida)+" --> "+"LPZ --"+MG.getPeso("LPZ","CBBA")+" --> "+"CBBA --"+MG.getPeso("CBBA",llegada)+" --> "+llegada;
        }
        return res;
    }
    
    private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem12ActionPerformed
        // TODO add your handling code here:
        GenerarVerticeEspecial();
        this.textArea1.setText(generarRecorrido("ACME","SCZ"));
    }//GEN-LAST:event_jMenuItem12ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(UFPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UFPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UFPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UFPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UFPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPopupMenu jPopupMenu1;
    private java.awt.TextArea textArea1;
    // End of variables declaration//GEN-END:variables
}
