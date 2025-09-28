package tp.examen;

import java.util.*;

public class TeamLeader extends TeamMember{
    private List<TeamMember> equipo;
    
    public TeamLeader(String nombre){
        super(nombre);
        this.equipo = new ArrayList<>();
    }
    
    public boolean isMember(TeamMember miembro){
        if (miembro == null){
            return false;
        }
        if (!(equipo.contains(miembro))){
            return false;
        }
        return true;
    }
    
    public boolean add(TeamMember miembro){
        if (miembro == null){
            return false;
        }
        if (!(miembro instanceof TeamDeveloper) && !(miembro instanceof TeamWriter)){
            return false;
        }
        if (equipo.contains(miembro)){
            return false;
        }
        equipo.add(miembro);
        return true;
    }
    
    public boolean remove(int id){
        Iterator<TeamMember> iterator = equipo.iterator();
        while(iterator.hasNext()){
            TeamMember miembro = iterator.next();
            if (miembro.getId() == id){
                iterator.remove();
                return true;
            }
        }
        return false;
    }
    
    public List<TeamMember> getMembers(){
        List<TeamMember> miembrosOrd = new ArrayList<>(equipo);
        miembrosOrd.sort(new Comparator<TeamMember>(){
            public int compare(TeamMember t1, TeamMember t2){
                int comp = t1.getName().compareTo(t2.getName());
                if (comp == 0){
                    return Integer.compare(t1.getId(), t2.getId());
                }
                return comp;
            }
        });
        return miembrosOrd;
    }
    
    @Override
    public String getDuties(){
        if (equipo == null || equipo.isEmpty()){
            return "Equipo vacío";
        }
        
        StringBuilder sb = new StringBuilder();
        sb.append("Responsable de:\n");
        
        List<TeamMember> miembrosList = new ArrayList<>(equipo);
        miembrosList.sort(new Comparator<TeamMember>(){
            public int compare(TeamMember t1, TeamMember t2){
                return Integer.compare(t1.getId(), t2.getId());
            }
        });
        
        for (TeamMember miembro: miembrosList){
            sb.append(miembro.getDuties()).append("\n");
        }
        return sb.toString();
    }
}


