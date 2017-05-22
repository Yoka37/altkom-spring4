package pl.altkom.shop.repo;

import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Repository;

@Repository
public class InMemoryProductRepo implements ProductRepo {

	Logger log = Logger.getLogger(InMemoryProductRepo.class);

	Map<Long, Product> products = new HashMap<Long, Product>();

}
