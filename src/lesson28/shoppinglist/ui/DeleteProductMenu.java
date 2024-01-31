package lesson28.shoppinglist.ui;

import lesson28.shoppinglist.dto.ProductDto;
import lesson28.shoppinglist.dto.ResponseForClientAddProduct;
import lesson28.shoppinglist.dto.ResponseForClientForDelete;
import lesson28.shoppinglist.service.ProductService;
import lesson28.shoppinglist.service.util.UserInput;

import java.util.Scanner;

public class DeleteProductMenu implements MenuCommand{

    private final ProductService service;

    public DeleteProductMenu(ProductService service) {
        this.service = service;
    }

    @Override
    public void executeCommand() {

        Integer idFroDelete = UserInput.getInt("Please enter product id for delete:");

        ResponseForClientForDelete deleteResult = service.deleteById(idFroDelete);
        System.out.println(deleteResult);

    }

    @Override
    public String getMenuName() {
        return "Delete product";
    }

    @Override
    public boolean shouldExit() {
        return false;
    }
}
