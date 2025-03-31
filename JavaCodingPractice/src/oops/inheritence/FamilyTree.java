package oops.inheritence;

class GrandFather {

  String grandFatherName;

  public GrandFather(String grandFatherName) {
    this.grandFatherName = grandFatherName;
  }
}

class Father extends GrandFather {

  String fatherName;

  public Father(String fatherName, String grandFatherName) {
    super(grandFatherName);
    this.fatherName = fatherName;
  }
}

class Son extends Father {

  String sonName;

  public Son(String sonName, String fatherName, String grandFatherName) {
    super(fatherName, grandFatherName);
    this.sonName = sonName;
  }

  public void printName() {
    System.out.println("sonname: " + sonName + "\nfathername: " + fatherName + "\ngrandfather: "
        + grandFatherName);
  }
}

class FamilyTree {

  public static void main(String args[]) {
    Son s1 = new Son("Saurabh", "Ramesh", "Suresh");
    s1.printName();
  }
}