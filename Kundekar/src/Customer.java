
import java.util.UUID;                                  //importerer java utilitien UUID

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author thoms
 */
public class Customer                                   //laver et objekt der hedder customer
{                                 
    String name;                                        //laver en string kaldet name
    final String ID = UUID.randomUUID().toString();     //laver en string kaldet ID og sætter den til at være et randomly generet UUID
    double balance = 0;                                 //laver en double kaldet balance
    
    Customer(String navn)                               //gør så jeg kan lave nye customers, de behøver kun et nyt navn da de ved standard får tildelt en balance på 0 og et randomly generet UUID
    {                             
        this.name = navn;                               //gør så jeg kan tildele customers nye navne
    }


    public double addMonetos(double beløb)              //en metode der kan sætte penge på en customers balance
    {
       return this.balance += beløb;                    //plusser penge (beløb) på balancen
    }
    
    public double decMonetos(double beløb)              //en metode der trækker penge fra en customers balance
    {
        if (this.balance > 0)                           //gør så der kun kan trækkes penge fra hvis kontoen har over 0 i balance
        {                         
            return this.balance -= beløb;               //trækker penge (beløb) fra balancen
        }
        
        return this.balance = -99999;                                 //returnere -99999 hvis kontoen er 0 eller hvis der går noget galt
        
    }
}
