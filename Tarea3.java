package tarea.pkg3;

import java.util.Scanner;

public class Tarea3 {
    static String[] lista = new String[5];
    static Menu a;
    
          
   
    public static void main(String[] args) {
//        a = new Menu();
//        lista = new String[5];
//        for (int i = 0; i < lista.length; i++) {
//            lista[i] = "";
//        }
        
        Scanner Home = new Scanner(System.in);

        
        int selecthome;

        do {
            System.out.println("Tarea #3");
            System.out.println("");
            System.out.println("201700001");
            System.out.println("");
            System.out.println("1. Usuarios");
            System.out.println("2. Palabras Palíndromas");
            System.out.println("3. Salir");
            selecthome = Home.nextInt();

            switch (selecthome) {

                case 1:
                    // Menu de usuarios

                    Scanner User = new Scanner(System.in);

                    int selectuser;

                    do {

                        System.out.println("Menú De Usuario");
                        System.out.println("");
                        System.out.println("1. Ingresar Usuarios");
                        System.out.println("2. Mostrar Todos Los Usuarios");
                        System.out.println("3. Mostrar Un Usuario Personalizado");
                        System.out.println("4. Menú Principal");
                        System.out.println("5. Salir");
                        selectuser = User.nextInt();
                    } while (selectuser < 1 || selectuser > 5);

                    switch (selectuser) {
                        case 1:
                            //Ingresar Usuario

                                ingresarusuario();
                    
                            break;
                        case 2:
                            //Todos los usuarios
                            System.out.println("Mostrar Todos Los Usuarios");
                            mostrarusuarios();
                            break;
                        case 3:
                            //Usuario Personalizado
                            
                            System.out.println("Mostrar Un Usuario Persolanizado");
                            System.out.println("");
                            System.out.println("Ingrese Usuario");
                            System.out.println("");
                            break;
                        case 4:
                            //Volver al menu
if (selectuser==4){
     a = new Menu();
}
                            
                            break;
                        case 5:
                            //Salir
                            System.exit(0);
                            break;
                    }
                    break;

                case 2:
                    //                   Palabras palindromas
                  System.out.println("");
                Palindromo a = new Palindromo();
                a.Correr();
                break;

                case 3:
                    //                   salir
                    System.exit(0);
                    break;
            }

        } while (selecthome < 1 || selecthome > 4);
    
//        switch (selecthome) {
//
//            case 1:
//                // Menu de usuarios
//
//                Scanner User = new Scanner(System.in);
//
//                int selectuser;
//
//                do {
//
//                    System.out.println("Menú De Usuario");
//                    System.out.println("");
//                    System.out.println("1. Ingresar Usuarios");
//                    System.out.println("2. Mostrar Todos Los Usuarios");
//                    System.out.println("3. Mostrar Un Usuario Personalizado");
//                    System.out.println("4. Menú Principal");
//                    System.out.println("5. Salir");
//                    selectuser = User.nextInt();
//                } while (selectuser < 1 || selectuser > 5);
//
//                switch (selectuser) {
//                    case 1:
//                        //Ingresar Usuario
//                     ingresarusuario();
//                        break;
//                    case 2:
//                        //Todos los usuarios
//                        System.out.println("Mostrar Todos Los Usuarios");
//                        mostrarusuarios();
//                        break;
//                    case 3:
//                        //Usuario Personalizado
//                        System.out.println("Mostrar Un Usuario Persolanizado");
//                        System.out.println("Ingrese Usuario");
//
//                        break;
//                    case 4:
//                        //Volver al menu
//
//                        break;
//                    case 5:
//                        //Salir
//                        System.exit(0);
//                        break;
//                }
//                break;
//
//            case 2:
//                //                   Palabras palindromas
//                System.out.println("");
//                Palindromo a = new Palindromo();
//                a.Correr();
//                break;
//
//            case 3:
//                //                   salir
//                System.exit(0);
//                break;
//        }
    
    }
    public static void mostrarusuarios(){
        for (int i = 0; i < lista.length; i++) {
            System.out.println(lista[i]);
        }
    }
    
    public static void ingresarusuario() {
        

        Scanner Users = new Scanner(System.in);
        String selusers;

        for (int i = 0; i < lista.length; i++) {
            System.out.println("");
            System.out.println("Ingresar Usuario:");
            System.out.println("");
            selusers = Users.nextLine();
            lista[i] = selusers;
        }
    
    }
}
