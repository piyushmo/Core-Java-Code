public class YearData {
    private String year;
   // private String firstName;
    //private String lastName;
    private String couponCode;

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    /*public String getFirstName() {
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
    }*/

    public String getCouponCode() {
        return couponCode;
    }

    public void setCouponCode(String couponCode) {
        this.couponCode = couponCode;
    }

    @Override
    public String toString() {
        return "Email Id=" + year + ",Coupon Code=" + couponCode + "";
    }

}
