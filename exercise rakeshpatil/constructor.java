
    package exercise1;

    public class constructor {

        int length;
        int width;
        constructor(){
            length=10;
            width=15;
        }

        constructor(int length, int breadth){
            int area;
            this.length=length;
            this.width=breadth;
        }
        public void calArea() {


            System.out.println("The area of constructor is : "+(length*width));
        }
        public static class mainApp2{
            public static void main(String[] args) {
                constructor c1=new constructor();
                c1.calArea();
            }
        }
    }



