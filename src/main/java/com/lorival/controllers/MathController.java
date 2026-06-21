package com.lorival.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/math")
public class MathController {

    @RequestMapping("/sum/{numberOne}/{numberTwo}")
    public Double sum(
            @PathVariable("numberOne") String numberOne,
            @PathVariable("numberTwo") String numberTwo
    ) throws Exception {

        if(!isNumeric(numberOne) || !isNumeric(numberTwo)) throw new UnsupportedOperationException("Please set a numeric value!");
        return convertToDouble(numberOne)  + convertToDouble(numberTwo) ;
    }


    @RequestMapping("/mult/{numberOne}/{numberTwo}")
    public Double mult(
            @PathVariable("numberOne") String numberOne,
            @PathVariable("numberTwo") String numberTwo
    ) throws Exception {

        if(!isNumeric(numberOne) || !isNumeric(numberTwo)) throw new UnsupportedOperationException("Please set a numeric value!");
        return convertToDouble(numberOne)  * convertToDouble(numberTwo) ;
    }


    @RequestMapping("/sub/{numberOne}/{numberTwo}")
    public Double sub(
            @PathVariable("numberOne") String numberOne,
            @PathVariable("numberTwo") String numberTwo
    ) throws Exception {

        if(!isNumeric(numberOne) || !isNumeric(numberTwo)) throw new UnsupportedOperationException("Please set a numeric value!");
        return convertToDouble(numberOne)  - convertToDouble(numberTwo) ;
    }


    @RequestMapping("/div/{numberOne}/{numberTwo}")
    public Double div(
            @PathVariable("numberOne") String numberOne,
            @PathVariable("numberTwo") String numberTwo
    ) throws Exception {

        if(!isNumeric(numberOne) || !isNumeric(numberTwo)) throw new UnsupportedOperationException("Please set a numeric value!");
        return convertToDouble(numberOne)  / convertToDouble(numberTwo) ;
    }


    @RequestMapping("/med/{numberOne}/{numberTwo}")
    public Double med(
            @PathVariable("numberOne") String numberOne,
            @PathVariable("numberTwo") String numberTwo
    ) throws Exception {

        if(!isNumeric(numberOne) || !isNumeric(numberTwo) || numberTwo.equals(0)) throw new UnsupportedOperationException("Please set a numeric value!");
        return (convertToDouble(numberOne)  + convertToDouble(numberTwo)) / 2 ;
    }


    @RequestMapping("/raizQ/{numberOne}/{numberTwo}")
    public Double raizQ(
            @PathVariable("numberOne") String numberOne,
            @PathVariable("numberTwo") String numberTwo
    ) throws Exception {

        if(!isNumeric(numberOne) || !isNumeric(numberTwo) || numberTwo.equals(0)) throw new UnsupportedOperationException("Please set a numeric value!");
        return Math.sqrt(convertToDouble(numberOne)  + convertToDouble(numberTwo)) ;
    }



    private Double convertToDouble(String strNumber) throws IllegalArgumentException {
        if (strNumber == null || strNumber.isEmpty()) {
            throw new UnsupportedOperationException("Please set a numeric value!");
        }
        String number = strNumber.replace(",",".");
        return Double.parseDouble(number);

    }

    private boolean isNumeric(String strNumber) {
        if (strNumber == null || strNumber.isEmpty()) {
            return false;
        }
        String number = strNumber.replace(",",".");

        if (number.matches("[-+]?[0-9]*\\.?[0-9]+")){
            return true;
        }
        return false;
    }
}