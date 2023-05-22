package zoomcalisma.localdate;

import java.time.LocalDate;

public class Ex10 {
    public static void main(String[] args) {
        //İki farklı tarihin ay numaralarının toplamını bulunuz.

        LocalDate a=LocalDate.of(2000,10,04);
        LocalDate b=LocalDate.of(2020,8,15);
        System.out.println("toplam : "+ (a.getMonthValue()+b.getMonthValue()));
    }
}
