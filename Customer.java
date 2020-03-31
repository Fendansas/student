package by.student;
//Список покуптелей в алфовитном порядке
// список покупателей у котрых номер карты находется в заданном диапазоне

public class Customer implements Comparable <Customer> {
    newId id = new newId();
    private String surname;
    private String name;
    private String patronymic;
    private String address;
    private Integer numberCard;
    private Integer bankAccountNumber;

    public Customer(String surname, String name, String patronymic, String address, Integer numberCard, Integer bankAccountNumber) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.address = address;
        this.numberCard = numberCard;
        this.bankAccountNumber = bankAccountNumber;
    }

    public newId getId() {
        return id;
    }

    public void setId(newId id) {
        this.id = id;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getNumberCard() {
        return numberCard;
    }

    public void setNumberCard(Integer numberCard) {
        this.numberCard = numberCard;
    }

    public Integer getBankAccountNumber() {
        return bankAccountNumber;
    }

    public void setBankAccountNumber(Integer bankAccountNumber) {
        this.bankAccountNumber = bankAccountNumber;
    }
    @Override
    public int compareTo(Customer o) {
        int result = this.surname.compareTo(o.surname);
        if(result == 0){
            result = this.numberCard.compareTo(o.numberCard);
        }
        return result;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", address='" + address + '\'' +
                ", numberCard=" + numberCard +
                ", bankAccountNumber=" + bankAccountNumber +
                '}'+"\n";
    }



}
   // @Override
//реализуем метод compareTo интерфейса Comparable
  //  public int compareTo(User o) {

//используем метод compareTo из класса String для сравнения имен
      //  int result = this.name.compareTo(o.name);

//если имена одинаковые -  сравниваем возраст,
      //  используя метод compareTo из класса Integer

       // if (result == 0) {
      //      result = this.age.compareTo(o.age);
     //   }
      //  return result;
    //}
