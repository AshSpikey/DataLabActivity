public class Main {
    public static void main(String[] args){
        Cereal cereal = new Cereal();
        System.out.println(cereal);

        Cereal badCereal = new Cereal("Bad", "F", 22, 400, 125, 12.5, 22.5, 123, 32, 55, 65, 22.5, 9.76548);
        System.out.println(badCereal);
    }
}