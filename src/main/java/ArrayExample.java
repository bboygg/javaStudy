public class ArrayExample {

    public static void main(String args[]){


        //declaration example

        /*
        int[] age;
        age = new int[5];
        */

        //int[] age = new int[5];

        //int[] age = {12,4,5,2,5};

        int[] age = new int[5];

        age[2] = 3;
        age[4] = 6;

        //print out example
        /*
        System.out.println(age[0]);
        System.out.println(age[1]);
        */


        /*
        for(int i:age){
            System.out.println(i);
        }
        */

        for(int i = 0; i < 5; i++){
            System.out.println("Element at index " + i + ":" + age[i]);
        }

    }
}
