
package pkg05rsamanita;
import java.math.BigInteger;
import java.util.*;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class rsa {
    private static int tamprimo = 0;
    private static BigInteger p, q, n;
    private static BigInteger fi;
    private static BigInteger e, d; 
    private static String claveDescifrar;

    
    public rsa(int tamprimo){
        this.tamprimo = tamprimo;
      
        
    }

  

    public static String getClaveDescifrar() {
        return claveDescifrar;
    }

    public static void setClaveDescifrar(String claveDescifrar) {
        rsa.claveDescifrar = claveDescifrar;
    }

    
    
    
    public void generarPrimos(){
        
       
        p = new BigInteger(tamprimo, 10, new Random());
        do{
            q = new BigInteger(tamprimo, 10, new Random());
        }while(q.compareTo(p) == 0);
    }
    
    public void generarClaves(){
        // n = p*q
        // fi = (p-1) * (q-1)  
        
        n = p.multiply(q);
        
        //calcular p-1
        fi = p.subtract(BigInteger.valueOf(1));
        
        fi = fi.multiply(
                q.subtract(BigInteger.valueOf(1)));
        
        //calculamos e
        //e debe de ser un coprimo de n tal que 1<e<fi(n)
        
        do e = new BigInteger(2*tamprimo, new Random());
            while( (e.compareTo(fi) != -1) || 
                ( e.gcd(fi).compareTo(
                        BigInteger.valueOf(1)) != 0 ));
        
        //d se calcula de fomr atal que
        // d = e^1 mod fi   osea es el inverso multiplicativo de e
        
        d = e.modInverse(fi);
        
    }
    
    
    public BigInteger[] cifrar(String mensaje){
        int i;
        byte[] temp = new byte[1];
        byte[] digitos = mensaje.getBytes();
        
        BigInteger[] bigdigitos = new BigInteger[digitos.length];
        
        for (i = 0; i < bigdigitos.length; i++) {
            temp[0] = digitos[i];
            bigdigitos[i] = new BigInteger(temp);
        }
        
        BigInteger[] cifrado = new BigInteger[bigdigitos.length];
        for (i = 0; i < bigdigitos.length; i++) {
            cifrado[i] = bigdigitos[i].modPow(e, n);
        }
        
        return cifrado;
    }
    
  public String descifrar(BigInteger[] cifrado){
        int i;
        
        BigInteger[] descifrado = new BigInteger[cifrado.length];
        
        //aplico la formula  Md = C^d modn
        
       
        
        //iterar con el mensaje para cifrarlo
        for(i = 0; i < descifrado.length; i++){
            descifrado[i] = cifrado[i].modPow(d, n);
        }
        
        char[] charArray = new char[descifrado.length];
        
        for(i = 0; i < charArray.length; i++){
            //vamos a unir todos los caracteres
            charArray[i] = (char)(descifrado[i].intValue());
        }
        return (new String(charArray));
    }
   
}
