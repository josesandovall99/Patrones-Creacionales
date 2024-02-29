/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udes.patronprototype;

/**
 *
 * @author JOSE SANDOVAL
 */
public class Usuario implements Prototype {
    
    private String nombres;
    private String apellidos;
    private int edad;
    private String estadoCivil;

    public Usuario(String nombres, String apellidos, int edad, String estadoCivil) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.edad = edad;
        this.estadoCivil = estadoCivil;
    }

    public Usuario() {
    }
    
    
                        
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
    
    
    
    
//    protected Usuario clone(){ //metodo para retornar clon de objeto usuario 
//    
//        Usuario ClonUsuario = new Usuario();
//        ClonUsuario.setNombres(this.nombres);
//        ClonUsuario.setApellidos(this.apellidos);
//        ClonUsuario.setEdad(this.edad);
//        ClonUsuario.setEstadoCivil(this.estadoCivil);
//
//        return ClonUsuario;
//    
//    }

    @Override
    public String toString() {
        return "Usuario{" + "nombres=" + nombres + ", apellidos=" + apellidos + ", edad=" + edad + ", estadoCivil=" + estadoCivil + '}';
    }

    @Override
    public Prototype clone() {
        Usuario ClonUsuario = new Usuario();
        ClonUsuario.setNombres(this.nombres);
        ClonUsuario.setApellidos(this.apellidos);
        ClonUsuario.setEdad(this.edad);
        ClonUsuario.setEstadoCivil(this.estadoCivil);

        return ClonUsuario;
    }
    
    
}
