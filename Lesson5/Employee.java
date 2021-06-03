public class Employee {
    public String name;
    public String post;
    public String email;
    public String phoneNumber;
    public int salary;
    public int age;

    public int getAge() {
        return age;
    }

    public Employee(String name, String post, String email, String phoneNumber, int salary, int age) {
    this.name = name;
    this.post = post;
    this.email = email;
    this.phoneNumber = phoneNumber;
    this.salary = salary;
    this.age = age;
    }

    public void print() {
        System.out.println("Имя: " + name + " | " + " Должность: " + post + " | " + " e-mail: " + email + " | " +
                " Тел.: " + phoneNumber + " | " + " ЗП: " + salary + " | " + " Возраст: " + age);

    }
}
