package com.lorival.math;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

public class SimpleMath {


    public Double sum(Double numberOne,Double numberTwo){

        return numberOne + numberTwo ;
    }


    @RequestMapping("/mult/{numberOne}/{numberTwo}")
    public Double mult(Double numberOne,Double numberTwo){

        return numberOne * numberTwo ;
    }


    @RequestMapping("/sub/{numberOne}/{numberTwo}")
    public Double sub(Double numberOne,Double numberTwo){

        return numberOne - numberTwo ;
    }


    @RequestMapping("/div/{numberOne}/{numberTwo}")
    public Double div(Double numberOne,Double numberTwo){

        return numberOne / numberTwo ;
    }


    @RequestMapping("/med/{numberOne}/{numberTwo}")
    public Double med(Double numberOne,Double numberTwo){

        return (numberOne + numberTwo) / 2 ;
    }


    @RequestMapping("/raizQ/{numberOne}/{numberTwo}")
    public Double raizQ(Double numberOne,Double numberTwo){

        return Math.sqrt(numberOne + numberTwo) ;
    }
}
