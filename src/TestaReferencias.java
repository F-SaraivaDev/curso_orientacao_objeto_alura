public class TestaReferencias {
    public static void main(String[] args) {

        Conta primeiraConta = new Conta();
        
        primeiraConta.saldo = 300;
        System.out.println(primeiraConta.saldo);

        Conta segundaConta = primeiraConta;

        System.out.println(segundaConta.saldo);

        segundaConta.saldo += 100;

        System.out.println(segundaConta.saldo);

        System.out.println(primeiraConta.saldo);
     
        if(primeiraConta == segundaConta){
            System.out.println("São iguais!");
        
        }else{
            System.out.println("São diferentes!");
        }

        System.out.println(primeiraConta);
        System.out.println(segundaConta);
    }
    
}
