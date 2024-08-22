package common.cmd;

public class PassCmdArgsEx02 {

	public static void main(String[] args) {

		if (args.length == 2) {

			try {
				int n1 = Integer.parseInt(args[0]);
				int n2 = Integer.parseInt(args[1]);
				System.out.println("Sum of pass two args: " + (n1 + n2));

			} catch (NumberFormatException ex) {
				System.out.println("Enter the Integer Numbers only.");
				System.out.println(ex.getMessage());
			} catch (Exception e) {
				e.printStackTrace();
			}

		} else {
			System.out.println("Enter two valid integers");
		}

	}

}
