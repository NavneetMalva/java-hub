package common.cmd;

public class PassCmdArgsEx01 {

  public static void main(String[] args) {
    if (args.length > 0) {
      for (int i = 0; i < args.length; i++) {
        System.out.println("arguments: " + (i + 1) + " " + args[i]);
      }
    } else {
      System.out.println("No args provided");
    }
  }

}
