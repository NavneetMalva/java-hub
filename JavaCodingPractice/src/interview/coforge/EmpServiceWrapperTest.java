package interview.coforge;

import java.util.List;

/**
 * EmpServiceWrapperTest.java
 * Created by Navneet Malva on 09/01/26 : 19:51.
 * Write the unit test for the given method func1
 */

class EmpService {
  List<String> func2(int salary) {
    return null;
  }

  ;
}

class EmpServiceWrapper {

  private EmpService empSer;

  public EmpServiceWrapper(EmpService empSer) {
    this.empSer = empSer;
  }

  public String fun1(int salary) {
    List<String> empList = empSer.func2(salary); // list of emp who had salary greater that input salary
    return empList.get(0);
  }
}


/* Complete test code
public class EmpServiceWrapperTest {

  @Test
  void f1_test(){
    EmpService empSerMock = mock(EmpService.class);
    EmpServiceWrapper empSerWrapper = new EmpServiceWrapper(empSerMock);

    int inputSalary = 50000;
    when(empSerMock.func2(inputSalary)).thenReturn(List.of("John", "Rick"));

    String result = empSerWrapper.fun1(inputSalary);

    assertEquals("John", result);

  }

  void f1_emptyListTest(){
    EmpService empSerMock = mock(EmpService.class);
    EmpServiceWrapper empSerWrapper = new EmpServiceWrapper(empSerMock);

    when(empSerMock.func2(amyInt())).thenReturn(List.of());

    assertThrows(IndexOutOfBoundsException.class, () -> empSerWrapper.fun1(5000));
  }

}
*/

