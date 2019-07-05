package facturacionsoda;

import Seguridad.Rol;
import Seguridad.Usuario;
import Mensajeria.Mensaje;
import java.util.List;
import java.util.ArrayList;

public class Casados extends Producto {

    private String nombre;
    private double precio;
    private int calorias;
    private String mensaje;
    private String tipoCasado;
    private List<Ingrediente> ingrediente = new ArrayList<>();

    public Casados(String nombre) {

        this.nombre = nombre;

    }

    public String getMensaje() {
        return mensaje;
    }

    public void addIngrediente(Ingrediente ingrediente, Usuario usuario) {
        if (this.rolPermitido(Rol.getGerente(), usuario)) {
            this.ingrediente.add(ingrediente);
            this.mensaje = Mensaje.EXITO;
        } else {
            this.mensaje = Mensaje.ACCESO_DENEGADO;
        }
    }

    public void delIngrediente(Ingrediente ingrediente, Usuario usuario) {
        if (this.rolPermitido(Rol.getGerente(), usuario)) {
            this.ingrediente.remove(ingrediente);
            this.mensaje = Mensaje.EXITO;

        } else {
            this.mensaje = Mensaje.ACCESO_DENEGADO;
        }
    }

    public int getCalorias() {

        return this.calorias;
    }

    public double getPrecio() {
        return this.precio;
    }

    public List<Ingrediente> getIngredientes() {

        return this.ingrediente;
    }

    public String getTipoCasado() {
        return this.tipoCasado;
    }

    public void setCalorias(int calorias, Usuario usuario) {
        if (this.rolPermitido(Rol.getGerente(), usuario)) {
            this.calorias = calorias;
            this.mensaje = Mensaje.EXITO;
        } else {
            this.mensaje = Mensaje.ACCESO_DENEGADO;
        }
    }

    public void setPrecio(int precio, Usuario usuario) {
        if (this.rolPermitido(Rol.getGerente(), usuario)) {

            this.precio = precio;
            this.mensaje = Mensaje.EXITO;
        } else {
            this.mensaje = Mensaje.ACCESO_DENEGADO;
        }
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
