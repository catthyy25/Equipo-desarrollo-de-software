package tp.examen;

public class TeamMemberUtils {
    private static int currentId = 1;
    
    public static int getUniqueId() {
        return currentId++;
    }
}