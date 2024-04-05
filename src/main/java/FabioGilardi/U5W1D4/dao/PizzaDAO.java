package FabioGilardi.U5W1D4.dao;

import FabioGilardi.U5W1D4.entities.Pizza;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PizzaDAO extends JpaRepository<Pizza, Long> {
}
