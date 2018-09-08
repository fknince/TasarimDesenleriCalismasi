/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ndam_decorator;

/**
 *
 * @author fince
 */
public class NumberFormatController {
    
    public boolean stringHasOnlydigit(String text)
    {
        if(text.length() == 0)
            return true;
        else
            return (Character.isDigit(text.charAt(0))) && stringHasOnlydigit(text.substring(1));
    }
    
}
