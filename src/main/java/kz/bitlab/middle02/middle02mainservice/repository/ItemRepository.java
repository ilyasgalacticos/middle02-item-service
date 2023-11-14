package kz.bitlab.middle02.middle02mainservice.repository;

import kz.bitlab.middle02.middle02mainservice.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepository extends JpaRepository<Item, Long> {
}