
class LifeLine {
	boolean fiftyfifty=false;
	boolean audience=false;

	public void fiftyfifty(String Option) {
		if(!fiftyfifty) {
			System.out.println("50-50 life line : removes two incorrect options"+Option);
			fiftyfifty =true;
		}
		else {
			System.out.println("You have already Used this life line");
		}
	}
	public void audience(String option,String message) {
		if(!audience) {
			System.out.println("Audience Poll lifeline: The audience's most popular answer will be displayed."+option+message);
		}
		else {
			System.out.println("You have already Used this life line");
		}
	}
}