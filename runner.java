public class runner{
    public static void main(String[]args){

        //Santhosh's Comments
        //I learned how to use GitHub and GitKraken to work together on a project by pushing and pulling as well as making and merging pull requests.

        InterfaceA partnerA = (a,b)-> {
            System.out.printf("'%.3f'%n",a/b);
        };
        partnerA.returnQuotient(5f, 3f);
        
        InterfaceB partnerB = (a)->{
            return (a == (Math.sqrt(a)*Math.sqrt(a)));
        };
        System.out.println(partnerB.isPerfectSquare(4f));


    }
     interface InterfaceA{
        public void returnQuotient(float a, float b);
    }
    interface InterfaceB{
        public boolean isPerfectSquare(float a);
    }
}