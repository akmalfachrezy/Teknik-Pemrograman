
/**
 *
 * @author Akmal Faqih
 */
public class RestaurantMain {

    public static void main(String[] args) {
        Restaurant menu = new Restaurant();
        System.out.println("==== MENU ====");
        menu.tambahMenuMakanan("Bala-Bala", 1_000, 20);
        Restaurant.nextId();
        menu.tambahMenuMakanan("Gehu", 1_000, 20);
        Restaurant.nextId();
        menu.tambahMenuMakanan("Tahu", 1_000, 0);
        Restaurant.nextId();
        menu.tambahMenuMakanan("Molen", 1_000, 20);
        menu.tampilMenuMakanan();
        
        
        System.out.println("\n==== PESANAN ====");
        menu.pembelian("Bala-Bala", 5);
        menu.pembelian("Gehu", 8);
        menu.pembelian("Molen", 4);
        menu.pembelian("Tahu", 5);
    }
}
