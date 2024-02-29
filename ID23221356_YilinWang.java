import javax.swing.JOptionPane;

public class ID23221356_YilinWang{
    public static void main(String args[]){

    /*Start*/
    //Create a dialog box to get username.
    String userName = "";
    
    boolean isValid = false;
    //Check if the username is between 2 and 15 characters and only include alphnumeric and/or underscore characters
    //For example, acceptable usernames include: ABC_1, 2B, _aG.
    //Unacceptable usernames include: A?G, B-b, a, ab cd.
    
    while(!isValid){
        userName = JOptionPane.showInputDialog(null, "Welcome to the adventure game, please choose a name for your player:");
        isValid = userName.length() >= 2 && userName.length() <= 15 && userName.matches("^[a-zA-Z0-9_]*$");
    
    if (isValid == false){

        //For unacceptable usernames, an error message will pop up.
        String message = "Incorrect username.\n Please enter a username that: \n Contains only alphanumeric and/or underscore characters, with a minimum length of 2 and a maximum length of 15.";
        JOptionPane.showMessageDialog(null, message);
        continue;
    }
    }
    System.out.println("Start succeeds.");

    
    /*Scenario 1 */
    
    isValid = false;
    while (!isValid) {

        //Create an input dialog box for user's option. Option should be integer 1 or 2 or 3.
        String optionMessage1 = userName + " finds themselves lost in a dense forest with no clear path forward.\n"
                                        + "Choices: \n"
                                        + "1 - Climb a tree to get a better view.\n"
                                        + "2 - Build a shelter and wait for rescue\n"
                                        + "3 - Follow a stream to see if it leads to civilization.";
        
        try {
            
            int option1 = Integer.parseInt(JOptionPane.showInputDialog(null, optionMessage1));

            isValid = (option1 == 1 || option1 == 2 || option1 == 3);

            if (isValid){
                //Show outcome
                JOptionPane.showMessageDialog(null, userName + " continues their journey.");
                System.out.println("Scenario 1 succeeds.");
                continue;

            } else {
                String message = "Invalid number.\n Please enter 1 or 2 or 3.";
                JOptionPane.showMessageDialog(null, message);
                System.out.println("User input invalid number. Expect integer 1 or 2 or 3.");
                continue;
            }

        } catch (Exception e) {

                String message = "Invalid input value.\n Please enter 1 or 2 or 3.";
                JOptionPane.showMessageDialog(null, message);
                System.out.println(e + "\nUser input invalid data type. Expect integer 1 or 2 or 3.");
                continue;

        }
    }
    System.out.println("Scenario 1 succeeds.");


    /*Scenario 2 */

    isValid = false;
    while (!isValid) {

        //Create an input dialog box for user's option. Option should be integer 1 or 2 or 3.
        String optionMessage2 = "While wandering through the forest, " + userName + " encounters a mysterious stranger who offers them assistance."
                                + userName + " must decide whether to trust the stranger." 
                                + "Choices: \n"
                                + "1 - Accept the stranger's help,\n"
                                + "2 - Politely decline and continue on your own,\n"
                                + "3 - Confront the stranger and demand answers";
        try {
            
            int option2 = Integer.parseInt(JOptionPane.showInputDialog(null, optionMessage2));
            isValid = (option2 == 1 || option2 == 2 || option2 == 3);
            
            if(option2 == 1){
                //Two possible outcomes. Both will end the game.
                double probability = Math.random();

                //Outcome 1 (70%)
                if (probability <= 0.7){
                    JOptionPane.showMessageDialog(null, userName + " is saved!");
                    
                    System.out.println("Game Over (outcome 1): " + userName + " is saved.");
                    System.exit(0);

                } else {
                     //Outcome 2 (30%)
                     JOptionPane.showMessageDialog(null, userName + " is killed!");

                     System.out.println("Game Over (outcome 2): " + userName + " is killed.");
                     System.exit(0);
                }
                     

            } else if (option2 == 2){

                //Show outcome
                JOptionPane.showMessageDialog(null, userName + " continues their journey.");
                System.out.println("Scenario 2 succeeds: " + userName + " continues their journey." );
                continue;

            } else if (option2 == 3){

                //Show outcome
                JOptionPane.showMessageDialog(null, "The stranger offers "+ userName + " to play a game.");
                System.out.println("Scenario 2 succeeds:" + "The stranger offers "+ userName + " to play a game.");
                continue;

            } else {

                //Show error message
                String message = "Invalid number.\n Please enter 1 or 2 or 3.";
                JOptionPane.showMessageDialog(null, message);

                System.out.println("User input invalid number. Expect integer 1 or 2 or 3.");
                continue;
            }


        } catch (Exception e) {

                String message = "Invalid input value.\n Please enter 1 or 2 or 3.";
                JOptionPane.showMessageDialog(null, message);

                System.out.println(e + "\nUser input invalid data type. Expect integer 1 or 2 or 3.");
                continue;
        }
    }
    
    System.out.println("Scenario 2 succeeds.");

    /*Scenario 3 */
    isValid = false;
    while (!isValid) {

        //Create an input dialog box for user's option. Option should be integer 1 or 2 or 3.
        String optionMessage3 = userName + " comes across a wide river blocking their path. "
                                + userName + " must figure out how to cross it safely." 
                                + "Choices: \n"
                                + "1 - Attempt to swim across the river,\n"
                                + "2 - Look for a shallow area to wade through,\n"
                                + "3 - Build a makeshift raft to cross the river";
        try {
            
            int option3 = Integer.parseInt(JOptionPane.showInputDialog(null, optionMessage3));
            isValid = (option3 == 1 || option3 == 2 || option3 == 3);

            //Two outcomes
            if (option3 == 1){
                //Scenario 3 Outcome 1
                JOptionPane.showMessageDialog(null, userName + " drowns!");
                System.out.println("Scenario 3: Sad End.");
                continue;

            } else if (option3 == 2 || option3 == 3){
                //Scenario 3 Outcome 2
                JOptionPane.showMessageDialog(null, userName + " is saved!");
                System.out.println("Scenario 3: Happy End.");
                continue;

            } else {
                //Show error message
                String message = "Invalid number.\n Please enter 1 or 2 or 3.";
                JOptionPane.showMessageDialog(null, message);

                System.out.println("User input invalid number. Expect integer 1 or 2 or 3.");
                continue;

            }
    

        } catch (Exception e) {
                String message = "Invalid input value.\n Please enter 1 or 2 or 3.";
                JOptionPane.showMessageDialog(null, message);

                System.out.println(e + "\nUser input invalid data type. Expect integer 1 or 2 or 3.");
                continue;
            
        }
    }

    System.out.println("Scenario 3 succeeds.");

    /*Scenario 4 */
    isValid = false;

    int count = 3;

    int answer = (int) Math.random() * 11;

    //Show guess dialog
    String message = "The game is to guess the number hidden in this mysterious box.\n It should be between 1 and 10 (inclusive)\n You have THREE tries.";
        

    while (!isValid && count > 0){
        
        try {
            int guess = Integer.parseInt(JOptionPane.showInputDialog(null, message));

            if (guess > answer){
                
                message = "LOWER";
                JOptionPane.showMessageDialog(null, "You should aim " + message + " in your next try, " + userName);
                //continue;

            } else if (guess < answer){
    
                message = "HIGHER";
                JOptionPane.showMessageDialog(null, "You should aim " + message + " in your next try, " + userName);
                //continue;

            } else {

                JOptionPane.showMessageDialog(null, userName + " is saved!");
                //break;
                
            }

            /*NOT FINISHED!!! */

            count --;

            switch (count) {
                case 2: 
                    message = "The game is to guess the number hidden in this mysterious box.\\n" + //
                                                " It should be between 1 and 10 (inclusive)\\n" + //
                                                " You have TWO tries.";
                    JOptionPane.showMessageDialog(null, message);
                    
                    break;
                
                case 1:
                    message = "The game is to guess the number hidden in this mysterious box.\\n" + //
                                                " It should be between 1 and 10 (inclusive)\\n" + //
                                                " You have ONE FINAL try.";
                    JOptionPane.showMessageDialog(null, message);
                    break;
            
                default:
                    JOptionPane.showMessageDialog(null, userName + " is killed!");
                    break;
            }

            
            
        } catch (Exception e) {

                message = "Invalid input value.\n Please enter 1 to 10.";
                JOptionPane.showMessageDialog(null, message);

                System.out.println(e + "\nUser input invalid data type. Expect integer 1 or 2 or 3.");
                continue;
        }
        //int guess = Integer.parseInt(JOptionPane.showInputDialog(null, message));

    }

    /*Play Anagin? */
    boolean playAgain = true;

    while (playAgain) {

        try {
            
            String choice = JOptionPane.showInputDialog(null, "Do you want to play again? (Y/N)");

            choice = choice.toLowerCase();

            if(choice == "y"){
                //Play Again

            } else {
                //Show goodbye dialog and finish
                JOptionPane.showMessageDialog(null, "Good Bye!");
                System.exit(0);

            }


        } catch (Exception e) {
        
            JOptionPane.showMessageDialog(null, "Invalid input value.\n Please enter Y/N.");

            System.out.println(e + "\nUser input invalid value. Expect String Y/y or N/n.");
            continue;
        }

        
    }

}
}
