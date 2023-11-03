public class TestaMetodo {
    public static void main(String[] args) {
        
        Conta conta = new Conta();
        conta.saldo = 50;
        conta.deposita(100);
        System.out.println(conta.saldo);
        conta.saca(30);
        System.out.println(conta.saldo);

        Conta contaDoFernando = new Conta();
        Conta contaDaCristiane = new Conta();


        contaDoFernando.titular = "Fernando Saraiva";
        contaDoFernando.saldo = 100;
        contaDaCristiane.saldo = 300;
        System.out.println(contaDoFernando.titular);
        System.out.println("Saldo Cristiane: R$ " + contaDaCristiane.saldo);
        System.out.println("Saldo Fernando: R$ " + contaDoFernando.saldo);
        contaDaCristiane.deposita(300);
        System.out.println("Cristiane: Saldo + Deposito: R$ " + contaDaCristiane.saldo);

        if(contaDaCristiane.transfere(100, contaDoFernando)){
            System.out.println("Transferência realizada com sucesso!");
        }else{
            System.out.println("Saldo insuficiente!");
        }
        System.out.println("Saldo Fernando: R$ " + contaDoFernando.saldo);
        System.out.println("Saldo Cristiane: R$ " + contaDaCristiane.saldo);
    
    }
    
}
