public class Conta {
    double saldo;
    int agencia;
    int numero;
    String titular;

    void deposita(double valor){
        saldo += valor;
    }

    boolean saca(double valor){

        if(this.saldo >= valor){
            this.saldo -= valor;
            return true;
        }
         return false;
    }

    boolean transfere(double valor, Conta destino){
        
        if(this.saldo >= valor){
            this.saldo -= valor;
            destino.deposita(valor);
            return true;
        }
        return false;
    }
}
