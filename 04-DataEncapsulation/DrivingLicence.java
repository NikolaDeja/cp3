public class DrivingLicence {
    private String name;
    private String surname;
    private String address, postalCode, city, drivingLicenseNumber, drivingLicenseCategory;
    private int year;

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getAddress() {
        return address;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public String getCity() {
        return city;
    }

    public String getDrivingLicenseNumber() {
        return drivingLicenseNumber;
    }

    public String getDrivingLicenseCategory() {
        return drivingLicenseCategory;
    }

    public int getYear() {
        return year;
    }

    public void setName(String name) {
        char[] names = new char[name.length()];
        names=name.toCharArray();
        for(int i=0; i<=names.length; i++){
            if(i==0){
                names[i].toUpperCase();
            }
        }
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setDrivingLicenseNumber(String drivingLicenseNumber) {
        this.drivingLicenseNumber = drivingLicenseNumber;
    }

    public void setDrivingLicenseCategory(String drivingLicenseCategory) {
        this.drivingLicenseCategory = drivingLicenseCategory;
    }

    public void setYear(int year) {
        if(year>=1980 && year<=2024)
            this.year = year;
    }

    public String toString(){
        return "Name "+getName()+" Year "+getYear();
    }

    public void display(){
        System.out.println("Name: "+getName());
        System.out.println("Surname: "+getSurname());
        System.out.println("Address: "+getAddress());
        System.out.println("Postal Code: "+getPostalCode());
        System.out.println("City: "+getCity());
        System.out.println("Driving licence number: "+getDrivingLicenseNumber());
        System.out.println("Driving licence category: "+getDrivingLicenseCategory());
        System.out.println("Year: "+getYear());
    }
}
