package dio.desafio.springboot.restapi.service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import dio.desafio.springboot.restapi.model.Endereco;

public interface ViaCepService {
    
    @GetMapping("/{cep}/json/")
    Endereco consultarCep(@PathVariable("cep") String cep);
}
