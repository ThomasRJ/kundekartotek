
import java.util.ArrayList;                                     //importerer java utilitien ArrayList

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author thoms
 */
public class Kundekartek {                                      //laver et objekt kaldet kundekartek
    ArrayList<Customer> Customers = new ArrayList<>(100);       //laver et array ved navn Customers som indeholder 100 af mine customer objekter ved hjælp af java utilitien ArrayList
    
    Kundekartek() {
        
    }
    
    public void removeCustomer(String i) {                      //en metode der lader mig fjerne customers
        for (Customer j : Customers) {                          //et foreach loop der gennemgår hele min liste med customers og sammenligner dem
            if (j.ID.equals(i)) {                               //if statement der siger at hvis customer j's ID er det samme som i skal der ske noget
                Customers.remove(j);                            //fjerner customeren j hvis if statementet er sandt ved hjælp af ArrayList utilitie funktionen remove
            }
        }
    }
    
    public ArrayList ReturnCustomers() {                        
        return Customers;                                       
    }
    
    public void printCustomer() {                   
        for (Customer j : Customers) {                          //en metode der printer listen af de Customers der er i min ArrayList
            System.out.println(j.name);                         //returner customers der er instansieret
        }
    }
    
    public void addCustomer (Customer i)                        //en metode der lader mig tilføje customers
    {
        Customers.add(i);                                       //bruger en ArrayList utilitie funktion der hedder add 
    }
}
