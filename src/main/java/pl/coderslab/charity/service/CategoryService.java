package pl.coderslab.charity.service;

import org.springframework.stereotype.Service;
import pl.coderslab.charity.model.Category;

import java.util.List;


public interface CategoryService {

    List<Category> findAllCategory();

}
