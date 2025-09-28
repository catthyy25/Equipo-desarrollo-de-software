package tp.examen;

import java.util.*;

public class TeamWriter extends TeamMember{
    
    public TeamWriter(String nombre){
        super(nombre);
    }
    
    @Override
    public String getDuties(){
        return super.toString() + "," + "Redactar documentación";
    }
    
}