package com.example.module_4_minitest_3012.controller;

import com.example.module_4_minitest_3012.model.Blog;
import com.example.module_4_minitest_3012.model.City;
import com.example.module_4_minitest_3012.model.Nation;
import com.example.module_4_minitest_3012.service.ICityService;
import com.example.module_4_minitest_3012.service.INationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.Optional;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/cities")
public class CityController {
    @Autowired
    INationService iNationService;
    @Autowired
    ICityService iCityService;

    @GetMapping("/list")
    public ResponseEntity<Iterable<City>> list() {
        return new ResponseEntity<>(iCityService.findAll(), HttpStatus.OK);
    }
    @GetMapping("/nation")
    public ResponseEntity<Iterable<Nation>> listNation() {
        return new ResponseEntity<>(iNationService.findAll(), HttpStatus.OK);
    }
    @GetMapping("/findOne/{id}")
    public ResponseEntity<Optional<City>> findOne(@PathVariable Long id) {
        return new ResponseEntity<>(iCityService.findById(id), HttpStatus.OK);
    }
    @PostMapping("/add")
    public ResponseEntity<City> add(@RequestBody City city){
        iCityService.save(city);
        return new ResponseEntity<>(city,HttpStatus.OK);
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<City> delete(@PathVariable Long id) {
        iCityService.remote(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    @PutMapping("/edit/{id}")
    public ResponseEntity<Optional<City>> edit(@PathVariable Long id, @RequestBody City city) {
        Optional<City> cityOptional = iCityService.findById(id);
        city.setId(cityOptional.get().getId());
        iCityService.save(city);
        return new ResponseEntity<>(cityOptional, HttpStatus.OK);
    }
}
