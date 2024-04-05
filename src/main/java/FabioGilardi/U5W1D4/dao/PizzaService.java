package FabioGilardi.U5W1D4.dao;

import FabioGilardi.U5W1D4.entities.Pizza;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PizzaService {
    @Autowired
    private PizzaDAO pizzaDAO;

    public void save(Pizza pizza) {
        pizzaDAO.save(pizza);
        System.out.println("Pizza " + pizza.getId() + " has been saved correctly");
    }
}
