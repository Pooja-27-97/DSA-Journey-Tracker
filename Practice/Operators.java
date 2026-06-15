public class Operators {
    public static void main(String[] args) {

        //Print reverse of a number
        int num = 123456;
        int original = num;
        int reverse = 0;
        while(num > 0) {
            int lastdigit = num % 10;
            reverse = (reverse * 10) + lastdigit;
            num /= 10;
        }
        System.out.println("Original: " + original);
        System.out.println("Reverse: "+ reverse);
        
        // int x = 2, y = 5;
        // int exp1 = (x * y / x); //5
        // int exp2 = (x * (y / x)); //4
        // System.out.print(exp1 + " , ");
        // System.out.print(exp2);

        // int x = 200, y = 50, z = 100;
        // if(x > y && y > z){
        //     System.out.println("Hello");
        // }
        // if(z > y && z < x){
        //     System.out.println("Java");
        // }
        // if((y+200) < x && (y+150) < z){
        //     System.out.println("Hello Java");
        // }

        // int x, y, z;
        // x = y = z = 2;
        // x += y; //x = 4
        // y -= z; //y = 0
        // z /= (x + y); //z = 0
        // System.out.println(x + " " + y + " " + z);

        // int x = 9, y = 12;
        // int a = 2, b = 4, c = 6;
        // int exp = 4/3 * (x + 34) + 9 * (a + b * c) + (3 + y * (2 + a)) / (a + b*y);
        // System.out.println(exp);

        // int x = 10, y = 5;
        // int exp1 = (y * (x / y + x / y)); //20
        // int exp2 = (y * x / y + y * x / y); //20
        // System.out.println(exp1);
        // System.out.println(exp2);
    }
}
