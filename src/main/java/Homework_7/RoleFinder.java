package Homework_7;

public class RoleFinder {
    public static void main(String[] args) {
        User roma = new Admin("Рома", 32);
        User eugenia = new Customer("Євгенія", 32);

        System.out.println("Роль Роми: " + roma.getRole());
        System.out.println("Роль Євгенії: " + eugenia.getRole());

        if (roma instanceof Admin) {
            System.out.println("Рома - адмін");
        }

        if (eugenia instanceof Customer){
            System.out.println("Євшенія - клієнт");
        }

        }
    }
