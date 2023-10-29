package com.example.demo.controller;

        import com.example.demo.model.Employe;
        import com.example.demo.repository.EmployeRepository;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.web.bind.annotation.*;

        import java.util.List;

        @RestController
        @RequestMapping("/api/employes")
        public class EmployeController {
            @Autowired
            private EmployeRepository employeRepository;

            @GetMapping
            public List<Employe> getAllEmployes() {
                return employeRepository.findAll();
            }

            @PostMapping
            public Employe createEmploye(@RequestBody Employe employe) {
                return employeRepository.save(employe);
            }

            // Autres méthodes CRUD
        }