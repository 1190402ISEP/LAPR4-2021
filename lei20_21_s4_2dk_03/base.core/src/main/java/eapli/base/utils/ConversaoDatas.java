package eapli.base.utils;

import java.util.Calendar;

/**
 * The type Conversao datas.
 */
public class ConversaoDatas {

    /**
     * String data hora calendar.
     *
     * @param date the date
     * @param time the time
     * @return the calendar
     */
    public static Calendar stringDataHora(String date, String time) {
        Calendar c = Calendar.getInstance();
        String[] data = date.split("/");
        String[] hora = time.split(":");
        c.set(Integer.parseInt(data[2]), Integer.parseInt(data[1]) - 1, Integer.parseInt(data[0]), Integer.parseInt(hora[0])
                , Integer.parseInt(hora[1]));
        return c;
    }

    /**
     * String data calendar.tre
     *
     * @param input the input
     * @return the calendar
     */
    public static Calendar stringData(String input) {
        Calendar c = Calendar.getInstance();
        String[] data = input.split("/");
        c.set(Integer.parseInt(data[2]), Integer.parseInt(data[1]) - 1, Integer.parseInt(data[0]));
        return c;
    }
}
