public class PartnerB{
	public static void main(String[] args){

	InterfaceB partnerB = (a)->{
	            return (a == (Math.sqrt(a)*Math.sqrt(a)));
	        };
        System.out.println(partnerB.isPerfectSquare(4f));


	}
}