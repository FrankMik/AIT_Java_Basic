package hw.cube.controller;

import hw.cube.model.Cube;

public class CubeAppl {
    public static void main(String[] args) {

        Cube cube1 = new Cube(12);
        System.out.println("Perimeter of cube is: " + cube1.perimeter(12));
        System.out.println("Square of cube is: " + cube1.square(12));
        System.out.println("Volume of cube is: " + cube1.volume(12));
        System.out.println();

        Cube cube2 = new Cube(13.5);
        System.out.println("Perimeter of cube is: " + cube1.perimeter(13.5));
        System.out.println("Square of cube is: " + cube1.square(13.5));
        System.out.println("Volume of cube is: " + cube1.volume(13.5));
        System.out.println();

        Cube cube3 = new Cube(24.7);
        System.out.println("Perimeter of cube is: " + cube1.perimeter(24.7));
        System.out.println("Square of cube is: " + cube1.square(24.7));
        System.out.println("Volume of cube is: " + cube1.volume(24.7));
    }
}
