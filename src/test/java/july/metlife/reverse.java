package july.metlife;

public class reverse {
    public static void main (String[]args)
    {
        String[] r = "dekho krna hi hoga".split(" ");

        StringBuilder sb = new StringBuilder();
       for(int i =0;i<r.length;i+=2)
       {
     sb.append(new StringBuilder(r[i+1]).reverse()).append(" ");

       if(i==0)
       {
sb.append(r[i]);
       }else{sb.append(new StringBuilder(r[i]).reverse());}
       sb.append(" ");
    }
    System.out.println(sb.toString());}
}


