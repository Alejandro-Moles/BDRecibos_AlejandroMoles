
package Vistas;

import Controladores.Controlador;
import java.util.List;
import java.util.ListIterator;
import Modelos.FormaPago;
import Modelos.Prestamo;
import Modelos.Recibo;
import java.awt.event.KeyEvent;
import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableColumnModel;
import javax.swing.table.DefaultTableModel;

public class Ventana extends javax.swing.JFrame {
    //creo un objeto de la clase COntrolador paar que realice todas las operaciones de insertar, leer, modificar y eliminar en la base de datos
    private Controlador cr = new Controlador();
    
    
    public Ventana() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Acceso BD ORM");
        //metodo para cargar el combo box con los datos
        cargarComboBox();
        //metodo para cargar la tabla de Prestamos
        CargarPrestamos();
        //metodo para cargar la tabla de recibos
        CargarRecibos();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel_Datos = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        text_Importe = new javax.swing.JTextField();
        Boton_Pagar = new javax.swing.JButton();
        Combo_FormaPago = new javax.swing.JComboBox<>();
        chooser_Fecha = new com.toedter.calendar.JDateChooser();
        text_NPrestamo = new javax.swing.JTextField();
        jToolBar1 = new javax.swing.JToolBar();
        añadir_btn = new javax.swing.JButton();
        eliminar_btn = new javax.swing.JButton();
        actualizar_btn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla_Prestamos = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        Tabla_Recibos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Panel_Datos.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel1.setText("Fecha");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel2.setText("Nº Prestamo");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel3.setText("Importe");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel4.setText("Forma de Pago");

        text_Importe.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        text_Importe.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                text_ImporteKeyTyped(evt);
            }
        });

        Boton_Pagar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Boton_Pagar.setText("Pagar");
        Boton_Pagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_PagarActionPerformed(evt);
            }
        });

        Combo_FormaPago.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        chooser_Fecha.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        text_NPrestamo.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        text_NPrestamo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text_NPrestamoActionPerformed(evt);
            }
        });
        text_NPrestamo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                text_NPrestamoKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout Panel_DatosLayout = new javax.swing.GroupLayout(Panel_Datos);
        Panel_Datos.setLayout(Panel_DatosLayout);
        Panel_DatosLayout.setHorizontalGroup(
            Panel_DatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_DatosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Panel_DatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Panel_DatosLayout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(text_NPrestamo))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Panel_DatosLayout.createSequentialGroup()
                        .addGroup(Panel_DatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Panel_DatosLayout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Combo_FormaPago, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Panel_DatosLayout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(chooser_Fecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Panel_DatosLayout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(text_Importe, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(Panel_DatosLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(Boton_Pagar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        Panel_DatosLayout.setVerticalGroup(
            Panel_DatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_DatosLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(Panel_DatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                    .addComponent(text_NPrestamo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Panel_DatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chooser_Fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(Panel_DatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(text_Importe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(Panel_DatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                    .addComponent(Combo_FormaPago))
                .addGap(43, 43, 43)
                .addComponent(Boton_Pagar, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(314, 314, 314))
        );

        Panel_DatosLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {chooser_Fecha, text_Importe});

        jToolBar1.setRollover(true);

        añadir_btn.setText("Añadir");
        añadir_btn.setFocusable(false);
        añadir_btn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        añadir_btn.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        añadir_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                añadir_btnActionPerformed(evt);
            }
        });
        jToolBar1.add(añadir_btn);

        eliminar_btn.setText("Eliminar");
        eliminar_btn.setFocusable(false);
        eliminar_btn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        eliminar_btn.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        eliminar_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminar_btnActionPerformed(evt);
            }
        });
        jToolBar1.add(eliminar_btn);

        actualizar_btn.setText("Actualizar");
        actualizar_btn.setFocusable(false);
        actualizar_btn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        actualizar_btn.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        actualizar_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualizar_btnActionPerformed(evt);
            }
        });
        jToolBar1.add(actualizar_btn);

        Tabla_Prestamos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NºPrestamo", "Fecha", "Importe", "Importe pagado", "Forma de pago"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Tabla_Prestamos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Tabla_PrestamosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Tabla_Prestamos);
        if (Tabla_Prestamos.getColumnModel().getColumnCount() > 0) {
            Tabla_Prestamos.getColumnModel().getColumn(0).setResizable(false);
            Tabla_Prestamos.getColumnModel().getColumn(1).setResizable(false);
            Tabla_Prestamos.getColumnModel().getColumn(2).setResizable(false);
            Tabla_Prestamos.getColumnModel().getColumn(3).setResizable(false);
            Tabla_Prestamos.getColumnModel().getColumn(4).setResizable(false);
        }

        Tabla_Recibos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NºRecibo", "Fecha", "Importe", "Fecha de pago"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(Tabla_Recibos);
        if (Tabla_Recibos.getColumnModel().getColumnCount() > 0) {
            Tabla_Recibos.getColumnModel().getColumn(0).setResizable(false);
            Tabla_Recibos.getColumnModel().getColumn(1).setResizable(false);
            Tabla_Recibos.getColumnModel().getColumn(2).setResizable(false);
            Tabla_Recibos.getColumnModel().getColumn(3).setResizable(false);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Panel_Datos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 677, Short.MAX_VALUE)
                    .addComponent(jScrollPane3))
                .addContainerGap())
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Panel_Datos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Boton_PagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_PagarActionPerformed
        //metodo para pagar el recibo que ha sido seleccionado
        actualizarRecibo();
    }//GEN-LAST:event_Boton_PagarActionPerformed
    
    
    private void añadir_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_añadir_btnActionPerformed
      //metodo para añadir a la base de datos los datos de un prestamo
      aniadirPrestamo();
      CargarPrestamos();
    }//GEN-LAST:event_añadir_btnActionPerformed
    
    private void eliminar_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminar_btnActionPerformed
        //metodo para eliminar de la base de datos un prestamo seleccionado
        eliminarPrestamo();      
    }//GEN-LAST:event_eliminar_btnActionPerformed

    
    private void actualizar_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizar_btnActionPerformed
        //metodo para modificar los datos de un prestamo seleccionado
        modificarPrestamo();
    }//GEN-LAST:event_actualizar_btnActionPerformed
    
    //cuando se pulsa en la fila de una tabla, ejecuta todo lo que hay dentro de este metodo
    private void Tabla_PrestamosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tabla_PrestamosMouseClicked
       //saco el indice de la fila que se ha seleccionado
       int indice =Tabla_Prestamos.getSelectedRow();
       //saco la lista de prestamos mediante el controlador
       List<Prestamo> prestamos = cr.cargarTablaPrestamos();
       //como en la tabla se ha guardado en el indice 0 un objeto de tipo prestamo, entonces sacamos ese objeto y se lo metemos a p1
       Prestamo p1 = prestamos.get(Tabla_Prestamos.getSelectedRow());
       //metemos los datos de ese objeto en lso respectivos campos de la aplicacion
       text_NPrestamo.setText(p1.getNPrestamo().toString());
       chooser_Fecha.setDate(p1.getFecha());
       text_Importe.setText(p1.getImporte().toString());
       
       //como el combo box tendra una longitud de 4 en total, entonces hacemos un entero para que se recorra un bucle y asi nos muestre el item del comboBox de la fila
       //que hemos seleccionado
       int longitudCombo = 4;
       //sacamos es String de la forma de Pago y la comparamos en el bucle para asi sacar el item del combobox que esta relacioada con esa forma de Pago
       String textoCombo = (Tabla_Prestamos.getValueAt(indice, 4)).toString();
        
       for(int i = 0; i<longitudCombo; i++){
            if(Combo_FormaPago.getItemAt(i).toString().equals(textoCombo)){
                Combo_FormaPago.setSelectedIndex(i);
            }
        }
       //cargamos la tabla de recibos correspondiente a ese prestamo
       CargarRecibos();
    }//GEN-LAST:event_Tabla_PrestamosMouseClicked

    private void text_NPrestamoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text_NPrestamoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text_NPrestamoActionPerformed

    private void text_NPrestamoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text_NPrestamoKeyTyped
       //metodo que comprueba que solo se ingresen numeros en el textfield de NPrestamo
        comprobarNumero(evt);
    }//GEN-LAST:event_text_NPrestamoKeyTyped

    private void text_ImporteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text_ImporteKeyTyped
        //metodo que comprueba que solo se ingresen numeros en el textfield de Importe
        comprobarNumero(evt);
    }//GEN-LAST:event_text_ImporteKeyTyped
       
    //metodo que nos devuelve una lista llamando al controlador la cual usamos para rellenar el combobox 
    public void cargarComboBox(){
        List<FormaPago> resultado = cr.CargarFormaPago();
        for(FormaPago fp : resultado){
            Combo_FormaPago.addItem(fp);
        } 
    }
    
    //metodo que llamando al controlador nos devuelve una lista con la que llenamos la tabla de Prestamos
    public void CargarPrestamos(){
        //metodo que vacia la tabla de Prestamos
        LimpiarTabla(Tabla_Prestamos);
        //llenamos la lista con los datos de la tabla de prestamos de la base de datos
        List<Prestamo> prestamos = cr.cargarTablaPrestamos();
        //creamos un modelo para poder rellenar la tabla
        DefaultTableModel tabla = (DefaultTableModel)Tabla_Prestamos.getModel();
        //recorremos un bucle por cada objeto de la lista y vamos metiendo los datos en la tabla, metoendo en el primer indice el obheto entero, el cual se
        //mostrara como NPrestamos por el toString que he hecho en la clase NPrestamos
        for(Prestamo p : prestamos){
            tabla.addRow(new Object[]{p,p.getFecha(),p.getImporte(),p.getImportePagado(),p.getFormaPago()});
        }
    }
    
    //netodo que carga la tabal Recibos, esta se hace sin acceder a la base de datos
    public void CargarRecibos(){
        //metodo que limpia la tabla de recibos
        LimpiarTabla(Tabla_Recibos);
        //creamos un modelo paraa poder insertar los datos en la tabla de recibos
        DefaultTableModel tabla = (DefaultTableModel)Tabla_Recibos.getModel();
        //sacamos el indice de la la fila que se esta seleccionando en la tabla Prestamos
        int indice =Tabla_Prestamos.getSelectedRow();
        //si no se ha seleccionado ningun indice carga los recibos de la primera fila de la tabla de Prestamos
        if(indice == -1){
          
        }else{
             //saco el objeto Prestamos que hay guardado en la columna 0 de la fila indicada
            Prestamo p1 = (Prestamo)Tabla_Prestamos.getValueAt(indice, 0);
            //hago un set y guardo los recibos ahi
            Set<Recibo> set= p1.getRecibos();
            //los meto en una lista para pider ordenarlos
            List<Recibo> ordenRecibos = new ArrayList<>(set);
            //los ordeno segun la fecha
            ordenRecibos.sort(Comparator.comparing(Recibo::getFecha));
            //los meto en la tabla de Recibos, metiendo en la columna 0 el objeto entero de recibos
            for(Recibo r : ordenRecibos){
                tabla.addRow(new Object[]{r,r.getFecha(),r.getImporte(),r.getFechaPagado()});
            }  
        }
    }
    
    public void LimpiarTabla(JTable tabla){
        //mediante un bucle comprueba que la tabla esta vacia, y si no borra la columna 0
        while(tabla.getRowCount()!= 0){
            ((DefaultTableModel)tabla.getModel()).removeRow(0);
        }
    }
    
    public void aniadirPrestamo(){
        //creo un objeto Prestamo
        Prestamo p1 = new Prestamo();
        //a ese objeto le meto los datos que hay en mis textfield, jdaychooser y combobox
        p1.setNPrestamo(BigDecimal.valueOf(Double.parseDouble(text_NPrestamo.getText())));
        p1.setFecha(chooser_Fecha.getDate());
        p1.setImporte(BigDecimal.valueOf(Double.parseDouble(text_Importe.getText())));
        p1.setImportePagado(BigDecimal.ZERO);//selecciono cero por que al insertar un prestamo siempre el importe pagado se pone a cero
        p1.setFormaPago((FormaPago) Combo_FormaPago.getSelectedItem());
        
        //paso el objeto al controlador para que lo inserte en ka base de datos
        //dependiendo de lo que me devuelva ese metodo me mostrar un mensaje de error o de exito
        if(cr.meterprestamo(p1) == 0){
            JOptionPane.showMessageDialog(null, "Se ha podido añadir el prestamo");
        }else{
            JOptionPane.showMessageDialog(null, "Error, no se ha podido añadir el prestamo");
        }            
    }
    
    public void eliminarPrestamo(){
        //saco el indice de la fila que se esta seleccionando
        int indice =Tabla_Prestamos.getSelectedRow();
        //si es -1 es que no se esta seleccionando ninguna fila
        if(indice == -1){
            JOptionPane.showMessageDialog(rootPane, "Error, no se ha seleccionado ninguna fila");
        }else{
            //saco el objeto de la fila que se esta seleccionando
            Prestamo p1 = (Prestamo)Tabla_Prestamos.getValueAt(indice, 0);
            //si el importe pagado es diferente a 0, quiere decir que ya ha habido un recibo que se ha pagad, por lo que no se puede borrar
            if(p1.getImportePagado() != BigDecimal.ZERO){
                JOptionPane.showMessageDialog(null, "Error, no se puede eliminar un prestamo el cual se ha pagado un recibo");
            }else{
                //pregunto si de verdad quiere borrar el prestamo que ha seleccionao
                int opcion = JOptionPane.showConfirmDialog(rootPane, "Quiere borrar el prestamo seleccionado? Se borraran los recibos asociados");
                if(opcion == JOptionPane.YES_OPTION){
                    //llamo al metodo del controlador el cual pasandole un objeto, borra ese objeto de la base de datos
                    cr.borrarPrestamo(p1);
                    //cargo las dos tablas de nuevo para que se actualicen los datos
                    CargarPrestamos();
                    CargarRecibos();
                    JOptionPane.showMessageDialog(null, "Prestamo borrado");
                }else{
                    JOptionPane.showMessageDialog(null, "Prestamo no borrado");
                }
            }
        }        
    }
    
    public void modificarPrestamo(){
            //saco el indice de la fila que se esta seleccionando
            int indice =Tabla_Prestamos.getSelectedRow();
            if(indice == -1){
                JOptionPane.showMessageDialog(rootPane, "Error, no se ha seleccionado ninguna fila");
            }else{
                //saco el objeto de la fila que se esta seleccionando
                Prestamo p1 = (Prestamo)Tabla_Prestamos.getValueAt(indice, 0);
                //creo un nuevo objeto al que se le pasaran los datos para modificar el Prestamo
                Prestamo p_modificar = new Prestamo();
                
                //le paso los datos al objetos
                p_modificar.setNPrestamo(p1.getNPrestamo());
                p_modificar.setFecha(chooser_Fecha.getDate());
                p_modificar.setImporte(BigDecimal.valueOf(Double.parseDouble(text_Importe.getText())));
                p_modificar.setImportePagado(BigDecimal.ZERO);
                p_modificar.setFormaPago((FormaPago) Combo_FormaPago.getSelectedItem());
            
                //si el importe pagado del Prestao de la fila seleccionado es distinto a cero, quiere decir que se ha pagado ya un recibo, por lo que no se puede modificar
                if(p1.getImportePagado() != BigDecimal.ZERO){
                    JOptionPane.showMessageDialog(null, "Error, no se puede modificar un prestamo el cual se ha pagado un recibo");
                }else{
                    //pregunto si quiere modificar el prestamo
                    int opcion = JOptionPane.showConfirmDialog(rootPane, "Quiere modificar el prestamo seleccionado? Se modificararn los recibos asociados");
                    if(opcion == JOptionPane.YES_OPTION){
                        CargarPrestamos();
                        //si ha tocado el campo de NPrestamo salta un mesaje de error, ya que no se puede tocar
                        if(!text_NPrestamo.getText().equalsIgnoreCase(p_modificar.getNPrestamo().toString())){
                            JOptionPane.showMessageDialog(rootPane, "¡CUIDADO!,no se puede tocar el campo de Numero Prestamo, prestamo no modificado");
                        }else{
                            //le paso al metodo del controlador que me modifica el prestamo el objeto que voy a utilizar para que me lo modifique
                            cr.modificarPrestamo(p_modificar);
                            JOptionPane.showMessageDialog(null, "Prestamo modificado");
                            CargarPrestamos();
                            CargarRecibos();
                        }
                    }else{
                        JOptionPane.showMessageDialog(null, "Prestamo no modificado");
                    }
                }
            }
    }
    
    //metodo que actualiza el recibo, una vez que se paga
    public void actualizarRecibo(){
        DefaultTableModel tabla = (DefaultTableModel)Tabla_Recibos.getModel();
        //cojo el objeto recibo que hay guardado en la fila seleccionada
        int indice =Tabla_Recibos.getSelectedRow();
        if(indice == -1){
            JOptionPane.showMessageDialog(null, "No ha seleccionado ninguna fila");
        }else{
            Recibo r = (Recibo)Tabla_Recibos.getValueAt(indice, 0);
            //si la fecha de pagado ya esta rellenada, entonces no se puede pagar el recibo de nuevo
            if(r.getFechaPagado() != null){
                JOptionPane.showMessageDialog(null, "Error, no se puede pagar un recibo ya pagado");
            }else{
                //creo un objeto prestamo de dicho recibo
                Prestamo p = r.getPrestamo();
                //hago que se sume el importe que ya tenia pagado con el importe de dicho recibo
                BigDecimal sumaImportes = p.getImportePagado().add(r.getImporte());
                p.setImportePagado(sumaImportes);
                java.util.Date fecha = new Date();
                r.setFechaPagado(fecha);
                //actualizo tanto recibos como prestamos en la base de datos
                cr.actualizarRecibos(r);
                cr.modificarPrestamo(p);
                JOptionPane.showMessageDialog(null, "Recibo pagado correctamente");
                //cargo las tablas
                CargarPrestamos(); 
                CargarRecibos();
            }
        }
    }
    
    //metodo que comprueba que lo que se esta escribiendo son numeros y no letras
    public void comprobarNumero(KeyEvent evt){
        //saco el caracter que se esta escirbiendo
        char ComprobarLetra = evt.getKeyChar();
        //si no es un digito entonces se cinsume y no deja escirbor nada
        if(!Character.isDigit(ComprobarLetra)){
            evt.consume();
        }
    }
    
    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Boton_Pagar;
    private javax.swing.JComboBox<FormaPago> Combo_FormaPago;
    private javax.swing.JPanel Panel_Datos;
    private javax.swing.JTable Tabla_Prestamos;
    private javax.swing.JTable Tabla_Recibos;
    private javax.swing.JButton actualizar_btn;
    private javax.swing.JButton añadir_btn;
    private com.toedter.calendar.JDateChooser chooser_Fecha;
    private javax.swing.JButton eliminar_btn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JTextField text_Importe;
    private javax.swing.JTextField text_NPrestamo;
    // End of variables declaration//GEN-END:variables
}
