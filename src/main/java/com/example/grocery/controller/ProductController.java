@RestController
@RequestMapping("/products")
public class ProductController {
    @Autowired
    private ProductService service;

    @GetMapping
    public List<Product> getProducts() {
        return service.getAll();
    }

    @PostMapping
    public Product addProduct(@RequestBody Product product) {
        return service.save(product);
    }
}

