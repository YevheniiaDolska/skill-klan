package Homework_4;

class Test {
    public static void main(String[] args) {
        String expected = "Login successful";
        String actual = "Login successful";
        if (expected.equals(actual)) {
            System.out.println("Тест пройдено!");
        }
        else {
            System.out.println("Тест не пройдено:(");
        }
    }
}