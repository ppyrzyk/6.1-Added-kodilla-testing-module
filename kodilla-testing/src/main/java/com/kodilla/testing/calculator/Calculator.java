package com.kodilla.testing.calculator;

public class Calculator {

            private int a;
            private int b;

            public Calculator(int a, int b){
                this.a = a;
                this.b = b;
            }

            public int getAddingResult() {
                return a + b;
            }
            public int getMultiplyResult(){
                return a * b;
            }
        // testowałęm automatyczne tworzenie setterów i getterów
        //         public int getA() {
        //            return a;
        //        }
        //        public int getB() {
        //            return b;
        //        }
        //        public void setA(int a){
        //            this.a = a;
        //        }
        //        public void setB(int b) {
        //            this.b = b;
        //        }
}
