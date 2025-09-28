package tp.examen;

import java.util.*;

public class TeamDeveloper extends TeamMember{
    private String tecnologia;
    
    public TeamDeveloper(String nombre, String tecnologia){
        super(nombre);
        this.tecnologia = tecnologia;
    }
    
    public String getTechnology(){
        return tecnologia;
    }
    
    @Override
    public String getDuties(){
        return super.toString() + "," + "Desarrollo en " + getTechnology();
    }
    
}