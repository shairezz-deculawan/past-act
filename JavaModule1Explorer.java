import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JavaModule1Explorer extends JFrame {
    private JTextArea textArea;

    public JavaModule1Explorer() {
        setTitle("Java MODULE 1 Explorer");
        setSize(800, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        textArea = new JTextArea();
        textArea.setFont(new Font("Monospaced", Font.PLAIN, 14));
        textArea.setEditable(false);
        add(new JScrollPane(textArea), BorderLayout.CENTER);

        JMenuBar menuBar = new JMenuBar();
        JMenu module1 = new JMenu("MODULE 1");
        JMenu module2Menu = new JMenu("MODULE 2");
		JMenu module3Menu = new JMenu("MODULE 3");


        String[] activities = {
            "Weather", "Password1", "Arr2Display", "ArrLargest", "ArrLowest",
            "Sorting", "AveReverse", "String1", "TallyString", "TallyNumber",
            "Object1", "Object2", "Object4", "BookObj"
        };

        // MODULE 2 Items
		        JMenuItem linkedListItem = new JMenuItem("LinkedList");
		        JMenuItem stackItem = new JMenuItem("Stack");
		        JMenuItem queueItem = new JMenuItem("Queue");
		        JMenuItem encapItem = new JMenuItem("Encapsulation");

		        // MODULE 3 Items
		        JMenuItem inheritanceItem = new JMenuItem("Inheritance");
		        JMenuItem polymorphismItem = new JMenuItem("Polymorphism");


        for (String activity : activities) {
            JMenuItem item = new JMenuItem(activity);
            item.addActionListener(e -> displayActivity(activity));
            module1.add(item);
        }

        menuBar.add(module1);
        setJMenuBar(menuBar);
    }

    private void displayActivity(String name) {
        switch (name) {
            case "Weather":
                textArea.setText(
                    "[Weather.java Simulation]\n" +
                    "How many days' temperature? 3\n" +
                    "Day1's high temp: 70\n" +
                    "Day2's high temp: 75\n" +
                    "Day3's high temp: 80\n" +
                    "Average temp = 75.00\n" +
                    "1 days above average"
                );
                break;

            case "Password1":
                textArea.setText(
                    "[Password1.java Simulation]\n" +
                    "Account Name: Computer\n" +
                    "Password: Science\n" +
                    "Welcome to Java computer programming!\n" +
                    "Length of S1: 8\n" +
                    "Length of S2: 7\n" +
                    "Concatenated String: ComputerScience\n" +
                    "S1 equals S2: false\n" +
                    "S1 equals S2 (ignore case): false\n" +
                    "S2 contains 'e': true\n" +
                    "Substring of S1 (1,5): ompu\n" +
                    "S1 replace 'o' with 'u': Cumpu­ter"
                );
                break;

            case "Arr2Display":
                textArea.setText(
                    "[Arr2Display.java Simulation]\n" +
                    "CS101 Introduction to Java Programming!\n" +
                    "Student        Test1     Test 2    Test 3    Average\n" +
                    "Student 1      87        96        70        84.33\n" +
                    "Student 2      68        87        90        81.67\n" +
                    "Student 3      94        100       90        94.67\n" +
                    "...\n" +
                    "Student 10     87        93        73        84.33"
                );
                break;

            case "ArrLargest":
                textArea.setText(
                    "[ArrLargest.java Simulation]\n" +
                    "The largest number in the array is: 95"
                );
                break;

            case "ArrLowest":
                textArea.setText(
                    "[ArrLowest.java Simulation]\n" +
                    "The smallest number in the array is: 4"
                );
                break;

            case "Sorting":
                textArea.setText(
                    "[Sorting.java Simulation]\n" +
                    "Ascending: [10, 20, 30, 40, 50]\n" +
                    "Descending: [50, 40, 30, 20, 10]"
                );
                break;

            case "AveReverse":
                textArea.setText(
                    "[AveReverse.java Simulation]\n" +
                    "Average: 27.33\n" +
                    "Reversed array: 89 0 27 -5 42 11"
                );
                break;

            case "String1":
                textArea.setText(
                    "[String1.java Simulation]\n" +
                    "Enter String: Hello\n" +
                    "Length: 5\n" +
                    "Reversed: olleH"
                );
                break;

            case "TallyString":
                textArea.setText(
                    "[TallyString.java Simulation]\n" +
                    "Enter section data: ynnnyyy\n" +
                    "Section 1\n" +
                    "Student points: [4, 3, 1, 3, 6]\n" +
                    "Student grades: 20.0 15.0 5.0 15.0 30.0"
                );
                break;

            case "TallyNumber":
                textArea.setText(
                    "[TallyNumber.java Simulation]\n" +
                    "Most Frequent digit in 749224477 is: 7"
                );
                break;

            case "Object1":
                textArea.setText(
                    "[Object1.java Simulation]\n" +
                    "Enter length: 5\n" +
                    "Enter breadth: 3\n" +
                    "Area of rectangle: 15.0"
                );
                break;

            case "Object2":
                textArea.setText(
                    "[Object2.java Simulation]\n" +
                    "Name is John and roll number is 2"
                );
                break;

            case "Object4":
                textArea.setText(
                    "[Object4.java Simulation]\n" +
                    "Area of the triangle: 6.0\n" +
                    "Perimeter of the triangle: 12"
                );
                break;

            case "BookObj":
                textArea.setText(
                    "[BookObj.java Simulation]\n" +
                    "Book 1:\n" +
                    "Title: To Kill a Mockingbird\n" +
                    "Author: Harper Lee\n" +
                    "Total Pages: 281\n" +
                    "Year Published: 1960\n\n" +
                    "Book 2:\n" +
                    "Title: 1984\n" +
                    "Author: George Orwell\n" +
                    "Total Pages: 328\n" +
                    "Year Published: 1949"
                );
                break;
        }
    }

    linkedListItem.addActionListener(e -> outputArea.setText("""
	LinkedList list = new LinkedList();
	list.insert(10);
	list.insert(20);
	list.insert(30);
	list.display();

	Output:
	10 -> 20 -> 30 -> NULL
	"""));

	        stackItem.addActionListener(e -> outputArea.setText("""
	Stack s = new Stack();
	s.push(10);
	s.push(20);
	s.push(30);
	s.display();
	s.pop();
	s.display();

	Output:
	Stack: 10 20 30
	Popped: 30
	Stack: 10 20
	"""));

	        queueItem.addActionListener(e -> outputArea.setText("""
	Queue q = new Queue();
	q.enqueue(100);
	q.enqueue(200);
	q.enqueue(300);
	q.display();
	q.dequeue();
	q.display();

	Output:
	Queue: 100 200 300
	Dequeued: 100
	Queue: 200 300
	"""));

	        encapItem.addActionListener(e -> outputArea.setText("""
	Employee e = new Employee();
	e.setName("Richard");
	e.setAge(41);
	e.setEmpID(12465789);

	System.out.println("Employee's name: " + e.getName());
	System.out.println("Employee's age: " + e.getAge());
	System.out.println("Employee's ID: " + e.getEmpID());

	Output:
	Employee's name: Richard
	Employee's age: 41
	Employee's ID: 12465789
	"""));

	        inheritanceItem.addActionListener(e -> outputArea.setText("""
	Tiger myTiger = new Tiger();
	myTiger.makeSound();
	myTiger.sleep();
	myTiger.roar();
	myTiger.hunt();

	Output:
	This animal makes a sound.
	This animal sleeps.
	Bengal Tiger roars loudly!
	Bengal Tiger is hunting in the jungle.
	"""));

	        polymorphismItem.addActionListener(e -> outputArea.setText("""
	Animal a;
	a = new Dog();
	a.sound();
	a = new Cat();
	a.sound();

	Output:
	The dog barks
	The cat meows
	"""));

	        module2Menu.add(linkedListItem);
	        module2Menu.add(stackItem);
	        module2Menu.add(queueItem);
	        module2Menu.add(encapItem);

	        module3Menu.add(inheritanceItem);
	        module3Menu.add(polymorphismItem);

	        menuBar.add(module2Menu);
	        menuBar.add(module3Menu);

	        frame.setJMenuBar(menuBar);
	        frame.add(scrollPane);
	        frame.setVisible(true);
	    }

	    // MODULE 2 classes (simplified or referenced here as examples)
	    static class LinkedList {
	        class Node {
	            int data;
	            Node next;
	        }
	        Node head;
	        void insert(int data) {
	            Node newNode = new Node();
	            newNode.data = data;
	            if (head == null) head = newNode;
	            else {
	                Node temp = head;
	                while (temp.next != null) temp = temp.next;
	                temp.next = newNode;
	            }
	        }
	        void display() {
	            Node temp = head;
	            while (temp != null) {
	                System.out.print(temp.data + " -> ");
	                temp = temp.next;
	            }
	            System.out.println("NULL");
	        }
	    }

	    static class Stack {
	        int[] stack = new int[5];
	        int top = -1;
	        void push(int data) {
	            if (top < 4) stack[++top] = data;
	            else System.out.println("Stack Overflow");
	        }
	        void pop() {
	            if (top >= 0) System.out.println("Popped: " + stack[top--]);
	            else System.out.println("Stack Underflow");
	        }
	        void display() {
	            System.out.print("Stack: ");
	            for (int i = 0; i <= top; i++)
	                System.out.print(stack[i] + " ");
	            System.out.println();
	        }
	    }

	    static class Queue {
	        int[] queue = new int[5];
	        int front = 0, rear = 0;
	        void enqueue(int data) {
	            if (rear < 5) queue[rear++] = data;
	            else System.out.println("Queue Overflow");
	        }
	        void dequeue() {
	            if (front < rear) System.out.println("Dequeued: " + queue[front++]);
	            else System.out.println("Queue Underflow");
	        }
	        void display() {
	            System.out.print("Queue: ");
	            for (int i = front; i < rear; i++)
	                System.out.print(queue[i] + " ");
	            System.out.println();
	        }
	    }

	    static class Encap1 {
	        static class Employee {
	            private String name;
	            private int age;
	            private int empID;
	            public void setName(String name) { this.name = name; }
	            public void setAge(int age) { this.age = age; }
	            public void setEmpID(int empID) { this.empID = empID; }
	            public String getName() { return name; }
	            public int getAge() { return age; }
	            public int getEmpID() { return empID; }
	        }
	    }

	    // MODULE 3 classes
	    static class Animal {
	        void makeSound() { System.out.println("This animal makes a sound."); }
	        void sleep() { System.out.println("This animal sleeps."); }
	        void sound() { System.out.println("This animal makes a sound"); }
	    }

	    static class Tiger extends Animal {
	        String name = "Bengal Tiger";
	        void roar() { System.out.println(name + " roars loudly!"); }
	        void hunt() { System.out.println(name + " is hunting in the jungle."); }
	    }

	    static class Dog extends Animal {
	        @Override
	        void sound() { System.out.println("The dog barks"); }
	    }

	    static class Cat extends Animal {
	        @Override
	        void sound() { System.out.println("The cat meows"); }
	    }
}

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new JavaModule1Explorer().setVisible(true));
    }
}
