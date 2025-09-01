import java.util.*;

public class Marks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Students: ");
        int n = sc.nextInt();

        for(int i=1;i<=n;i++){
            System.out.println("Student " + i);
            int p=sc.nextInt(), c=sc.nextInt(), m=sc.nextInt();
            double per=(p+c+m)/3.0;
            String g = per>=90?"A":per>=75?"B":per>=50?"C":"D";
            System.out.println("Marks:"+p+" "+c+" "+m+" %:"+per+" Grade:"+g);
        }
    }
}

