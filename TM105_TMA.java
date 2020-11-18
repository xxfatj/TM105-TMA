package tm105_TMA;

import java.util.Scanner;

public class TM105_TMA {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);



        // initializing  the variables

        String The_Type_Of_The_Shape;
        String The_Area_Of_The_Type = "";
        String The_Type_Of_The_Perimeter = "";



        double radius;

        double The_Side_Length_Of_The_Square;
        double The_Length_Of_The_Rectangle;
        double The_Width_Of_The_Rectangle;

        double tSide1;
        double tSide2;
        double tSide3;

        double ParralSide1Length;
        double ParralSide2Length;
        double parallelogramAngle;

        double The_Area_Of_The_Circle ;
        double The_Area_Of_The_Square ;
        double The_Area_Of_The_Rectangle ;
        double The_Area_Of_The_Parallelogram ;
        double The_Area_Of_The_Triangle ;


        double The_Perimeter_Of_The_Circle ;
        double The_Perimeter_Of_The_Square ;
        double The_Perimeter_Of_The_Rectangle ;
        double The_Perimeter_Of_The_Parallelogram ;
        double The_Perimeter_Of_The_Triangle ;



        //assigning a value


        double maxArea = -1;
        double maxAreaRadius = 0;
        double maxAreaSide = 0;
        double The_Max_Area_Of_The_Rectangle = 0;
        double The_Max_Width_Of_The_Rectangle_Area = 0;
        double maxTside1Area = 0;
        double maxTside2Area = 0;
        double maxTside3Area = 0;
        double maxParral1Area = 0;
        double maxParral2Area = 0;




        double minPerimeter = 1000;
        double minPerimeterRadius = 0;
        double minPerimeterSide = 0;
        double minPerimeteThe_Length_Of_The_Rectangle = 0;
        double minPerimeteThe_Width_Of_The_Rectangle = 0;
        double minTside1Perimeter = 0;
        double minTside2Perimeter = 0;
        double minTside3Perimeter = 0;
        double minParral1Perimeter = 0;
        double minParral2Perimeter = 0;



        double sumCircleArea = 0;
        double sumSquareArea= 0;
        double sumRectangleArea = 0;
        double sumParallelogramArea = 0;
        double sumTriangleArea = 0;
        
        
        double sumCirclePerimeter = 0 ;
        double  sumSquarePerimeter = 0 ; 
        double  sumRectanglePerimeter = 0;
        double  sumParallelogramPerimeter = 0; 
        double  sumTrianglePerimeter = 0;




        int countAll = 0;
        int Circle_Counter = 0;
        int Square_Counter = 0;
        int Rectangle_Counter = 0;
        int Parallelogram_Counter = 0;
        int Triangle_Counter = 0;



        //asking the user to enter a shape



        System.out.println("Rest shapes to be entered: (total shapes: 20, square: "
                + "3, Triangle: 3, Rectangle: 3, Parallelogram: 3 and Circle: 3");


        System.out.print("Enter shape type (Square, Rectangle, Triangle, "
                + "Parallelogram, Circle) or STOP to end:");

                
        The_Type_Of_The_Shape = input.next();





        // when the user enters stop, while the shape counters counts 20 shape, the program can stop



        while (!The_Type_Of_The_Shape.equalsIgnoreCase("stop") || countAll < 20 || Circle_Counter < 3 || Parallelogram_Counter < 3
                || Rectangle_Counter < 3 || Rectangle_Counter < 3 || Square_Counter < 3 || Triangle_Counter < 3) {



        // when the user enters stop, while the shape counters counts less than 20 shapes, the program will ask the user to enter a shape



            if (The_Type_Of_The_Shape.equalsIgnoreCase("stop")) {
                System.err.println("our inputs should include minimum 20 shapes and "
                        + "at least 3 squares, 3 rectangles, 3 triangles, 3 parallelograms and 3 circles");



            // when the user enters circle as a shape, they will be asked to enter a radious

            } else if (The_Type_Of_The_Shape.equalsIgnoreCase("circle")) {
                Circle_Counter++;
                countAll++;
                System.out.print("Enter circle radius: ");
                radius = input.nextDouble();
                The_Area_Of_The_Circle = Math.PI * radius * radius;
                The_Perimeter_Of_The_Circle = 2 * Math.PI * radius;
                sumCircleArea += The_Area_Of_The_Circle;
                sumCirclePerimeter += The_Perimeter_Of_The_Circle;

                if (The_Area_Of_The_Circle > maxArea) {
                    maxArea = The_Area_Of_The_Circle;
                    maxAreaRadius = radius;
                    The_Area_Of_The_Type = "circle";
                }

                if (The_Perimeter_Of_The_Circle < minPerimeter) {
                    minPerimeter = The_Perimeter_Of_The_Circle;
                    minPerimeterRadius = radius;
                    The_Type_Of_The_Perimeter = "circle";
                }





                System.out.printf("Circle number %d area = %.2f\n", Circle_Counter, The_Area_Of_The_Circle);
                System.out.printf("Circle number %d Perimeter = %.2f\n", Circle_Counter, The_Perimeter_Of_The_Circle);



            // when the user enters square as a shape, they will be asked to enter a side length

            } else if (The_Type_Of_The_Shape.equalsIgnoreCase("square")) {
                Square_Counter++;
                countAll++;
                System.out.print("Enter square side length: ");
                The_Side_Length_Of_The_Square = input.nextDouble();

                The_Area_Of_The_Square = The_Side_Length_Of_The_Square * The_Side_Length_Of_The_Square;
                The_Perimeter_Of_The_Square = The_Side_Length_Of_The_Square * 4;
                sumSquareArea += The_Area_Of_The_Square;
                sumSquarePerimeter += The_Perimeter_Of_The_Square;




                if (The_Area_Of_The_Square > maxArea) {
                    maxArea = The_Area_Of_The_Square;
                    maxAreaSide = The_Side_Length_Of_The_Square;
                    The_Area_Of_The_Type = "square";
                }




                if (The_Perimeter_Of_The_Square < minPerimeter) {
                    minPerimeter = The_Perimeter_Of_The_Square;
                    minPerimeterSide = The_Side_Length_Of_The_Square;
                    The_Type_Of_The_Perimeter = "square";
                }




                System.out.printf("Square number %d area = %.2f\n", Square_Counter, The_Area_Of_The_Square);
                System.out.printf("Square number %d Perimeter = %.2f\n", Square_Counter, The_Perimeter_Of_The_Square);







            // when the user enters rectangle as a shape, they will be asked to enter a length and a width


            } else if (The_Type_Of_The_Shape.equalsIgnoreCase("rectangle")) {
                Rectangle_Counter++;
                countAll++;
                System.out.print("Enter rectangle length: ");
                The_Length_Of_The_Rectangle = input.nextDouble();
                System.out.print("Enter rectangle width: ");
                The_Width_Of_The_Rectangle = input.nextDouble();




                The_Area_Of_The_Rectangle = The_Length_Of_The_Rectangle * The_Width_Of_The_Rectangle;
                The_Perimeter_Of_The_Rectangle = 2 * (The_Length_Of_The_Rectangle + The_Width_Of_The_Rectangle);
                sumRectangleArea += The_Area_Of_The_Rectangle;
                sumRectanglePerimeter += The_Perimeter_Of_The_Rectangle;




                if (The_Area_Of_The_Rectangle > maxArea) {
                    maxArea = The_Area_Of_The_Rectangle;
                    The_Max_Area_Of_The_Rectangle = The_Length_Of_The_Rectangle;
                    The_Max_Width_Of_The_Rectangle_Area = The_Width_Of_The_Rectangle;
                    The_Area_Of_The_Type = "rectangle";
                }
                if (The_Perimeter_Of_The_Rectangle < minPerimeter) {
                    minPerimeter = The_Perimeter_Of_The_Rectangle;
                    minPerimeteThe_Length_Of_The_Rectangle = The_Length_Of_The_Rectangle;
                    minPerimeteThe_Width_Of_The_Rectangle = The_Width_Of_The_Rectangle;
                    The_Type_Of_The_Perimeter = "rectangle";
                }




                System.out.printf("Rectangle number %d area = %.2f\n", Rectangle_Counter, The_Area_Of_The_Rectangle);
                System.out.printf("Rectangle number %d Perimeter = %.2f\n", Rectangle_Counter, The_Perimeter_Of_The_Rectangle);


                // when the user enters triangle as a shape, they will be asked to enter three sides length





            } else if (The_Type_Of_The_Shape.equalsIgnoreCase("triangle")) {

                System.out.print("Enter Triangle side 1 length: ");
                tSide1 = input.nextDouble();
                System.out.print("Enter Triangle side 2 length: ");
                tSide2 = input.nextDouble();
                System.out.print("Enter Triangle side 3 length: ");
                tSide3 = input.nextDouble();




                // using a condition statement to make sure that the given values of the length of the sides make a real triangle



                if (tSide1 > Math.abs(tSide2 - tSide3)
                        && tSide2 > Math.abs(tSide1 - tSide3)
                        && tSide3 > Math.abs(tSide1 - tSide2)
                        && tSide1 < tSide2 + tSide3
                        && tSide2 < tSide1 + tSide3
                        && tSide3 < tSide1 + tSide2) {

                    Triangle_Counter++;
                    countAll++;

                    The_Perimeter_Of_The_Triangle = (tSide1 + tSide2 + tSide3);
                    double p = The_Perimeter_Of_The_Triangle / 2;
                    The_Area_Of_The_Triangle = Math.sqrt(p
                            * (p - tSide1) * (p - tSide2) * (p - tSide3));

                    sumTriangleArea += The_Area_Of_The_Triangle;
                    sumTrianglePerimeter += The_Perimeter_Of_The_Triangle;

                    if (The_Area_Of_The_Triangle > maxArea) {
                        maxArea = The_Area_Of_The_Triangle;
                        maxTside1Area = tSide1;
                        maxTside2Area = tSide2;
                        maxTside3Area = tSide3;

                        The_Area_Of_The_Type = "triangle";
                    }




                    if (The_Perimeter_Of_The_Triangle < minPerimeter) {
                        minPerimeter = The_Perimeter_Of_The_Triangle;
                        minTside1Perimeter = tSide1;
                        minTside2Perimeter = tSide2;
                        minTside3Perimeter = tSide3;

                        The_Type_Of_The_Perimeter = "triangle";
                    }



                    System.out.printf("Triangle number %d area = %.2f\n", Triangle_Counter, The_Area_Of_The_Triangle);
                    System.out.printf("Triangle number %d Perimeter = %.2f\n", Triangle_Counter, The_Perimeter_Of_The_Triangle);
                } else {
                    System.err.println("the entered 3 triangle sides are not forming a real triangle");
                }



                // when the user enters a parallelogram as a shape, they will be asked to enter two sides length and an angle between the 2 sides





            } else if (The_Type_Of_The_Shape.equalsIgnoreCase("parallelogram")) {
                Parallelogram_Counter++;
                countAll++;
                System.out.print("Enter parallelogram side 1 length: ");
                ParralSide1Length = input.nextDouble();
                System.out.print("Enter parallelogram side 2 length: ");
                ParralSide2Length = input.nextDouble();
                System.out.print("Enter parallelogram angle between the 2 sides: ");
                parallelogramAngle = input.nextDouble();



                The_Area_Of_The_Parallelogram = ParralSide1Length * ParralSide2Length * Math.sin(Math.toRadians(parallelogramAngle));
                The_Perimeter_Of_The_Parallelogram = 2 * (ParralSide1Length + ParralSide2Length);
                sumParallelogramArea += The_Area_Of_The_Parallelogram;
                sumParallelogramPerimeter += The_Perimeter_Of_The_Parallelogram;




                if (The_Area_Of_The_Parallelogram > maxArea) {
                    maxArea = The_Area_Of_The_Parallelogram;
                    maxParral1Area = ParralSide1Length;
                    maxParral2Area = ParralSide2Length;
                    The_Area_Of_The_Type = "parallelogram";
                }



                if (The_Perimeter_Of_The_Parallelogram < minPerimeter) {
                    minPerimeter = The_Perimeter_Of_The_Parallelogram;
                    minParral1Perimeter = ParralSide1Length;
                    minParral2Perimeter = ParralSide2Length;
                    The_Type_Of_The_Perimeter = "parallelogram";
                }




                System.out.printf("parallelogram number %d area = %.2f\n", Parallelogram_Counter, The_Area_Of_The_Parallelogram);
                System.out.printf("parallelogram number %d Perimeter = %.2f\n", Parallelogram_Counter, The_Perimeter_Of_The_Parallelogram);
            } else {
                System.err.println("the entered shape is not one of the considered 5");
            }




            System.out.println();
            System.out.println("Rest shapes to be entered: (total shapes: " + (countAll > 20 ? 0 : (20 - countAll))
                    + ", square: " + (Square_Counter > 3 ? 0 : (3 - Square_Counter))
                    + ", Triangle: " + (Triangle_Counter > 3 ? 0 : (3 - Triangle_Counter))
                    + ", Rectangle: " + (Rectangle_Counter > 3 ? 0 : (3 - Rectangle_Counter))
                    + ", Parallelogram: " + (Parallelogram_Counter > 3 ? 0 : (3 - Parallelogram_Counter))
                    + " and Circle: " + (Circle_Counter > 3 ? 0 : (3 - Circle_Counter)) + ")");
            System.out.print("Enter shape type (Square, Rectangle, Triangle, "
                    + "Parallelogram, Circle) or STOP to end:");
            The_Type_Of_The_Shape = input.next();
        }

        System.out.println();
        System.out.println("Program Statistics >>\n");
        System.out.println("Number of entered shapes is " + countAll + " with the following distribution");
        System.out.println("Shape\t\tNumber\t\t%Ratio");
        System.out.printf("Square\t\t %d \t\t %.2f\n", Square_Counter, (double) Square_Counter / countAll * 100);
        System.out.printf("Rectangle\t %d \t\t %.2f\n", Rectangle_Counter, (double) Rectangle_Counter / countAll * 100);
        System.out.printf("Triangle\t %d \t\t %.2f\n", Triangle_Counter, (double) Triangle_Counter / countAll * 100);
        System.out.printf("Parallelogram\t %d \t\t %.2f\n", Parallelogram_Counter, (double) Parallelogram_Counter / countAll * 100);
        System.out.printf("Circle\t\t %d \t\t %.2f\n", Circle_Counter, (double) Circle_Counter / countAll * 100);

        // you can do something else with this line 

        double averageArea =
         (sumCircleArea + sumSquareArea + sumRectangleArea + sumParallelogramArea + sumTriangleArea) / countAll;
        double averagePerimeter = (sumCirclePerimeter + sumSquarePerimeter + sumRectanglePerimeter + sumParallelogramPerimeter + sumTrianglePerimeter) / countAll; 


      

        System.out.printf("Average area of the entered shapes is %.2f\n", averageArea);
        System.out.printf("Average perimeter of the entered shapes is %.2f\n", averagePerimeter);




        if (The_Area_Of_The_Type.equalsIgnoreCase("circle")) {
            System.out.printf("Maximum area is %.2f of a shape type "
                    + "%s with radius length %.2f\n", maxArea, "CIRCLE", maxAreaRadius);
        } else if (The_Area_Of_The_Type.equalsIgnoreCase("square")) {
            System.out.printf("Maximum area is %.2f of a shape type "
                    + "%s with side length %.2f\n", maxArea, "SQUARE", maxAreaSide);
        } else if (The_Area_Of_The_Type.equalsIgnoreCase("rectangle")) {
            System.out.printf("Maximum area is %.2f of a shape type "
                    + "%s with 2 side lengths %.2f, %.2f\n", maxArea, "RECTANGLE", The_Max_Area_Of_The_Rectangle, The_Max_Width_Of_The_Rectangle_Area);
        } else if (The_Area_Of_The_Type.equalsIgnoreCase("triangle")) {
            System.out.printf("Maximum area is %.2f of a shape type "
                    + "%s with 3 side lengths %.2f, %.2f, %.2f\n", maxArea, "TRIANGLE",
                    maxTside1Area, maxTside2Area, maxTside3Area);
        } else if (The_Area_Of_The_Type.equalsIgnoreCase("parallelogram")) {
            System.out.printf("Maximum area is %.2f of a shape type "
                    + "%s with 2 side length %.2f , %.2f\n", maxArea, "PARALLELOGRAM", maxParral1Area, maxParral2Area);
        }

        if (The_Type_Of_The_Perimeter.equalsIgnoreCase("circle")) {
            System.out.printf("Minimum perimeter is %.2f of a shape type "
                    + "%s with radius length %.2f\n", minPerimeter, "CIRCLE", minPerimeterRadius);
        } else if (The_Type_Of_The_Perimeter.equalsIgnoreCase("square")) {
            System.out.printf("Minimum perimeter is %.2f of a shape type "
                    + "%s with side length %.2f\n", minPerimeter, "SQUARE", minPerimeterSide);
        } else if (The_Type_Of_The_Perimeter.equalsIgnoreCase("rectangle")) {
            System.out.printf("Minimum perimeter is %.2f of a shape type "
                    + "%s with 2 side lengths %.2f, %.2f\n", minPerimeter, "RECTANGLE", minPerimeteThe_Length_Of_The_Rectangle, minPerimeteThe_Width_Of_The_Rectangle);
        } else if (The_Type_Of_The_Perimeter.equalsIgnoreCase("triangle")) {
            System.out.printf("Minimum perimeter is %.2f of a shape type "
                    + "%s with 3 side lengths %.2f, %.2f, %.2f\n", minPerimeter, "TRIANGLE",
                    minTside1Perimeter, minTside2Perimeter, minTside3Perimeter);
        } else if (The_Type_Of_The_Perimeter.equalsIgnoreCase("parallelogram")) {
            System.out.printf("Minimum perimeter is %.2f of a shape type "
                    + "%s with 2 side length %.2f , %.2f\n", minPerimeter, "PARALLELOGRAM", minParral1Perimeter, minParral2Perimeter);
        }
    }
}
