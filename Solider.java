public class Solider {

    int number, rank, quater;
    String endDate, phoneNumber, name;

    public Solider(int number, String name, int rank, int quater, String endDate, String phoneNumber) {
        super();
        this.number = number;
        this.name = name;
        this.rank = rank;
        this.quater = quater;
        this.endDate = endDate;
        this.phoneNumber = phoneNumber;
	  }
    public String toString() {
      return "Solider [번호=" + number + ", 이름=" + name + ", 분기=" + quater + ", 계급="
          + rank + ", 전역일=" + endDate + ", 전화번호=" + phoneNumber + "]";
    }

    public int getNumber() {
      return number;
    }
  
    public void setNumber(int number) {
      this.number = number;
    }
  
    public int getRank() {
      return rank;
    }
  
    public void setRank(int rank) {
      this.rank = rank;
    }
    public void setName(String name) {
      this.name = name;
    }
    public String getNAme() {
      return name;
    }
    public int getQuater() {
      return quater;
    }
    public void setQuater(int quater) {
      this.quater = quater;
    }
    public String getEndDate() {
      return endDate;
    }
    public void setEndDate(String endDate) {
      this.endDate = endDate;
    }
    public String getPhoneNumber() {
      return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
      this.phoneNumber = phoneNumber;
    }

}
