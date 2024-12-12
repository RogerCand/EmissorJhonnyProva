package com.senac.Emissor.service;

import com.senac.Emissor.dto.ProdutoDto;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {

    @Autowired
    private RabbitTemplate rabbitTemplate;
    public List<ProdutoDto> listarProdutos(){
        rabbitTemplate.convertAndSend("fila-get-produto", "listar");
        return null;
    }
}
