package com.senai.amigopetter.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.senai.amigopetter.model.Pets;
import com.senai.amigopetter.model.enums.Disponibilidade;
import com.senai.amigopetter.repository.PetsRepository;

@Service
public class PetsService {
    @Autowired
    private PetsRepository petsRepository;


    //lista todos os pets GET /pets
    public List<Pets> listarTodos(){
        return petsRepository.findAll();
    }

    //retorna pet por ID GET /pets/{id}
    public Pets buscarPetPorId(Integer id){
        Optional<Pets> pet = petsRepository.findById(id);
        return pet.orElse(null);
    }

    //cadastra novo pet POST /pets
    public Pets adicionarPet(Pets pet){
        return petsRepository.save(pet);
    }

    //atualiza pet PUT /pets/{id}
    public Pets atualizarPets(Integer id, Pets petAtualizado) {

        Optional<Pets> petExiste = petsRepository.findById(id);

        if (petExiste.isEmpty()) {
            throw new RuntimeException("Pet não encontrado");
        }

        Pets pet = petExiste.get();

        pet.setNome(petAtualizado.getNome());
        pet.setRaca(petAtualizado.getRaca());
        pet.setIdade(petAtualizado.getIdade());
        pet.setPorte(petAtualizado.getPorte());
        pet.setSexo(petAtualizado.getSexo());
        pet.setDisponibilidade(petAtualizado.getDisponibilidade());
        pet.setFotos(petAtualizado.getFotos());
        pet.setCor(petAtualizado.getCor());
        pet.setVacinado(petAtualizado.getVacinado());
        pet.setQtdDoses(petAtualizado.getQtdDoses());
        pet.setDtRegistro(petAtualizado.getDtRegistro());
        pet.setCastrado(petAtualizado.getCastrado());
        pet.setDescricao(petAtualizado.getDescricao());
        pet.setEspecie(petAtualizado.getEspecie());

        return petsRepository.save(pet);
}

    //remove pet DELETE /pets/{id}
    public void deletarPet(Integer id){
            petsRepository.deleteById(id);
    }


    //lista pets disponiveis GET /pets/disponiveis
    public List<Pets> listarPetsDisponiveis(){
        return petsRepository.findByDisponibilidade(Disponibilidade.DISPONIVEL);
    }

    //pets filtrados por espécie GET /pets/especie/{idEspecie}
    public List<Pets> listarPorEspecie(Integer idEspecie){
        return petsRepository.findByEspecie_Id(idEspecie);
    }

    //filtro especial
    //public List<Pets> filtrar(Porte porte, Sexo sexo, String cor, Boolean vacinado){
    //    return petsRepository.filtrarPets(porte, sexo, cor, vacinado);
    //}
}
