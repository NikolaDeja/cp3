public class DrivingLicenceTest {
    public static void main(String[] args) {
        DrivingLicence dl = new DrivingLicence();

        dl.setName("Jan");
        dl.setSurname("Nowak");
        dl.setAddress("Ul.Mickiewicza 4");
        dl.setPostalCode("23-567");
        dl.setCity("Szczecin");
        dl.setDrivingLicenseNumber("234567");
        dl.setDrivingLicenseCategory("B");
        dl.setYear(2023);
        dl.display();

        System.out.println(dl.toString());
    }
}
