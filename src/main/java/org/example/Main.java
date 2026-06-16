package org.example;

public class Main {

    public static void main(String[] args) {

        Book b1 = new Book(101, "C programming", "Robert Martin", 599.00);
        Book b2 = new Book(102, "Python basics", "Joshua Bloch", 799.00);
        Book b3 = new Book(103, "Java Adhvanced", "John Doe", 299.00);
        Book b4 = new Book(104,"ds Basics", "Ram", 300.00);
        Book b5 = new Book(105, "software testing", "Sam", 200.00);
        Book b6 = new Book(106, "MOBILE application", "dev", 100.00);
        Book b7 = new Book(107, "cloud computing", "Rebecca", 360.00);
        Book b8 = new Book(108, "ds Basics", "Ram", 300.00);
        Book b9 = new Book(109, "Speech tech", "Harvey", 300.00);
        Book b10 = new Book(110, "Priceples of AI", "helen", 400.00);
        Book b11= new Book(111, "Aviation", "Ram", 300.00);
        Book b12= new Book(112, "Aerodynamics", "sinha", 550.00);
        Book b13 = new Book(113, "Follow up", "henry", 400.00);
        Book b14= new Book(114, "atomic Habits", "James Clear", 800.00);
        Book b15 = new Book(115, "Achemist", "paulo coeho", 499.00);
        Book b16 = new Book(117, "The art", "Chandra", 390.00);
        Book b17 = new Book(118, "Genz", "shyam", 200.00);
        Book b18= new Book(119, "Talking", "max", 400.00);
        Book b19= new Book(120, "True self", "sankar", 150.00);




        System.out.println("-----------------------------------------------------");
        System.out.printf("%-5s %-21s %-20s %-3s%n",
                "ID", "TITLE", "AUTHOR", "PRICE");
        System.out.println("-----------------------------------------------------");

        System.out.printf("%-5d%-21s%-20s%-10.2f%n",
                b1.id(),b1.title(),b1.author(),b1.price());

        System.out.printf("%-5d %-20s %-20s %-10.2f%n",
                b2.id(),b2.title(),b2.author(),b2.price());

        System.out.printf("%-5d %-20s %-20s %-10.2f%n",
                b3.id(),b3.title(),b3.author(),b3.price());
        System.out.printf("%-6d%-20s%-20s%-10.2f%n",
                b4.id(),b4.title(),b4.author(),b4.price());
        System.out.printf("%-6d%-20s%-20s%-10.2f%n",
                b5.id(),b5.title(),b5.author(),b5.price());
        System.out.printf("%-6d%-20s%-20s%-10.2f%n",
                b6.id(),b6.title(),b6.author(),b6.price());
        System.out.printf("%-6d%-20s%-20s%-10.2f%n",
                b7.id(),b7.title(),b7.author(),b7.price());
        System.out.printf("%-6d%-20s%-20s%-10.2f%n",
                b8.id(),b8.title(),b8.author(),b8.price());
        System.out.printf("%-6d%-20s%-20s%-5.2f%n",
                b9.id(),b9.title(),b9.author(),b9.price());
        System.out.printf("%-6d%-20s%-20s%-10.2f%n",
                b10.id(),b10.title(),b10.author(),b10.price());
        System.out.printf("%-6d%-20s%-20s%-10.2f%n",
                b11.id(),b11.title(),b11.author(),b11.price());
        System.out.printf("%-6d%-20s%-20s%-10.2f%n",
                b12.id(),b12.title(),b12.author(),b12.price());
        System.out.printf("%-6d%-20s%-20s%-10.2f%n",
                b13.id(),b13.title(),b13.author(),b13.price());
        System.out.printf("%-6d%-20s%-20s%-10.2f%n",
                b14.id(),b14.title(),b14.author(),b14.price());
        System.out.printf("%-6d%-20s%-20s%-10.2f%n",
                b15.id(),b15.title(),b15.author(),b15.price());
        System.out.printf("%-6d%-20s%-20s%-10.2f%n",
                b16.id(),b16.title(),b16.author(),b16.price());
        System.out.printf("%-6d%-20s%-20s%-10.2f%n",
                b17.id(),b17.title(),b17.author(),b17.price());
        System.out.printf("%-6d%-20s%-20s%-10.2f%n",
                b18.id(),b18.title(),b18.author(),b18.price());
        System.out.printf("%-6d%-20s%-20s%-10.2f%n",
                b19.id(),b19.title(),b19.author(),b19.price());



        System.out.println("-----------------------------------------------------");
    }
}