package learn.study.entity;

/**
 * Created by vinod on 4/1/2017.
 */
public class phone {


    private String firstName;
    private String lastName;

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    private  String mobileNumber;
    private String landLineNumber;
    private String email;
    private String genter;
    private String month;
    private String day;
    private String year;
    private String company;
    private String jobTitle;

    public phone(){

    }

    public phone(String firstName, String lastName,String mobileNumber, String landLineNumber, String email, String genter, String month, String day, String year, String company, String jobTitle) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.mobileNumber=mobileNumber;
        this.landLineNumber = landLineNumber;
        this.email = email;
        this.genter = genter;
        this.month = month;
        this.day = day;
        this.year = year;
        this.company = company;
        this.jobTitle = jobTitle;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLandLineNumber() {
        return landLineNumber;
    }

    public void setLandLineNumber(String landLineNumber) {
        this.landLineNumber = landLineNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGenter() {
        return genter;
    }

    public void setGenter(String genter) {
        this.genter = genter;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }


}
