import java.util.Scanner;

public class MadLib {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        String adjective, noun, animal, noise;

        System.out.println("What is a adjective?");
        adjective = read.nextLine();

        System.out.println("What is a noun?");
        noun = read.nextLine();

        System.out.println("What is a animal?");
        animal = read.nextLine();

        System.out.println("What is a noise?");
        noise = read.nextLine();

        System.out.println(adjective + " Macdonald had a " + noun + ", E-I-E-I-O");
        System.out.println("and on that " + noun + " he had an " + animal + ", E-I-E-I-O");
        System.out.println("with a " + noise + " " + noise + " here");
        System.out.println("and a " + noise + " " + noise + " there,");
        System.out.println("here a " + noise + ", there a " + noise + ",");
        System.out.println("everywhere a " + noise + " " + noise + ",");
        System.out.println(adjective + " Macdonald had a " + noun + ", E-I-E-I-O.");

    }


}


/*Create your own MadLibs. (https://www.madtakes.com/) You may use a story or example from the
    website if you don't wish to make up your own. This program must run entirely in the console.
     */