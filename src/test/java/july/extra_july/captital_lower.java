package july;

public class captital_lower {
    public static void main (String []args)
    {
        String tt= "DeeKSHA kASHyap dekha TO hai NA";
        StringBuilder sb = new StringBuilder();
        for( char cp : tt.toCharArray())
        {
            if(Character.isUpperCase(cp))
            {
                sb.append(Character.toLowerCase(cp));
            }
            else if (Character.isLowerCase(cp))
            {
                sb.append(Character.toUpperCase(cp));
            }
            else{sb.append(cp);
            }

        }
        System.out.println(sb.toString());
    }
}
