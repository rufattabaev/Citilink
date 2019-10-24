package ru.itpark.service;

import ru.itpark.model.Product;
import ru.itpark.repository.ProductRepository;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class CitilinkService {
    private final ProductRepository repository;

    public CitilinkService(ProductRepository repository) {
        this.repository = repository;
    }

    //Добавляет продукт
    public void add(Product product) {
        if (product.getId() != 0) {
            throw new IllegalArgumentException("Id must be zero");
        }
        if (product.getImageUrl() == null) {
            throw new IllegalArgumentException("Download image");
        }
        if (product.getName() == null) {
            throw new IllegalArgumentException("Product must have name");
        }
        if (product.getPrice() == 0) {
            throw new IllegalArgumentException("Set price");
        }
        repository.save(product);
    }

    // Удаляет по id
    public void deleteById(int id) {
        if (id != 0) {
            repository.delete(id);
        }
    }

    //сортировка по категории по возрастающей цене
    public List<Product> searchByCategoryByPriceAsc(String category) {
        List<Product> result = new LinkedList<>();
        for (Product product : repository.getAll()) {
            if (product.getCategory().contains(category)) {
                result.add(product);
                result.sort(Comparator.comparingInt(Product::getPrice));
            }
        }
        return result;
    }

    //сортировка по категории по убывающей цене
    public List<Product> searchByCategoryByPriceDesc(String category) {
        List<Product> result = new LinkedList<>();
        for (Product product : repository.getAll()) {
            if (product.getCategory().contains(category)) {
                result.add(product);
                result.sort((o1, o2) -> -(o1.getPrice() - o2.getPrice()));
            }
        }
        return result;
    }

    //Поиск по названию по всем категориям по алфавиту по возрастающей цене
    public List<Product> searchByName(String name) {
        List<Product> result = new LinkedList<>();
        for (Product product : repository.getAll()) {
            if (product.getName().contains(name)) {
                result.add(product);
                result.sort(Comparator.comparingInt(Product::getPrice));
                result.sort((o1, o2) -> o1.getName().compareToIgnoreCase(o2.getName()));
            }
        }
        return result;
    }

}
