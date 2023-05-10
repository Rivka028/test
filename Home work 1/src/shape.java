import java.util.Scanner; 

public class shape {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        
        int shape=0;
        double width =0, height =0;
        
        while(shape!=3)
        {
        	System.out.println("Select a shape or closing the progrem:"); // Give the user to select a shape or go out
            System.out.println("1. Rectangle tower");
            System.out.println("2. Triangle tower");
            System.out.println("3. Close the progrem");
            
            shape = input.nextInt(); // Check the choice
            
            if(shape == 3) // Check if the user want to go out
            	break;
            
            else if(shape == 1 || shape ==2)  //  Check which shape the user wants
            {	
            	System.out.println("Enter the width of the tower:"); // Ask for width of the tower
            	width = input.nextDouble(); 

            	System.out.println("Enter the height of the tower:"); // Ask for height of the tower 
            	height = input.nextDouble(); 
        	
            	if(height<2) // Check if the height correct
            	{
            		System.out.println("The size of height is too small, Please enter a new one");
            		height = input.nextDouble();
            	}
        	
            	if(shape == 1) // Check if it is rectangle
            	{
            		if(width==height || width-height>5 || width-height<-5) //Checks if it is a square or a rectangle with the difference of more than 5 between the sides
            		{
            			double area = width * height; // Calculate the area of the rectangle
            			System.out.println("The area of the rectangle is: " + area); // Print the result
            		}
            		else
            		{
            			double scope = (width + height)*2; // Calculate the scope of the rectangle
            			System.out.println("The scope of the rectangle is: " + scope); // Print the result
            		}
            	}
            	else //  Check if it is triangle
            	{ 
            		// Calculate the length of the hypotenuse using the Pythagorean theorem
            		double hypotenuse = Math.sqrt(Math.pow(height, 2) + Math.pow(width, 2));
                
            		// Check if the triangle is isosceles
            		if (height != width || height != hypotenuse || width != hypotenuse)
            		{
            			System.out.println("This is not an isosceles triangle, Please enter new width and height for the triangle tower");
            			width = input.nextDouble(); 
            			height = input.nextDouble();
            		}
                
            		System.out.println("Select the act you want to do with the triangle tower:"); // Give the user to choose what to do with the triangle tower
            		System.out.println("1. Calculate the scope of tower");
            		System.out.println("2. Print the tower");
                
            		double action = input.nextInt(); // Check the choice of the action 
                		if (action == 1)
                		{
                			double triangleScope = (hypotenuse*2)+ width;
                			System.out.println("The area of the rectangle is: " + triangleScope); // Print the result
                		}
                		else if (action == 2)
                		{
                			if((width % 2 == 0) ||(width > 2 * height))
                			{
                				System.out.println("We can't print this tower");
                			}
                			else
                			{
                				double numOfSpaces = width / 2;
                				double numOfStars = 1;

                		        // Print the top half of the triangle
                		        for (int i = 1; i <= (height + 1) / 2; i++) {
                		            for (int j = 1; j <= numOfSpaces; j++) {
                		                System.out.print(" ");
                		            }
                		            for (int j = 1; j <= numOfStars; j++) {
                		                System.out.print("*");
                		            }
                		            System.out.println();
                		            numOfSpaces--;
                		            numOfStars += 2;
                		        }

                		        // Print the bottom half of the triangle
                		        numOfSpaces = 1;
                		        numOfStars = width - 2;
                		        for (int i = 1; i <= height / 2; i++) {
                		            for (int j = 1; j <= numOfSpaces; j++) {
                		                System.out.print(" ");
                		            }
                		            for (int j = 1; j <= numOfStars; j++) {
                		                System.out.print("*");
                		            }
                		            System.out.println();
                		            numOfSpaces++;
                		            numOfStars -= 2;
                		        }
                			}
                		}	
                		
            	}	
            }
        	else
        	{ // If the user entered an invalid choice
        		System.out.println("Invalid choiceaaa, choose again"); // Print an error message
        		shape = 4; // Check the choice
        	}
            }
        	input.close(); // Close the Scanner object to free up resources
        }
    }

