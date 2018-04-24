import java.util.Scanner;
    public class VK {
        static Scanner take = new Scanner(System.in);

        static int AND(int a, int b) {
            if ((a <= 1) && (b <= 1)) {
                if ((a == 1) && (b == 1)) {
                    return 1;
                }
                else{
                    return 0;
                }
            } else {
                System.out.println("Wrong Input");
            }
            return -1;
        }

        static int OR(int a, int b) {
            if ((a <= 1) && (b <= 1)) {
                if ((a == 0) && (b == 0)) {
                    return 0;
                }
               else{
                    return 1;
                }
            } else {
                System.out.println("Wrong Input");
            }
            return -1;
        }

        static int NAND(int a, int b) {
            if ((a <= 1) && (b <= 1)) {
                if ((a == 1) && (b == 1)) {
                    return 0;
                }
                else{
                    return 1;
                }
            } else {
                System.out.println("Wrong Input ");
            }
            return -1;
        }

        static int XOR(int a, int b) {
            if ((a <= 1) && (b <= 1)) {
                if ((a == 1) && (b == 1)) {
                    return 0;
                }
                if ((a == 0) && (b == 0)) {
                    return 0;
                }
                else{
                    return 1;
                }
            } else {
                System.out.println("Wrong Input");
            }
            return -1;
        }


        public static void main(String[] args) {
            int n = 0;
            while (n < 6) {
                System.out.println("           Logic Gates           ");
                System.out.println("Select Gate Which You Want To Test");
                System.out.println(" 1. AND GATE");
                System.out.println(" 2. OR GATE");
                System.out.println(" 3. NAND");
                System.out.println(" 4. XOR");
                n = take.nextInt();
                System.out.println("Enter values of X and Y.");
                int x = take.nextInt();
                int y = take.nextInt();
                switch (n)

                {
                    case 1:
                        System.out.println(AND(x, y));
                        break;
                    case 2:
                        System.out.println(OR(x, y));
                        break;
                    case 3:
                        System.out.println(NAND(x, y));
                        break;
                    case 4:
                        System.out.println(XOR(x, y));
                        break;
                    default:
                        System.out.println("Wrong input");
                        break;

                }
            }
        }
    }

