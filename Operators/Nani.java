// public class Nani{
//     public static void main(String[] args){
//         int n1=5;
//         String name = "sai";
//         System.out.println(n1);
//         System.out.println(name);

//     } 
// }



// public class Nani{
//     public static void main(String[] args){
//         int a=3 , b=5;
//         System.out.println(a);
//         System.out.println(a++); // post increment 
//         System.out.println(a);
//         System.out.println(++b);  // pre increment 
//        System.out.println(a + " " + a++ + " " + ++a );

//          System.out.println(a);
//         System.out.println(a--); // post decrement 
//         System.out.println(a);
//         System.out.println(--b); 


//     }
// }



public class Nani{

    int n1=5;
    int n2=6;
    public static void main(String[] args ){
       
        Nani n= new Nani();
        // Nani n1= new Nani();

        // System.out.println(n.n1);
        // System.out.println(++n.n1);
        // System.out.println(n.n1++);

        int var=9;
        int var2=8;
        // System.out.println(++var2);
        // System.out.println(!(var==var2));

        // System.out.println(--var);
        // System.out.println(!(var>var2));

        // System.out.println(++n.n1);
        // System.out.println(!(n.n1==n.n2));
        // System.out.println(++n.n1);
        // System.out.println(!(n.n1<n.n2));

        int p1,p2;
        p1=(var>var2)?var:var2;
        System.out.println(  "bigger value is " + p1);

        p2=(!(var>var2))?var:var2; 
         System.out.println(   "Small value is " + p2);
    }
}