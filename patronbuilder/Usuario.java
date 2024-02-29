/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udes.patronbuilder;

/**
 *
 * @author JOSE SANDOVAL
 */
public class Usuario implements BuilderUsuario{
    
    private String nombres;
    private String apellidos;
    private int edad;
    private String estadoCivil;
    private String Direccion;

//    public Usuario(Builder cons) {
//        this.nombres = cons.nombres;
//        this.apellidos = cons.apellidos;
//        this.edad = cons.edad;
//        this.estadoCivil = cons.estadoCivil;
//        this.Direccion = cons.Direccion;
//    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }
    
    
//    public static class Builder {
//    
//    private String nombres;
//    private String apellidos;
//    private int edad;
//    private String estadoCivil;
//    private String Direccion;
//
//        public Usuario.Builder nombres(String nombres) {
//            this.nombres = nombres;
//            return this;
//        }
//
//        public Usuario.Builder Apellidos(String apellidos) {
//            this.apellidos = apellidos;
//            return this;
//        }
//
//        public Usuario.Builder Edad(int edad) {
//            this.edad = edad;
//            return this;
//        }
//
//        public Usuario.Builder EstadoCivil(String estadoCivil) {
//            this.estadoCivil = estadoCivil;
//            return this;
//        }
//
//        public Usuario.Builder Direccion(String Direccion) {
//            this.Direccion = Direccion;
//            return this;
//        }
//    
//        public Usuario build(){
//        
//            return new Usuario(this);
//        }
//    
//    
//    
//    
//    } 

    @Override
    public String nombres() {
        x   
    }

    @Override
    public String apellidos() {
    }

    @Override
    public String estadoCivil() {
    }

    @Override
    public String direccion() {
    }

    @Override
    public int edad() {
    }
    
}
