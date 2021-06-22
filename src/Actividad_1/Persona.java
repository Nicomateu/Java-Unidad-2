/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Actividad_1;

/**
 *
 * @author Mateu
 */
public class Persona {
    private String nombre;
    private String apellido;
    private String hobbie;
    private String editor_codigo;
    private String sistema_operativo;
    private int edad;

    public Persona(String nombre, String apellido, String hobbie, String editor_codigo, String sistema_operativo, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.hobbie = hobbie;
        this.editor_codigo = editor_codigo;
        this.sistema_operativo = sistema_operativo;
        this.edad = edad;
    }

    public String getApellido() {
        return apellido;
    }

    public String getHobbie() {
        return hobbie;
    }

    public int getEdad() {
        return edad;
    }

    public String getEditor_codigo() {
        return editor_codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getSistema_operativo() {
        return sistema_operativo;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setEditor_codigo(String editor_codigo) {
        this.editor_codigo = editor_codigo;
    }

    public void setHobbie(String hobbie) {
        this.hobbie = hobbie;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSistema_operativo(String sistema_operativo) {
        this.sistema_operativo = sistema_operativo;
    }

    public String toString() {
        return "\u001B[31m"+"Nombre: "+this.getNombre()+"\n"+
                "\u001B[31m"+"Apellido: "+this.getApellido()+"\n"+
                "\u001B[31m"+"Edad: "+this.getEdad()+"\n"+
                "\u001B[31m"+"Hobbie: "+this.getHobbie()+"\n"+
                "\u001B[31m"+ "Editor de Codigo: "+this.getEditor_codigo()+"\n"+
                "\u001B[31m"+"Sistema Operativo: "+this.getSistema_operativo()+"\n";
    }
    
    
    
    
            
    
    
    
    
}
