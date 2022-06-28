public class Main {

    public static void main(String[] args) {
        int numeroIf = 1;

        System.out.println("Primer item, if:\nEl valor de numeroIf es: "+numeroIf);
        if(numeroIf == 0){
            System.out.println("Es cero");
        }else if(numeroIf > 0){
            System.out.println("Es positivo");
        }else {
            System.out.println("Es negativo");
        }

        System.out.println();

        int numeroWhile = 0;

        System.out.println("Segundo item, while:\nEl valor de numeroWhile es: "+numeroWhile);
        while(numeroWhile < 3){
            numeroWhile++;
            System.out.println("NumeroWhile="+numeroWhile);
        }

        System.out.println();

        System.out.println("Tercer item, do while:\nEl valor de numeroWhile es: "+numeroWhile);
        do{
            numeroWhile++;
            System.out.println("NumeroWhile="+numeroWhile);
        }while(numeroWhile == 0);

        System.out.println();

        System.out.println("Cuarto item, for");
        for(int numeroFor = 0; numeroFor <= 3; numeroFor++){
            System.out.println("NumeroFor="+numeroFor);
        }

        System.out.println();

        String estacion = "Verano";
        System.out.println("Quinto item, switch: Valor de la variable estacion: "+estacion);
        switch(estacion){
            case "Verano":
                System.out.println("Es verano");
                break;
            case "Invierno":
                System.out.println("Es invierno");
                break;
            case "Otoño":
                System.out.println("Es otoño");
                break;
            case "Primavera":
                System.out.println("Es primavera");
                break;
            default:
                System.out.println("El valor ingresado no es una estación");
        }

    }

}
