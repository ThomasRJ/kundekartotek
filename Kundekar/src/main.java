/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author thoms
 */
public class main {

    /**
     * @param args the command line arguments
     */         
    public static void main(String[] args) {                                //main metoden hvor jeg tester/benytter min kode
        Customer Thomas = new Customer("Thomas");                           //tilføjer en customer der hedder thomas
        Thomas.addMonetos(1239);                                            //tilføjer 1239 til thomas' balance
        System.out.println("Thomas Balance: " + Thomas.balance);            //printer thomas' balance
        Thomas.decMonetos(1243);                                            //trækker 1243 fra thomas' balance
        System.out.println("Thomas balance: " + Thomas.balance);            //printer thomas' balance
        Thomas.decMonetos(12);
        System.out.println("Thomas balance: " + Thomas.balance);
        Kundekartek Bodel = new Kundekartek();                              //laver en ArrayList og kalder den Bodel
        Bodel.addCustomer(Thomas);                                          //tilføjer thomas til ArrayListen Bodel
                                                        
        Customer Jeppe = new Customer("Jeppe");                             //tilføjer en customer der hedder jeppe  
        Bodel.addCustomer(Jeppe);                                           //tilføjer customeren jeppe til ArrayListen Bodel
        
        System.out.println("Personer i bodellet: ");
        Bodel.printCustomer();                                              //printer alle customers i ArrayListen Bodel
    }
    
}
