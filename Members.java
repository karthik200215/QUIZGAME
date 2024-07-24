import java.util.Scanner;
public class Members {
    String name;
    public Members() {
		// TODO Auto-generated constructor stub
    	Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the name: ");
        this.name = scanner.nextLine();
	}

	public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}