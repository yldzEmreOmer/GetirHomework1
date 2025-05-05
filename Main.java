import java.util.List;

public class Main {

    public static void main(String[] args) {
        HouseRepository repository = new HouseRepository();
        HouseService service = new HouseService(repository);

        System.out.println("Total price of houses: " + service.getTotalPriceOfHouses() + "₺");
        System.out.println("Total price of villas: " + service.getTotalPriceOfVillas() + "₺");
        System.out.println("Total price of summer houses: " + service.getTotalPriceOfSummerHouses() + "₺");
        System.out.println("Total price of all properties: " + service.getTotalPriceOfAllProperties() + "₺");
        System.out.println();

        System.out.println("Average size of houses: " + service.getAverageSquareMetersOfHouses() + " m²");
        System.out.println("Average size of villas: " + service.getAverageSquareMetersOfVillas() + " m²");
        System.out.println("Average size of summer houses: " + service.getAverageSquareMetersOfSummerHouses() + " m²");
        System.out
                .println("Average size of all properties: " + service.getAverageSquareMetersOfAllProperties() + " m²");
        System.out.println();

        int room = 4, livingRoom = 1;
        List<House> filtered = service.filterByRoomAndLivingRoom(room, livingRoom);
        System.out.println("Properties with " + room + " rooms and " + livingRoom + " living room:");
        filtered.forEach(System.out::println);
    }
}
