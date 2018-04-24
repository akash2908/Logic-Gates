import java.util.Scanner;

public class vm{

    static boolean And(boolean x,boolean y)
    {
        if(x==true)
            if (y==true)
                return true;
            else
                return false;
        else
            return false;
    }
    /* OR GATE */
    public static boolean Or(boolean x,boolean y)
    {
        if(x==true)
            return true;
        else if (y==true)
            return true;
        else
            return false;
    }
    /* NOT GATE */
    public static boolean Not(boolean y)
    {
        if(y==true)
            return false;
        else
            return true;
    }
    /* NAND GATE */
    public static boolean Nand(boolean x,boolean y)
    {
        return Not(And(x,y));
    }
    /* NOR GATE */
    public static boolean Nor(boolean x,boolean y)
    {
        return Not(Or(x,y));
    }
    /* XOR GATE */
    public static boolean Xor(boolean x,boolean y)
    {
        int count=0;
        if(x==true)
            count++;
        if(y==true)
            count++;
        if(count%2!=0)
            return true;
        else
            return false;
    }


    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two values");
        boolean x,y;
        x=sc.nextBoolean();
        y=sc.nextBoolean();
        int cont=1;
        while(cont==1)
        {
            System.out.println("Enter 1 -> Not\nEnter 2 -> And\nEnter 3 -> Or\nEnter 4 -> Nand\nEnter 5 -> Nor\nEnter 6 -> Xor\nEnter 7 -> Xnor\n");
            int choice=sc.nextInt();
            switch(choice)
            {
                case 1:
                    System.out.println(Not(y));
                    break;
                case 2:
                    System.out.println(And(x,y));
                    break;
                case 3:
                    System.out.println(Or(x,y));
                    break;
                case 4:
                    System.out.println(Nand(x,y));
                    break;
                case 5:
                    System.out.println(Nor(x,y));
                    break;
                case 6:
                    System.out.println(Xor(x,y));
                    break;
                default:
                    System.out.println("WRONG!" +
                            "; Try Again");
                    break;
            }
            System.out.println("To perform Again -> Click On Button 1");
            cont=sc.nextInt();
        }
    }
}