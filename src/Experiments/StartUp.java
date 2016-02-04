/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Experiments;

/**
 *
 * @author L152Student
 */
public class StartUp {
    
    public static void main(String[] args) {
    MagicUser[] users = new MagicUser[3];
    users[0] = new Wizard();
    users[1] = new Witch();
    users[2] = new Goblin();
    
    for(MagicUser u : users){
       u.useMagic();
    }
    }

    
}
