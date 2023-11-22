
package pkg05rsamanita;
import java.math.BigInteger;
import java.util.*;
import java.io.*;

public class Main {
    int tamprimo = 0;
    BigInteger p, q, n;
    BigInteger fi;
    BigInteger e, d; 
    
    public Main(int tamprimo){
        this.tamprimo = tamprimo;
    }
    
    public void generarPrimos(){
        p = new BigInteger(tamprimo, 10, new Random());
        do{
            q = new BigInteger(tamprimo, 10, new Random());
        }while(q.compareTo(p) == 0);
    }
    
    public BigInteger generarClaves(){
        n = p.multiply(q);
        fi = p.subtract(BigInteger.valueOf(1));
        fi = fi.multiply(q.subtract(BigInteger.valueOf(1)));
        
        do{
            e = new BigInteger(2*tamprimo, new Random());
        }while((e.compareTo(fi) != 1) || (e.gcd(fi).compareTo(BigInteger.valueOf(1)) != 0));
        
        d = e.modInverse(fi);
        return d;
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
    
    public String descifrar(BigInteger d, BigInteger[] cifrado){
        int i;
        BigInteger[] descifrado = new BigInteger[cifrado.length];
        
        
        
        for (i = 0; i < descifrado.length; i++) {
            descifrado[0] = cifrado[i].modPow(d, n);
        }
        
        char[] charArray = new char[descifrado.length];
        for (i = 0; i < charArray.length; i++) {
            charArray[i] = (char)(descifrado[i].intValue());
        }
        
        return (new String(charArray));
    }
    
    
    public static void main(String[] args) { 
        
    }   
}
