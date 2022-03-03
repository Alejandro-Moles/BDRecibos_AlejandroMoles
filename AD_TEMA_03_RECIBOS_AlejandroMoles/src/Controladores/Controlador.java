
package Controladores;

import Modelos.FormaPago;
import Modelos.Prestamo;
import Modelos.Recibo;
import java.util.List;
import java.util.ListIterator;
import org.hibernate.HibernateException;
import org.hibernate.NonUniqueObjectException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.hibernate.exception.ConstraintViolationException;


public class Controlador {
    //creo tanto una  transaccion como una sesion
    private Transaction tx;
    private Session sesion;
    
    //metodo que me conecta la sesion, el cual llamare siempre que quiera hacer uso de la base de datos
    public void cargarSesion(){
        try{
            sesion = NewHibernateUtil.getSessionFactory().openSession();           
        }catch(HibernateException ex){
                
        }
    }
    
    public List CargarFormaPago(){
        try{
            //conecto la sesion
            cargarSesion();
            //hago una sentencia hql, la cual me devuelve todos los datos de la tabla FormaPago
            String hql = "FROM FormaPago";
            Query query = sesion.createQuery(hql);
            //recojo los datos en una lista
            List results = query.list();
            //devuelvo la lista
            return results;
        }finally{
            //cierro la sesion
            sesion.close();
        }
         
    }
   
    public List cargarTablaPrestamos(){
        try{
            //conecto la sesion
            cargarSesion();
            //hago un criteria el cual almaceno en una lista, el criteria recojera los datos de la tabla Prestamo y estaran ordenado por el NPrestamo
            List <Prestamo> lista = sesion.createCriteria(Prestamo.class)
                    .addOrder(Order.asc("NPrestamo"))
                    .list();
            //devuelvo la lista
            return lista;
        }finally{
            //cierro la sesion
            sesion.close();
        }
        
    }
        
    public int meterprestamo(Prestamo p){
        try{
            //conecto la sesion
           cargarSesion();
           //inicio la transaccion
           tx = sesion.beginTransaction();
           //con el objeto que he recibido de tipo Prestamo ejecuto un save, el cual me lo guarda en la base de datos
           sesion.save(p);
           //realizo un commit
           tx.commit();
           //devuelvo un 0 si no se ha producodo ningun error
           return 0;
        }catch(HibernateException ex){
            //si se ha producido un error, hago un rollback y devuelvo un -1
            tx.rollback();
            return -1;  
        }finally{
            //cierro la sesion
            sesion.close();
        }
        
    } 

    public void borrarPrestamo(Prestamo p) {
        try{
            //conecto a la sesion
            cargarSesion();
            //inicio un transaccion
            tx = sesion.beginTransaction();
            //borro el objeto seleccionado que he recogido
            sesion.delete(p);
            //realizo un commit
            tx.commit();
        }finally{
            //cierro la sesion
            sesion.close();
        }         
    }
    
    public void modificarPrestamo(Prestamo p){
        try{
            //me conecto a la sesion
            cargarSesion();
            //inicio una transaccion
            tx = sesion.beginTransaction();
            //con el objeto que he recibido actualizo la base de datos
            sesion.update(p);
            //hago un commit
            tx.commit();
        }finally{
            //cierro la sesion
            sesion.close();
        }
    }
    
    public void actualizarRecibos(Recibo r){
        try{
            //me conecto a la sesion
            cargarSesion();
            //inicio una transaccion
            tx = sesion.beginTransaction();
             //con el objeto que he recibido actualizo la base de datos
            sesion.update(r);
            tx.commit();
        }finally{
             //cierro la sesion
            sesion.close();
        }
    }
}
