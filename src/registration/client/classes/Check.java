package registration.client.classes;

import registration.client.exceptions.FIOInvalidFormatException;
import registration.client.exceptions.InvalidDataFormatException;
import registration.client.exceptions.InvalidFloorException;
import registration.client.exceptions.InvalidNumberPhoneFormat;
import registration.client.interfaces.CurrentLocal;
import registration.client.interfaces.IChekData;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.HashMap;


public class Check implements IChekData {

    public HashMap<String, Object> checkDataUser(HashMap<String, String> res, CurrentLocal local) throws
            FIOInvalidFormatException, InvalidDataFormatException,
            InvalidNumberPhoneFormat, InvalidFloorException
    {
        HashMap<String, Object> parseData = new HashMap<>();

        parseData.put("surname", checkFIO(res.get("surname"), local));
        parseData.put("name", checkFIO(res.get("name"), local));
        parseData.put("patronymic", checkFIO(res.get("patronymic"), local));
        parseData.put("birthData", checkBirthData(res.get("birthData")));
        parseData.put("numberPhone", checkNumberPhone(res.get("numberPhone")));
        parseData.put("floor", checkFloor(res.get("floor")));

        return parseData;
    }

    @Override
    public String checkFIO(String value, CurrentLocal local) throws FIOInvalidFormatException {
        String[] lang = local.getLang();
        int count = 0;
        for (int i = 0; i < value.length(); i++) {
            for (int j = 0; j < lang.length; j++) {
                if (i == 0) {
                    if (String.valueOf(value.charAt(i)).equals(lang[j].toUpperCase())) {
                        count++;
                    }
                } else if (String.valueOf(value.charAt(i)).equals(lang[j])) {
                    count++;
                }
            }
        }
        if (count != value.length()) {
            throw new FIOInvalidFormatException();
        }
        return value;
    }

    @Override
    public String checkBirthData(String value) throws InvalidDataFormatException {
        SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");
        try {
            Date date = format.parse(value);
            return value;
        } catch (ParseException exception) {
            throw new InvalidDataFormatException();
        }

    }

    @Override
    public long checkNumberPhone(String value) throws InvalidNumberPhoneFormat {
        try {
            long num = Long.parseLong(value);
            return num;
        } catch (NumberFormatException exception) {
            throw new InvalidNumberPhoneFormat();
        }
    }

    @Override
    public String checkFloor(String value) throws InvalidFloorException {
        if (!value.equalsIgnoreCase("м") && !value.equalsIgnoreCase("ж")) {
            throw new InvalidFloorException();
        }
        return value;
    }
}
