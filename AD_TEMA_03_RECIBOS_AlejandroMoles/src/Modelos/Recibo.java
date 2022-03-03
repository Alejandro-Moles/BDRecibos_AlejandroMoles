package Modelos;
// Generated 23-nov-2021 10:19:16 by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.Date;

/**
 * Recibo generated by hbm2java
 */
public class Recibo  implements java.io.Serializable {


     private ReciboId id;
     private Prestamo prestamo;
     private Date fecha;
     private BigDecimal importe;
     private Date fechaPagado;

    public Recibo() {
    }

	
    public Recibo(ReciboId id, Prestamo prestamo, BigDecimal importe) {
        this.id = id;
        this.prestamo = prestamo;
        this.importe = importe;
    }
    public Recibo(ReciboId id, Prestamo prestamo, Date fecha, BigDecimal importe, Date fechaPagado) {
       this.id = id;
       this.prestamo = prestamo;
       this.fecha = fecha;
       this.importe = importe;
       this.fechaPagado = fechaPagado;
    }
   
    public ReciboId getId() {
        return this.id;
    }
    
    public void setId(ReciboId id) {
        this.id = id;
    }
    public Prestamo getPrestamo() {
        return this.prestamo;
    }
    
    public void setPrestamo(Prestamo prestamo) {
        this.prestamo = prestamo;
    }
    public Date getFecha() {
        return this.fecha;
    }
    
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    public BigDecimal getImporte() {
        return this.importe;
    }
    
    public void setImporte(BigDecimal importe) {
        this.importe = importe;
    }
    public Date getFechaPagado() {
        return this.fechaPagado;
    }
    
    public void setFechaPagado(Date fechaPagado) {
        this.fechaPagado = fechaPagado;
    }

    @Override
    public String toString(){
        return this.getId() + "";
    }


}


