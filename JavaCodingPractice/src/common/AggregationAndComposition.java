package common;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;
 
//============
// Aggregation
//============

class Student {
  String name;

  public Student(String name) {
    this.name = name;
  }

  public String toString() {
    return "name: " + name;
  }

}

class Dept {
  private String deptName;
  private List<Student> students;

  public Dept(String deptName, List<Student> students) {
    this.deptName = deptName;
    this.students = students;
  }

  public String toString() {
    return "[deptName: " + this.deptName + ", students: " + this.students + "]";
  }

  public static void main(String[] args) {
    Student student = new Student("Jack");
    Student student2 = new Student("John");
    List<Student> students = new ArrayList<>();
    students.add(student);
    students.add(student2);

    Dept dept = new Dept("CS", students);
    System.out.println(dept);
  }
}

/**
 * Composition
 */

@Data
class Room {
  private String type;

  public Room(String type) {
    this.type = type;
  }

  public String getType() {
    return type;
  }
}

@Data
class House {
  private List<Room> rooms;

  public House() {
    // House controls room creation [IMP]
    this.rooms = new ArrayList<Room>();
  }

  public List<Room> getRooms() {
    return rooms;
  }

  public void addRoom(Room room) {
    rooms.add(room);
  }

  public static void main(String[] args) {
    House house = new House();
    house.addRoom(new Room("Room 1"));
    house.addRoom(new Room("Room 2"));

    System.out.println(house.getRooms());
  }
}
