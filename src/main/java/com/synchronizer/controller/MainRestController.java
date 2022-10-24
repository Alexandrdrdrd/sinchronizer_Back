package com.synchronizer.controller;


import com.fasterxml.jackson.databind.JsonNode;
import com.synchronizer.builder_service.TableMetadataBuilderService;
import com.synchronizer.entity.Table;


import com.synchronizer.entity.TableMetadata;
import com.synchronizer.repository.ColumnRepository;
import com.synchronizer.repository.TableRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api")
public class MainRestController {

    @Autowired
    TableMetadataBuilderService tableMetadataBuilderService;


    @GetMapping("/get_data")
    @CrossOrigin(origins = "http://localhost:3000")
    public List<TableMetadata> getDataFromDB() {
           System.out.println( tableMetadataBuilderService.build());
        return tableMetadataBuilderService.build();
    }

    @PostMapping("/post_data")
    @CrossOrigin(origins = "http://localhost:3000")
    public List<TableMetadata> getDataFromClient(@RequestBody  List<TableMetadata> list ) {
        System.out.println(list);
        return null;

    }

}
