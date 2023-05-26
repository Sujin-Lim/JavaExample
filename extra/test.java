package extra;

public class test {
    public static void main(String[] args) {
        AmigosCode ami = new AmigosCode("id", "sujin", 2023);
        int birthYear = ami.getBirthYear();
        String id = ami.getId();

        System.out.println(ami);
        System.out.println(birthYear);
        System.out.println(id);

    }
}
