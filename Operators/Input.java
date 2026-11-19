public class Input{
    public static void main(String[] args){
        java.util.Scanner r = new java.util.Scanner(System.in);


        String First_name , Second_name;

        First_name=r.next();
        Second_name=r.next();

        System.out.print("your full name is : " + First_name + " " + Second_name);
    }
}