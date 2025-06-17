@Service
public class ProductService {
    @Autowired
    private ProductRepository repo;

    public List<Product> getAll() {
        return repo.findAll();
    }

    public Product save(Product product) {
        return repo.save(product);
    }
}

