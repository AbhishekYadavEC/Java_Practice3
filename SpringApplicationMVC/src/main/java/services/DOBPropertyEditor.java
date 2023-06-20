package services;

import java.beans.PropertyEditorSupport;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DOBPropertyEditor extends PropertyEditorSupport {

    @Override
    public void setAsText(String text) throws IllegalArgumentException {
        DateTimeFormatter dateTimeFormatter=DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate localDate=LocalDate.parse(text,dateTimeFormatter);
        setValue(localDate);
    }
}
