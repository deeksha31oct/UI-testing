package july.metlife;

public class special {
    public static void main (String[]args) {
        String r = "dekho krna hi hoga385y3825894u$%^&&*(*(&)";
    for(char ct : r.toCharArray())
    {
        if(Character.isLetterOrDigit(ct))
        {
            System.out.print(ct);
        }
    }
    }
}
