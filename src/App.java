public class App {
    public static void main(String[] args) {
        PhoneBook phonebook = new PhoneBook();
        phonebook.put("Илья", "+7999");
        phonebook.put("Илья", "+7988");
        phonebook.put("Ксюша", "+7911");
        phonebook.put("Игорь Константинович", "+7918");
        phonebook.put("Игорь Константинович", "+7938");
        phonebook.put("Игорь Константинович", "+7939");

        System.out.println(phonebook);
        System.out.println(phonebook.size());
        phonebook.delContact("Ксюша");
        System.out.println(phonebook);
        System.out.println(phonebook.size());
        phonebook.clear();
        System.out.println(phonebook);
        System.out.println(phonebook.size());
        System.out.println(phonebook.empty());
    }
}