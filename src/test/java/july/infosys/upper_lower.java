package july.infosys;

public class upper_lower {
    public static void main(String[]args) {
        String w = "deeksh RAJKUMAR geetanjali RAHUL khusbooA shutosh 287873";
        StringBuilder sb = new StringBuilder();
        for(char t : w.toCharArray())
        {
            if(Character.isLowerCase(t))
            {
                sb.append(Character.toUpperCase(t));
            }
            else if(Character.isUpperCase(t))
            {
                sb.append(Character.toLowerCase(t));
            }
            else {sb.append(t);
            }
        }
        System.out.println(sb.toString());

    }

}
