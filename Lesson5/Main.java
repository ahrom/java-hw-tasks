public class Main {
    public static void main(String[] args) {
        Employee[] employeeArray = new Employee[5];
        employeeArray[0] = new Employee("Ivanov Ivan", "Java Developer", "java1@mail.ru", "89279111", 37000, 45);
        employeeArray[1] = new Employee("Petrov Petr", "Teamlead", "teamdlead@mail.ru", "89279222", 39000, 44);
        employeeArray[2] = new Employee("Morozov Kirill", "QA-Engineer", "qa1@mail.ru", "89279333", 38000, 35);
        employeeArray[3] = new Employee("Danilov Nik", "Java Developer", "java2@mail.ru", "89279344", 38000, 35);
        employeeArray[4] = new Employee("Dmitriev Dima", "QA-Engineer", "qa2@mail.ru", "89279555", 38000, 28);

        for (int i = 0; i < employeeArray.length; i++) {
            if (employeeArray[i].getAge() > 40) {
                employeeArray[i].print();
            }
        }
    }
}
