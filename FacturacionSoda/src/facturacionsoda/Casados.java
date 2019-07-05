
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facturacionsoda;

/**
 *
 * @author T.YENDY
 */
public class Casados extends Producto {
    private int calorias;
    private String tipoCasado;
    
    public Casados(){
        
    }
    public Casados(String nombre){
        this.nombre = nombre;
    }
    public int getCalorias(){
        return this.calorias;
    }
    public void setCalorias(int calorias, Usuario usuario) {
        if (this.rolPermitido(Rol.getGerente(), usuario)) {
            this.calorias = calorias;
            this.mensaje = Mensaje.EXITO;
        } else {
            this.mensaje = Mensaje.ACCESO_DENEGADO;
        }
    }
    public String getTipoCasado(){
        return this.tipoCasado;
    }
    public void setTipoCasado(String tipo, Usuario usario) {

        if (this.rolPermitido(Rol.getGerente(), usario)) {

            switch (tipo) {
                case "Carne en salsa":
                    this.mensaje = Mensaje.EXITO;
                    this.tipoCasado = tipo;
                    break;
                case "Pollo a la plancha":
                    this.mensaje = Mensaje.EXITO;
                    this.tipoCasado = tipo;
                    break;

                case "Cerdo":
                    this.mensaje = Mensaje.EXITO;
                    this.tipoCasado = tipo;
                    break;

                case "Res":
                    this.mensaje = Mensaje.EXITO;
                    this.tipoCasado = tipo;
                    break;

                case "Pescado":
                    this.mensaje = Mensaje.EXITO;
                    this.tipoCasado = tipo;
                    break;

                default:
                    this.mensaje = "El casado no se encuentra en el menu";

            }
        } else {
            this.mensaje = Mensaje.ACCESO_DENEGADO;
        }
    }
}
