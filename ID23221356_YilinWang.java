import javax.swing.JOptionPane;

public class ID23221356_YilinWang{
    public static void main(String args[]){

    /*Start*/
    //Create a dialog box to get username.
    String userName = JOptionPane.showInputDialog(null, "Welcome to the adventure game, please choose a name for your player:", "Welcom!", JOptionPane.INFORMATION_MESSAGE);

    userName = Start(userName);

    /*Scenario 1 */
    Scenario1(userName);

    /*Scenario 2 */
    Scenario2(userName);
   
    /*Scenario3 */
    //Scenario3(userName);

    /*Scenario4 */
    //Scenario4(userName);

    /*Play Again */
    //playAgain();

}

private static String Start(String userName){

    /*Start*/
    
    boolean isValid = false;
    //Check if the username is between 2 and 15 characters and only include alphnumeric and/or underscore characters
    //For example, acceptable usernames include: ABC_1, 2B, _aG.
    //Unacceptable usernames include: A?G, B-b, a, ab cd.
    
    while(!isValid){
        isValid = userName.length() >= 2 && userName.length() <= 15 && userName.matches("^[a-zA-Z0-9_]*$");
    
        if (isValid == false){

            //For unacceptable usernames, an error message will pop up.
            String message = "Incorrect username.\r\n Please enter a username that: \r\n Contains only alphanumeric and/or underscore characters, with a minimum length of 2 and a maximum length of 15.";
            JOptionPane.showMessageDialog(null, message, "Error!", JOptionPane.ERROR_MESSAGE);
            //continue;
            System.out.println("Incorrect username. Length 2-15 and contains only a-zA-Z0-9_");

            userName = JOptionPane.showInputDialog(null, "Welcome to the adventure game, please choose a name for your player:", "Welcom!", JOptionPane.INFORMATION_MESSAGE);

        }
        
    }
    System.out.println("Start succeeds.");
    System.out.println("The user name is: " + userName);
    return userName;
}

private static void Scenario1(String userName){
    /*Scenario 1 */
    
    boolean isValid = false;
    while (!isValid) {
 
         //Create an input dialog box for user's option. Option should be integer 1 or 2 or 3.
         String optionMessage1 = userName + " finds themselves lost in a dense forest with no clear path forward.\r\n"
                                         + "Choices: \r\n"
                                         + "1 - Climb a tree to get a better view.\r\n"
                                         + "2 - Build a shelter and wait for rescue\r\n"
                                         + "3 - Follow a stream to see if it leads to civilization.";
         
         try {
             
             int option1 = Integer.parseInt(JOptionPane.showInputDialog(null, optionMessage1, "Scenario 1", JOptionPane.INFORMATION_MESSAGE));
 
             isValid = (option1 == 1 || option1 == 2 || option1 == 3);
 
             if (isValid){
                 //Show outcome
                 JOptionPane.showMessageDialog(null, userName + " continues their journey.", "Succeed!", JOptionPane.INFORMATION_MESSAGE);
                 System.out.println("Scenario 1 succeeds.");
                 //continue;
 
             } else {
                 //String message = "Invalid number.\r\n Please enter 1 or 2 or 3.";
                 JOptionPane.showMessageDialog(null, "Invalid number.\r\n Please enter 1 or 2 or 3.", "Error!", JOptionPane.ERROR_MESSAGE);
                 System.out.println("User input invalid number. Expect integer 1 or 2 or 3.");
                 //continue;
             }
 
         } catch (Exception e) {
 
                 //String message = "Invalid input value.\r\n Please enter 1 or 2 or 3.";
                 JOptionPane.showMessageDialog(null, "Invalid input value.\r\n Please enter 1 or 2 or 3.");
                 System.out.println(e + "\r\nUser input invalid data type. Expect integer 1 or 2 or 3.");
                 //continue;
         }
    }
    System.out.println("Scenario 1 succeeds.");
     
 
}

private static void Scenario2(String userName){
    /*Scenario 2 */

    boolean isValid = false;
    while (!isValid) {

        //Create an input dialog box for user's option. Option should be integer 1 or 2 or 3.
        String optionMessage2 = "While wandering through the forest, " + userName + " encounters a mysterious stranger who offers them assistance."
                                + userName + " must decide whether to trust the stranger." 
                                + "Choices: \r\n"
                                + "1 - Accept the stranger's help,\r\n"
                                + "2 - Politely decline and continue on your own,\r\n"
                                + "3 - Confront the stranger and demand answers";
        try {
            
            int option2 = Integer.parseInt(JOptionPane.showInputDialog(null, optionMessage2, "Scenario 2", JOptionPane.INFORMATION_MESSAGE));
            isValid = (option2 == 1 || option2 == 2 || option2 == 3);
            
            //Choice 1
            if(option2 == 1){
                //Two possible outcomes. Both will end the game.
                double probability = Math.random();

                //Outcome 1 (70%)
                if (probability <= 0.7){
                    JOptionPane.showMessageDialog(null, userName + " is saved!", "Succeeds!", JOptionPane.INFORMATION_MESSAGE);
                    
                    System.out.println("Game Over (outcome 1): " + userName + " is saved.");
                    playAgain();
                    System.exit(0);

                } else {
                     //Outcome 2 (30%)
                     JOptionPane.showMessageDialog(null, userName + " is killed!", "So SAD!", JOptionPane.INFORMATION_MESSAGE);

                     System.out.println("Game Over (outcome 2): " + userName + " is killed.");
                     
                     playAgain();

                     System.exit(0);
                }
                     

            } else if (option2 == 2){

                //Show outcome
                JOptionPane.showMessageDialog(null, userName + " continues their journey.", "Succeeds!", JOptionPane.INFORMATION_MESSAGE);
                System.out.println("Scenario 2 succeeds: " + userName + " continues their journey." );
                Scenario3(userName);

                //continue;

            //Choice 2
            } else if (option2 == 3){

                //Show outcome
                JOptionPane.showMessageDialog(null, "The stranger offers "+ userName + " to play a game.", "Game!", JOptionPane.INFORMATION_MESSAGE);
                System.out.println("Scenario 2 succeeds:" + "The stranger offers "+ userName + " to play a game.");
                Scenario4(userName);
                //continue;

            } else {

                //Show error message
                String message = "Invalid number.\r\n Please enter 1 or 2 or 3.";
                JOptionPane.showMessageDialog(null, message, "Error!", JOptionPane.ERROR_MESSAGE);

                System.out.println("User input invalid number. Expect integer 1 or 2 or 3.");
                //continue;
            }


        } catch (Exception e) {

                String message = "Invalid input value.\r\n Please enter 1 or 2 or 3.";
                JOptionPane.showMessageDialog(null, message, "Error!", JOptionPane.ERROR_MESSAGE);

                System.out.println(e + "\r\nUser input invalid data type. Expect integer 1 or 2 or 3.");
                //continue;
        }
    }
    
    System.out.println("Scenario 2 succeeds.");
}

private static void Scenario3(String userName){
    /*Scenario 3 */
    boolean isValid = false;
    while (!isValid) {

        //Create an input dialog box for user's option. Option should be integer 1 or 2 or 3.
        String optionMessage3 = userName + " comes across a wide river blocking their path. "
                                + userName + " must figure out how to cross it safely." 
                                + "Choices: \r\n"
                                + "1 - Attempt to swim across the river,\r\n"
                                + "2 - Look for a shallow area to wade through,\r\n"
                                + "3 - Build a makeshift raft to cross the river";
        try {
            
            int option3 = Integer.parseInt(JOptionPane.showInputDialog(null, optionMessage3, "Scenario 3", JOptionPane.INFORMATION_MESSAGE));
            isValid = (option3 == 1 || option3 == 2 || option3 == 3);

            //Two outcomes
            if (option3 == 1){
                //Scenario 3 Outcome 1
                JOptionPane.showMessageDialog(null, userName + " drowns!", "So SAD!", JOptionPane.INFORMATION_MESSAGE);
                System.out.println("Scenario 3: Sad End.");
                playAgain();

            } else if (option3 == 2 || option3 == 3){
                //Scenario 3 Outcome 2
                JOptionPane.showMessageDialog(null, userName + " is saved!", "Succeeds!", JOptionPane.INFORMATION_MESSAGE);
                System.out.println("Scenario 3: Happy End.");
                playAgain();

            } else {
                //Show error message
                //String message = ;
                JOptionPane.showMessageDialog(null, "Invalid number.\r\n Please enter 1 or 2 or 3.", "Error!", JOptionPane.ERROR_MESSAGE);

                System.out.println("User input invalid number. Expect integer 1 or 2 or 3.");

            }
    

        } catch (Exception e) {
                //String message = "Invalid input value.\r\n Please enter 1 or 2 or 3.";
                JOptionPane.showMessageDialog(null, "Invalid input value.\r\n Please enter 1 or 2 or 3.", "Error!", JOptionPane.ERROR_MESSAGE);

                System.out.println(e + "\r\nUser input invalid data type. Expect integer 1 or 2 or 3.");
                //continue;
            
        }
    }

    System.out.println("Scenario 3 succeeds.");
}

private static void Scenario4(String userName){
    /*Scenario 4 */
    boolean isValid = false;

    //User has 3 chances to guess
    int count = 3;

    // Create the guess answer
    int answer = (int) Math.random() * 10 + 1;
    System.out.println("The answer is: " + answer);

    String message = "" ;
    String guessNum = "";

    while (!isValid && count >= 0){
        
        switch (count) {
            //User has 3 chances left.
            case 3:
                //Show guess dialog
                message = "The game is to guess the number hidden in this mysterious box.\r\n" + //
                            "It should be between 1 and 10 (inclusive)\r\n" + //
                            "You have THREE tries.";
   
                guessNum = JOptionPane.showInputDialog(null, message, "Scenario 4", JOptionPane.INFORMATION_MESSAGE);
                
                break;

            //User has 2 chances left.
            case 2: 
                //Show guess dialog
                message = "The game is to guess the number hidden in this mysterious box.\r\n" + //
                                            " It should be between 1 and 10 (inclusive)\r\n" + //
                                            " You have TWO tries.";
                guessNum = JOptionPane.showInputDialog(null, message, "Scenario 4", JOptionPane.INFORMATION_MESSAGE);
                
                break;
            
            //User has 1 chance left.
            case 1:
                //Show guess dialog
                message = "The game is to guess the number hidden in this mysterious box.\r\n" + //
                                            " It should be between 1 and 10 (inclusive)\r\n" + //
                                            " You have ONE FINAL try.";
                guessNum = JOptionPane.showInputDialog(null, message, "Scenario 4", JOptionPane.INFORMATION_MESSAGE);
                break;
            
            //User has NO chance.
            default:
                JOptionPane.showMessageDialog(null, userName + " is killed!", "SO SAD!", JOptionPane.INFORMATION_MESSAGE);
                System.out.println(userName + " is killed! Sad End. Will ask user if play again.");
                playAgain();
                break;
        }
        
        try {
            //User input guess number
            int guess = Integer.parseInt(guessNum);
            System.out.println("User's guess is:" + guess);

            //Check if user's guess number is correct
            if (guess > answer){
                
                //message = "LOWER";
                JOptionPane.showMessageDialog(null, "You should aim LOWER in your next try, " + userName, "Scenario 4", JOptionPane.INFORMATION_MESSAGE);
                System.out.println("User should aim LOWER.");

            } else if (guess < answer){
    
                //message = "HIGHER";
                JOptionPane.showMessageDialog(null, "You should aim HIGHER in your next try, " + userName, "Scenario 4", JOptionPane.INFORMATION_MESSAGE);
                System.out.println("User should aim HIGHER.");

            } else {

                JOptionPane.showMessageDialog(null, userName + " is saved!", "Succeeds!", JOptionPane.INFORMATION_MESSAGE);
                isValid = true;
                System.out.println(userName + " is saved! Happy End. Will ask user if play again.");
                playAgain();
                System.exit(0);
                //break;
                
            }

            count --;

            
        } catch (Exception e) {

                //message = "Invalid input value.\r\n Please enter 1 to 10.";
                JOptionPane.showMessageDialog(null, "Invalid input value.\r\n Please enter 1 to 10.", "Error!", JOptionPane.ERROR_MESSAGE);

                System.out.println(e + "\r\n --- User input invalid data type. Expect integer 1 or 2 or 3.");
                //continue;
        }

    }
    System.out.println("Scenario 4 succeeds.");

}

private static void playAgain(){
    /*Play Anagin? */
    boolean playAgain = true;

    while (playAgain) {
            
        String choice = JOptionPane.showInputDialog(null, "Do you want to play again? (Y/N)", "Play Again?", JOptionPane.INFORMATION_MESSAGE);
        System.out.println("The choice is " + choice);

        choice = choice.toLowerCase();
        
        if(choice.equals("y")){
            //Play Again
            //Create a dialog box to get username.
            String userName = JOptionPane.showInputDialog(null, "Welcome to the adventure game, please choose a name for your player:", "Welcome!", JOptionPane.INFORMATION_MESSAGE);

            userName = Start(userName);

            /*Scenario 1 */
            Scenario1(userName);

            /*Scenario 2 */
            Scenario2(userName);
            
            /*Scenario3 */
            Scenario3(userName);

            /*Scenario4 */
            Scenario4(userName);

            /*Play Again */
            playAgain();

            } else if(choice.equals("n")){
                //Show goodbye dialog and finish
                JOptionPane.showMessageDialog(null, "Good Bye!", "Bye!", JOptionPane.INFORMATION_MESSAGE);
                playAgain = false;
                System.out.println("User doesn't want to play again. Exit the game.");
                System.exit(0);

            } else {

                JOptionPane.showMessageDialog(null, "Invalid input value.\r\n Please enter Y/N.", "Error!", JOptionPane.ERROR_MESSAGE);

                System.out.println("User input invalid value. Expect String Y/y or N/n.");

            }

        }

        
    }

}


