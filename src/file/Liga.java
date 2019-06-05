/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package file;
import java.util.*;
import java.io.*;
/**
 *
 * @author mrincono
 */
public class Liga {
    private String nombre;
    private ArrayList<Equipo>teams;

    public Liga(String nombre) {
        this.nombre = nombre;
        this.teams = new ArrayList<>();
    }
 public void añadirEquipo(String n){
 Equipo e= new Equipo(n);
     this.teams.add(e);

 }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Equipo> getTeams() {
        return teams;
    }

    public void setTeams(ArrayList<Equipo> teams) {
        this.teams = teams;
    }


}
