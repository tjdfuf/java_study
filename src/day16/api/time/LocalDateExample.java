package day16.api.time;

import utility.Util;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;

public class LocalDateExample {
    public static void main(String[] args) {

        // 현재 날짜 정보 얻기 (연, 월, 일 )
        LocalDate now = LocalDate.now();
        System.out.println(now);

        // 현재 시간 정보 얻기
        LocalTime nowTime = LocalTime.now();
        System.out.println(nowTime);

        // 현재 날짜와 시간 정보 얻기 (연, 월, 일, 시, 분, 초 )
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

        // 특정 날짜와 시간 정보 얻기
        LocalDateTime beginDate = LocalDateTime.of(2022, 7, 1, 9, 0, 0);
        System.out.println("beginDate = " + beginDate);

        // 연도 추출하기
        int year = localDateTime.getYear();
        System.out.println(year);

        // 월 추출하기
        int monthValue = localDateTime.getMonthValue();
        System.out.println("monthValue = " + monthValue);

        Month month = localDateTime.getMonth();
        System.out.println("month = " + month);

        // 시간 구하기
        int hour = localDateTime.getHour();
        System.out.println("hour = " + hour);

        // 요일 구하기
        DayOfWeek dayOfWeek = localDateTime.getDayOfWeek();
        System.out.println("dayOfWeek = " + dayOfWeek);

        Util.line();


        // 지금으로부터 3일 뒤
        LocalDateTime returnDate = localDateTime.plusDays(3);
        System.out.println("returnDate = " + returnDate);

        // 지금으로부터 1년 2개월 7일 뒤
//        LocalDateTime d1 = localDateTime.plusYears(1);
//        LocalDateTime d2 = localDateTime.plusMonths(2);
//        LocalDateTime d3 = localDateTime.plusDays(7);

        LocalDateTime d1 = localDateTime.plusYears(1).plusMonths(2).plusDays(7);

        // 지금으로부터 1년 3개월 18일 전
        LocalDateTime d2 = localDateTime.minusYears(1).minusMonths(3).minusDays(18);

        // 사이 날짜 연산
        LocalDate b = LocalDate.of(2020, 12, 30);
        LocalDate f = LocalDate.of(2022, 9, 14);

        long between = ChronoUnit.DAYS.between(b, f);
        System.out.println("between = " + between);

        LocalTime x = LocalTime.of(2, 10, 30);
        LocalTime y = LocalTime.of(12, 54, 12);

        long betweenSeconds = ChronoUnit.SECONDS.between(x, y);
        System.out.println("betweenSeconds = " + betweenSeconds);

        Util.line();

        // 날짜 포멧 변경하기
        System.out.println(localDateTime);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy년 MM월 E요일 d일 a hh시 m분 ss.m초");
        System.out.println(localDateTime.format(dtf));

    }
}
