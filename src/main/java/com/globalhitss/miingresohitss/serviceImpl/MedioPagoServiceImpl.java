package com.globalhitss.miingresohitss.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.globalhitss.miingresohitss.model.MedioPago;
import com.globalhitss.miingresohitss.repository.MedioPagoRepository;
import java.math.BigDecimal;
import com.globalhitss.miingresohitss.service.IMedioPagoService;

@Service
public class MedioPagoServiceImpl implements IMedioPagoService {

    @Autowired
    private MedioPagoRepository medioPagoRepository;

    @Override
    public List<MedioPago> getAllMedioPago() {
        return (List<MedioPago>) medioPagoRepository.findAll();
    }

    @Override
    public MedioPago getMedioPago(BigDecimal id) {
        return medioPagoRepository.findById(id).orElse(null);
    }

    @Override
    public MedioPago saveMedioPago(MedioPago medioPago) {
        return medioPagoRepository.save(medioPago);
    }

    @Override
    public void deleteMedioPago(BigDecimal id) {
        medioPagoRepository.deleteById(id);
    }
}
