package com.globalhitss.miingresohitss.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.globalhitss.miingresohitss.service.IProductoService;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
;
import java.nio.file.Paths;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/archivo")
public class ArchivoController {

    @Autowired
    private IProductoService productoService;

    public ArchivoController() {
    }

    @PostMapping
    @ResponseBody
    public boolean subirArchivo(@RequestParam MultipartFile archivo) throws Exception {
        String ruta = "src/main/resources/static/";
        Path path = Paths.get(ruta + archivo.getOriginalFilename());
        //File file = new File(ruta + archivo.getOriginalFilename());
        archivo.transferTo(path);
        /*
        String ruta = "/src/main/resources/static/";
        byte[] bytes = archivo.getBytes();
        Path path = Paths.get(ruta + archivo.getOriginalFilename());
        Files.write(path, bytes);
        */
        return true;
    }
}
