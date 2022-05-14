package tdd;

import java.util.Scanner;

public class NokiaPhoneMenu {
    private static int userInput(){
        Scanner userInput = new Scanner(System.in);
        return userInput.nextInt();
    }

    private static void print(String message){
        System.out.print(message);
    }
    public static void main(String... args) {
        String prompt = """
        Phone Menu
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
        0. Exit
        """;
        print(prompt);
        switch (userInput()) {
            case 1 -> showPhonebook();
            case 2 -> showMessage();
            case 3 -> {
                print("Chat\n");
                singleBackButton();
                System.out.println();
                if(userInput() == 0) main();
            }
            case 4 -> showCallRegister();
            case 5 -> showTone();
            case 6 -> showSetting();
            case 7 -> {
                print("Call divert\n");
                singleBackButton();
                System.out.println();
                if(userInput() == 0) main();
            }
            case 8 -> {
                print("Games\n");
                singleBackButton();
                System.out.println();
                if(userInput() == 0) main();
            }
            case 9 -> {
                print("Calculator\n");
                singleBackButton();
                System.out.println();
                if(userInput() == 0) main();
            }
            case 10 -> {
                print("Remainder\n");
                singleBackButton();
                System.out.println();
                if(userInput() == 0) main();
            }
            case 11 -> showClock();
            case 12 -> {
                print("Profiles\n");
                singleBackButton();
                System.out.println();
                if(userInput() == 0) main();
            }
            case 13 -> {
                print("SIM services\n");
                singleBackButton();
                System.out.println();
                if(userInput() == 0) main();
            }
            case 0 -> exit();
            default -> print("Wrong input\n");
        }

    }
    private static void optionBackButton(){
        switch (userInput()) {
            case 0 -> showPhonebookOption();
            case 1 -> main();
        }
    }
    private static void showBackAndHomeButton(){
        String button = """
                0. Back
                1. Main menu
                """;
        print(button);
    }
    private static void messageButton(){
        switch (userInput()){
            case 0 -> showMessage();
            case 1 -> main();
        }
    }
    private static void singleDisplayPhonebookButton(){
        switch (userInput()){
            case 0 -> showPhonebook();
            case 1 -> main();
        }
    }
    private static void singleBackButton(){
        print("0. Back");

    }
    private static void exit(){
        System.exit(0);
    }
    private static void showPhonebook(){
        String phonebookPrompt = """
            1. Search
            2. Service Nos.
            3. Add name
            4. Erase
            5. Edit
            6. Assign tone
            7. Send b'card
            8. Option
            9. Speed dials
            10. Voice tags
            0. Back
            """;
        print(phonebookPrompt);
        switch (userInput()) {
            case 1 -> {print("Search\n");
                showBackAndHomeButton();
                singleDisplayPhonebookButton();
            }
            case 2 -> {print("Service Nos.\n");
                showBackAndHomeButton();
                singleDisplayPhonebookButton();}
            case 3 -> {print("Add name\n");
                showBackAndHomeButton();
                singleDisplayPhonebookButton();}

            case 4 -> {print("Erase\n");
                showBackAndHomeButton();
                singleDisplayPhonebookButton();}
            case 5 -> {print("Edit\n");
                showBackAndHomeButton();
                singleDisplayPhonebookButton();
            }
            case 6 -> {
                print("Assign tone\n");
                showBackAndHomeButton();
                singleDisplayPhonebookButton();
            }
            case 7 -> {
                print("Send b'card\n");
                showBackAndHomeButton();
                singleDisplayPhonebookButton();
            }
            case 8 -> showPhonebookOption();
            case 9 -> {
                print("Speed dials\n");
                showBackAndHomeButton();
                singleDisplayPhonebookButton();
            }
            case 10 -> {
                print("Voice tags\n");
                showBackAndHomeButton();
                singleDisplayPhonebookButton();
            }
            case 0 -> main();
            default -> print("Wrong input");
        }

    }
    private static void showPhonebookOption(){
        String prompt = """
                        1. Type of view
                        2. Memory status
                        0. Back
                        """;
        print(prompt);
        switch (userInput()) {
            case 1 -> {
                print("Type of view\n");
                showBackAndHomeButton();
                optionBackButton();
            }
            case 2 -> {
                print("Memory status\n");
                showBackAndHomeButton();
                optionBackButton();
            }
            case 0 -> showPhonebook();
            default -> {
                print("Wrong input\n");
                showBackAndHomeButton();
                optionBackButton();
            }
        }
    }
    private static void showMessage(){
        String messagePrompt = """
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
                        0. Back
                        """;
        print(messagePrompt);
        switch (userInput()) {
            case 1 -> {
                print("Write messages\n");
                showBackAndHomeButton();
                messageButton();

            }
            case 2 -> {
                print("Inbox\n");
                showBackAndHomeButton();
                messageButton();
            }
            case 3 -> {
                print("Outbox");
                showBackAndHomeButton();
                messageButton();
            }
            case 4 -> {
                print("Picture messages");
                showBackAndHomeButton();
                messageButton();
            }
            case 5 -> {
                print("Templates");
                showBackAndHomeButton();
                messageButton();
            }
            case 6 -> {
                print("Smileys");
                showBackAndHomeButton();
                messageButton();
            }
            case 7 -> showMessageSetting();
            case 8 -> {
                print("Info services");
                showBackAndHomeButton();
                messageButton();
            }
            case 9 -> {
                print("Voice mailbox number");
                showBackAndHomeButton();
                messageButton();
            }
            case 10 -> {
                print("Service command editor");
                showBackAndHomeButton();
                messageButton();
            }
            case 0 -> main();
            default -> print("Wrong input");
        }
    }
    private static void showMessageSetting(){
        String prompt = """
                        1. Set
                        2. Common
                        0. Back
                        """;
        print(prompt);
        switch (userInput()){
            case 1 -> showSetOption();
            case 2 -> showCommonOption();
            case 0 -> showMessage();
        }
    }
    private static void showSetOption(){
        String prompt = """
                1. Message center number
                2. Message sent as
                3. Message validity
                0. Back
                """;
        print(prompt);
        switch (userInput()) {
            case 1 -> {
                print("Message center number\n");
                singleBackButton();
                System.out.println();
                if(userInput() == 0) showSetOption();
            }
            case 2 -> {
                print("Message sent as\n");
                singleBackButton();
                System.out.println();
                if(userInput() == 0) showSetOption();
            }
            case 3 -> {
                print("Message validity\n");
                singleBackButton();
                System.out.println();
                if(userInput() == 0) showSetOption();
            }
            case 0 -> showMessageSetting();
            default -> print("Wrong input");
        }
    }
    private static void showCommonOption(){
        String prompt = """
                1. Delivery reports
                2. Reply via same center
                3. Character support
                0. Back
                """;
        print(prompt);
        switch (userInput()) {
            case 1 -> {
                print("Delivery reports\n");
                singleBackButton();
                System.out.println();
                if(userInput() == 0) showCommonOption();
            }
            case 2 -> {
                print("Reply via same center\n");
                singleBackButton();
                System.out.println();
                if(userInput() == 0) showCommonOption();
            }
            case 3 -> {
                print("Character support\n");
                singleBackButton();
                System.out.println();
                if(userInput() == 0) showCommonOption();
            }
            case 0 -> showMessageSetting();
            default -> print("Wrong input");
        }
    }
    private static void showCallRegister(){
        String prompt = """
                        1. Missed calls
                        2. Received calls
                        3. Dialed numbers
                        4. Erase recent call lists
                        5. Show call duration
                        6. Show call costs
                        7. Call cost setting
                        8. Prepaid credit
                        0. Back
                        """;
        print(prompt);
        switch (userInput()) {
            case 1 -> {
                print("Missed calls\n");
                singleBackButton();
                System.out.println();
                if(userInput() == 0) showCallRegister();
            }
            case 2 -> {
                print("Received calls\n");
                singleBackButton();
                System.out.println();
                if(userInput() == 0) showCallRegister();
            }
            case 3 -> {
                print("Dialed calls\n");
                singleBackButton();
                System.out.println();
                if(userInput() == 0) showCallRegister();
            }
            case 4 -> {
                print("Erase recent call lists\n");
                singleBackButton();
                System.out.println();
                if(userInput() == 0) showCallRegister();
            }
            case 5 -> showCallDuration();
            case 6 -> showCallCost();
            case 7 -> showCallCostSetting();
            case 8 -> {
                print("Prepaid credit\n");
                singleBackButton();
                System.out.println();
                if(userInput() == 0) showCallRegister();
            }
            case 0-> main();
            default -> print("Wrong input\n");
        }
    }
    private static void showCallCostSetting(){
        String prompt = """
                    1. Call cost limit
                    2. Show cost in
                    0. Back
                    """;
        print(prompt);
        switch (userInput()) {
            case 1 -> {
                print("Call cost limit\n");
                singleBackButton();
                System.out.println();
                if(userInput() == 0) showCallCostSetting();
            }
            case 2 -> {
                print("Show cost in\n");
                singleBackButton();
                System.out.println();
                if(userInput() == 0) showCallCostSetting();
            }
            case 0 -> showCallRegister();
            default -> print("Wrong input");
        }
    }
    private static void showCallCost(){
        String prompt = """
                    1. Last call costs
                    2. All calls' costs
                    3. Clear counter
                    0. Back
                    """;
        print(prompt);
        switch (userInput()) {
            case 1 -> {
                print("Last call duration\n");
                singleBackButton();
                System.out.println();
                if(userInput() == 0) showCallCost();
            }
            case 2 -> {
                print("All calls' duration\n");
                singleBackButton();
                System.out.println();
                if(userInput() == 0) showCallCost();
            }
            case 3 -> {
                print("Clear timers\n");
                singleBackButton();
                System.out.println();
                if(userInput() == 0) showCallCost();
            }
            case 0 -> showCallRegister();
            default -> print("Wrong input\n");
        }
    }
    private static void showCallDuration(){
        String prompt = """
                        1. Last call duration
                        2. All calls' duration
                        3. Received calls' duration
                        4. Dialed calls' duration
                        5. Clear timers
                        0. Back
                        """;
        print(prompt);
        switch (userInput()) {
            case 1 -> {
                print("Last call duration\n");
                singleBackButton();
                System.out.println();
                if(userInput() == 0) showCallDuration();
            }
            case 2 -> {
                print("All calls' duration\n");
                singleBackButton();
                System.out.println();
                if(userInput() == 0) showCallDuration();
            }
            case 3 -> {
                print("Received call duration\n");
                singleBackButton();
                System.out.println();
                if(userInput() == 0) showCallDuration();
            }
            case 4 -> {
                print("Dialed calls' duration\n");
                singleBackButton();
                System.out.println();
                if(userInput() == 0) showCallDuration();
            }
            case 5 -> {
                print("Clear timers\n");
                singleBackButton();
                System.out.println();
                if(userInput() == 0) showCallDuration();
            }
            case 0 -> showCallRegister();
            default -> print("Wrong input\n");
        }
    }
    private static void showTone(){
        String prompt = """
                        1. Ringing tone
                        2. Ringing volume
                        3. Incoming call alert
                        4. Composer
                        5. Message alert tone
                        6. Keypad tones
                        7. Warning and game tones
                        8. Vibrating alert
                        9. Screen saver
                        0. Back
                        """;
        print(prompt);
        switch (userInput()) {
            case 1 -> {
                print("Ringing tone\n");
                singleBackButton();
                System.out.println();
                if(userInput() == 0) showTone();
            }
            case 2 -> {
                print("Ringing volume\n");
                singleBackButton();
                System.out.println();
                if(userInput() == 0) showTone();
            }
            case 3 -> {
                print("Incoming call alert\n");
                singleBackButton();
                System.out.println();
                if(userInput() == 0) showTone();
            }
            case 4 -> {
                print("Composer\n");
                singleBackButton();
                System.out.println();
                if(userInput() == 0) showTone();
            }
            case 5 -> {
                print("Message alert tone\n");
                singleBackButton();
                System.out.println();
                if(userInput() == 0) showTone();
            }
            case 6 -> {
                print("Keypad tones\n");
                singleBackButton();
                System.out.println();
                if(userInput() == 0) showTone();
            }
            case 7 -> {
                print("Warning and gaming tones\n");
                singleBackButton();
                System.out.println();
                if(userInput() == 0) showTone();
            }
            case 8 -> {
                print("Vibrating alert\n");
                singleBackButton();
                System.out.println();
                if(userInput() == 0) showTone();
            }
            case 9 -> {
                print("Screen saver\n");
                singleBackButton();
                System.out.println();
                if(userInput() == 0) showTone();
            }
            case 0 -> main();
            default -> print("Wrong input\n");
        }
    }
    private static void showSetting(){
        String prompt = """
                        1. Call settings
                        2. Phone settings
                        3. Security settings
                        4. Restore factory
                        0. Back
                        """;
        print(prompt);
        switch (userInput()) {
            case 1 -> showCallSetting();
            case 2 -> showPhoneSetting();
            case 3 -> showSecuritySetting();
            case 4 -> {
                print("Restore factory settings\n");
                singleBackButton();
                System.out.println();
                if(userInput() == 0) showSetting();
            }
            case 0 -> main();
            default -> print("Wrong input");
        }
    }
    private static void showClock(){
        String prompt = """
                        1. Alarm clock
                        2. Clock settings
                        3. Date setting
                        4. Stopwatch
                        5. Countdown timer
                        6. Auto update of date and time
                        0. Back
                        """;
        print(prompt);
        switch (userInput()) {
            case 1 -> {
                print("Alarm clock\n");
                singleBackButton();
                System.out.println();
                if(userInput() == 0) showClock();
            }
            case 2 -> {
                print("Clock setting\n");
                singleBackButton();
                System.out.println();
                if(userInput() == 0) showClock();
            }
            case 3 -> {
                print("Date setting\n");
                singleBackButton();
                System.out.println();
                if(userInput() == 0) showClock();
            }
            case 4 -> {
                print("Stopwatch\n");
                singleBackButton();
                System.out.println();
                if(userInput() == 0) showClock();
            }
            case 5 -> {
                print("Countdown timer\n");
                singleBackButton();
                System.out.println();
                if(userInput() == 0) showClock();
            }
            case 6 -> {
                print("Auto update of date and time\n");
                singleBackButton();
                System.out.println();
                if(userInput() == 0) showClock();
            }
            case 0 -> main();
            default -> print("Wrong input\n");
        }
    }
    private static void showCallSetting(){
        String prompt = """
                    1. Automatic redial
                    2. Speed dialling
                    3. Call waiting options
                    4. Own number sending
                    5. Phone line in use
                    6. Automatic answer
                    0. Back
                    """;
        print(prompt);
        switch (userInput()) {
            case 1 -> {
                print("Automatic redial\n");
                singleBackButton();
                System.out.println();
                if(userInput() == 0) showCallSetting();
            }
            case 2 -> {
                print("Speed dialling\n");
                singleBackButton();
                System.out.println();
                if(userInput() == 0) showCallSetting();
            }
            case 3 -> {
                print("Call waiting options\n");
                singleBackButton();
                System.out.println();
                if(userInput() == 0) showCallSetting();
            }
            case 4 -> {
                print("Own number sending\n");
                singleBackButton();
                System.out.println();
                if(userInput() == 0) showCallSetting();
            }
            case 5 -> {
                print("Phone line in use\n");
                singleBackButton();
                System.out.println();
                if(userInput() == 0) showCallSetting();
            }
            case 6 -> {
                print("Automatic answer\n");
                singleBackButton();
                System.out.println();
                if(userInput() == 0) showCallSetting();
            }
            case 0 -> showSetting();
            default -> print("Wrong input\n");
        }
    }
    private static void showPhoneSetting(){
        String prompt = """
                    1. Language
                    2. Cell info display
                    3. Welcome note
                    4. Network selection
                    5. Lights
                    6. Confirm Sim service actions
                    0. Back
                    """;
        print(prompt);
        switch (userInput()) {
            case 1 -> {
                print("Language\n");
                singleBackButton();
                System.out.println();
                if(userInput() == 0) showPhoneSetting();
            }
            case 2 -> {
                print("Cell info display\n");
                singleBackButton();
                System.out.println();
                if(userInput() == 0) showPhoneSetting();
            }
            case 3 -> {
                print("Welcome note\n");
                singleBackButton();
                System.out.println();
                if(userInput() == 0) showPhoneSetting();
            }
            case 4 -> {
                print("Network selection\n");
                singleBackButton();
                System.out.println();
                if(userInput() == 0) showPhoneSetting();
            }
            case 5 -> {
                print("Lights\n");
                singleBackButton();
                System.out.println();
                if(userInput() == 0) showPhoneSetting();
            }
            case 6 -> {
                print("Confirm Sim service actions\n");
                singleBackButton();
                System.out.println();
                if(userInput() == 0) showPhoneSetting();
            }
            case 0 -> showSetting();
            default -> print("Wrong input\n");
        }
    }
    private static void showSecuritySetting(){
        String prompt = """
                    1. PIN code request
                    2. Call barring service
                    3. Fixed dialling
                    4. Closed user group
                    5. Phone security
                    6. Change access code
                    0. Back
                    """;
        print(prompt);
        switch (userInput()) {
            case 1 -> {
                print("PIN code request\n");
                singleBackButton();
                System.out.println();
                if(userInput() == 0) showSecuritySetting();
            }
            case 2 -> {
                print("Call barring service\n");
                singleBackButton();
                System.out.println();
                if(userInput() == 0) showSecuritySetting();
            }
            case 3 -> {
                print("Fixed dialling\n");
                singleBackButton();
                System.out.println();
                if(userInput() == 0) showSecuritySetting();
            }
            case 4 -> {
                print("Closed user group\n");
                singleBackButton();
                System.out.println();
                if(userInput() == 0) showSecuritySetting();
            }
            case 5 -> {
                print("Phone security\n");
                singleBackButton();
                System.out.println();
                if(userInput() == 0) showSecuritySetting();
            }
            case 6 -> {
                print("Change access code\n");
                singleBackButton();
                System.out.println();
                if(userInput() == 0) showSecuritySetting();
            }
            case 0 -> showSetting();
            default -> print("Wrong input\n");
        }
    }
}
