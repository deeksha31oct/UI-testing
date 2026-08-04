package july.mittal;

public class uppercase {
    public static void main(String[]args) {
        String st = "my java coDDing is not good DEEKSHha KASyap";
        StringBuilder sb = new StringBuilder();
        for(char k : st.toCharArray())
        {
            if(Character.isUpperCase(k))
            {
                sb.append(Character.toLowerCase(k));

            }
            else if (Character.isLowerCase(k))
            {
                sb.append(Character.toUpperCase(k));
            }
            else {
                sb.append(k);
            }
        }
        System.out.println(sb.toString());
    }
}
