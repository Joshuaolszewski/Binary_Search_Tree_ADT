
//Joshua Olszewski
//BST 
import java.util.Scanner;
import java.io.FileWriter;   
import java.io.IOException;
import java.io.PrintStream;
import java.io.File;
public class Main
{
    public static void main(String[] args) throws IOException
    {
        BST bst = new BST();
        File file = new File("output.txt");
        PrintStream stream = new PrintStream(file);
        PrintStream standard = System.out;
        Scanner scanner = new Scanner(System.in);
        
        boolean exit = false; 
        System.out.println("Seed the Tree");
        while(exit == false)
        {
            System.out.println("Type: done or seed"); 
            String input = scanner.nextLine();
            
            if(input.equals("seed"))
            {
                System.out.println("Enter a Dollar Double value: "); 
                String inputValue = scanner.nextLine();
                try
                {
                    double value = Double.parseDouble(inputValue);
                    bst.Insert(new BSTNode(new Dollar(value))); 
                }
                catch(Exception e)
                {
                    System.out.println("This input: " + inputValue + " is not valid");
                    System.setOut(stream);
                    System.out.println("This input: " + inputValue + " is not valid");
                    System.setOut(standard);
                }     
            }
            else
            {
                exit = true; 
            }
        }
        
        exit = false; 
        
        while(exit == false) 
        {
            System.out.println("Enter a number:\n1) Print \n2) Insert \n3) Delete \n4) Search \n5) Exit");
            String input = scanner.nextLine();
           
            int numberOption = Integer.parseInt(input);
            
            if(numberOption == 1)
            {
                System.out.println("Breadth First");
                bst.PrintBreadthFirst();
                System.setOut(stream);
                System.out.println("Breadth First");
                bst.PrintBreadthFirst();
                System.setOut(standard);
                
                System.out.println("In Order");
                bst.PrintInOrder(bst.getRoot());
                System.setOut(stream);
                System.out.println("In Order");
                bst.PrintInOrder(bst.getRoot());
                System.setOut(standard);
                
                System.out.println("Pre Order");
                bst.PrintPreOrder(bst.getRoot());
                System.setOut(stream);
                System.out.println("Pre Order");
                bst.PrintPreOrder(bst.getRoot());
                System.setOut(standard);
                
                System.out.println("Post Order");
                bst.PrintPostOrder(bst.getRoot());
                System.setOut(stream);
                System.out.println("Post Order");
                bst.PrintPostOrder(bst.getRoot());
                System.setOut(standard);
            }
            if(numberOption == 2)
            {
                System.out.println("Enter a Dollar Double value: "); 
                String inputValue = scanner.nextLine();
                try
                {
                    double value = Double.parseDouble(inputValue);
                    bst.Insert(new BSTNode(new Dollar(value))); 
                }
                catch(Exception e)
                {
                    System.out.println("This input: " + inputValue + " is not valid");
                    System.setOut(stream);
                    System.out.println("This input: " + inputValue + " is not valid");
                    System.setOut(standard);
                }              
            }
            if(numberOption == 3)
            {
                System.out.println("Enter a Dollar Double value: "); 
                String inputValue = scanner.nextLine();
                try
                {
                    Double value = Double.parseDouble(inputValue);
                    bst.Remove(new Dollar(value)); 
                }
                catch(Exception e)
                {
                    System.out.println("This input: " + inputValue + " is not valid");
                    System.setOut(stream);
                    System.out.println("This input: " + inputValue + " is not valid");
                    System.setOut(standard);
                }              
            }
            if(numberOption == 4)
            {
                System.out.println("Enter a Dollar Double value: "); 
                String inputValue = scanner.nextLine();
                try
                {
                    Double value = Double.parseDouble(inputValue);
                    if(bst.Search(new Dollar(value)) != null)
                    {
                        System.out.println("Found"); 
                    }
                    else
                    {
                        System.out.println("Not Found"); 
                    }
                }
                catch(Exception e)
                {
                    System.out.println("This input: " + inputValue + " is not valid");
                    System.setOut(stream);
                    System.out.println("This input: " + inputValue + " is not valid");
                    System.setOut(standard);
                }              
            }
            if(numberOption == 5)
            {
                exit = true; 
                System.out.println("Breadth First");
                bst.PrintBreadthFirst();
                System.setOut(stream);
                System.out.println("Breadth First");
                bst.PrintBreadthFirst();
                System.setOut(standard);
                
                System.out.println("In Order");
                bst.PrintInOrder(bst.getRoot());
                System.setOut(stream);
                System.out.println("In Order");
                bst.PrintInOrder(bst.getRoot());
                System.setOut(standard);
                
                System.out.println("Pre Order");
                bst.PrintPreOrder(bst.getRoot());
                System.setOut(stream);
                System.out.println("Pre Order");
                bst.PrintPreOrder(bst.getRoot());
                System.setOut(standard);
                
                System.out.println("Post Order");
                bst.PrintPostOrder(bst.getRoot());
                System.setOut(stream);
                System.out.println("Post Order");
                bst.PrintPostOrder(bst.getRoot());
                System.setOut(standard);
            }
        }    
    }
}