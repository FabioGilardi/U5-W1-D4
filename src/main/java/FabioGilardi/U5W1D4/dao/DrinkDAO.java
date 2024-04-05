package FabioGilardi.U5W1D4.dao;

import FabioGilardi.U5W1D4.entities.Drink;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DrinkDAO extends JpaRepository<Drink, Long> {
}
