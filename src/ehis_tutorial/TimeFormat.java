package ehis_tutorial;

public class TimeFormat {
    public static void main(String[] args) {
        String time = "2:45:33PM";
        timeFormerTo24Hour(time);
    }
    public static String timeFormerTo24Hour(String givenTime){
        String [] timeArr = givenTime.split(":");
        String amPm = timeArr[2].substring(2,4);
        int hh,mm,ss;

        hh = Integer.parseInt(timeArr[0]);
        mm = Integer.parseInt(timeArr[1]);
        ss = Integer.parseInt(timeArr[2].substring(0,2));

        String checkAm = "AM", checkPm = "PM";
        if(amPm.equals(checkAm) && hh == 12){
            hh = 0;
        }
        else if(amPm.equals(checkPm) && hh < 12){
            hh += 12;
        }
        System.out.printf("%02d:%02d:%02d",hh, mm, ss);
        return String.format("%02d:%02d:%02d",hh, mm, ss);

    }
}
