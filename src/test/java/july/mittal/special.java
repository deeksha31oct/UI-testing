package july.mittal;

public class special {
    public static void main(String[]args) {
        String st = "myname11233@#$%^deeDDDwww132#@&^!@#123@!@#6788";
        StringBuilder db = new StringBuilder();
        for(char ct : st.toCharArray())
        {
            if(!Character.isLetterOrDigit(ct))
            {
                db.append(ct);
            }
        }
        System.out.println(db.toString());
    }
}
