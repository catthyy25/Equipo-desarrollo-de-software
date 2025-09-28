package tp.examen;

import java.util.*;

/**
 * Esta clase representa roles que se encuentran en el equipo.
 * @author: Cathaysa Moreno.
 * @version: 28/09/2025-17:38
 */
public abstract class TeamMember{
    private int id;
    private String nombre;
    
    /**
     * Constructor de la clase TeamMember.
     * @param nombre: Nombre de la persona.
     * @param id: ID de la persona.
     */
    public TeamMember(String nombre){
        this.nombre = nombre;
        this.id = TeamMemberUtils.getUniqueId();
    }
    
    /**
     * Metodo getter para obtener el ID de la persona.
     * @return id.
     */
    public int getId(){
        return id;
    }
    
    /**
     * Metodo getter para obtener el nombre de la persona.
     * @return nombre.
     */
    public String getName(){
        return nombre;
    }
    
    /**
     * Metodo para devolver una ristra con informacion.
     * @return ristra.
     */
    public String toString(){
        return getId() + "," + getName();
    }
    
    /**
     * Metodo que devuelve una cadena de texto.
     */
    public abstract String getDuties();
    
    @Override
    public boolean equals(Object obj){
        if (this == obj){
            return true;
        }
        if (this == null || !(obj instanceof TeamMember)){
            return false;
        }
        TeamMember other = (TeamMember) obj;
        return this.getId() == other.getId();
    }
    
    @Override
    public int hashCode(){
        return Objects.hash(getId(), getName());
    }
    
    public int compareTo(TeamMember other){
        return Integer.compare(this.getId(), other.getId());
    }
}