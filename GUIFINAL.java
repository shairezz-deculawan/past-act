import java.awt.BorderLayout;
import java.awt.Font;
import java.io.*;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.swing.*;

public class GUIFINAL extends JFrame {
    private JTextArea codeArea;
    private JTextArea outputArea;
    private JButton runButton;

    private Map<String, Map<String, String>> categorizedActivities;
    private String currentActivityKey = "";

    public GUIFINAL() {
        setTitle("Java Activity Explorer");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(850, 620);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        Font codeFont = new Font("Monospaced", Font.PLAIN, 14);
        categorizedActivities = new LinkedHashMap<>();


		Map<String, String> module1 = new LinkedHashMap<>();
		module1.put("Array2Display", "public class Array2Display {\n" +
		"    public static void main(String[] args) {\n" +
		"        String course = \"CS101 Introduction to Java Programming!\";\n" +
		"        String[] students = {\n" +
		"            \"Student1\", \"Student2\", \"Student3\", \"Student4\",\n" +
		"            \"Student5\", \"Student6\", \"Student7\", \"Student8\",\n" +
		"            \"Student9\", \"Student10\"\n" +
		"        };\n" +
		"        int[][] grades = {\n" +
		"            {87, 96, 70}, {68, 87, 90}, {94, 100, 90}, {100, 81, 82},\n" +
		"            {83, 65, 85}, {78, 87, 65}, {85, 75, 83}, {91, 94, 100},\n" +
		"            {76, 72, 84}, {87, 93, 73}\n" +
		"        };\n" +
		"\n" +
		"        System.out.println(\"The Grades are: \");\n" +
		"        System.out.println(course);\n" +
		"        System.out.printf(\"%-15s%-10s%-10s%-10s%-10s%n\", \"Student\", \"Test 1\", \"Test 2\", \"Test 3\", \"Average\");\n" +
		"\n" +
		"        for (int i = 0; i < students.length; i++) {\n" +
		"            double sum = 0;\n" +
		"            System.out.printf(\"%-15s\", students[i]);\n" +
		"            for (int j = 0; j < 3; j++) {\n" +
		"                System.out.printf(\"%-10d\", grades[i][j]);\n" +
		"                sum += grades[i][j];\n" +
		"            }\n" +
		"            double average = sum / 3;\n" +
		"            System.out.printf(\"%-10.2f%n\", average);\n" +
		"        }\n" +
		"    }\n" +
"}");
		module1.put("Password1", "import java.util.Scanner;\n\npublic class Password1 {\n    public static void main(String[] args) {\n        Scanner input = new Scanner(System.in);\n        \n        String accountName = \"Computer\";\n        String password = \"Science\";\n\n        System.out.print(\"Enter Account Name: \" );\n        String inputAccount = input.nextLine();\n\n        System.out.print(\"Enter Password: \" );\n        String inputPassword = input.nextLine();\n\n        if (accountName.equals(inputAccount) && password.equals(inputPassword)) {\n            System.out.println(\"Welcome to Java computer programming!\");\n        } else {\n            System.out.println(\"Wrong Entry\");\n        }\n\n        System.out.println(\"\\nDemonstrating String Methods:\");\n        System.out.println(\"Length of account name: \" + accountName.length());\n        System.out.println(\"Concatenation: \" + accountName.concat(password));\n        System.out.println(\"Equals (case-sensitive): \" + accountName.equals(inputAccount));\n        System.out.println(\"Equals Ignore Case: \" + accountName.equalsIgnoreCase(inputAccount));\n        System.out.println(\"Contains 'e' in password: \" + password.contains(\"e\"));\n        System.out.println(\"Substring (1,5) of account name: \" + accountName.substring(1, 5));\n        System.out.println(\"Replace 'o' with 'u' in account name: \" + accountName.replace(\"o\", \"u\"));\n\n        input.close();\n    }\n}");

		module1.put("ArraysWeather", "import java.util.Scanner;\n\npublic class ArraysWeather {\n    public static void main(String[] args) {\n        Scanner input = new Scanner(System.in);\n\n        System.out.print(\"Days' Temp? \");\n        int days = input.nextInt();\n\n        int[] temp = new int[days];\n        int sum = 0;\n\n        for (int i = 0; i < days; i++) {\n            System.out.print(\"Day \" + (i + 1) + \" high temp: \");\n            temp[i] = input.nextInt();\n            sum += temp[i];\n        }\n\n        double average = (double) sum / days;\n        int count = 0;\n\n        for (int i = 0; i < days; i++) {\n            if (temp[i] > average) {\n                count++;\n            }\n        }\n\n        System.out.printf(\"Average temp = %.1f\\n\", average);\n        System.out.println(count + \" days above average\");\n    }\n}");

		module1.put("ArrLargest", "public class ArrLargest {\n    public static void main(String[] args) {\n        int[] arr = {32, 27, 64, 18, 95, 14, 90, 70, 60, 37};\n\n        int max = arr[0];\n        for (int i = 1; i < arr.length; i++) {\n            if (arr[i] > max) {\n                max = arr[i];\n            }\n        }\n        System.out.println(\"The largest number in the array is: \" + max);\n    }\n}");

		module1.put("ArrSmallest", "public class ArrSmallest {\n    public static void main(String[] args) {\n        int[] arr = {32, 27, 64, 18, 95, 14, 90, 70, 60, 37};\n\n        int min = arr[0];\n        for (int i = 1; i < arr.length; i++) {\n            if (arr[i] < min) {\n                min = arr[i];\n            }\n        }\n\n        System.out.println(\"The smallest number in the array is: \" + min);\n    }\n}");

		module1.put("AverageReverse",
		    "public class AverageReverse {\n" +
		    "    public static void main(String[] args) {\n" +
		    "        int[] numbers = {11, 42, -5, 27, 0, 89};\n\n" +
		    "        double average = calculateAverage(numbers);\n" +
		    "        System.out.println(\"Average: \" + average);\n\n" +
		    "        reverseArray(numbers);\n\n" +
		    "        System.out.print(\"Reversed Array: \");\n" +
		    "        for (int num : numbers) {\n" +
		    "            System.out.print(num + \" \");\n" +
		    "        }\n" +
		    "    }\n\n" +
		    "    public static double calculateAverage(int[] numbers) {\n" +
		    "        int sum = 0;\n" +
		    "        for (int num : numbers) {\n" +
		    "            sum += num;\n" +
		    "        }\n" +
		    "        return (double) sum / numbers.length;\n" +
		    "    }\n\n" +
		    "    public static void reverseArray(int[] numbers) {\n" +
		    "        int n = numbers.length;\n" +
		    "        for (int i = 0; i < n / 2; i++) {\n" +
		    "            int temp = numbers[i];\n" +
		    "            numbers[i] = numbers[n - 1 - i];\n" +
		    "            numbers[n - 1 - i] = temp;\n" +
		    "        }\n" +
		    "    }\n" +
		    "}");

			module1.put("Sorting",
			    "import java.util.Arrays;\n" +
			    "import java.util.Collections;\n\n" +
			    "public class Sorting{\n" +
			    "    public static void main (String [] args){\n\n" +
			    "        int [] numbers = {30,50,10,20,40};\n" +
			    "        Arrays.sort(numbers);\n" +
			    "        System.out.println(Arrays.toString(numbers));\n\n" +
			    "        Integer[] numObjects = {30,50,10,20,40};\n" +
			    "        Arrays.sort(numObjects, Collections.reverseOrder());\n" +
			    "        System.out.println(Arrays.toString(numObjects));\n" +
			    "    }\n" +
			    "}");
		module1.put("String1",
		    "import java.util.Scanner;\n\n" +
		    "public class String1{\n" +
		    "    public static void main(String [] args){\n" +
		    "        Scanner scanner = new Scanner(System.in);\n\n" +
		    "        System.out.print(\"Enter String: \");\n" +
		    "        String in = scanner.nextLine();\n\n" +
		    "        int length = in.length();\n\n" +
		    "        String reversed = new StringBuilder(in).reverse().toString();\n\n" +
		    "        System.out.println(\"Length: \" + length);\n" +
		    "        System.out.println(\"Reversed: \" +  reversed);\n" +
		    "    }\n" +
		    "}"
		);
		module1.put("StringOperation",
		    "public class StringOperation {\n" +
		    "    public static void main(String[] args) {\n" +
		    "        // Given strings\n" +
		    "        String S1 = \"Good morning Set A\";\n" +
		    "        String S2 = \"Welcome to Programming 2\";\n\n" +
		    "        // Get and display the length of each string\n" +
		    "        int lengthS1 = S1.length();\n" +
		    "        int lengthS2 = S2.length();\n\n" +
		    "        System.out.println(\"Length of S1: \" + lengthS1);\n" +
		    "        System.out.println(\"Length of S2: \" + lengthS2);\n\n" +
		    "        // Concatenate the strings\n" +
		    "        String concatenatedString = S1 + \" \" + S2;\n\n" +
		    "        // Display concatenated result\n" +
		    "        System.out.println(\"Concatenated String: \" + concatenatedString);\n" +
		    "    }\n" +
		    "}"
		);
		module1.put("TallyNumber",
		    "public class TallyNumber { \n" +
		    "    public static void main(String[] args) {\n" +
		    "        int n = 19924992;\n" +
		    "        int digit = mostFrequentDigit(n);\n" +
		    "        System.out.println(\"Most frequent digit in \" + n + \" is: \" + digit);\n" +
		    "    }\n\n" +
		    "    public static int mostFrequentDigit(int n) {\n" +
		    "        int[] digits = new int[20];\n\n" +
		    "        while (n > 0) {\n" +
		    "            int digit = n % 10;\n" +
		    "            digits[digit]++;\n" +
		    "            n /= 10;\n" +
		    "        }\n\n" +
		    "        int bestDigit = 0;\n" +
		    "        for (int i = 0; i < digits.length; i++) {\n" +
		    "            if (digits[i] > digits[bestDigit]) {\n" +
		    "                bestDigit = i;\n" +
		    "            }\n" +
		    "        }\n\n" +
		    "        return bestDigit;\n" +
		    "    }\n" +
		    "}"
		);

		module1.put("Object4",
    "import javax.swing.*;\n" +
    "\n" +
    "class Triangle {\n" +
    "    private double a, b, c;\n" +
    "\n" +
    "    Triangle() {\n" +
    "        this.a = 3;\n" +
    "        this.b = 4;\n" +
    "        this.c = 5;\n" +
    "    }\n" +
    "\n" +
    "    double getArea() {\n" +
    "        double s = (a + b + c) / 2;\n" +
    "        return Math.sqrt(s * (s - a) * (s - b) * (s - c));\n" +
    "    }\n" +
    "\n" +
    "    double getPerimeter() {\n" +
    "        return a + b + c;\n" +
    "    }\n" +
    "}\n" +
    "\n" +
    "public class Object4 {\n" +
    "    public static void main(String[] args) {\n" +
    "        Triangle t = new Triangle();\n" +
    "        String output = \"Area of the triangle: \" + t.getArea() + \"\\n\" +\n" +
    "                        \"Perimeter of the triangle: \" + t.getPerimeter();\n" +
    "        JOptionPane.showMessageDialog(null, output, \"Triangle Info\", JOptionPane.INFORMATION_MESSAGE);\n" +
    "    }\n" +
    "}"
);
	module1.put("Object2",
	    "import javax.swing.*;\n" +
	    "\n" +
	    "class Student {\n" +
	    "    String name;\n" +
	    "    int roll_no;\n" +
	    "}\n" +
	    "\n" +
	    "public class Object2 {\n" +
	    "    public static void main(String[] args) {\n" +
	    "        Student s = new Student();\n" +
	    "        s.name = \"John\";\n" +
	    "        s.roll_no = 2;\n" +
	    "\n" +
	    "        String output = \"Name is \" + s.name + \" and roll number is \" + s.roll_no;\n" +
	    "        JOptionPane.showMessageDialog(null, output, \"Student Info\", JOptionPane.INFORMATION_MESSAGE);\n" +
	    "    }\n" +
	    "}"
);
		module1.put("Object1",
		    "import javax.swing.*;\n" +
		    "\n" +
		    "class Area {\n" +
		    "    private double length;\n" +
		    "    private double breadth;\n" +
		    "\n" +
		    "    public void setDim(double length, double breadth) {\n" +
		    "        this.length = length;\n" +
		    "        this.breadth = breadth;\n" +
		    "    }\n" +
		    "\n" +
		    "    public double getArea() {\n" +
		    "        return length * breadth;\n" +
		    "    }\n" +
		    "}\n" +
		    "\n" +
		    "public class Object1 {\n" +
		    "    public static void main(String[] args) {\n" +
		    "        try {\n" +
		    "            double length = Double.parseDouble(JOptionPane.showInputDialog(\"Enter length:\"));\n" +
		    "            double breadth = Double.parseDouble(JOptionPane.showInputDialog(\"Enter breadth:\"));\n" +
		    "\n" +
		    "            Area rect = new Area();\n" +
		    "            rect.setDim(length, breadth);\n" +
		    "\n" +
		    "            JOptionPane.showMessageDialog(null,\n" +
		    "                \"Area of Rectangle: \" + rect.getArea(),\n" +
		    "                \"Area Calculator\",\n" +
		    "                JOptionPane.INFORMATION_MESSAGE);\n" +
		    "        } catch (Exception e) {\n" +
		    "            JOptionPane.showMessageDialog(null,\n" +
		    "                \"Invalid input!\",\n" +
		    "                \"Error\",\n" +
		    "                JOptionPane.ERROR_MESSAGE);\n" +
		    "        }\n" +
		    "    }\n" +
		    "}"
		);
			module1.put("BookObj",
			    "import javax.swing.*;\n" +
			    "\n" +
			    "class Book {\n" +
			    "    String title;\n" +
			    "    String author;\n" +
			    "    int totalPages;\n" +
			    "    int yearPublished;\n" +
			    "\n" +
			    "    public Book(String title, String author, int totalPages, int yearPublished) {\n" +
			    "        this.title = title;\n" +
			    "        this.author = author;\n" +
			    "        this.totalPages = totalPages;\n" +
			    "        this.yearPublished = yearPublished;\n" +
			    "    }\n" +
			    "\n" +
			    "    public String display() {\n" +
			    "        return \"Title: \" + title + \"\\n\" +\n" +
			    "               \"Author: \" + author + \"\\n\" +\n" +
			    "               \"Total Pages: \" + totalPages + \"\\n\" +\n" +
			    "               \"Year Published: \" + yearPublished + \"\\n\\n\";\n" +
			    "    }\n" +
			    "}\n" +
			    "\n" +
			    "public class BookObj {\n" +
			    "    public static void main(String[] args) {\n" +
			    "        Book book1 = new Book(\"Encantadia\", \"Renz General\", 205, 1998);\n" +
			    "        Book book2 = new Book(\"Harry Roque\", \"Darwin Mara\", 101, 2001);\n" +
			    "\n" +
			    "        String output = \"Book 1:\\n\" + book1.display() + \"Book 2:\\n\" + book2.display();\n" +
			    "\n" +
			    "        JOptionPane.showMessageDialog(null, output, \"Book Details\", JOptionPane.INFORMATION_MESSAGE);\n" +
			    "    }\n" +
			    "}"
);

        categorizedActivities.put("Module 1", module1);


        Map<String, String> module2 = new LinkedHashMap<>();
        module2.put("LinkedList", "class Node {\n    int data;\n    Node next;\n\n    Node(int data) {\n        this.data = data;\n        this.next = null;\n    }\n}\n\npublic class LinkedList {\n    Node head;\n\n    void insertAtBeginning(int data) {\n        Node newNode = new Node(data);\n        newNode.next = head;\n        head = newNode;\n    }\n\n    void display() {\n        Node current = head;\n        System.out.print(\"Linked List: \");\n        while (current != null) {\n            System.out.print(current.data + \" -> \");\n            current = current.next;\n        }\n        System.out.println(\"NULL\");\n    }\n\n    public static void main(String[] args) {\n        LinkedList list = new LinkedList();\n        list.insertAtBeginning(10);\n        list.insertAtBeginning(20);\n        list.insertAtBeginning(30);\n        list.display();\n    }\n}");
		module2.put("Stack1", "class StackNode {\n    int data;\n    StackNode next;\n\n    StackNode(int data) {\n        this.data = data;\n        this.next = null;\n    }\n}\n\nclass Stack {\n    private StackNode top;\n\n    public void push(int value) {\n        StackNode newNode = new StackNode(value);\n        newNode.next = top;\n        top = newNode;\n    }\n\n    public void pop() {\n        if (top == null) {\n            System.out.println(\"Stack is empty\");\n        } else {\n            top = top.next;\n        }\n    }\n\n    public void display() {\n        StackNode temp = top;\n        while (temp != null) {\n            System.out.print(temp.data + \" -> \");\n            temp = temp.next;\n        }\n        System.out.println(\"NULL\");\n    }\n}\n\npublic class Stack1 {\n    public static void main(String[] args) {\n        Stack stack = new Stack();\n\n        stack.push(10);\n        stack.push(20);\n        stack.push(30);\n\n        stack.display(); // 30 -> 20 -> 10 -> NULL\n\n        stack.pop();\n\n        stack.display(); // 20 -> 10 -> NULL\n    }\n}");
        module2.put("Queue1", "class Queues {\n    int data;\n    Queues next;\n\n    Queues(int data) {\n        this.data = data;\n        this.next = null;\n    }\n}\n\nclass Queue {\n    private Queues front, rear;\n\n    public void enqueue(int value) {\n        Queues newNode = new Queues(value);\n        if (front == null) {\n            front = rear = newNode;\n            return;\n        }\n        rear.next = newNode;\n        rear = newNode;\n    }\n\n    public void dequeue() {\n        if (front == null) {\n            System.out.println(\"Queue is empty\");\n            return;\n        }\n        front = front.next;\n        if (front == null) {\n            rear = null;\n        }\n    }\n\n    public void display() {\n        Queues temp = front;\n        while (temp != null) {\n            System.out.print(temp.data + \" -> \");\n            temp = temp.next;\n        }\n        System.out.println(\"NULL\");\n    }\n}\n\npublic class Queue1 {\n    public static void main(String[] args) {\n        Queue queue = new Queue();\n\n        queue.enqueue(10);\n        queue.enqueue(20);\n        queue.enqueue(30);\n\n        queue.display();  // Output: 10 -> 20 -> 30 -> NULL\n\n        queue.dequeue();\n\n        queue.display();  // Output: 20 -> 30 -> NULL\n    }\n}");
		module2.put("JMenu1", "import javax.swing.*;\n\npublic class JMenu1 {\n    public static void main(String[] args) {\n        SwingUtilities.invokeLater(JMenu1::createAndShowGUI);\n    }\n\n    private static void createAndShowGUI() {\n        JFrame frame = new JFrame(\"Simple Menu Example\");\n        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);\n\n        JMenuBar menuBar = new JMenuBar();\n\n        JMenu fileMenu = new JMenu(\"File\");\n        JMenuItem newItem = new JMenuItem(\"New\");\n        JMenuItem openItem = new JMenuItem(\"Open\");\n        JMenuItem exitItem = new JMenuItem(\"Exit\");\n\n        exitItem.addActionListener(e -> System.exit(0));\n\n        fileMenu.add(newItem);\n        fileMenu.add(openItem);\n        fileMenu.addSeparator();\n        fileMenu.add(exitItem);\n\n        JMenu editMenu = new JMenu(\"Edit\");\n        editMenu.add(new JMenuItem(\"Cut\"));\n        editMenu.add(new JMenuItem(\"Copy\"));\n        editMenu.add(new JMenuItem(\"Paste\"));\n\n        menuBar.add(fileMenu);\n        menuBar.add(editMenu);\n\n        frame.setJMenuBar(menuBar);\n        frame.setSize(400, 300);\n        frame.setVisible(true);\n    }\n}");

        categorizedActivities.put("Module 2", module2);

        Map<String, String> module3 = new LinkedHashMap<>();
        module3.put("Encap1", "public class Encap1 {\n    public static void main(String[] args) {\n        Employee emp = new Employee(\"Richard\", 41, 12464789);\n        System.out.println(emp);\n    }\n}\n\nclass Employee {\n    private String name;\n    private int age;\n    private int empID;\n\n    public Employee(String name, int age, int empID) {\n        this.name = name;\n        this.age = age;\n        this.empID = empID;\n    }\n\n    public String getName() {\n        return name;\n    }\n\n    public void setName(String name) {\n        this.name = name;\n    }\n\n    public int getAge() {\n        return age;\n    }\n\n    public void setAge(int age) {\n        this.age = age;\n    }\n\n    public int getEmpID() {\n        return empID;\n    }\n\n    public void setEmpID(int empID) {\n        this.empID = empID;\n    }\n\n    @Override\n    public String toString() {\n        return \"Employee{\" +\n                \"name='\" + name + '\\'' +\n                \", age=\" + age +\n                \", empID=\" + empID +\n                '}';\n    }\n}");
		module3.put("Inheritance", "class Vehicle {\n    int speed;\n\n    public void move() {\n        System.out.println(\"The vehicle is moving at \" + speed + \" km/h.\");\n    }\n}\n\nclass Car extends Vehicle {\n    String brand;\n\n    public void displayInfo() {\n        System.out.println(\"Brand: \" + brand);\n        System.out.println(\"Speed: \" + speed + \" km/h\");\n    }\n}\n\npublic class Inheritance {\n    public static void main(String[] args) {\n        Car myCar = new Car();\n        myCar.speed = 120;\n        myCar.brand = \"Toyota\";\n\n        myCar.move();\n        myCar.displayInfo();\n    }\n}");
        module3.put("Polymorphism1", "class Animal {\n    void sound() {\n        System.out.println(\"This animal makes a sound\");\n    }\n}\n\nclass Dog extends Animal {\n    void sound() {\n        System.out.println(\"The dog barks\");\n    }\n}\n\nclass Cat extends Animal {\n    void sound() {\n        System.out.println(\"The cat meows\");\n    }\n}\n\npublic class Polymorphism1 {\n    public static void main(String[] args) {\n        Animal a;\n\n        a = new Dog();\n        a.sound();\n\n        a = new Cat();\n        a.sound();\n    }\n}");
        categorizedActivities.put("Module 3", module3);

        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("File");
        JMenu openMenu = new JMenu("Open Activity");

        for (String category : categorizedActivities.keySet()) {
            JMenu categoryMenu = new JMenu(category);
            Map<String, String> activities = categorizedActivities.get(category);
            for (String activityName : activities.keySet()) {
                JMenuItem item = new JMenuItem(activityName);
                item.addActionListener(e -> {
                    currentActivityKey = activityName;
                    codeArea.setText(activities.get(activityName));
                    outputArea.setText("Activity loaded: " + activityName + "\nPress 'Run Activity' to compile and run.");
                });
                categoryMenu.add(item);
            }
            openMenu.add(categoryMenu);
        }

        fileMenu.add(openMenu);
        menuBar.add(fileMenu);
        setJMenuBar(menuBar);

        JSplitPane splitPane = new JSplitPane(JSplitPane.VERTICAL_SPLIT);

        codeArea = new JTextArea();
        codeArea.setFont(codeFont);
        JScrollPane codeScroll = new JScrollPane(codeArea);
        codeScroll.setBorder(BorderFactory.createTitledBorder("Code Area"));
        splitPane.setTopComponent(codeScroll);

        outputArea = new JTextArea();
        outputArea.setFont(codeFont);
        outputArea.setEditable(false);
        outputArea.setText("Welcome to Java Activity Explorer.\nChoose an activity from File > Open Activity.");
        JScrollPane outputScroll = new JScrollPane(outputArea);
        outputScroll.setBorder(BorderFactory.createTitledBorder("Output"));
        splitPane.setBottomComponent(outputScroll);

        splitPane.setDividerLocation(300);
        add(splitPane, BorderLayout.CENTER);

        JPanel bottomPanel = new JPanel();
        runButton = new JButton("Run Activity");
        runButton.addActionListener(e -> simulateRun());
        bottomPanel.add(runButton);
        add(bottomPanel, BorderLayout.SOUTH);

        SwingUtilities.invokeLater(() -> {
            JTextArea introText = new JTextArea(
                "Final MCO for ITE4 (Computer Programming 2)\n" +
                "by: Jovon Guyo\n" +
                "BSCS-1C");
            introText.setFont(new Font("Serif", Font.BOLD, 16));
            introText.setEditable(false);
            introText.setBackground(null);
            introText.setBorder(null);
            JOptionPane.showMessageDialog(this, introText, "Welcome", JOptionPane.INFORMATION_MESSAGE);
        });
    }

    private void simulateRun() {
        if (codeArea.getText().trim().isEmpty()) {
            outputArea.setText("Code area is empty!");
            return;
        }

        try {
            String code = codeArea.getText();
            String className = extractClassName(code);
            if (className == null) {
                outputArea.setText("Error: Could not find a public class name.");
                return;
            }

            File file = new File(className + ".java");
            try (FileWriter writer = new FileWriter(file)) {
                writer.write(code);
            }

            Process compileProcess = Runtime.getRuntime().exec("javac " + file.getName());
            compileProcess.waitFor();

            BufferedReader errorReader = new BufferedReader(new InputStreamReader(compileProcess.getErrorStream()));
            StringBuilder errorOutput = new StringBuilder();
            String line;
            while ((line = errorReader.readLine()) != null) {
                errorOutput.append(line).append("\n");
            }

            if (errorOutput.length() > 0) {
                outputArea.setText("Compilation errors:\n" + errorOutput.toString());
                return;
            }

            Process runProcess = Runtime.getRuntime().exec("java " + className);
            BufferedReader inputReader = new BufferedReader(new InputStreamReader(runProcess.getInputStream()));
            BufferedReader runErrorReader = new BufferedReader(new InputStreamReader(runProcess.getErrorStream()));

            StringBuilder output = new StringBuilder();
            while ((line = inputReader.readLine()) != null) {
                output.append(line).append("\n");
            }
            while ((line = runErrorReader.readLine()) != null) {
                output.append("ERR: ").append(line).append("\n");
            }

            runProcess.waitFor();

            outputArea.setText("Running " + className + "...\n\n" + output.toString());

            file.delete();
            new File(className + ".class").delete();

        } catch (Exception ex) {
            outputArea.setText("Error during execution:\n" + ex.getMessage());
            ex.printStackTrace();
        }
    }

    private String extractClassName(String code) {
        for (String line : code.split("\n")) {
            line = line.trim();
            if (line.startsWith("public class")) {
                String[] parts = line.split("\\s+");
                if (parts.length >= 3) {
                    return parts[2].replace("{", "").trim();
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            GUIFINAL gui = new GUIFINAL();
            gui.setVisible(true);
        });
    }
}