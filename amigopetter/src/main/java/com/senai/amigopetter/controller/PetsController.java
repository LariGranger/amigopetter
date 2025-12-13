package com.senai.amigopetter.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.senai.amigopetter.model.Pets;
import com.senai.amigopetter.model.enums.Disponibilidade;
import com.senai.amigopetter.service.PetsService;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping("/pets")
public class PetsController {
    @Autowired
    private PetsService petsService;

    // listar pets
    @GetMapping
    public ResponseEntity <List<Pets>> listarTodos() {
        List<Pets> pets = petsService.listarTodos();
        return ResponseEntity.ok(pets);
    }

    //retorna pet por ID GET /pets/{id}
    @GetMapping("/{id}")
    public ResponseEntity<Pets> buscarPetPorId(@PathVariable Integer id) {
        Pets pet = petsService.buscarPetPorId(id);
        if(pet != null){
            return ResponseEntity.ok(pet);
        }
        return ResponseEntity.notFound().build();
    }
    
    //cadastra novo pet POST /pets
    @PostMapping
    public ResponseEntity<Pets> adicionarPet(@RequestBody Pets pet) {
        Pets novoPet = petsService.adicionarPet(Pets);
        return ResponseEntity.status(HttpStatus.CREATED).body(novoPet);
    }
    
    //atualiza pet PUT /pets/{id}
    @PutMapping("/{id}")
    public ResponseEntity<Pets> atualizarPets(@PathVariable Integer id, @RequestBody Pets pet){
    return ResponseEntity.ok(petsService.atualizarPets(id, pet));
    }


    

    //remove pet DELETE /pets/{id}
    @DeleteMapping("/{id}")
    public String getMethodName(@RequestParam String param) {
        return new String();
    }
    


    //lista pets disponiveis GET /pets/disponiveis
    @GetMapping("/disponiveis")
    public String getMethodName(@RequestParam String param) {
        return new String();
    }

    //pets filtrados por espécie GET /pets/especie/{idEspecie}
    @GetMapping("/especie/{idEspecie}")
    public String getMethodName(@RequestParam String param) {
        return new String();
    }

}
