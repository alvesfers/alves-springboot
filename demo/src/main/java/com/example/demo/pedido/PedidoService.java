package com.example.demo.pedido;

import com.example.demo.cupom.CupomDesconto;
import com.example.demo.cupom.CupomDescontoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class PedidoService {

    @Autowired
    private PedidoRepository pedidoRepository;

    @Autowired
    private CupomDescontoService cupomDescontoService;

    public Pedido criarPedido(Pedido pedido) {
        if (pedido.getIdCupom() != null) {
            Optional<CupomDesconto> cupom = cupomDescontoService.buscarPorCodigo(pedido.getIdCupom());
            if (cupom.isPresent() && cupom.get().isAtivo()) {
                double valorComDesconto = calcularValorComDesconto(pedido.getValorTotal(), cupom.get());
                pedido.setValorTotal(valorComDesconto);
            }
        }
        pedido.setIdPedido(UUID.randomUUID().toString());
        return pedidoRepository.save(pedido);
    }

    public double calcularValorComDesconto(double valorTotal, CupomDesconto cupom) {
        if (cupom.getPercentualDesconto() > 0) {
            return valorTotal - (valorTotal * (cupom.getPercentualDesconto() / 100));
        } else {
            return valorTotal - cupom.getValorDesconto();
        }
    }

    public List<Pedido> listarPedidos() {
        return pedidoRepository.findAll();
    }

    public Pedido buscarPedidoPorId(String id) {
        return pedidoRepository.findById(id).orElse(null);
    }
}