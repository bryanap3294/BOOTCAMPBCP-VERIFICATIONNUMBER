package com.bootcamp.verificador.service.impl;

import com.bootcamp.verificador.service.VerificationService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@Service
public class VerificationServiceImpl implements VerificationService {

    Integer[] sourceArray = {3, 2, 7, 6, 5, 4, 3, 2};
    List<Integer> values = Arrays.asList(sourceArray);

    @Override
    public Integer getVerificationNumber(String dni) {

        String[] dniArray = dni.split("");
        List<String> sourceList = Arrays.asList(dniArray);

        return null;
    }
}
