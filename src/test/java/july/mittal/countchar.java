package july.mittal;

public class countchar {
    public static void main(String[]args) {
        String st = "my java coDDing is not good DEEKSHha KASyap".replaceAll(" ","");
        while(!st.isEmpty())
        {
            char cg = st.charAt(0);
            int dk = st.replaceAll(String.valueOf(cg),"").length();
            System.out.println("character: "+String.valueOf(cg)+ " repeat : "+ (st.length()-dk));
            st = st.replaceAll(String.valueOf(cg),"");
        }

    }
}
