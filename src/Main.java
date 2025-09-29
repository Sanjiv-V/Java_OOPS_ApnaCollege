public class Main {

    public static void main (String[] args){

        // OOPS FROM APNA COLLEGE!
        // https://www.youtube.com/watch?v=bSrm9RXwBaI

//        // create instance of the class 'Pen'
//        Pen pen1 = new Pen();
//
//        // use/access properties, with only . but no () after name
//        pen1.color = "Blue";
//        pen1.type = "Gel";
//
//        // now we will access methods
////        pen1.write();
//        Pen pen2 = new Pen();
//
//        pen2.color = "Black";
//        pen2.type = "Ball Point";
//
//        pen1.printColor();
//        pen2.printColor();

        // NON Parameterized-------------------->
//        Student s1 = new Student();
//        s1.name = "Sanjiv";
//        s1.age = 22;

        //Parameterized-------------------->
        Student s1 = new Student("Sanjiv",22);

        s1.printInfo();
    }


}

// this is the class / blueprint, based on which instances will be created..
class Student {
    String name;
    int age;

    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }

    // TODO: THIS IS CALLED CONSTRUCTOR, THERE ARE THREE TYPES OF CONSTRUCTOR
    // TODO: NON-PARAMETERIZED, PARAMETERIZED AND COPY CONSTRUCTORS

    // NON PARAMETERIZED -->
    // usually when we dont have parameters on our class, this is not needed
    // java will automatically call it with its default value
    // TODO:
//    Student(){
//        System.out.println("Constructor called.....📞");
//    }

    // PARAMETERIZED -->
    // sometimes, we might pass in the parameter directly when defining and
    // initializing class, that is when we use parameterize constructors
    // tidbit-> the 'Student()' when u define , the one with brackets is called contructors
    // this is basically for prodiving parameter for the argument, incase any
    Student (String name, int age){
        this.name=name;
        this.age=age;
    }

    // 3RD TYPE , COPY CONSTRUCTORS --->

}


class Pen {
    String color;
    String type;

    public void write(){
        System.out.println("Writing something....🖋");
    }

    public void printColor(){
        System.out.println(this.color);
    }
}

