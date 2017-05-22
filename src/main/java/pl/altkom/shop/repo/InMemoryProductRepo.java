package pl.altkom.shop.repo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Primary
@Repository
public class InMemoryProductRepo implements ProductRepo {

}
