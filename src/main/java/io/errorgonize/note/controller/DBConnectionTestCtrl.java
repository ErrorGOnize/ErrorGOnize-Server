package io.errorgonize.note.controller;

import io.errorgonize.note.service.TestDAO;
import io.errorgonize.note.store.logic.TestDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class DBConnectionTestCtrl {
    @Autowired
    private TestDAO testDAO;

    @GetMapping("/hello")
    public List<TestDTO> HelloWorld() {
        return testDAO.getTestData();
    }
}
