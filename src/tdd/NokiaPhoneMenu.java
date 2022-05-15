package tdd;

import java.util.Scanner;

public class NokiaPhoneMenu {
    private static int userInput(){
        Scanner userInput = new Scanner(System.in);
        return userInput.nextInt();
    }

    private static void print(String message){
        System.out.println(message);
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
                print("Chat");
                print("0. Back");
                if(userInput() == 0) main();
            }
            case 4 -> showCallRegister();
            case 5 -> showTone();
            case 6 -> showSetting();
            case 7 -> {
                print("Call divert");
                print("0. Back");
                if(userInput() == 0) main();
            }
            case 8 -> {
                print("Games");
                print("0. Back");
                if(userInput() == 0) main();
            }
            case 9 -> {
                print("Calculator");
                print("0. Back");
                if(userInput() == 0) main();
            }
            case 10 -> {
                print("Remainder");
                print("0. Back");
                if(userInput() == 0) main();
            }
            case 11 -> showClock();
            case 12 -> {
                print("Profiles");
                print("0. back");
                if(userInput() == 0) main();
            }
            case 13 -> {
                print("SIM services");
                print("0. Back");
                if(userInput() == 0) main();
            }
            case 0 -> exit();
            default -> print("Wrong input");
        }

    }
    private static void exit(){
        System.exit(0);
    }
    private static void showPhonebook() {
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
            case 1 -> {print("Search");
                print("0. Back");
                if (userInput() == 0)showPhonebook();
            }
            case 2 -> {print("Service Nos.");
                print("0. Back");
                if (userInput() == 0)showPhonebook();
            }
            case 3 -> {print("Add name");
                print("0. Back");
                if (userInput() == 0)showPhonebook();
            }

            case 4 -> {print("Erase");
                print("0. Back");
                if (userInput() == 0)showPhonebook();
            }
            case 5 -> {print("Edit");
                print("0. Back");
                if (userInput() == 0)showPhonebook();
            }
            case 6 -> {
                print("Assign tone");
                print("0. Back");
                if (userInput() == 0)showPhonebook();
            }
            case 7 -> {
                print("Send b'card");
                print("0. Back");
                if (userInput() == 0)showPhonebook();
            }
            case 8 -> showPhonebookOption();
            case 9 -> {
                print("Speed dials");
                print("0. Back");
                if (userInput() == 0)showPhonebook();
            }
            case 10 -> {
                print("Voice tags");
                print("0. Back");
                if (userInput() == 0)showPhonebook();
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
                print("Type of view");
                print("0. Back");
                if (userInput() == 0)showPhonebookOption();
            }
            case 2 -> {
                print("Memory status");
                print("0. Back");
                if (userInput() == 0)showPhonebookOption();
            }
            case 0 -> showPhonebook();
            default -> {
                print("Wrong input\n");
                print("0. Back");
                if (userInput() == 0)showPhonebookOption();
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
                print("Write messages");
                print("0. Back");
                if (userInput() == 0)showMessage();

            }
            case 2 -> {
                print("Inbox");
                print("0. Back");
                if (userInput() == 0)showMessage();
            }
            case 3 -> {
                print("Outbox");
                print("0. Back");
                if (userInput() == 0)showMessage();
            }
            case 4 -> {
                print("Picture messages");
                print("0. Back");
                if (userInput() == 0)showMessage();
            }
            case 5 -> {
                print("Templates");
                print("0. Back");
                if (userInput() == 0)showMessage();
            }
            case 6 -> {
                print("Smileys");
                print("0. Back");
                if (userInput() == 0)showMessage();
            }
            case 7 -> showMessageSetting();
            case 8 -> {
                print("Info services");
                print("0. Back");
                if (userInput() == 0)showMessage();
            }
            case 9 -> {
                print("Voice mailbox number");
                print("0. Back");
                if (userInput() == 0)showMessage();
            }
            case 10 -> {
                print("Service command editor");
                print("0. Back");
                if (userInput() == 0)showMessage();
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
                print("Message center number");
                print("0. Back");
                if(userInput() == 0) showSetOption();
            }
            case 2 -> {
                print("Message sent as");
                print("0. Back");
                if(userInput() == 0) showSetOption();
            }
            case 3 -> {
                print("Message validity");
                print("0. Back");
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
                print("Delivery reports");
                print("0. Back");
                if(userInput() == 0) showCommonOption();
            }
            case 2 -> {
                print("Reply via same center");
                print("0. Back");
                if(userInput() == 0) showCommonOption();
            }
            case 3 -> {
                print("Character support");
                print("0. Back");
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
                print("Missed calls");
                print("0. Back");
                if(userInput() == 0) showCallRegister();
            }
            case 2 -> {
                print("Received calls");
                print("0. Back");
                if(userInput() == 0) showCallRegister();
            }
            case 3 -> {
                print("Dialed calls");
                print("0. Back");
                if(userInput() == 0) showCallRegister();
            }
            case 4 -> {
                print("Erase recent call lists");
                print("0. Back");
                if(userInput() == 0) showCallRegister();
            }
            case 5 -> showCallDuration();
            case 6 -> showCallCost();
            case 7 -> showCallCostSetting();
            case 8 -> {
                print("Prepaid credit");
                print("0. Back");
                if(userInput() == 0) showCallRegister();
            }
            case 0-> main();
            default -> print("Wrong input");
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
                print("Call cost limit");
                print("0. Back");
                if(userInput() == 0) showCallCostSetting();
            }
            case 2 -> {
                print("Show cost in");
                print("0. Back");
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
                print("Last call duration");
                print("0. Back");
                if(userInput() == 0) showCallCost();
            }
            case 2 -> {
                print("All calls' duration\n");
                print("0. Back");
                if(userInput() == 0) showCallCost();
            }
            case 3 -> {
                print("Clear timers\n");
                print("0. Back");
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
                print("Last call duration");
                print("0. Back");
                if(userInput() == 0) showCallDuration();
            }
            case 2 -> {
                print("All calls' duration");
                print("0. Back");
                if(userInput() == 0) showCallDuration();
            }
            case 3 -> {
                print("Received call duration");
                print("0. Back");
                if(userInput() == 0) showCallDuration();
            }
            case 4 -> {
                print("Dialed calls' duration");
                print("0. Back");
                if(userInput() == 0) showCallDuration();
            }
            case 5 -> {
                print("Clear timers");
                print("0. Back");
                if(userInput() == 0) showCallDuration();
            }
            case 0 -> showCallRegister();
            default -> print("Wrong input");
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
                print("Ringing tone");
                print("0. Back");
                if(userInput() == 0) showTone();
            }
            case 2 -> {
                print("Ringing volume");
                print("0. Back");
                if(userInput() == 0) showTone();
            }
            case 3 -> {
                print("Incoming call alert");
                print("0. Back");
                if(userInput() == 0) showTone();
            }
            case 4 -> {
                print("Composer");
                print("0. Back");
                if(userInput() == 0) showTone();
            }
            case 5 -> {
                print("Message alert tone");
                print("0. Back");
                if(userInput() == 0) showTone();
            }
            case 6 -> {
                print("Keypad tones");
                print("0. Back");
                if(userInput() == 0) showTone();
            }
            case 7 -> {
                print("Warning and gaming tones");
                print("0. Back");
                if(userInput() == 0) showTone();
            }
            case 8 -> {
                print("Vibrating alert");
                print("0. Back");
                if(userInput() == 0) showTone();
            }
            case 9 -> {
                print("Screen saver");
                print("0. Back");
                if(userInput() == 0) showTone();
            }
            case 0 -> main();
            default -> print("Wrong input");
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
                print("Restore factory settings");
                print("0. Back");
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
                print("0. Back");
                if(userInput() == 0) showClock();
            }
            case 2 -> {
                print("Clock setting\n");
                print("0. Back");
                if(userInput() == 0) showClock();
            }
            case 3 -> {
                print("Date setting\n");
                print("0. Back");
                if(userInput() == 0) showClock();
            }
            case 4 -> {
                print("Stopwatch");
                print("0. Back");
                if(userInput() == 0) showClock();
            }
            case 5 -> {
                print("Countdown timer");
                print("0. Back");
                if(userInput() == 0) showClock();
            }
            case 6 -> {
                print("Auto update of date and time");
                print("0. Back");
                if(userInput() == 0) showClock();
            }
            case 0 -> main();
            default -> print("Wrong input");
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
                print("Automatic redial");
                print("0. Back");
                if(userInput() == 0) showCallSetting();
            }
            case 2 -> {
                print("Speed dialling");
                print("0. Back");
                if(userInput() == 0) showCallSetting();
            }
            case 3 -> {
                print("Call waiting options");
                print("0. Back");
                if(userInput() == 0) showCallSetting();
            }
            case 4 -> {
                print("Own number sending");
                print("0. Back");
                if(userInput() == 0) showCallSetting();
            }
            case 5 -> {
                print("Phone line in use");
                print("0. Back");
                if(userInput() == 0) showCallSetting();
            }
            case 6 -> {
                print("Automatic answer");
                print("0. Back");
                if(userInput() == 0) showCallSetting();
            }
            case 0 -> showSetting();
            default -> print("Wrong input");
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
                print("Language");
                print("0. Back");
                if(userInput() == 0) showPhoneSetting();
            }
            case 2 -> {
                print("Cell info display");
                print("0. Back");
                if(userInput() == 0) showPhoneSetting();
            }
            case 3 -> {
                print("Welcome note");
                print("0. Back");
                if(userInput() == 0) showPhoneSetting();
            }
            case 4 -> {
                print("Network selection");
                print("0. Back");
                if(userInput() == 0) showPhoneSetting();
            }
            case 5 -> {
                print("Lights");
                print("0. Back");
                if(userInput() == 0) showPhoneSetting();
            }
            case 6 -> {
                print("Confirm Sim service actions");
                print("0. Back");
                if(userInput() == 0) showPhoneSetting();
            }
            case 0 -> showSetting();
            default -> print("Wrong input");
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
                print("PIN code request");
                print("0. Back");
                if(userInput() == 0) showSecuritySetting();
            }
            case 2 -> {
                print("Call barring service");
                print("0. Back");
                if(userInput() == 0) showSecuritySetting();
            }
            case 3 -> {
                print("Fixed dialling");
                print("0. Back");
                if(userInput() == 0) showSecuritySetting();
            }
            case 4 -> {
                print("Closed user group");
                print("0. Back");
                if(userInput() == 0) showSecuritySetting();
            }
            case 5 -> {
                print("Phone security");
                print("0. Back");
                if(userInput() == 0) showSecuritySetting();
            }
            case 6 -> {
                print("Change access code");
                print("0. Back");
                if(userInput() == 0) showSecuritySetting();
            }
            case 0 -> showSetting();
            default -> print("Wrong input");
        }
    }
}
