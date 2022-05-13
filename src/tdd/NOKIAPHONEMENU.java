package tdd;

import java.util.Scanner;

public class NOKIAPHONEMENU {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String prompt = """
        1. Phonebook
        2. Messages
        3. Chat
        4. Call register
        5. Tone
        6. Setting
        7. Call divert
        8. Game
        9. Calculator
        10. Reminder
        11. Clock
        12. Profiles
        13. Sim service
        """;
        System.out.println(prompt);
        int userInput = input.nextInt();
        switch (userInput){
            case 1:
                prompt = """
                        1. Search
                        2. Service Nos.
                        3. Add name
                        4. Erase
                        5. Edit
                        6. Assign tone
                        7. Send b'card
                        8. Option
                        9. Speed dials
                        10 Voice tags
                        """;
                System.out.println(prompt);
                userInput = input.nextInt();
                switch (userInput){
                    case 1:
                        System.out.println("Search");
                        break;
                    case 2:
                        System.out.println("Service Nos.");
                        break;
                    case 3:
                        System.out.println("Add name");
                        break;
                    case 4:
                        System.out.println("Erase");
                        break;
                    case 5:
                        System.out.println("Edit");
                        break;
                    case 6:
                        System.out.println("Assign tone");
                        break;
                    case 7:
                        System.out.println("Send b'card");
                        break;
                    case 8:
                        prompt = """
                                1. Type of view
                                2. Memory status
                                """;
                        System.out.println(prompt);
                        userInput = input.nextInt();
                        switch (userInput){
                            case 1:
                                System.out.println("Type of view");
                                break;
                            case 2:
                                System.out.println("Memory status");
                                break;
                            default:
                                System.out.println("Wrong input");
                        }break;
                    case 9:
                        System.out.println("Speed dials");
                        break;
                    case 10:
                        System.out.println("Voice tags");
                        break;
                    default:
                        System.out.println("Wrong input");
                        break;
                }

            break;


            case 2:
                prompt = """
                        1. Write messages
                        2. Inbox
                        3. Outbox
                        4. Picture messages
                        5. Templates
                        6. Smileys
                        7. Message settings
                        8. Info services
                        9. Voice mailbox number
                        10 Service command editor
                        """;
                System.out.println(prompt);
                userInput = input.nextInt();
                switch (userInput){
                    case 1:
                        System.out.println("Write messages");
                        break;
                    case 2:
                        System.out.println("Inbox");
                        break;
                    case 3:
                        System.out.println("Outbox");
                        break;
                    case 4:
                        System.out.println("Picture messages");
                        break;
                    case 5:
                        System.out.println("Templates");
                        break;
                    case 6:
                        System.out.println("Smileys");
                        break;
                    case 7:
                        prompt = """
                                1. Set
                                2. Common
                                """;
                        System.out.println(prompt);
                        userInput = input.nextInt();
                        switch (userInput){
                            case 1:
                                prompt = """
                                        1. Message center number
                                        2. Message sent as
                                        3. Message validity
                                        """;
                                System.out.println(prompt);
                                userInput = input.nextInt();
                                switch (userInput){
                                    case 1:
                                        System.out.println("Message center number");
                                        break;
                                    case 2:
                                        System.out.println("Message sent as");
                                        break;
                                    case 3:
                                        System.out.println("Message validity");
                                        break;
                                    default:
                                        System.out.println("Wrong input");

                                }
                                break;
                            case 2:
                                prompt = """
                                        1. Delivery reports
                                        2. Reply via same center
                                        3. Character support
                                        """;
                                System.out.println(prompt);
                                userInput = input.nextInt();
                                switch (userInput){
                                    case 1:
                                        System.out.println("Delivery reports");
                                        break;
                                    case 2:
                                        System.out.println("Reply via same center");
                                        break;
                                    case 3:
                                        System.out.println("Character support");
                                        break;
                                    default:
                                        System.out.println("Wrong input");

                                }
                                break;


                        }break;
                    case 8:
                        System.out.println("Info services");
                        break;
                    case 9:
                        System.out.println("Voice mailbox number");
                        break;
                    case 10:
                        System.out.println("Service command editor");
                        break;
                    default:
                        System.out.println("Wrong input");
                        break;
                }
                break;


            case 3:
                System.out.println("Chat");
                break;


            case 4:
                prompt = """
                        1. Missed calls
                        2. Received calls
                        3. Dialed numbers
                        4. Erase recent call lists
                        5. Show call duration
                        6. Show call costs
                        7. Call cost setting
                        8. Prepaid credit
                        """;
                System.out.println(prompt);
                userInput = input.nextInt();
                switch (userInput){
                    case 1:
                        System.out.println("Missed calls");
                        break;
                    case 2:
                        System.out.println("Received calls");
                        break;
                    case 3:
                        System.out.println("Dialed calls");
                        break;
                    case 4:
                        System.out.println("Erase recent call lists");
                        break;
                    case 5:
                        prompt = """
                                1. Last call duration
                                2. All calls' duration
                                3. Received calls' duration
                                4. Dialed calls' duration
                                5. Clear timers
                                """;
                        System.out.println(prompt);
                        userInput = input.nextInt();
                        switch (userInput){
                            case 1:
                                System.out.println("Last call duration");
                                break;
                            case 2:
                                System.out.println("All calls' duration");
                                break;
                            case 3:
                                System.out.println("Received call duration");
                                break;
                            case 4:
                                System.out.println("Dialed calls' duration");
                                break;
                            case 5:
                                System.out.println("Clear timers");
                            default:
                                System.out.println("Wrong input");
                                break;
                        }
                        break;
                    case 6:
                        prompt = """
                                1. Last call costs
                                2. All calls' costs
                                3. Clear counter
                                """;
                        System.out.println(prompt);
                        userInput = input.nextInt();
                        switch (userInput){
                            case 1:
                                System.out.println("Last call duration");
                                break;
                            case 2:
                                System.out.println("All calls' duration");
                                break;
                            case 3:
                                System.out.println("Clear timers");
                            default:
                                System.out.println("Wrong input");
                                break;
                        }
                        break;
                    case 7:
                        prompt = """
                                1. Call cost limit
                                2. Show cost in
                                """;
                        System.out.println(prompt);
                        userInput = input.nextInt();
                        switch (userInput){
                            case 1:
                                System.out.println("Call cost limit");
                                break;
                            case 2:
                                System.out.println("Show cost in");
                                break;
                            default:
                                System.out.println("Wrong input");
                                break;
                        }
                        break;
                    case 8:
                        System.out.println("Prepaid credit");
                        break;
                    default:
                        System.out.println("Wrong input");
                        break;
                }
                break;

            case 5:
                prompt = """
                        1. Ringing tone
                        2. Ringing volume
                        3. Incoming call alert
                        4. Composer
                        5. Message alert tone
                        6. Keypad tones
                        7. Warning and game tones
                        8. Vibrating alert
                        9. Screen saver
                        """;
                System.out.println(prompt);
                userInput = input.nextInt();
                switch (userInput){
                    case 1:
                        System.out.println("Ringing tone");
                        break;
                    case 2:
                        System.out.println("Ringing volume");
                        break;
                    case 3:
                        System.out.println("Incoming call alert");
                        break;
                    case 4:
                        System.out.println("Composer");
                        break;
                    case 5:
                        System.out.println("Message alert tone");
                        break;
                    case 6:
                        System.out.println("Keypad tones");
                        break;
                    case 7:
                        System.out.println("Warning and gaming tones");
                        break;
                    case 8:
                        System.out.println("Vibrating alert");
                        break;
                    case 9:
                        System.out.println("Screen saver");
                        break;
                    default:
                        System.out.println("Wrong input");
                        break;
                }
                break;


            case 6:
                prompt = """
                        1. Call settings
                        2. Phone settings
                        3. Security settings
                        4. Restore factory
                        """;
                System.out.println(prompt);
                userInput = input.nextInt();
                switch (userInput){
                    case 1:
                        prompt = """
                                1. Automatic redial
                                2. Speed dialling
                                3. Call waiting options
                                4. Own number sending
                                5. Phone line in use
                                6. Automatic answer
                                """;
                        System.out.println(prompt);
                        userInput = input.nextInt();
                        switch (userInput){
                            case 1:
                                System.out.println("Automatic redial");
                                break;
                            case 2:
                                System.out.println("Speed dialling");
                                break;
                            case 3:
                                System.out.println("Call waiting options");
                                break;
                            case 4:
                                System.out.println("Own number sending");
                                break;
                            case 5:
                                System.out.println("Phone line in use");
                                break;
                            case 6:
                                System.out.println("Automatic answer");
                                break;
                            default:
                                System.out.println("Wrong input");
                                break;
                        }
                        break;
                    case 2:
                        prompt = """
                                1. Language
                                2. Cell info display
                                3. Welcome note
                                4. Network selection
                                5. Lights
                                6. Confirm Sim service actions
                                """;
                        System.out.println(prompt);
                        userInput = input.nextInt();
                        switch (userInput){
                            case 1:
                                System.out.println("Language");
                                break;
                            case 2:
                                System.out.println("Cell info display");
                                break;
                            case 3:
                                System.out.println("Welcome note");
                                break;
                            case 4:
                                System.out.println("Network selection");
                                break;
                            case 5:
                                System.out.println("Lights");
                            case 6:
                                System.out.println("Confirm Sim service actions");
                            default:
                                System.out.println("Wrong input");
                                break;
                        }
                        break;
                    case 3:
                        prompt = """
                                1. PIN code request
                                2. Call barring service
                                3. Fixed dialling
                                4. Closed user group
                                5. Phone security
                                6. Change access code
                                """;
                        System.out.println(prompt);
                        userInput = input.nextInt();
                        switch (userInput){
                            case 1:
                                System.out.println("PIN code request");
                                break;
                            case 2:
                                System.out.println("Call barring service");
                                break;
                            case 3:
                                System.out.println("Fixed dialling");
                                break;
                            case 4:
                                System.out.println("Closed user group");
                                break;
                            case 5:
                                System.out.println("Phone security");
                                break;
                            case 6:
                                System.out.println("Change access code");
                                break;
                            default:
                                System.out.println("Wrong input");
                                break;
                        }
                        break;

                    case 4:
                        System.out.println("Restore factory settings");
                        break;
                    default:
                        System.out.println("Wrong input");
                        break;
                }
                break;

            case 7:
                System.out.println("Call divert");
                break;

            case 8:
                System.out.println("Games");
                break;

            case 9:
                System.out.println("Calcularor");
                break;

            case 10:
                System.out.println("Remainder");
                break;

            case 11:
                prompt = """
                        1. Alarm clock
                        2. Clock settings
                        3. Date setting
                        4. Stopwatch
                        5. Countdown timer
                        6. Auto update of date and time
                        """;
                System.out.println(prompt);
                userInput = input.nextInt();
                switch (userInput){
                    case 1:
                        System.out.println("Alarm clock");
                        break;
                    case 2:
                        System.out.println("Clock setting");
                        break;
                    case 3:
                        System.out.println("Date setting");
                        break;
                    case 4:
                        System.out.println("Stopwatch");
                        break;
                    case 5:
                        System.out.println("Countdown timer");
                        break;
                    case 6:
                        System.out.println("Auto update of date and time");
                        break;
                    default:
                        System.out.println("Wrong input");
                        break;
                }
                break;

            case 12:
                System.out.println("Profiles");
                break;

            case 13:
                System.out.println("SIM services");
                break;

            default:
                System.out.println("Wrong input");
                break;
        }
    }


    //private static int display(String message){

       // return display(message);
   // }
//    private static String print(String messages){
//        System.out.println();
//        return print(messages);

   // }
}
