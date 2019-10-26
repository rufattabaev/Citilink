package ru.itpark;

import ru.itpark.model.Notebook;
import ru.itpark.model.Smartphone;
import ru.itpark.repository.ProductRepository;
import ru.itpark.service.CitilinkService;


public class Main {
    public static void main(String[] args) {
        CitilinkService service = new CitilinkService(new ProductRepository());

        service.add(new Smartphone(
                0,
                "https://url",
                "Samsung Galaxy A10",
                "4.5 stars",
                9_990,
                true,
                "Smartphone",
                "Samsung",
                32,
                13,
                3400));

        service.add(new Smartphone(
                0,
                "https://url",
                "Xiaomi Mi A2",
                "4 stars",
                10_990,
                true,
                "Smartphone",
                "Xiaomi",
                64,
                20,
                3010));

        service.add(new Smartphone(
                0,
                "https://url",
                "Meizu Pro 7 Plus",
                "5 stars",
                17_990,
                true,
                "Smartphone",
                "Meizu",
                128,
                12,
                3500));

        service.add(new Smartphone(
                0,
                "https://url",
                "Apple iPhone 6plus",
                "0 stars",
                26_990,
                true,
                "Smartphone",
                "Apple",
                128,
                12,
                3000));

        service.add(new Smartphone(
                0,
                "https://url",
                "Apple iPhone 6plus",
                "0 stars",
                36_990,
                true,
                "Smartphone",
                "Apple",
                128,
                12,
                3000));

        service.add(new Notebook(
                0,
                "https://Url",
                "HP ProBook 430 G5",
                "0",
                59_230,
                true,
                "Notebook",
                13,
                "Intel Corei5",
                "Windows 10"));

        service.add(new Notebook(
                0,
                "https://Url",
                "DIGMA CITI E600",
                "4",
                15_180,
                true,
                "Notebook",
                15,
                "Intel Atom X5",
                "Windows 10"));

        service.add(new Notebook(
                0,
                "https://Url",
                "LENOVO V330-14IKB",
                "0",
                43_990,
                true,
                "Notebook",
                14,
                "Intel Corei5",
                "Windows 10"));

        //Удаляет по id
        service.deleteById(3);

//Поиск по названию без учёта категории
        System.out.println(service.searchByName("Apple"));
//Поиск по категории  по возрастающей цене
        System.out.println(service.searchByCategoryByPriceAsc("Smartphone"));

//Поиск по категории по убывающей цене
        System.out.println(service.searchByCategoryByPriceDesc("Smartphone"));

    }

}
