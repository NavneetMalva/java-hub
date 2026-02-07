package interview.accolite;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * ImmutableClassEx01.java
 * Created by Navneet Malva on 03/02/26 : 11:54.
 */


class Address {

}

public class ImmutableClassEx01 {
  private String name;
  private List<Address> addressList;

  public ImmutableClassEx01(String name, List<Address> addressList) {
    this.name = name;
    // defensive copy
    this.addressList = new ArrayList<>(addressList);
  }

  public String getName() {
    return name;
  }

  public List<Address> getAddressList() {
    // return unmodifiable copy
    return Collections.unmodifiableList(addressList);
  }

}


final class ImmutableClassEx02 {

  private final String name;
  private final List<Address> addresses;

  public ImmutableClassEx02(String name, List<Address> addresses) {
    this.name = name;
    this.addresses = List.copyOf(addresses);
  }

  public String getName() {
    return name;
  }

  public List<Address> getAddresses() {
    return addresses;
  }
}