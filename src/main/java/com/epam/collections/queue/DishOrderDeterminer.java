package com.epam.collections.queue;

import java.util.ArrayList;
import java.util.List;

public class DishOrderDeterminer {
    public List<Integer> determineDishOrder(int numberOfDishes, int everyDishNumberToEat) {
        List<Integer> result = new ArrayList<>();
        
        if (numberOfDishes <= 0) {
            return result;
        }
        
        List<Integer> dishes = new ArrayList<>();
        for (int i = 1; i <= numberOfDishes; i++) {
            dishes.add(i);
        }
        
        int currentIndex = 0;
        while (!dishes.isEmpty()) {
            currentIndex = (currentIndex + everyDishNumberToEat - 1) % dishes.size();
            
            result.add(dishes.remove(currentIndex));
        }
        
        return result;
    }
}
