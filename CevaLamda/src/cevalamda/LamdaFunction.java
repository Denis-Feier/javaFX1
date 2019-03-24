/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cevalamda;

public interface LamdaFunction {
    
    String getString(String s);
    
    default String getString2(){
        return "s-a apelat getString2";
    }
    
    static public String getString3(){
        return "s-a apelat getString3";
    }
}
