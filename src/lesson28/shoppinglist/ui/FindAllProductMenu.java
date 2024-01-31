package lesson28.shoppinglist.ui;

import lesson28.shoppinglist.dto.ProductDto;
import lesson28.shoppinglist.dto.ResponseForClientAddProduct;
import lesson28.shoppinglist.dto.ResponseForClientFindAllProducts;
import lesson28.shoppinglist.service.ProductService;

import java.util.Scanner;

public class FindAllProductMenu implements MenuCommand{

    private final ProductService service;

    public FindAllProductMenu(ProductService service) {
        this.service = service;
    }

    @Override
    public void executeCommand() {

        ResponseForClientFindAllProducts findAllResult = service.findAll();
        System.out.println(findAllResult);

    }

    @Override
    public String getMenuName() {
        return "Find all products";
    }

    @Override
    public boolean shouldExit() {
        return false;
    }
}
