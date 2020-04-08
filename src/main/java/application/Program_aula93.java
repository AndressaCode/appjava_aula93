/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author Andressa Silva
 */
public class Program_aula93 {
    
    public static void main(String[] args){
        
        List<String> list = new ArrayList<>();
        
        list.add("Andressa");
        list.add("Enzo");
        list.add("Maria Alice");
        list.add("Felícia");
        list.add("Amor");
        list.add(2, "Maria Odete");        
        System.out.println("Tamanho da lista: " + list.size());
        
        for(String x : list){
            System.out.println(x);
        }
        
        System.out.printf("===========================================================================%n%n");
        System.out.printf("Modificações%n%n%n");
        
        //list.remove(1);
        list.removeIf(x -> x.charAt(0) == 'M');
        
        System.out.println("Tamanho da lista: " + list.size());
        System.out.println("Index of Andressa: " + list.indexOf("Andressa"));
        System.out.println("Index of Maria: " + list.indexOf("Maria Odete"));
        
        for(String x: list){ 
        // para cada valor de String pertencente 
        //a minha lista, imprima o valor de x
            System.out.println(x);
        }
        System.out.printf("===========================================================================%n%n");
        
        List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
        for(String x: result){
            System.out.println(x);
        }
        
        System.out.printf("===========================================================================%n%n");
        
        String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
        System.out.println(name);
        
        String d = list.stream().filter(x -> x.charAt(0) == 'G').findFirst().orElse(null);
        System.out.println(d);
    }
}
