package designpattern.prototypedesign;

// creational design

/**
 * The Prototype design pattern is a creational pattern that allows you to create new objects by copying existing ones.
 * Instead of creating objects from scratch, it uses a "prototype" instance and clones it to generate new instances.
 * This is especially useful when creating a new object is costly in terms of resources or time.
 *
 * Scenario
 * Imagine you have different types of documents, like a Resume and a Report, each with predefined fields.
 * Instead of creating these documents from scratch every time, you can create prototypes of each type and clone them as needed,
 * allowing quick creation of documents with default values.
 */

public class PrototypeDesignMain {
    public static void main(String[] args) {
        // Creating original documents
        Resume originalResume = new Resume("Developer Resume", "This is a template for a developer resume.");
        Report originalReport = new Report("Annual Report", "This is a template for an annual report.");

        // Cloning the documents
        Document clonedResume = originalResume.cloneDocument();
        Document clonedReport = originalReport.cloneDocument();

        ((Resume)clonedResume).setTitle("Senior Developer Resume");

        // Print original and cloned documents
        System.out.println("Original Resume:");
        originalResume.print();
        System.out.println("\nCloned Resume:");
        clonedResume.print();


        System.out.println("\nOriginal Report:");
        originalReport.print();
        System.out.println("\nCloned Report:");
        clonedReport.print();
    }
}
