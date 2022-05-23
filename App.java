class App {
  public static void main(String args[]) {
    String vin = "VIN: 0102030";
    String make = "Ford F-150";
    String color = "Black";
    String towing = "Towing package included";
    String quality = "Quality: A";
    String odometer = "Odometer: 1,400 miles";
    String price = "Price $48,000";

    StringBuilder vehicleInformation = new StringBuilder();
    vehicleInformation.append(vin);
    vehicleInformation.append(";" + make);
    vehicleInformation.append(";" + color);
    vehicleInformation.append(";" + towing);
    vehicleInformation.append(";" + quality);
    vehicleInformation.append(";" + odometer);
    vehicleInformation.append(";" + price);

    System.out.println(vehicleInformation);
  }
}
