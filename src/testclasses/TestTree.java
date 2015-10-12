/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testclasses;

import Misc.Tree;

/**
 *
 * @author Admin
 */
public class TestTree {

    public static void main(String args[]) {

        Tree person = new Tree("Иванов Иван Иванович");
        
        //person.addParent("Вася").addParent("Петя").addParent("Саша").addParent("Паша");
        
        Tree parent2 = person.addParent("Иванов Иван Петрович");
        Tree t = parent2.addParent("Иванов Петр Сергеевич");
        t.addParent("Иванов Сергей Родионович");
        t.addParent("Петренко Зоя Сергеевна");
        parent2.addParent("Романова Наталья Сергеевна");
        
        Tree parent1 = person.addParent("Петрова Анна Сергеевна");
        parent1.addParent("Петров Сергей Иванович");
        parent1.addParent("Сидорова Елена Петровна").addParent("нет данных");
        
        System.out.println(person);
        System.out.println("\nВсего узлов дерева: " + person.getSize());

    }
}
