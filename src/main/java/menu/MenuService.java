package menu;

import java.util.ArrayList;
import java.util.List;

public class MenuService {
    private List<MenuItem> menu = new ArrayList<>();

    //Create Menu
    public void addMenuItem(MenuItem menuItem){
        menu.add(menuItem);
        System.out.println("Menu Item added");
    }

    //Read By ID
    public MenuItem getMenuItemById(int id){
        for(MenuItem menuItem : menu){
            if(menuItem.getId() == id){
                return menuItem;
            }
        }
        return null;
    }

    // READ ALL
    public void getAllMenuItems() {
        for (MenuItem item : menu) {
            System.out.println(item);
        }
    }

    //Update Menu Item
    public void updateMenuItem(int id, MenuItem updateItem){
        for(MenuItem menuItem : menu){
            if(menuItem.getId() == id){
                menuItem.setName(updateItem.getName());
                System.out.println("Menu item updated.");
                return;
            }
        }
        System.out.println("Menu item not found.");
    }

    //Delete Menu Item
    public void deleteMenuItem(int id){
        MenuItem removeItem = null;
        for(MenuItem menuItem : menu){
            if(menuItem.getId() == id){
                removeItem = menuItem;
                break;
            }
        }
        if(removeItem != null){
            menu.remove(removeItem);
            System.out.println("Menu item deleted.");
        }else {
            System.out.println("Menu item not found.");
        }
    }
}
