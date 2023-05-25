package ch12;

public class Map2Demo {
    public static void main(String[] args) {
        Nation.nations.stream().map(Nation::getName).forEach(Util::printWithParenthesis);
        System.out.println();

        Nation.nations.stream().mapToInt(Nation::getGdpRank).forEach(Util::print);
    }
}
