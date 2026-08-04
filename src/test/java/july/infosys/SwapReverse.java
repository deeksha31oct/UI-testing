package july.infosys;

public class SwapReverse {
    public static void main(String[] args) {
        String[] w = "selenium and rest assured".split(" ");
        StringBuilder out = new StringBuilder();
for(int i =0;i<w.length;i+=2)
{
    out.append(new StringBuilder(w[i+1]).reverse()).append(" ");
    if( i==0)
    {
        out.append(w[i]);
    }else {out.append(new StringBuilder(w[i]).reverse());}out.append(" ");
}
System.out.println(out.toString().trim());
    }}