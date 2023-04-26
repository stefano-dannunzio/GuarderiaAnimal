import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MenuGuarderia {
    public static void main(String[] args) {

        List<Animal> animales = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        int opcion = -1;
        while (opcion != 0) {
            System.out.println("--------------------------------------------------");
            System.out.println("Bienvenido a la guarderia de animales");
            System.out.println("1. Dar de alta un animal");
            System.out.println("2. Dar de baja un animal");
            System.out.println("3. Calcular cantidad de animales");
            System.out.println("4. Listar todos los animales");
            System.out.println("5. Hacer saludar a todos los animales");
            System.out.println("0. Salir");
            System.out.println("--------------------------------------------------");

            System.out.println("Ingrese una opcion: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1 : {
                    System.out.println("Ingrese que animal desea dar de alta: ");
                    System.out.println("1. Perro");
                    System.out.println("2. Gato");
                    System.out.println("3. Mojarrita");
                    System.out.println("4. Hamster");
                    System.out.println("Ingrese una opcion: ");
                    int opcionAnimal = sc.nextInt();
                    switch (opcionAnimal) {
                        case 1 : {
                            Animal perro = new Perro();
                            System.out.println("Ingrese el nombre del perro: ");
                            perro.setNombre(sc.next());
                            System.out.println("Ingrese la edad del perro: ");
                            perro.setEdad(sc.nextInt());
                            System.out.println("Ingrese el peso del perro(gramos): ");
                            perro.setPeso(sc.nextInt());
                            System.out.println("Ingrese el sexo del perro(macho o hembra): ");
                            perro.setSexo(Animal.Sexo.valueOf(sc.next().toUpperCase()));
                            sc.nextLine(); // consume la línea en blanco
                            System.out.println("Ingrese el nombre del dueño del perro: ");
                            Owner owner = new Owner();
                            owner.setNombre(sc.nextLine());
                            System.out.println("Ingrese el dni del dueño del perro: ");
                            owner.setDni(sc.nextInt());
                            sc.nextLine(); // consume la línea en blanco
                            System.out.println("Ingrese la direccion del dueño del perro: ");
                            owner.setDireccion(sc.nextLine());
                            perro.setOwner(owner);
                            System.out.println("Ingrese la raza del perro: ");
                            ((Perro)perro).setRaza(sc.nextLine());

                            animales.add(perro);
                        } break;
                        case 2 : {
                            Animal gato = new Gato();
                            System.out.println("Ingrese el nombre del gato: ");
                            gato.setNombre(sc.next());
                            System.out.println("Ingrese la edad del gato: ");
                            gato.setEdad(sc.nextInt());
                            System.out.println("Ingrese el peso del gato(gramos): ");
                            gato.setPeso(sc.nextInt());
                            System.out.println("Ingrese el sexo del gato(macho o hembra): ");
                            gato.setSexo(Animal.Sexo.valueOf(sc.next().toUpperCase()));
                            sc.nextLine(); // consume la línea en blanco
                            System.out.println("Ingrese el nombre del dueño del gato: ");
                            Owner owner = new Owner();
                            owner.setNombre(sc.nextLine());
                            System.out.println("Ingrese el dni del dueño del gato: ");
                            owner.setDni(sc.nextInt());
                            sc.nextLine(); // consume la línea en blanco
                            System.out.println("Ingrese la direccion del dueño del gato: ");
                            owner.setDireccion(sc.nextLine());
                            gato.setOwner(owner);
                            animales.add(gato);
                        } break;
                        case 3 : {
                            Animal mojarrita = new Mojarrita();
                            System.out.println("Ingrese el nombre de la mojarrita: ");
                            mojarrita.setNombre(sc.next());
                            System.out.println("Ingrese la edad de la mojarrita: ");
                            mojarrita.setEdad(sc.nextInt());
                            System.out.println("Ingrese el peso de la mojarrita(gramos): ");
                            mojarrita.setPeso(sc.nextInt());
                            System.out.println("Ingrese el sexo de la mojarrita(macho o hembra): ");
                            mojarrita.setSexo(Animal.Sexo.valueOf(sc.next().toUpperCase()));
                            sc.nextLine(); // consume la línea en blanco
                            System.out.println("Ingrese el nombre del dueño de la mojarrita: ");
                            Owner owner = new Owner();
                            owner.setNombre(sc.nextLine());
                            System.out.println("Ingrese el dni del dueño de la mojarrita: ");
                            owner.setDni(sc.nextInt());
                            sc.nextLine(); // consume la línea en blanco
                            System.out.println("Ingrese la direccion del dueño de la mojarrita: ");
                            owner.setDireccion(sc.nextLine());
                            mojarrita.setOwner(owner);
                            System.out.println("Ingrese si la Mojarrita es de agua fria o tropical: ");
                            ((Mojarrita)mojarrita).setDeAgua(Mojarrita.DeAgua.valueOf(sc.next().toUpperCase()));
                            animales.add(mojarrita);
                        } break;
                        case 4 : {
                            Animal hamster = new Hamster();
                            System.out.println("Ingrese el nombre del hamster: ");
                            hamster.setNombre(sc.next());
                            System.out.println("Ingrese la edad del hamster: ");
                            hamster.setEdad(sc.nextInt());
                            System.out.println("Ingrese el peso del hamster(gramos): ");
                            hamster.setPeso(sc.nextInt());
                            System.out.println("Ingrese el sexo del hamster(macho o hembra): ");
                            hamster.setSexo(Animal.Sexo.valueOf(sc.next().toUpperCase()));
                            sc.nextLine(); // consume la línea en blanco
                            System.out.println("Ingrese el nombre del dueño del hamster: ");
                            Owner owner = new Owner();
                            owner.setNombre(sc.nextLine());
                            System.out.println("Ingrese el dni del dueño del hamster: ");
                            owner.setDni(sc.nextInt());
                            sc.nextLine(); // consume la línea en blanco
                            System.out.println("Ingrese la direccion del dueño del hamster: ");
                            owner.setDireccion(sc.nextLine());
                            hamster.setOwner(owner);
                            animales.add(hamster);
                        } break;
                    }
                } break;
                case 2 : {
                    System.out.println("Ingrese la posicion en la lista del animal que desea dar de baja: ");
                    int posicion = sc.nextInt();
                    animales.remove(posicion);
                } break;
                case 3 : {
                    System.out.println("La cantidad de animales es: " + animales.size());
                } break;
                case 4 : {
                    System.out.println("Los animales actualmente en la guarderia son: ");
                    for (Animal animal : animales) {
                        System.out.println(animal.toString() + "\n" +
                        "Posicion en la lista: " + animales.indexOf(animal));
                        System.out.println("--------------------------------------------------");
                    }
                } break;
                case 5 : {
                    for (Animal animal : animales) {
                        System.out.println(animal.saludo());
                    }
                } break;
            }
            if (opcion != 0 && opcion != 1 && opcion != 2 && opcion != 3 && opcion != 4 && opcion != 5) {
                System.out.println("Opcion incorrecta, vuelva a intentarlo");
            }
        }
    }
}
