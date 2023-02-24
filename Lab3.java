/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.lab3;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Lab3 {

    Scanner scanner = new Scanner();

    class Square {

        public double acgearg;
        public double perimeter;
        public float canhS = scanner.nextFloat();

        public double getAcgearg() {
            return acgearg;
        }

        public void setAcgearg(double acgearg) {

            this.acgearg = canhS * 4;
        }

        public double getPerimeter() {
            return perimeter;
        }

        public void setPerimeter(double perimeter) {
            this.perimeter = canhS * canhS;
        }

        class circle {

            final float Pi = 3.14f;
            protected double acgearg;
            protected double perimeter;

            float D=scanner.nextFloat();
           

            public double getAcgearg() {
                return acgearg;
            }

            public void setAcgearg(double acgearg) {

                this.acgearg = D * Pi;
            }

            public double getPerimeter() {
                return perimeter;
            }

            public void setPerimeter(double perimeter) {

                D = scanner.nextFloat();
                this.perimeter = perimeter;
            }

        }
    }
}
