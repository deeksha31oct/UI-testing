package july.extra_july;

public class add_digitextract {
    public static void main(String[] args) {

            String s = "deeksha12kashyap34tester56sddsgds";
            int c = 0;
            StringBuilder sb = new StringBuilder();
            for(char ch : s.toCharArray())
            {
                if(Character.isDigit(ch))
                {
                    sb.append(ch);
                }else
                {
                    if(sb.length()>0)
                    {
                        c += Integer.parseInt(sb.toString());
                        sb.setLength(0);
                    }
                }
            }
            if(sb.length()>0)
                c += Integer.parseInt(sb.toString());
            System.out.println(c);
        }
    }

