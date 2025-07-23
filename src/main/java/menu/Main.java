package menu;

public class Main {
    public static void main(String[] args) {
        MenuService menuService = new MenuService();

        MenuItem pizza = new MenuItem(1, "Margherita", "Classic cheese pizza", 5.99, "Pizza", true);
        MenuItem burger = new MenuItem(2, "Veg Burger", "Spicy veggie patty", 3.49, "Burger", true);

        // CREATE
        menuService.addMenuItem(pizza);
        menuService.addMenuItem(burger);

        // READ
        System.out.println("Get menu item by ID:");
        System.out.println(menuService.getMenuItemById(1));

        // UPDATE
        MenuItem updatedPizza = new MenuItem(1, "Margherita Deluxe", "Cheese + Basil", 6.99, "Pizza", true);
        menuService.updateMenuItem(1, updatedPizza);

        // DELETE
        menuService.deleteMenuItem(2);

        // READ ALL
        System.out.println("All menu items:");
        menuService.getAllMenuItems();
    }
}
