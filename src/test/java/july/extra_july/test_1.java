package july.extra_july;

public class test_1 {
    public static void main(String[]args) {
        String r = "DEEksha Kashyap IS VEREY SMART and working as automation engineer 31/10/1995";
        StringBuilder sb = new StringBuilder();
        for(char ct : r.toCharArray()) {
        if(Character.isUpperCase(ct))
        {
            sb.append(Character.toUpperCase(ct));
        } else if (Character.isLowerCase(ct)) {
            sb.append(Character.toLowerCase(ct));

        }else {sb.append(ct);

        }
    }
    System.out.println(sb.toString());}

    }


