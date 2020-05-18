class exercicio01 {

    public static void main(String [] args) {

        int soma = 0;
        int contador = 0;

        for (contador = 0; contador <= 500; contador++){
            if (contador % 3 == 0){
                soma = soma + contador;
                System.out.println(soma);
            }
        }


    }

}